package com.spotify.localfiles.mediastoreimpl;

import p.jly0;
import p.luk;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LocalFilesProperties_Factory implements jly0 {
    private final jly0 configProvider;

    private LocalFilesProperties_Factory(jly0 jly0Var) {
        this.configProvider = jly0Var;
    }

    public static LocalFilesProperties_Factory create(jly0 jly0Var) {
        return new LocalFilesProperties_Factory(jly0Var);
    }

    public static LocalFilesProperties newInstance(luk lukVar) {
        return new LocalFilesProperties(lukVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public LocalFilesProperties m461get() {
        return newInstance((luk) this.configProvider.get());
    }
}
