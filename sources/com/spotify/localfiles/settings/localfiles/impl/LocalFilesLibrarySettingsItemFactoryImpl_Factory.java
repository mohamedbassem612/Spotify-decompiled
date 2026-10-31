package com.spotify.localfiles.settings.localfiles.impl;

import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LocalFilesLibrarySettingsItemFactoryImpl_Factory implements jly0 {

    public static final class InstanceHolder {
        static final LocalFilesLibrarySettingsItemFactoryImpl_Factory INSTANCE = new LocalFilesLibrarySettingsItemFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static LocalFilesLibrarySettingsItemFactoryImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LocalFilesLibrarySettingsItemFactoryImpl newInstance() {
        return new LocalFilesLibrarySettingsItemFactoryImpl();
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public LocalFilesLibrarySettingsItemFactoryImpl m478get() {
        return newInstance();
    }
}
