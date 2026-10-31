package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tdf implements bef {
    public final String a;
    public final String b;

    public tdf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdf)) {
            return false;
        }
        tdf tdfVar = (tdf) obj;
        return u890.j(this.a, tdfVar.a) && u890.j(this.b, tdfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
