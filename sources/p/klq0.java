package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class klq0 {
    public final int a;
    public final int b;

    public /* synthetic */ klq0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        hf91Var.a(a9aVar.l(0));
    }

    public s340 b(a9a a9aVar) {
        return null;
    }

    public final String toString() {
        String strR = rc11.a.b(getClass()).r();
        return strR == null ? "" : strR;
    }

    public klq0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
