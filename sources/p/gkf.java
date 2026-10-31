package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gkf {
    public final j7d a;
    public final boolean b;

    public gkf(j7d j7dVar, boolean z) {
        this.a = j7dVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkf)) {
            return false;
        }
        gkf gkfVar = (gkf) obj;
        return this.a == gkfVar.a && this.b == gkfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
