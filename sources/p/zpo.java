package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zpo {
    public final String a;
    public final String b;

    public zpo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpo)) {
            return false;
        }
        zpo zpoVar = (zpo) obj;
        return this.a.equals(zpoVar.a) && this.b.equals(zpoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
