package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class raz {
    public final String a;
    public final String b;
    public final String c;
    public final k4m d;
    public final boolean e;

    public raz(String str, String str2, String str3, k4m k4mVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k4mVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raz)) {
            return false;
        }
        raz razVar = (raz) obj;
        return u890.j(this.a, razVar.a) && u890.j(this.b, razVar.b) && u890.j(this.c, razVar.c) && this.d == razVar.d && this.e == razVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p3d1.g(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
