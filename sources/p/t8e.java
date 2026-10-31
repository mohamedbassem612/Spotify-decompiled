package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t8e extends u8e {
    public final b881 a;

    public t8e(b881 b881Var) {
        this.a = b881Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8e) && this.a.equals(((t8e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
