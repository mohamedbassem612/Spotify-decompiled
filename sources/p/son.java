package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class son {
    public final String a;
    public final String b;
    public final String c;
    public final h290 d;

    public son(String str, String str2, String str3, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof son)) {
            return false;
        }
        son sonVar = (son) obj;
        return this.a.equals(sonVar.a) && this.b.equals(sonVar.b) && this.c.equals(sonVar.c) && this.d.equals(sonVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
