package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jgd {
    public final phx a;
    public final phx b;
    public final String c;
    public final hux d;
    public final String e;
    public final boolean f;

    public jgd(phx phxVar, phx phxVar2, String str, hux huxVar, String str2, boolean z) {
        this.a = phxVar;
        this.b = phxVar2;
        this.c = str;
        this.d = huxVar;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgd)) {
            return false;
        }
        jgd jgdVar = (jgd) obj;
        return this.a.equals(jgdVar.a) && this.b.equals(jgdVar.b) && u890.j(this.c, jgdVar.c) && u890.j(this.d, jgdVar.d) && u890.j(this.e, jgdVar.e) && this.f == jgdVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(eqq.k(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
