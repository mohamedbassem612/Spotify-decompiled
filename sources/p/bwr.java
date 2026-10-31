package p;

import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bwr implements e9v {
    public final b9v a;
    public y8v b;
    public boolean c;
    public final /* synthetic */ cwr d;

    public bwr(cwr cwrVar, b9v b9vVar) {
        this.d = cwrVar;
        this.a = b9vVar;
    }

    @Override // p.e9v
    public final void release() {
        Handler handler = this.d.u;
        handler.getClass();
        zoi1.c0(handler, new fe(this, (byte) 28));
    }
}
