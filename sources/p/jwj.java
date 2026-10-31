package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jwj {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;

    public jwj(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwj)) {
            return false;
        }
        jwj jwjVar = (jwj) obj;
        return u890.j(this.a, jwjVar.a) && this.b == jwjVar.b && u890.j(this.c, jwjVar.c) && u890.j(this.d, jwjVar.d) && this.e == jwjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
