package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LocalFilesSettingsValueAccessor_Factory implements jly0 {
    private final jly0 localFilesFeatureProvider;

    private LocalFilesSettingsValueAccessor_Factory(jly0 jly0Var) {
        this.localFilesFeatureProvider = jly0Var;
    }

    public static LocalFilesSettingsValueAccessor_Factory create(jly0 jly0Var) {
        return new LocalFilesSettingsValueAccessor_Factory(jly0Var);
    }

    public static LocalFilesSettingsValueAccessor newInstance(LocalFilesFeature localFilesFeature) {
        return new LocalFilesSettingsValueAccessor(localFilesFeature);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public LocalFilesSettingsValueAccessor m480get() {
        return newInstance((LocalFilesFeature) this.localFilesFeatureProvider.get());
    }
}
