package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ifa implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ifa(String str, boolean z, mdm mdmVar, qim0 qim0Var, xu30 xu30Var, Function0 function0, int i) {
        this.d = str;
        this.b = z;
        this.e = mdmVar;
        this.f = qim0Var;
        this.g = xu30Var;
        this.h = function0;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.g;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i | 1);
                z6p1.m((mfv0) obj7, (w5f1) obj6, (c9n) obj5, this.b, (ven0) obj3, (j2i) obj4, (b0k) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = czo1.p(i | 1);
                zxo1.g(this.b, (rze1) obj7, (qim0) obj6, (hvf) obj5, (phc1) obj3, (phc1) obj4, (b0k) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = czo1.p(i | 1);
                ijm.c((String) obj7, this.b, (mdm) obj6, (qim0) obj5, (xu30) obj3, (Function0) obj4, (b0k) obj, iP3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = czo1.p(i | 1);
                rb91.c((qim0) obj7, (tb91) obj6, this.b, (idn0) obj5, (j2i) obj4, (j2i) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ ifa(qim0 qim0Var, tb91 tb91Var, boolean z, idn0 idn0Var, j2i j2iVar, j2i j2iVar2, int i) {
        this.d = qim0Var;
        this.e = tb91Var;
        this.b = z;
        this.f = idn0Var;
        this.h = j2iVar;
        this.g = j2iVar2;
        this.c = i;
    }

    public /* synthetic */ ifa(mfv0 mfv0Var, w5f1 w5f1Var, c9n c9nVar, boolean z, ven0 ven0Var, j2i j2iVar, int i) {
        this.d = mfv0Var;
        this.e = w5f1Var;
        this.f = c9nVar;
        this.b = z;
        this.g = ven0Var;
        this.h = j2iVar;
        this.c = i;
    }

    public /* synthetic */ ifa(boolean z, rze1 rze1Var, qim0 qim0Var, hvf hvfVar, phc1 phc1Var, phc1 phc1Var2, int i) {
        this.b = z;
        this.d = rze1Var;
        this.e = qim0Var;
        this.f = hvfVar;
        this.g = phc1Var;
        this.h = phc1Var2;
        this.c = i;
    }
}
