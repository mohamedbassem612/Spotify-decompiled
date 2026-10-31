package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tmm {
    public final String a;
    public final String b;

    public tmm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmm)) {
            return false;
        }
        tmm tmmVar = (tmm) obj;
        return u890.j(this.a, tmmVar.a) && u890.j(this.b, tmmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ tmm() {
        this("", "");
    }
}
