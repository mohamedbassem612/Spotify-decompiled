package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bw81 implements qq60 {
    public final fw81 a;
    public final String b;

    public bw81(fw81 fw81Var, String str) {
        this.a = fw81Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw81)) {
            return false;
        }
        bw81 bw81Var = (bw81) obj;
        return this.a.equals(bw81Var.a) && this.b.equals(bw81Var.b);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
