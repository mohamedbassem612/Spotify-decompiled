package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h3c implements j3c {
    public final s2c a;

    public h3c(s2c s2cVar) {
        this.a = s2cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3c) && u890.j(this.a, ((h3c) obj).a);
    }

    public final int hashCode() {
        s2c s2cVar = this.a;
        if (s2cVar == null) {
            return 0;
        }
        return s2cVar.hashCode();
    }
}
