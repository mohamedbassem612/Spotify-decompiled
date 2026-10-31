package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t0o implements z0i {
    public final String a;
    public final s0o b;
    public final String c;
    public final String d;
    public final q0o e;
    public final String f;

    public t0o(String str, s0o s0oVar, String str2, String str3, q0o q0oVar, String str4) {
        this.a = str;
        this.b = s0oVar;
        this.c = str2;
        this.d = str3;
        this.e = q0oVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0o)) {
            return false;
        }
        t0o t0oVar = (t0o) obj;
        return this.a.equals(t0oVar.a) && this.b.equals(t0oVar.b) && this.c.equals(t0oVar.c) && this.d.equals(t0oVar.d) && this.e.equals(t0oVar.e) && this.f.equals(t0oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }
}
