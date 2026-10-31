package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class niw0 extends oiw0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public niw0(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niw0)) {
            return false;
        }
        niw0 niw0Var = (niw0) obj;
        return u890.j(this.a, niw0Var.a) && u890.j(this.b, niw0Var.b) && this.c == niw0Var.c && this.d == niw0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
