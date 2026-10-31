package p;

import android.graphics.Rect;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mr30 implements fkk1 {
    public final dg30 a;
    public final boolean b;
    public final p5t c;
    public final p5t d;

    public mr30(dg30 dg30Var, boolean z) {
        this.a = dg30Var;
        this.b = z;
        p5t p5tVar = new p5t(this, (byte) 1);
        this.c = p5tVar;
        this.d = p5tVar;
        DisplayMetrics displayMetrics = dg30Var.getResources().getDisplayMetrics();
        Rect rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        p5tVar.m(rect);
        ebp1.k(dg30Var.getWindow().getDecorView(), rect, z);
    }

    public final ymd0 a() {
        return this.d;
    }
}
