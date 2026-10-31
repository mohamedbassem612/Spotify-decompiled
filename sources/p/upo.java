package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class upo {
    public static final n8b1 l = irn1.l0(0.0f, 400.0f, null, 5);
    public static final df41 m = new df41(eno.f, ido.i);
    public final drr0 a = new drr0(0.0f);
    public final hrr0 b;
    public final hrr0 c;
    public final hrr0 d;
    public final hrr0 e;
    public final hrr0 f;
    public final hrr0 g;
    public final hrr0 h;
    public wy71 i;
    public int j;
    public Float k;

    public upo(wy71 wy71Var) {
        Boolean bool = Boolean.FALSE;
        this.b = v8r.q(bool);
        this.c = v8r.q(0);
        this.d = v8r.q(0);
        this.e = v8r.q(0);
        this.f = v8r.q(wy71Var);
        this.g = v8r.q(bool);
        this.h = v8r.q((Object) null);
        this.i = wy71Var;
    }

    public static Object e(upo upoVar, a8d1 a8d1Var) throws Throwable {
        hrr0 hrr0Var = upoVar.f;
        wy71 wy71Var = wy71.c;
        hrr0Var.setValue(wy71Var);
        Object objA = upoVar.a(upoVar.g(wy71Var), l, a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(float f, fe5 fe5Var, lnm lnmVar) throws Throwable {
        spo spoVar;
        Throwable th;
        int i;
        if (lnmVar instanceof spo) {
            spoVar = (spo) lnmVar;
            int i2 = spoVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                spoVar.d = i2 - Integer.MIN_VALUE;
            } else {
                spoVar = new spo(this, lnmVar);
            }
        } else {
            spoVar = new spo(this, lnmVar);
        }
        spo spoVar2 = spoVar;
        Object obj = spoVar2.b;
        int i3 = spoVar2.d;
        hrr0 hrr0Var = this.b;
        if (i3 != 0) {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = spoVar2.a;
            try {
                hm5.M(obj);
                if (this.j == i) {
                    hrr0Var.setValue(Boolean.FALSE);
                    this.k = null;
                }
                return rih1.a;
            } catch (Throwable th2) {
                th = th2;
                if (this.j == i) {
                    throw th;
                }
                hrr0Var.setValue(Boolean.FALSE);
                this.k = null;
                throw th;
            }
        }
        hm5.M(obj);
        int i4 = this.j + 1;
        this.j = i4;
        hrr0Var.setValue(Boolean.TRUE);
        this.k = new Float(f);
        try {
            float fS = this.a.s();
            try {
                du0 du0Var = new du0((Object) this, i4, (byte) 21);
                spoVar2.a = i4;
                spoVar2.d = 1;
                Object objT = wwo1.t(fS, f, fe5Var, du0Var, spoVar2, 4);
                d9n d9nVar = d9n.a;
                if (objT == d9nVar) {
                    return d9nVar;
                }
                i = i4;
                if (this.j == i) {
                    hrr0Var.setValue(Boolean.FALSE);
                    this.k = null;
                }
                return rih1.a;
            } catch (Throwable th3) {
                th = th3;
                i = i4;
                if (this.j == i) {
                    throw th;
                }
                hrr0Var.setValue(Boolean.FALSE);
                this.k = null;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final float b(float f) {
        drr0 drr0Var = this.a;
        float fS = drr0Var.s();
        float fO = yoi1.o(f + fS, 0.0f, g(wy71.c));
        drr0Var.t(fO);
        return fO - fS;
    }

    public final wy71 c() {
        return (wy71) this.f.getValue();
    }

    public final int d() {
        return ((Number) this.c.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum f(float f, float f2, Function0 function0, onm onmVar) throws Throwable {
        tpo tpoVar;
        if (onmVar instanceof tpo) {
            tpoVar = (tpo) onmVar;
            int i = tpoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpoVar.d = i - Integer.MIN_VALUE;
            } else {
                tpoVar = new tpo(this, onmVar);
            }
        } else {
            tpoVar = new tpo(this, onmVar);
        }
        Object obj = tpoVar.b;
        int i2 = tpoVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wy71 wy71Var = tpoVar.a;
            hm5.M(obj);
            return wy71Var;
        }
        hm5.M(obj);
        float fAbs = Math.abs(f);
        wy71 wy71Var2 = wy71.b;
        wy71 wy71Var3 = wy71.c;
        if (fAbs < f2) {
            float fG = g(wy71Var2);
            wy71 wy71Var4 = wy71.a;
            float fG2 = g(wy71Var4);
            float fG3 = g(wy71Var3);
            float fS = this.a.s();
            if (fG2 != fG) {
                int iOrdinal = this.i.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                    } else if (fS <= l1d.e(fG3, fG, 0.5f, fG)) {
                        if (fS > l1d.e(fG2, fG, 0.5f, fG)) {
                            wy71Var2 = wy71Var4;
                        }
                    }
                    wy71Var2 = wy71Var3;
                } else if (fS > l1d.e(fG3, fG2, 0.5f, fG2)) {
                    wy71Var2 = wy71Var3;
                } else if (fS >= fG2 - ((fG2 - fG) * 0.5f)) {
                    wy71Var2 = wy71Var4;
                }
            } else if (fS > l1d.e(fG3, fG, 0.5f, fG)) {
                wy71Var2 = wy71Var3;
            }
        } else if (f > 0.0f) {
            wy71Var2 = wy71Var3;
        }
        if (wy71Var2 == wy71Var3) {
            function0.invoke();
        }
        this.f.setValue(wy71Var2);
        float fG4 = g(wy71Var2);
        tpoVar.a = wy71Var2;
        tpoVar.d = 1;
        Object objA = a(fG4, l, tpoVar);
        d9n d9nVar = d9n.a;
        return objA == d9nVar ? d9nVar : wy71Var2;
    }

    public final float g(wy71 wy71Var) {
        int iOrdinal = wy71Var.ordinal();
        if (iOrdinal == 0) {
            int iD = d() - ((Number) this.d.getValue()).intValue();
            if (iD < 0) {
                iD = 0;
            }
            return iD;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return ((Number) this.e.getValue()).intValue() + d();
            }
            eg.o();
        }
        return 0.0f;
    }
}
