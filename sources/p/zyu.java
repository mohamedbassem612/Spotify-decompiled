package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zyu {
    public final String a;
    public final String b;

    public zyu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyu)) {
            return false;
        }
        zyu zyuVar = (zyu) obj;
        return u890.j(this.a, zyuVar.a) && u890.j(this.b, zyuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
