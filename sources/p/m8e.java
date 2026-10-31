package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m8e {
    public final pu6 a;

    public m8e(pu6 pu6Var) {
        this.a = pu6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8e) && this.a.equals(((m8e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
