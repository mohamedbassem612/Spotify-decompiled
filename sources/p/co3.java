package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class co3 extends qxd0 {
    public final as3 d;

    public co3(as3 as3Var) {
        this.d = as3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co3) && this.d == ((co3) obj).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
