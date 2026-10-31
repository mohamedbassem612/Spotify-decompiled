package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface oim0 extends qim0 {
    @Override // p.qim0
    default boolean all(iu30 iu30Var) {
        return ((Boolean) iu30Var.invoke(this)).booleanValue();
    }

    @Override // p.qim0
    default Object foldIn(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }
}
