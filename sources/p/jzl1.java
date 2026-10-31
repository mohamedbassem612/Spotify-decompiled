package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jzl1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ mzl1 c;

    public /* synthetic */ jzl1(vr20 vr20Var, mzl1 mzl1Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = mzl1Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        izl1 izl1Var;
        lzl1 lzl1Var;
        z6x z6xVarK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mzl1 mzl1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof izl1) {
                    izl1Var = (izl1) lnmVar;
                    int i = izl1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        izl1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        izl1Var = new izl1(this, lnmVar);
                    }
                } else {
                    izl1Var = new izl1(this, lnmVar);
                }
                Object obj2 = izl1Var.a;
                int i2 = izl1Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Boolean boolValueOf = Boolean.valueOf(((xyl1) mzl1Var.c.c).a(((cxc0) obj).f.q));
                izl1Var.b = 1;
                return vr20Var.emit(boolValueOf, izl1Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof lzl1) {
                    lzl1Var = (lzl1) lnmVar;
                    int i3 = lzl1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lzl1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        lzl1Var = new lzl1(this, lnmVar);
                    }
                } else {
                    lzl1Var = new lzl1(this, lnmVar);
                }
                Object obj3 = lzl1Var.a;
                int i4 = lzl1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                ArrayList arrayListZ = mzl1Var.b.z(((m7e0) obj).b);
                if (arrayListZ.isEmpty()) {
                    z6xVarK = z6x.a;
                } else {
                    kp51 kp51Var = (kp51) o7h.q0(arrayListZ);
                    kp51 kp51Var2 = (kp51) o7h.A0(arrayListZ);
                    ArrayList<kp51> arrayListW = sua.w(arrayListZ);
                    smc0 smc0VarN = k4p1.n();
                    if (kp51Var.c.a != null) {
                        smc0VarN.add(Integer.valueOf(kp51Var.a));
                    }
                    for (kp51 kp51Var3 : arrayListW) {
                        if (kp51Var3.c.a != null) {
                            smc0VarN.add(Integer.valueOf(kp51Var3.a));
                        }
                    }
                    if (!smc0VarN.isEmpty()) {
                        smc0VarN.add(Integer.valueOf(kp51Var2.a + 1));
                    }
                    z6xVarK = k4p1.k(smc0VarN);
                }
                lzl1Var.b = 1;
                return vr20Var.emit(z6xVarK, lzl1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
