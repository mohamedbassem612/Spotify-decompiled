package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t49 extends c59 {
    public final boolean a;

    public t49(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t49) && this.a == ((t49) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
