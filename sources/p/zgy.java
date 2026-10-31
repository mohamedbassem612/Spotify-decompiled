package p;

import java.util.BitSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zgy implements wf80 {
    public static final bv40 a;
    public static final bv40 b;
    public static final bv40 c;
    public static final bv40 d;

    static {
        cp5 cp5VarI = bv40.i();
        cp5VarI.e('0', '9');
        cp5VarI.e('A', 'F');
        cp5VarI.e('a', 'f');
        a = new bv40(cp5VarI);
        cp5 cp5VarI2 = bv40.i();
        cp5VarI2.e('0', '9');
        b = new bv40(cp5VarI2);
        cp5 cp5VarI3 = bv40.i();
        cp5VarI3.e('A', 'Z');
        cp5VarI3.e('a', 'z');
        bv40 bv40Var = new bv40(cp5VarI3);
        c = bv40Var;
        cp5 cp5VarO = bv40Var.o();
        cp5VarO.e('0', '9');
        d = new bv40(cp5VarO);
    }

    public static zhq0 b(d9z0 d9z0Var, yr31 yr31Var) {
        return new zhq0(new xzd1(yy60.a(yr31Var.d(d9z0Var, yr31Var.l()).b())), yr31Var.l(), (byte) 11);
    }

    @Override // p.wf80
    public final zhq0 a(ug80 ug80Var) {
        yr31 yr31Var = ug80Var.h;
        d9z0 d9z0VarL = yr31Var.l();
        yr31Var.h();
        char cK = yr31Var.k();
        if (cK != '#') {
            if (!((BitSet) c.b).get(cK)) {
                return null;
            }
            yr31Var.f(d);
            if (yr31Var.i(';')) {
                return b(d9z0VarL, yr31Var);
            }
            return null;
        }
        yr31Var.h();
        if (yr31Var.i('x') || yr31Var.i('X')) {
            int iF = yr31Var.f(a);
            if (1 > iF || iF > 6 || !yr31Var.i(';')) {
                return null;
            }
            return b(d9z0VarL, yr31Var);
        }
        int iF2 = yr31Var.f(b);
        if (1 > iF2 || iF2 > 7 || !yr31Var.i(';')) {
            return null;
        }
        return b(d9z0VarL, yr31Var);
    }
}
