package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pni1 {
    public final kly0 a;
    public final epb b;

    public pni1(caq caqVar, epb epbVar) {
        this.a = caqVar;
        this.b = epbVar;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 31 && ((t65) this.a.get()).c();
    }
}
