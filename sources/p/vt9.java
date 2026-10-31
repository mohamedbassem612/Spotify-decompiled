package p;

import android.window.BackEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vt9 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public vt9(BackEvent backEvent) {
        float fC = zh5.c(backEvent);
        float fD = zh5.d(backEvent);
        float fA = zh5.a(backEvent);
        int iB = zh5.b(backEvent);
        this.a = fC;
        this.b = fD;
        this.c = fA;
        this.d = iB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return l1d.o(sb, this.d, '}');
    }
}
