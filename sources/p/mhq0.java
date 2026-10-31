package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mhq0 implements may {
    public final String a;
    public final String b;
    public final lay c;

    public mhq0(String str, String str2, lay layVar) {
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
        if (!(obj instanceof mhq0)) {
            return false;
        }
        mhq0 mhq0Var = (mhq0) obj;
        return this.a.equals(mhq0Var.a) && this.b.equals(mhq0Var.b) && this.c.equals(mhq0Var.c);
    }

    @Override // p.may
    public final String getFormat() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
