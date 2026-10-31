package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wwg1 {
    public final String a;
    public final int b;
    public final short c;
    public int d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    public wwg1(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = os00.INVALID_ID;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        eg.m("generateNewId() must be called before retrieving ids.");
    }

    public wwg1(int i, int i2) {
        this(os00.INVALID_ID, i, i2);
    }
}
