package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ek40 extends ck40 {
    public final String a;
    public final String b;
    public final boolean c;

    public ek40(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek40)) {
            return false;
        }
        ek40 ek40Var = (ek40) obj;
        return u890.j(this.a, ek40Var.a) && u890.j(this.b, ek40Var.b) && this.c == ek40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
