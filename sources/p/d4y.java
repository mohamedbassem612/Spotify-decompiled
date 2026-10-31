package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d4y {
    public final String a;
    public final String b;

    public d4y(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4y)) {
            return false;
        }
        d4y d4yVar = (d4y) obj;
        return u890.j(this.a, d4yVar.a) && u890.j(this.b, d4yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
