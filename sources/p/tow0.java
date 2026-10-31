package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tow0 implements vow0 {
    public final boolean a;

    public tow0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tow0) && this.a == ((tow0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
