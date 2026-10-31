package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aye implements nye {
    public final String a;
    public final String b;
    public final tom c;
    public final boolean d;

    public aye(String str, String str2, tom tomVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = tomVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aye)) {
            return false;
        }
        aye ayeVar = (aye) obj;
        return u890.j(this.a, ayeVar.a) && u890.j(this.b, ayeVar.b) && this.c.equals(ayeVar.c) && this.d == ayeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
