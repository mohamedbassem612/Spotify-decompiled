package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xow0 implements bpw0 {
    public final boolean a;

    public xow0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xow0) && this.a == ((xow0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
