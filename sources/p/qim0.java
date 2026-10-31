package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface qim0 {
    boolean all(iu30 iu30Var);

    Object foldIn(Object obj, vu30 vu30Var);

    default qim0 then(qim0 qim0Var) {
        return qim0Var == nim0.a ? this : new bdh(this, qim0Var);
    }
}
