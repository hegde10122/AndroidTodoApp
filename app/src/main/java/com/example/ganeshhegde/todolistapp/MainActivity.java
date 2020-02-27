package com.example.ganeshhegde.todolistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ganeshhegde.todolistapp.dagger2.Battery;
import com.example.ganeshhegde.todolistapp.dagger2.DaggerSmartPhoneComponent;
import com.example.ganeshhegde.todolistapp.dagger2.MemoryCard;
import com.example.ganeshhegde.todolistapp.dagger2.SIMCard;
import com.example.ganeshhegde.todolistapp.dagger2.ServiceProvider;
import com.example.ganeshhegde.todolistapp.dagger2.SmartPhone;
import com.example.ganeshhegde.todolistapp.dagger2.SmartPhoneComponent;

import dagger.android.DaggerActivity;
import dagger.android.DaggerActivity_MembersInjector;
import dagger.android.DaggerApplication;

public class MainActivity extends AppCompatActivity {

    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  Battery battery = new Battery();
        MemoryCard memoryCard = new MemoryCard();

        ServiceProvider serviceProvider = new ServiceProvider();

        SIMCard simCard = new SIMCard(serviceProvider);

        SmartPhone smartPhone = new SmartPhone(battery,memoryCard,simCard);*/

        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhone.makeCall();
    }
}
