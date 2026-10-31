package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o5k {
    public final String a;
    public final String b;

    public o5k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5k)) {
            return false;
        }
        o5k o5kVar = (o5k) obj;
        return this.a.equals(o5kVar.a) && this.b.equals(o5kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
