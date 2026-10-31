package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dye implements nye {
    public final xwu a;

    public dye(xwu xwuVar) {
        this.a = xwuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dye) && u890.j(this.a, ((dye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
