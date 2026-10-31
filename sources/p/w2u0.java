package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w2u0 implements x2u0 {
    public final i1z a;

    public w2u0(i1z i1zVar) {
        this.a = i1zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2u0) && this.a.equals(((w2u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
