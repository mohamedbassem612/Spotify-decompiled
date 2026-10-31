package p;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class sr91 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sr91(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        nbe1 nbe1Var;
        byte b = this.a;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                xu30 xu30Var = (xu30) obj4;
                xr91 xr91Var = (xr91) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    xr91Var.getClass();
                    xu30Var.invoke(xr91Var, x340Var2, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((ykb0) obj4).f((Drawable) obj3, (b0k) obj, czo1.p(49));
                break;
            case 2:
                x6e1 x6e1Var = (x6e1) obj4;
                c9n c9nVar = (c9n) obj3;
                d3e1 d3e1Var = (d3e1) obj;
                Context context = (Context) obj2;
                boolean zH = x6e1Var.h();
                af5 af5VarK = x6e1Var.k();
                String str = af5VarK != null ? af5VarK.b : null;
                nbe1 nbe1Var2 = x6e1Var.v;
                if (nbe1Var2 != null) {
                    long j = nbe1Var2.a;
                    hyp0 hyp0Var = x6e1Var.b;
                    nbe1Var = new nbe1(e6p1.e(hyp0Var.o((int) (j >> 32)), hyp0Var.o((int) (j & 4294967295L))));
                } else {
                    nbe1Var = null;
                }
                odt0.a(d3e1Var, context, zH, str, nbe1Var, x6e1Var.i, new d5e1(x6e1Var, c9nVar, context, b2));
                break;
            case 3:
                r7e1 r7e1Var = (r7e1) obj4;
                d3e1 d3e1Var2 = (d3e1) obj;
                Context context2 = (Context) obj2;
                boolean zM = r7e1Var.m();
                ggg1 ggg1Var = r7e1Var.a;
                odt0.a(d3e1Var2, context2, zM, ggg1Var.h().d, new nbe1(ggg1Var.h().e), r7e1Var.f, new d5e1(r7e1Var, (c9n) obj3, context2, (byte) 5));
                break;
            default:
                ((Integer) obj2).getClass();
                s9e1.a((lee1) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ sr91(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
