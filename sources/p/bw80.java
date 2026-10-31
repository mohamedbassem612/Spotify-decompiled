package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bw80 extends cw80 {
    public final di8 a;

    public bw80(di8 di8Var) {
        this.a = di8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw80) && this.a.equals(((bw80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
