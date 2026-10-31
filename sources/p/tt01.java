package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tt01 extends vt01 {
    public final cr01 a;

    public tt01(cr01 cr01Var) {
        this.a = cr01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt01) && this.a.equals(((tt01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
