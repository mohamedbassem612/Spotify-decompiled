package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jvh0 {
    public final gvh0 a;
    public int b = 1;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;

    public jvh0(gvh0 gvh0Var) {
        this.a = gvh0Var;
    }

    public final kvh0 a() {
        return new kvh0(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(boolean z) {
        this.d = z;
    }

    public final void c() {
        this.e = true;
    }

    public final void d(boolean z) {
        this.c = z;
    }

    public final void e(int i) {
        this.b = i;
    }
}
