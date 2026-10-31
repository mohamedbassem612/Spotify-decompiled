package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lcx {
    public final String a;
    public final gbx b;

    public lcx(String str, gbx gbxVar) {
        this.a = str;
        this.b = gbxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcx)) {
            return false;
        }
        lcx lcxVar = (lcx) obj;
        return u890.j(this.a, lcxVar.a) && this.b.equals(lcxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
