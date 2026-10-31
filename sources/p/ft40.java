package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface ft40 extends gt40 {
    @Override // p.gt40
    default boolean a(iu30 iu30Var) {
        return ((Boolean) iu30Var.invoke(this)).booleanValue();
    }

    @Override // p.gt40
    default boolean b() {
        return Boolean.TRUE.booleanValue();
    }

    @Override // p.gt40
    default Object foldIn(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }
}
