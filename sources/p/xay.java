package p;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xay {
    public static final tzg1 a = rno1.f();
    public static final n8b1 b = irn1.l0(0.0f, 400.0f, (Object) null, 5);
    public static final n8b1 c = irn1.l0(0.0f, 400.0f, (Object) null, 5);
    public static final n8b1 d;
    public static final n8b1 e;

    static {
        n511 n511Var = ckk1.a;
        d = irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1);
        e = irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1);
    }

    public static final void a(mhg1 mhg1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1186853286);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mhg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hrr0 hrr0Var = mhg1Var.e;
            hrr0 hrr0Var2 = mhg1Var.d;
            boolean z = hrr0Var.getValue() != null;
            if (u890.j(mhg1Var.a.P0(), hrr0Var2.getValue()) && !z) {
                function0.invoke();
            }
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            Object obj = objT;
            if (objT == m4cVar) {
                boolean[] zArr = {z};
                x340Var.s0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new Object[1];
                x340Var.s0(objT2);
            }
            Object[] objArr = (Object[]) objT2;
            if (!u890.j(objArr[0], hrr0Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    function0.invoke();
                }
                objArr[0] = hrr0Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(mhg1Var, function0, i, (byte) 0);
        }
    }

    public static bby b(pxg1 pxg1Var, era eraVar, iu30 iu30Var, int i) {
        gra graVar;
        era eraVar2 = een.R0;
        ni20 ni20VarL0 = pxg1Var;
        if ((i & 1) != 0) {
            n511 n511Var = ckk1.a;
            ni20VarL0 = irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            eraVar = eraVar2;
        }
        if ((i & 8) != 0) {
            iu30Var = x0y.b1;
        }
        if (u890.j(eraVar, een.P0)) {
            graVar = een.g;
        } else {
            graVar = u890.j(eraVar, eraVar2) ? een.i : een.h;
        }
        return c(ni20VarL0, graVar, new v2y(iu30Var, (byte) 6));
    }

    public static final bby c(ni20 ni20Var, gra graVar, iu30 iu30Var) {
        return new bby(new oig1((qg10) null, (eb91) null, new cfe(graVar, iu30Var, ni20Var, true), (eg41) null, (LinkedHashMap) null, 123));
    }

    public static bby d(ni20 ni20Var, fra fraVar, int i) {
        gra graVar;
        fra fraVar2 = een.O0;
        if ((i & 1) != 0) {
            n511 n511Var = ckk1.a;
            ni20Var = irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            fraVar = fraVar2;
        }
        if (u890.j(fraVar, een.Z)) {
            graVar = een.e;
        } else {
            graVar = u890.j(fraVar, fraVar2) ? een.X : een.h;
        }
        return c(ni20Var, graVar, new qrk((byte) 23));
    }

    public static bby e(int i, ni20 ni20Var) {
        if ((i & 1) != 0) {
            ni20Var = irn1.l0(0.0f, 400.0f, (Object) null, 5);
        }
        return new bby(new oig1(new qg10(0.0f, ni20Var), (eb91) null, (cfe) null, (eg41) null, (LinkedHashMap) null, 126));
    }

    public static ln00 f(int i, ni20 ni20Var) {
        if ((i & 1) != 0) {
            ni20Var = irn1.l0(0.0f, 400.0f, (Object) null, 5);
        }
        return new ln00(new oig1(new qg10(0.0f, ni20Var), (eb91) null, (cfe) null, (eg41) null, (LinkedHashMap) null, 126));
    }

    public static bby g(float f, int i, long j, ni20 ni20Var) {
        long jV;
        ni20 ni20VarL0 = (i & 1) != 0 ? irn1.l0(0.0f, 400.0f, (Object) null, 5) : ni20Var;
        float f2 = (i & 2) != 0 ? 0.0f : f;
        if ((i & 4) != 0) {
            int i2 = ofg1.c;
            jV = wpb1.v();
        } else {
            jV = j;
        }
        return new bby(new oig1((qg10) null, (eb91) null, (cfe) null, new eg41(f2, 0, jV, ni20VarL0), (LinkedHashMap) null, 119));
    }

    public static ln00 h(ni20 ni20Var, long j, int i) {
        long jV;
        if ((i & 1) != 0) {
            ni20Var = irn1.l0(0.0f, 400.0f, (Object) null, 5);
        }
        ni20 ni20Var2 = ni20Var;
        float f = (i & 2) == 0 ? 0.5f : 0.0f;
        if ((i & 4) != 0) {
            int i2 = ofg1.c;
            jV = wpb1.v();
        } else {
            jV = j;
        }
        return new ln00(new oig1((qg10) null, (eb91) null, (cfe) null, new eg41(f, 0, jV, ni20Var2), (LinkedHashMap) null, 119));
    }

    public static ln00 i(ni20 ni20Var, era eraVar, iu30 iu30Var, int i) {
        gra graVar;
        era eraVar2 = een.R0;
        if ((i & 1) != 0) {
            n511 n511Var = ckk1.a;
            ni20Var = irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            eraVar = eraVar2;
        }
        if ((i & 8) != 0) {
            iu30Var = x0y.d1;
        }
        if (u890.j(eraVar, een.P0)) {
            graVar = een.g;
        } else {
            graVar = u890.j(eraVar, eraVar2) ? een.i : een.h;
        }
        return j(ni20Var, graVar, new v2y(iu30Var, (byte) 7));
    }

    public static final ln00 j(ni20 ni20Var, gra graVar, iu30 iu30Var) {
        return new ln00(new oig1((qg10) null, (eb91) null, new cfe(graVar, iu30Var, ni20Var, true), (eg41) null, (LinkedHashMap) null, 123));
    }

    public static ln00 k() {
        n511 n511Var = ckk1.a;
        return j(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.e1);
    }

    public static ln00 l(int i, ni20 ni20Var) {
        gra graVar;
        fra fraVar = een.O0;
        fra fraVar2 = een.Z;
        if ((i & 1) != 0) {
            n511 n511Var = ckk1.a;
            ni20Var = irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1);
        }
        fra fraVar3 = (i & 2) != 0 ? fraVar : fraVar2;
        if (u890.j(fraVar3, fraVar2)) {
            graVar = een.e;
        } else {
            graVar = u890.j(fraVar3, fraVar) ? een.X : een.h;
        }
        return j(ni20Var, graVar, new qrk((byte) 24));
    }

    public static final bby m(ni20 ni20Var, iu30 iu30Var) {
        return new bby(new oig1((qg10) null, new eb91(ni20Var, new v2y(iu30Var, (byte) 8)), (cfe) null, (eg41) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ bby n(int i, iu30 iu30Var) {
        n511 n511Var = ckk1.a;
        n8b1 n8b1VarL0 = irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1);
        if ((i & 2) != 0) {
            iu30Var = vay.b;
        }
        return m(n8b1VarL0, iu30Var);
    }

    public static final bby o(ni20 ni20Var, iu30 iu30Var) {
        return new bby(new oig1((qg10) null, new eb91(ni20Var, new way(iu30Var, (byte) 0)), (cfe) null, (eg41) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ bby p(int i, iu30 iu30Var) {
        n511 n511Var = ckk1.a;
        n8b1 n8b1VarL0 = irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1);
        if ((i & 2) != 0) {
            iu30Var = vay.c;
        }
        return o(n8b1VarL0, iu30Var);
    }

    public static final ln00 q(ni20 ni20Var, iu30 iu30Var) {
        return new ln00(new oig1((qg10) null, new eb91(ni20Var, new v2y(iu30Var, (byte) 9)), (cfe) null, (eg41) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ ln00 r(int i, iu30 iu30Var) {
        n511 n511Var = ckk1.a;
        n8b1 n8b1VarL0 = irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1);
        if ((i & 2) != 0) {
            iu30Var = vay.d;
        }
        return q(n8b1VarL0, iu30Var);
    }

    public static final ln00 s(ni20 ni20Var, iu30 iu30Var) {
        return new ln00(new oig1((qg10) null, new eb91(ni20Var, new v2y(iu30Var, (byte) 10)), (cfe) null, (eg41) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ ln00 t(int i, iu30 iu30Var) {
        n511 n511Var = ckk1.a;
        n8b1 n8b1VarL0 = irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1);
        if ((i & 2) != 0) {
            iu30Var = vay.e;
        }
        return s(n8b1VarL0, iu30Var);
    }
}
