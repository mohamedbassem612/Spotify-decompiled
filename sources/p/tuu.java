package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tuu implements wuu {
    public final String a;
    public final String b;

    public tuu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuu)) {
            return false;
        }
        tuu tuuVar = (tuu) obj;
        return u890.j(this.a, tuuVar.a) && this.b.equals(tuuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
