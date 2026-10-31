package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gun implements iun {
    public final fun a;
    public final boolean b;

    public gun(fun funVar, boolean z) {
        this.a = funVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gun)) {
            return false;
        }
        gun gunVar = (gun) obj;
        return this.a.equals(gunVar.a) && this.b == gunVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
