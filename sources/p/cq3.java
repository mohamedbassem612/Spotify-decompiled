package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cq3 extends hr3 {
    public final as3 a;

    public cq3(as3 as3Var) {
        this.a = as3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq3) && this.a == ((cq3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
