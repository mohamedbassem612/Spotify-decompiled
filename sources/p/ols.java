package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ols {
    public final String a;
    public final String b;

    public ols(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ols)) {
            return false;
        }
        ols olsVar = (ols) obj;
        return u890.j(this.a, olsVar.a) && u890.j(this.b, olsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
