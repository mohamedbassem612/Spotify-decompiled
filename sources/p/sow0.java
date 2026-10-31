package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sow0 implements vow0 {
    public final boolean a;

    public sow0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sow0) && this.a == ((sow0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
