package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fru {
    public final String a;
    public final String b;

    public fru(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fru)) {
            return false;
        }
        fru fruVar = (fru) obj;
        return this.a.equals(fruVar.a) && this.b.equals(fruVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
