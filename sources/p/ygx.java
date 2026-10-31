package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ygx {
    public final String a;
    public final gbx b;

    public ygx(String str, gbx gbxVar) {
        this.a = str;
        this.b = gbxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygx)) {
            return false;
        }
        ygx ygxVar = (ygx) obj;
        return u890.j(this.a, ygxVar.a) && this.b.equals(ygxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
