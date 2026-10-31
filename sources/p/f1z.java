package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f1z {
    public final String a;
    public final String b;
    public final String c;
    public final ben d;

    public f1z(String str, String str2, String str3, ben benVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = benVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1z)) {
            return false;
        }
        f1z f1zVar = (f1z) obj;
        return this.a.equals(f1zVar.a) && this.b.equals(f1zVar.b) && this.c.equals(f1zVar.c) && this.d.equals(f1zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
