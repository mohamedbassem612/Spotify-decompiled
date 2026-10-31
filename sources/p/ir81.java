package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ir81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kr81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir81(kr81 kr81Var, byte b) {
        super(1);
        this.a = b;
        this.b = kr81Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kr81 kr81Var = this.b;
        switch (b) {
            case 0:
                return new azw((View) obj, kr81Var.e, kr81Var.h);
            case 1:
                return new y6s0((View) obj, kr81Var.e, kr81Var.h);
            case 2:
                return new mh2((View) obj, kr81Var.a, kr81Var.h, kr81Var.t);
            case 3:
                return new nn2((View) obj, kr81Var.h);
            default:
                return new kkn0((View) obj, kr81Var.a, kr81Var.c, kr81Var.d, kr81Var.h);
        }
    }
}
