package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r8e extends u8e {
    public final mh90 a;

    public r8e(mh90 mh90Var) {
        this.a = mh90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8e) && this.a.equals(((r8e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
