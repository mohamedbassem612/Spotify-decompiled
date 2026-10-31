package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yac1 extends ebc1 {
    public final eb71 a;

    public yac1(eb71 eb71Var) {
        this.a = eb71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yac1) && this.a == ((yac1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
