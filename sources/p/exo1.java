package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class exo1 {
    public final lyo1 a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, xnn1 xnn1Var, onm onmVar) throws zzhm {
        bxo1 bxo1Var;
        if (onmVar instanceof bxo1) {
            bxo1Var = (bxo1) onmVar;
            int i = bxo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bxo1Var.c = i - Integer.MIN_VALUE;
            } else {
                bxo1Var = new bxo1(this, onmVar);
            }
        } else {
            bxo1Var = new bxo1(this, onmVar);
        }
        Object objA = bxo1Var.a;
        int i2 = bxo1Var.c;
        tgo1 tgo1Var = tgo1.d;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objA);
                    lyo1 lyo1Var = this.a;
                    byte[] bArrD = xnn1Var.d();
                    bxo1Var.c = 1;
                    objA = lyo1Var.a(str, bArrD, bxo1Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objA);
                }
                oyo1 oyo1Var = (oyo1) objA;
                try {
                    return oyo1Var.b(yln1.I());
                } catch (zzhm e) {
                    if (!u890.j(e.b(), ij81.l1)) {
                        throw e;
                    }
                    try {
                        zzhm zzhmVar = (zzhm) zzhm.d().get(ynn1.y(oyo1Var.b).x());
                        if (zzhmVar == null) {
                            throw new zzhm(tgo1.b, ij81.d1, (String) null, (Exception) null);
                        }
                        throw zzhmVar;
                    } catch (Exception e2) {
                        throw new zzhm(tgo1Var, ij81.O0, e2.getMessage(), (Exception) null);
                    }
                }
            } catch (zzhm e3) {
                throw e3;
            }
        } catch (Exception e4) {
            throw new zzhm(tgo1Var, ij81.N0, e4.getMessage(), (Exception) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(brk1 brk1Var, tmn1 tmn1Var, onm onmVar) throws zzhm {
        dyo1 dyo1Var;
        if (onmVar instanceof dyo1) {
            dyo1Var = (dyo1) onmVar;
            int i = dyo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dyo1Var.c = i - Integer.MIN_VALUE;
            } else {
                dyo1Var = new dyo1(this, onmVar);
            }
        } else {
            dyo1Var = new dyo1(this, onmVar);
        }
        Object objA = dyo1Var.a;
        int i2 = dyo1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                lyo1 lyo1Var = this.a;
                String strA = brk1Var.a();
                byte[] bArrD = tmn1Var.d();
                dyo1Var.c = 1;
                objA = lyo1Var.a(strA, bArrD, dyo1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return ((oyo1) objA).b(umn1.B());
        } catch (zzhm e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhm(tgo1.d, ij81.N0, e2.getMessage(), (Exception) null);
        }
    }
}
