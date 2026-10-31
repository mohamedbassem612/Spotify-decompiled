package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jwg {
    public static final jwg d = new jwg(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    public final int a;
    public final int b;
    public final boolean c;

    public /* synthetic */ jwg(int i, int i2, boolean z) {
        this.c = z;
        this.a = i;
        this.b = i2;
    }

    public static jwg a(int i) {
        return new jwg(i, -1, false);
    }

    public int b() {
        dm5.y(this.c);
        return this.b;
    }

    public int c() {
        dm5.y(this.c);
        return this.a;
    }

    public boolean d() {
        return this.c;
    }
}
