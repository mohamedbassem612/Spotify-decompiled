package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zgx {
    public final String a;
    public final gbx b;

    public zgx(String str, gbx gbxVar) {
        this.a = str;
        this.b = gbxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgx)) {
            return false;
        }
        zgx zgxVar = (zgx) obj;
        return u890.j(this.a, zgxVar.a) && this.b.equals(zgxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
