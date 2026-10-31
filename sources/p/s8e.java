package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s8e extends u8e {
    public final rh90 a;

    public s8e(rh90 rh90Var) {
        this.a = rh90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8e) && this.a.equals(((s8e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
