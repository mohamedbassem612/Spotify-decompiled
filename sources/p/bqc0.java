package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bqc0 implements cqc0 {
    public final aqc0 a;

    public bqc0(aqc0 aqc0Var) {
        this.a = aqc0Var;
    }

    @Override // p.cqc0
    public final aqc0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqc0) && this.a.equals(((bqc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
