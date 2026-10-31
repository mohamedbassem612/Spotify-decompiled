package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b2c1 extends c2c1 {
    public final ci2 a;

    public b2c1(ci2 ci2Var) {
        this.a = ci2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2c1) && this.a.equals(((b2c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
