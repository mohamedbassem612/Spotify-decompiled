package p;

import com.spotify.remoteconfig.NativeRemoteConfigImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qz11 implements f961 {
    public final NativeRemoteConfigImpl a;

    public qz11(lw21 lw21Var) {
        qmn0 qmn0Var = NativeRemoteConfigImpl.Companion;
        rz11 rz11Var = new rz11(lw21Var);
        qmn0Var.getClass();
        NativeRemoteConfigImpl nativeRemoteConfigImplCreateInternal = NativeRemoteConfigImpl.createInternal(rz11Var);
        nativeRemoteConfigImplCreateInternal.initialize();
        this.a = nativeRemoteConfigImplCreateInternal;
    }

    @Override // p.dwo
    public final void shutdown() {
        this.a.destroy();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
