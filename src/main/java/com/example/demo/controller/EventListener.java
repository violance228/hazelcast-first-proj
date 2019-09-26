package com.example.demo.controller;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.MapEvent;

public class EventListener implements EntryListener {
    @Override
    public void entryAdded(EntryEvent entryEvent) {
        System.out.println(entryEvent.getKey());
    }

    @Override
    public void entryEvicted(EntryEvent entryEvent) {
        System.out.println(entryEvent.getKey());

    }

    @Override
    public void entryRemoved(EntryEvent entryEvent) {
        System.out.println(entryEvent.getKey());

    }

    @Override
    public void entryUpdated(EntryEvent entryEvent) {
        System.out.println(entryEvent.getKey());

    }

    @Override
    public void mapCleared(MapEvent mapEvent) {
        System.out.println(mapEvent.getNumberOfEntriesAffected());

    }

    @Override
    public void mapEvicted(MapEvent mapEvent) {
        System.out.println(mapEvent.getNumberOfEntriesAffected());

    }
}
