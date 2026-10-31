package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o4r0 implements vr20 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ zl5 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ y6h1 e;

    public o4r0(vr20 vr20Var, String str, y6h1 y6h1Var, zl5 zl5Var) {
        this.b = vr20Var;
        this.d = str;
        this.e = y6h1Var;
        this.c = zl5Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        n4r0 n4r0Var;
        s4r0 s4r0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y6h1 y6h1Var = this.e;
        String str = this.d;
        zl5 zl5Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof n4r0) {
                    n4r0Var = (n4r0) lnmVar;
                    int i = n4r0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        n4r0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        n4r0Var = new n4r0(this, lnmVar);
                    }
                } else {
                    n4r0Var = new n4r0(this, lnmVar);
                }
                Object obj2 = n4r0Var.a;
                int i2 = n4r0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    List listB = f3r0.b(str, y6h1Var, zl5Var, (List) obj);
                    n4r0Var.b = 1;
                    return vr20Var.emit(listB, n4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof s4r0) {
                    s4r0Var = (s4r0) lnmVar;
                    int i3 = s4r0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        s4r0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        s4r0Var = new s4r0(this, lnmVar);
                    }
                } else {
                    s4r0Var = new s4r0(this, lnmVar);
                }
                Object obj3 = s4r0Var.a;
                int i4 = s4r0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Object objB = ((py21) obj).b(new wvq0(zl5Var, (byte) 5), new mvn0(zl5Var, str, y6h1Var, (byte) 13));
                    s4r0Var.b = 1;
                    return vr20Var.emit(objB, s4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public o4r0(vr20 vr20Var, zl5 zl5Var, String str, y6h1 y6h1Var) {
        this.b = vr20Var;
        this.c = zl5Var;
        this.d = str;
        this.e = y6h1Var;
    }
}
