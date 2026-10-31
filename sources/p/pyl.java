package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface pyl extends qyl {
    @Override // p.qyl
    default Object foldIn(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }
}
