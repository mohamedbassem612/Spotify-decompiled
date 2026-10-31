package p;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.spotify.messages.ScrollPerformance;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c0s implements hk30, rjp0 {
    public final zf10 a;
    public final ik30 b;
    public g931 c;

    public c0s(zf10 zf10Var, ik30 ik30Var) {
        this.a = zf10Var;
        this.b = ik30Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(bn70 bn70Var) {
        tj30 tj30Var;
        g931 g931Var = this.c;
        if (g931Var != null) {
            rl1 rl1Var = (rl1) ((hl00) g931Var.b).b;
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) rl1Var.c;
            rl1Var.c = new SparseIntArray[9];
            if (sparseIntArrayArr == null) {
                tj30Var = null;
            } else {
                SparseIntArray sparseIntArray = sparseIntArrayArr[0];
                int size = sparseIntArray.size();
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseIntArray.keyAt(i);
                    long jValueAt = sparseIntArray.valueAt(i);
                    j3 += jValueAt;
                    if (iKeyAt > 700) {
                        j += jValueAt;
                    }
                    if (iKeyAt > 16) {
                        j2 += jValueAt;
                    }
                }
                if (j3 > 0) {
                    tj30Var = new tj30(j, j2, j3);
                } else {
                    tj30Var = null;
                }
            }
            if (tj30Var != null) {
                String str = (String) g931Var.c;
                as41 as41VarN = ScrollPerformance.n();
                as41VarN.n(str);
                as41VarN.q((int) tj30Var.c);
                as41VarN.r(tj30Var.a);
                as41VarN.s(tj30Var.b);
                ((t2j0) g931Var.d).a(as41VarN.build());
            }
        }
        this.c = null;
        if (bn70Var != null) {
            n6r0 n6r0Var = bn70Var.a;
            this.c = (g931) this.a.invoke(n6r0Var.path() + ":" + n6r0Var.a() + ":" + bn70Var.b.a);
        }
    }

    public final void c() {
        ((war0) this.b.invoke()).d(this);
    }

    public final void d() {
        ((war0) this.b.invoke()).c(this);
        b(null);
    }

    public final void g(ViewGroup viewGroup) {
    }
}
