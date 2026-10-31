package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pav0 implements lav0 {
    public iu30 a;
    public gqb0 b;
    public boolean c;
    public final oav0 d = new oav0(this);

    public final iu30 a() {
        iu30 iu30Var = this.a;
        if (iu30Var != null) {
            return iu30Var;
        }
        u890.C("onTouchEvent");
        throw null;
    }

    public final kav0 getPointerInputFilter() {
        return this.d;
    }
}
