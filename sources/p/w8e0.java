package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w8e0 extends r4p1 {
    public final re70 c;

    public w8e0(re70 re70Var) {
        this.c = re70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8e0) && this.c.equals(((w8e0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final re70 z() {
        return this.c;
    }
}
