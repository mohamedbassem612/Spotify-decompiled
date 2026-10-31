package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zac1 extends ebc1 {
    public final u4c1 a;

    public zac1(u4c1 u4c1Var) {
        this.a = u4c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zac1) && this.a.equals(((zac1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
