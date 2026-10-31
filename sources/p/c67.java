package p;

import android.app.Application;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c67 implements ynb0 {
    public final /* synthetic */ Application a;

    public c67(Application application) {
        this.a = application;
    }

    @Override // p.ynb0
    public final Object get() {
        return y520.I(this.a.getFilesDir(), "asset-loader");
    }
}
