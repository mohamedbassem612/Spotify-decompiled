package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zak implements abk {
    public final String a;
    public final String b;

    public zak(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zak)) {
            return false;
        }
        zak zakVar = (zak) obj;
        return this.a.equals(zakVar.a) && this.b.equals(zakVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
