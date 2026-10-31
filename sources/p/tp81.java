package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tp81 extends eq81 {
    public final zc40 a;

    public tp81(zc40 zc40Var) {
        this.a = zc40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp81) && this.a.equals(((tp81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
