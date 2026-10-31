package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ija {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e = "";

    public ija(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ija)) {
            return false;
        }
        ija ijaVar = (ija) obj;
        return this.a.equals(ijaVar.a) && this.b.equals(ijaVar.b) && this.c.equals(ijaVar.c) && this.d.equals(ijaVar.d) && this.e.equals(ijaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
