package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r4w {
    public final String a;
    public final String b;

    public r4w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4w)) {
            return false;
        }
        r4w r4wVar = (r4w) obj;
        return u890.j(this.a, r4wVar.a) && u890.j(this.b, r4wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
