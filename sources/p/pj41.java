package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public interface pj41 extends Comparable {
    @Override // java.lang.Comparable
    default int compareTo(Object obj) {
        pj41 pj41Var = (pj41) obj;
        if (equals(pj41Var)) {
            return 0;
        }
        oj41 oj41Var = oj41.a;
        if (equals(oj41Var)) {
            return 1;
        }
        mj41 mj41Var = mj41.a;
        if (pj41Var.equals(mj41Var)) {
            return 1;
        }
        if (equals(mj41Var) || pj41Var.equals(oj41Var)) {
            return -1;
        }
        return ((nj41) this).a > ((nj41) pj41Var).a ? 1 : -1;
    }
}
