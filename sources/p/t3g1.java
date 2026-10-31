package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t3g1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjf1 b;
    public final /* synthetic */ t62 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3g1(gjf1 gjf1Var, t62 t62Var, boolean z, byte b) {
        super(1);
        this.a = b;
        this.b = gjf1Var;
        this.c = t62Var;
        this.d = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        t62 t62Var = this.c;
        boolean z = this.d;
        gjf1 gjf1Var = this.b;
        switch (b) {
            case 0:
                Resources resources = (Resources) obj;
                int iC = l1d.C(gjf1Var.g);
                if (iC == 0) {
                    return t62Var.a;
                }
                if (iC == 1) {
                    return z ? resources.getString(2131959123) : gjf1Var.c;
                }
                eg.o();
                return null;
            default:
                int iC2 = l1d.C(gjf1Var.g);
                if (iC2 == 0) {
                    return t62Var.b;
                }
                if (iC2 == 1) {
                    return z ? "" : gjf1Var.d;
                }
                eg.o();
                return null;
        }
    }
}
