package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oi8 {
    public final ck8 a;

    public oi8(ck8 ck8Var) {
        this.a = ck8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi8) && this.a.equals(((oi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
