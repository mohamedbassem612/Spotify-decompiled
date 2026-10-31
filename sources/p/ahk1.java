package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ahk1 {
    public final String a;
    public final c380 b;
    public final String c;
    public final String d;
    public final String e;

    public ahk1(String str, c380 c380Var, String str2, String str3, String str4) {
        this.a = str;
        this.b = c380Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahk1)) {
            return false;
        }
        ahk1 ahk1Var = (ahk1) obj;
        return u890.j(this.a, ahk1Var.a) && u890.j(this.b, ahk1Var.b) && u890.j(this.c, ahk1Var.c) && u890.j(this.d, ahk1Var.d) && u890.j(this.e, ahk1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
