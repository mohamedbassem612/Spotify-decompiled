package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jzg1 implements may {
    public final String a;
    public final String b;
    public final lay c;

    public jzg1(String str, String str2, lay layVar) {
        this.a = str;
        this.b = str2;
        this.c = layVar;
    }

    @Override // p.may
    public final lay a() {
        return this.c;
    }

    @Override // p.may
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzg1)) {
            return false;
        }
        jzg1 jzg1Var = (jzg1) obj;
        return this.a.equals(jzg1Var.a) && this.b.equals(jzg1Var.b) && this.c.equals(jzg1Var.c);
    }

    @Override // p.may
    public final String getFormat() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
