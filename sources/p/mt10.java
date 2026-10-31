package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mt10 implements st10 {
    public final dw10 a;

    public mt10(dw10 dw10Var) {
        this.a = dw10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt10) && this.a.equals(((mt10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
