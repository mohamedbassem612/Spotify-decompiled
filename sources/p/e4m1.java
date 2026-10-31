package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e4m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i4m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4m1(i4m1 i4m1Var, byte b) {
        super(1);
        this.a = b;
        this.b = i4m1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i4m1 i4m1Var = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    i4m1Var.g.a(ixb.b);
                    i4m1Var.m.a(nxb.a(i4m1Var.l, (Integer) null, (ixb) null, 0, false, false, 3967));
                }
                break;
            case 1:
                i4m1Var.c.f(new dwn0((String) obj, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                break;
            default:
                i4m1Var.k.t(((Number) obj).intValue());
                break;
        }
        return rih1Var;
    }
}
