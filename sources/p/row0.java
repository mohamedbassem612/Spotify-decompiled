package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class row0 implements vow0 {
    public final boolean a;

    public row0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof row0) && this.a == ((row0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
