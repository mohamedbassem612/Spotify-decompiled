package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f1i1 extends omo1 {
    public final mmo1 c;

    public f1i1(mmo1 mmo1Var) {
        this.c = mmo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1i1) && this.c.equals(((f1i1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
