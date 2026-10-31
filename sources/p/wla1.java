package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wla1 implements yla1 {
    public final zjd1 a;

    public wla1(zjd1 zjd1Var) {
        this.a = zjd1Var;
    }

    public final zjd1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wla1) && this.a.equals(((wla1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
