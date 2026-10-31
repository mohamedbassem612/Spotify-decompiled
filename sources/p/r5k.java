package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r5k {
    public final String a;
    public final String b;

    public r5k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5k)) {
            return false;
        }
        r5k r5kVar = (r5k) obj;
        return this.a.equals(r5kVar.a) && this.b.equals(r5kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
