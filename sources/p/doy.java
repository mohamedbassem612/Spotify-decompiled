package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class doy {
    public final String a;
    public final String b;

    public doy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doy)) {
            return false;
        }
        doy doyVar = (doy) obj;
        return this.a.equals(doyVar.a) && u890.j(this.b, doyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
