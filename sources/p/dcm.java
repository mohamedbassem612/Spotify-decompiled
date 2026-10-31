package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dcm {
    public final String a;
    public final String b;
    public final dq70 c;

    public dcm(String str, String str2, dq70 dq70Var) {
        this.a = str;
        this.b = str2;
        this.c = dq70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcm)) {
            return false;
        }
        dcm dcmVar = (dcm) obj;
        return this.a.equals(dcmVar.a) && this.b.equals(dcmVar.b) && this.c.equals(dcmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
