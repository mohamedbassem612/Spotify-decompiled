package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i3i0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public i3i0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3i0)) {
            return false;
        }
        i3i0 i3i0Var = (i3i0) obj;
        return u890.j(this.a, i3i0Var.a) && this.b.equals(i3i0Var.b) && u890.j(this.c, i3i0Var.c) && this.d.equals(i3i0Var.d) && this.e.equals(i3i0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
