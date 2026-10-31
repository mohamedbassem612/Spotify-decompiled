package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sq8 {
    public wq8 a;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public final tq8 a() {
        wq8 wq8Var = this.a;
        int i = this.b;
        if (i != 0) {
            return new tq8(wq8Var, i, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        eg.m("Required value was null.");
        return null;
    }
}
