package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ogt0 implements sgt0 {
    public final String a;
    public final String b;

    public ogt0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // p.sgt0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogt0)) {
            return false;
        }
        ogt0 ogt0Var = (ogt0) obj;
        return this.a.equals(ogt0Var.a) && u890.j(this.b, ogt0Var.b);
    }

    @Override // p.sgt0
    public final String getContextUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
