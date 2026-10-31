package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vi91 extends zi91 {
    public final tl91 a;

    public vi91(tl91 tl91Var) {
        this.a = tl91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vi91) && u890.j(this.a, ((vi91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
