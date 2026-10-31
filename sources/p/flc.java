package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class flc extends jlc {
    public final o6p1 a;

    public flc(o6p1 o6p1Var) {
        this.a = o6p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flc) && this.a.equals(((flc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
