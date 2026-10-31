package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ws41 {
    public static final us41 a = new us41();
    public static final ts41 b = new ts41();
    public static final kkr0 c = new kkr0((byte) 1);

    public static qim0 a(qim0 qim0Var, ct41 ct41Var, qqq0 qqq0Var, n201 n201Var, boolean z, boolean z2, idn0 idn0Var, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            idn0Var = null;
        }
        return qim0Var.then(new ss41(ct41Var, qqq0Var, n201Var, z3, z4, (iq20) null, idn0Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(du41 du41Var, long j, onm onmVar) {
        vs41 vs41Var;
        m811 m811Var;
        du41 du41Var2;
        if (onmVar instanceof vs41) {
            vs41Var = (vs41) onmVar;
            int i = vs41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs41Var.d = i - Integer.MIN_VALUE;
            } else {
                vs41Var = new vs41(onmVar);
            }
        } else {
            vs41Var = new vs41(onmVar);
        }
        Object obj = vs41Var.c;
        int i2 = vs41Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            m811Var = new m811();
            xn2 xn2Var = new xn2(du41Var, j, m811Var, (lnm) null, (byte) 12);
            vs41Var.a = du41Var;
            vs41Var.b = m811Var;
            vs41Var.d = 1;
            Object objG = du41Var.g(hfn0.a, xn2Var, vs41Var);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
            du41Var2 = du41Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m811 m811Var2 = vs41Var.b;
            du41 du41Var3 = vs41Var.a;
            hm5.M(obj);
            m811Var = m811Var2;
            du41Var2 = du41Var3;
        }
        return new Offset(du41Var2.i(m811Var.a));
    }
}
