package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d261 {
    public final String a;
    public final vu30 b;
    public final boolean c;

    public /* synthetic */ d261(String str) {
        this(str, (vu30) new f6f0((byte) 12));
    }

    public final String toString() {
        return l1d.m("AccessibilityKey: ", this.a);
    }

    public d261(String str, vu30 vu30Var) {
        this.a = str;
        this.b = vu30Var;
    }

    public d261(String str, int i) {
        this(str);
        this.c = true;
    }

    public d261(String str, boolean z, vu30 vu30Var) {
        this(str, vu30Var);
        this.c = z;
    }
}
