package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class stb0 implements wu91 {
    public final /* synthetic */ xtb0 a;
    public final /* synthetic */ xu91 b;

    public stb0(xtb0 xtb0Var, xu91 xu91Var) {
        this.a = xtb0Var;
        this.b = xu91Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    public final float a(float f) {
        xtb0 xtb0Var = this.a;
        List list = xtb0Var.h().l;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            qtb0 qtb0Var = (qtb0) list.get(i);
            qtb0 qtb0Var2 = qtb0Var != null ? qtb0Var : null;
            if (qtb0Var2 == null || !qtb0Var2.w) {
                int iD = pno1.d(xtb0Var.h());
                int i2 = -xtb0Var.h().m;
                int i3 = xtb0Var.h().r;
                int i4 = qtb0Var.q;
                int i5 = qtb0Var.p;
                int i6 = xtb0Var.h().o;
                float fA = i5 - this.b.a(iD, i4, i2, i3);
                if (fA <= 0.0f && fA > f3) {
                    f3 = fA;
                }
                if (fA >= 0.0f && fA < f2) {
                    f2 = fA;
                }
            }
        }
        char c = Math.abs(f) >= ((ptb0) xtb0Var.f.getValue()).i.X0(400.0f) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c == 0) {
            if (Math.abs(f2) <= Math.abs(f3)) {
                f3 = f2;
            }
        } else if (c == 1) {
            f3 = f2;
        } else if (c != 2) {
            f3 = 0.0f;
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }

    public final float b(float f, float f2) {
        float fAbs = Math.abs(f2);
        List list = this.a.h().l;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            int size2 = list.size();
            int i2 = 0;
            while (i < size2) {
                i2 += ((qtb0) list.get(i)).q;
                i++;
            }
            i = i2 / size;
        }
        float f3 = fAbs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }
}
