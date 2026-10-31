package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o7d implements v7d {
    public final String a;
    public final String b;

    public o7d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7d)) {
            return false;
        }
        o7d o7dVar = (o7d) obj;
        return u890.j(this.a, o7dVar.a) && u890.j(this.b, o7dVar.b);
    }

    public final t7d getStatus() {
        return t7d.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((t7d.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
