package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ahe {
    public final String a;
    public final String b;

    public ahe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahe)) {
            return false;
        }
        ahe aheVar = (ahe) obj;
        return u890.j(this.a, aheVar.a) && u890.j(this.b, aheVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
