package p;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class wxa1 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final e9r a(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        wat watVar = (wat) x340Var.k(t4k.h);
        boolean zD = x340Var.d(watVar.h());
        Object objT = x340Var.T();
        if (zD || objT == fkj0.X) {
            objT = t5p1.n(new c681(watVar));
            x340Var.s0(objT);
        }
        return (e9r) objT;
    }
}
