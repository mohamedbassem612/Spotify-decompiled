package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k4c0 implements wu30 {
    public final Object apply(Object obj) {
        d4c0 d4c0Var = (d4c0) obj;
        vqo1 vqo1Var = d4c0Var.a;
        if (!(vqo1Var instanceof i4c0)) {
            if (vqo1Var instanceof j4c0) {
                return l4c0.b;
            }
            eg.o();
            return null;
        }
        int i = ((i4c0) vqo1Var).c;
        if (i == 2) {
            return l4c0.c;
        }
        if (i == 1) {
            return l4c0.e;
        }
        return d4c0Var.b ? l4c0.a : l4c0.d;
    }
}
