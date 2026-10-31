package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ivf1 implements caz0 {
    public final hjf1 a;
    public final String b;

    public ivf1(hjf1 hjf1Var) {
        this.a = hjf1Var;
        this.b = hjf1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivf1) && this.a.equals(((ivf1) obj).a);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
