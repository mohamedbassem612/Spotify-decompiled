package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class twq {
    public final swq a;
    public final swq b;
    public final double c;

    public twq(swq swqVar, swq swqVar2, double d) {
        this.a = swqVar;
        this.b = swqVar2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twq)) {
            return false;
        }
        twq twqVar = (twq) obj;
        return this.a == twqVar.a && this.b == twqVar.b && Double.compare(this.c, twqVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
