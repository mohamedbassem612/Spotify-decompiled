package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public interface qk41 extends Comparable {
    @Override // java.lang.Comparable
    default int compareTo(Object obj) {
        qk41 qk41Var = (qk41) obj;
        if (equals(qk41Var)) {
            return 0;
        }
        pk41 pk41Var = pk41.a;
        if (equals(pk41Var)) {
            return 1;
        }
        nk41 nk41Var = nk41.a;
        if (qk41Var.equals(nk41Var)) {
            return 1;
        }
        if (equals(nk41Var) || qk41Var.equals(pk41Var)) {
            return -1;
        }
        return ((ok41) this).a > ((ok41) qk41Var).a ? 1 : -1;
    }
}
