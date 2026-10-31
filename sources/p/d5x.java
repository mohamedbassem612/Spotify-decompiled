package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d5x implements c5x {
    public final int a;
    public int b = -1;
    public int c = -1;

    public d5x(int i) {
        this.a = i;
    }

    public final boolean c(CharSequence charSequence, int i, int i2, a2h1 a2h1Var) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    public final Object getResult() {
        return this;
    }
}
