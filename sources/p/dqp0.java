package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dqp0 {
    public final String a;
    public final poz b;

    public dqp0(String str, poz pozVar) {
        this.a = str;
        this.b = pozVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqp0)) {
            return false;
        }
        dqp0 dqp0Var = (dqp0) obj;
        return this.a.equals(dqp0Var.a) && this.b == dqp0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
