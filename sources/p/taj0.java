package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class taj0 {
    public final saj0 a;

    public taj0(saj0 saj0Var) {
        this.a = saj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof taj0) && this.a == ((taj0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
