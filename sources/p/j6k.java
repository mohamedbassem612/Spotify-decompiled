package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j6k implements ez00 {
    public final String a;
    public final String b;
    public final yqk c;

    public j6k(String str, String str2, yqk yqkVar) {
        this.a = str;
        this.b = str2;
        this.c = yqkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6k)) {
            return false;
        }
        j6k j6kVar = (j6k) obj;
        return this.a.equals(j6kVar.a) && this.b.equals(j6kVar.b) && this.c.equals(j6kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
