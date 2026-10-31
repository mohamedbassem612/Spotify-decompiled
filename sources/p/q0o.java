package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q0o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public q0o(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0o)) {
            return false;
        }
        q0o q0oVar = (q0o) obj;
        return this.a.equals(q0oVar.a) && this.b.equals(q0oVar.b) && this.c.equals(q0oVar.c) && this.d.equals(q0oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
