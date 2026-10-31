package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface qyl {
    default qyl a(qyl qylVar) {
        return qylVar == oyl.a ? this : new adh(this, qylVar);
    }

    Object foldIn(Object obj, vu30 vu30Var);
}
