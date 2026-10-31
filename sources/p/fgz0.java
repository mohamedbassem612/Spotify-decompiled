package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fgz0 {
    public final xtb0 a;
    public final hrr0 b = v8r.q(Boolean.FALSE);
    public final mdt c = yv91.a(new egz0(this, (byte) 1));
    public final mdt d;

    public fgz0(xtb0 xtb0Var) {
        this.a = xtb0Var;
        yv91.a(new egz0(this, (byte) 2));
        this.d = yv91.a(new egz0(this, (byte) 0));
    }

    public final int a(float f) {
        ptb0 ptb0VarH = this.a.h();
        int i = ptb0VarH.o;
        List list = ptb0VarH.l;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((qtb0) it.next()).q));
        }
        int i2 = ptb0VarH.n - ptb0VarH.m;
        if (i != 0 && !arrayList.isEmpty()) {
            float fH0 = (float) o7h.h0(arrayList);
            if (fH0 > 0.0f) {
                float f2 = (i * fH0) - i2;
                if (f2 > 0.0f) {
                    return yoi1.p((int) ((f * f2) / fH0), 0, i - 1);
                }
            }
        }
        return 0;
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final int c(int i) {
        int i2 = this.a.h().o;
        if (i2 != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (i3 == i) {
                    return i4;
                }
                i3++;
            }
            int i5 = i2 - 1;
            if (i5 >= 0) {
                return i5;
            }
        }
        return 0;
    }
}
