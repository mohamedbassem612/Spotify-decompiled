package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yuc0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zuc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yuc0(zuc0 zuc0Var, byte b) {
        super(0);
        this.a = b;
        this.b = zuc0Var;
    }

    public final Object invoke() {
        boolean zY;
        boolean zY2;
        byte b = this.a;
        boolean z = false;
        zuc0 zuc0Var = this.b;
        switch (b) {
            case 0:
                fjf1 fjf1Var = zuc0Var.p;
                if (fjf1Var instanceof hkj0) {
                    zY = nhc1.Y(zuc0Var.c, "spotify:kallax", false);
                } else if (fjf1Var instanceof fjf1) {
                    zY = fjf1Var.f;
                } else {
                    if (!(fjf1Var instanceof k1z)) {
                        eg.o();
                        return null;
                    }
                    zY = ((k1z) fjf1Var).g;
                }
                return Boolean.valueOf(zY);
            case 1:
                fjf1 fjf1Var2 = zuc0Var.p;
                if (!(fjf1Var2 instanceof k1z) && !(fjf1Var2 instanceof hkj0)) {
                    if (!(fjf1Var2 instanceof fjf1)) {
                        eg.o();
                        return null;
                    }
                    z = fjf1Var2.c;
                }
                return Boolean.valueOf(z);
            case 2:
                fjf1 fjf1Var3 = zuc0Var.p;
                if (fjf1Var3 instanceof hkj0) {
                    zY2 = nhc1.Y(zuc0Var.c, "spotify:kallax", false);
                } else if (fjf1Var3 instanceof fjf1) {
                    zY2 = fjf1Var3.d;
                } else {
                    if (!(fjf1Var3 instanceof k1z)) {
                        eg.o();
                        return null;
                    }
                    zY2 = ((k1z) fjf1Var3).e;
                }
                return Boolean.valueOf(zY2);
            case 3:
                fjf1 fjf1Var4 = zuc0Var.p;
                if (fjf1Var4 instanceof hkj0) {
                    return ltt0.a;
                }
                if (fjf1Var4 instanceof fjf1) {
                    return fjf1Var4.e;
                }
                if (fjf1Var4 instanceof k1z) {
                    return ((k1z) fjf1Var4).f;
                }
                eg.o();
                return null;
            default:
                fjf1 fjf1Var5 = zuc0Var.p;
                if (fjf1Var5 instanceof hkj0) {
                    return null;
                }
                if (fjf1Var5 instanceof fjf1) {
                    return fjf1Var5.i;
                }
                if (fjf1Var5 instanceof k1z) {
                    return ((k1z) fjf1Var5).c;
                }
                eg.o();
                return null;
        }
    }
}
