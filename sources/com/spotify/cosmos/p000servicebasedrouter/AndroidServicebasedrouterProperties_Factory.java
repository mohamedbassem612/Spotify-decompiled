package com.spotify.cosmos.p000servicebasedrouter;

import com.spotify.cosmos.servicebasedrouter.AndroidServicebasedrouterProperties;
import p.jly0;
import p.luk;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AndroidServicebasedrouterProperties_Factory implements jly0 {
    private final jly0 configProvider;

    private AndroidServicebasedrouterProperties_Factory(jly0 jly0Var) {
        this.configProvider = jly0Var;
    }

    public static AndroidServicebasedrouterProperties_Factory create(jly0 jly0Var) {
        return new AndroidServicebasedrouterProperties_Factory(jly0Var);
    }

    public static AndroidServicebasedrouterProperties newInstance(luk lukVar) {
        return new AndroidServicebasedrouterProperties(lukVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public AndroidServicebasedrouterProperties m1277get() {
        return newInstance((luk) this.configProvider.get());
    }
}
