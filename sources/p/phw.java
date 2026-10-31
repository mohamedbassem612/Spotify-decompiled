package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class phw implements eiw {
    public final String a;
    public final String b;

    public phw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phw)) {
            return false;
        }
        phw phwVar = (phw) obj;
        return this.a.equals(phwVar.a) && this.b.equals(phwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
