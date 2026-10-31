package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x640 implements d740 {
    public final String a;
    public final int b;
    public final boolean c;

    public x640(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x640)) {
            return false;
        }
        x640 x640Var = (x640) obj;
        return u890.j(this.a, x640Var.a) && this.b == x640Var.b && this.c == x640Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
