package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f0d1 extends fuo1 {
    public final buo1 b;

    public f0d1(buo1 buo1Var) {
        this.b = buo1Var;
    }

    public final buo1 E() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0d1) && this.b.equals(((f0d1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
