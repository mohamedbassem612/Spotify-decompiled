package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mx0 extends px0 {
    public final ji0 a;

    public mx0(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx0) && this.a.equals(((mx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
