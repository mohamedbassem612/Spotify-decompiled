package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q5k {
    public final String a;
    public final String b;

    public q5k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5k)) {
            return false;
        }
        q5k q5kVar = (q5k) obj;
        return this.a.equals(q5kVar.a) && this.b.equals(q5kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
