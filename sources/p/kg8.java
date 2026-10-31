package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kg8 extends byo1 {
    public final p450 c;

    public kg8(p450 p450Var) {
        this.c = p450Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg8) && u890.j(this.c, ((kg8) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
