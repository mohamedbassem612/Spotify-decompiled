package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i3j0 {
    public final lzn0 a;
    public final e4j0 b;

    public i3j0(lzn0 lzn0Var, e4j0 e4j0Var) {
        this.a = lzn0Var;
        this.b = e4j0Var;
    }

    public static Object b(i3j0 i3j0Var, String str, g3j0 g3j0Var, Bundle bundle, lnm lnmVar, int i) {
        boolean z = (i & 4) == 0;
        x2j0 x2j0Var = (i & 8) != 0 ? x2j0.a : w2j0.a;
        if ((i & 16) != 0) {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        i3j0Var.getClass();
        return i3j0Var.a(str, null, g3j0Var, new d3j0(new z2j0(z), x2j0Var), bundle2, lnmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, tv80 tv80Var, g3j0 g3j0Var, d3j0 d3j0Var, Bundle bundle, lnm lnmVar) {
        h3j0 h3j0Var;
        m4j0 m4j0Var;
        if (lnmVar instanceof h3j0) {
            h3j0Var = (h3j0) lnmVar;
            int i = h3j0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                h3j0Var.g = i - Integer.MIN_VALUE;
            } else {
                h3j0Var = new h3j0(this, lnmVar);
            }
        } else {
            h3j0Var = new h3j0(this, lnmVar);
        }
        Object objB = h3j0Var.e;
        int i2 = h3j0Var.g;
        if (i2 == 0) {
            hm5.M(objB);
            if (g3j0Var instanceof f3j0) {
                m4j0Var = m4j0.a;
            } else {
                if (!(g3j0Var instanceof e3j0)) {
                    eg.o();
                    return null;
                }
                m4j0Var = l4j0.a;
            }
            h3j0Var.a = str;
            h3j0Var.b = tv80Var;
            h3j0Var.c = d3j0Var;
            h3j0Var.d = bundle;
            h3j0Var.g = 1;
            objB = this.b.b(m4j0Var, d3j0Var, h3j0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bundle = h3j0Var.d;
            d3j0Var = h3j0Var.c;
            tv80Var = h3j0Var.b;
            str = h3j0Var.a;
            hm5.M(objB);
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (zBooleanValue) {
            p1f0 p1f0VarW = rrn1.w(str);
            p1f0VarW.B(tv80Var);
            p1f0VarW.m(mno1.h(new mmr0[]{oqn1.n("message_metadata", d3j0Var)}));
            this.a.i(p1f0VarW.h(), bundle);
        }
        return yah0.m(zBooleanValue);
    }
}
