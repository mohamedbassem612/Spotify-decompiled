package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class px20 {
    public final iu30 a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;

    public px20(iu30 iu30Var, boolean z) {
        this.a = iu30Var;
        this.b = z;
    }

    public final void a() {
        if (this.c) {
            int i = this.b ? this.d : 0;
            if (this.e && this.f == i) {
                return;
            }
            this.e = true;
            this.f = i;
            this.a.invoke(Integer.valueOf(i));
        }
    }

    public final int b() {
        return this.f;
    }
}
