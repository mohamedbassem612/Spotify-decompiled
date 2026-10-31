package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface gt40 {
    boolean a(iu30 iu30Var);

    boolean b();

    default gt40 c(gt40 gt40Var) {
        return gt40Var == et40.a ? this : new sch(this, gt40Var);
    }

    Object foldIn(Object obj, vu30 vu30Var);
}
