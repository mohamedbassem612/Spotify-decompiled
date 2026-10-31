package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ytx0 extends qqn1 {
    public final ktx0 c;

    public ytx0(ktx0 ktx0Var) {
        this.c = ktx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytx0) && u890.j(this.c, ((ytx0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
