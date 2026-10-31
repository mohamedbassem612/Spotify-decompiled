package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mj50 implements nj50 {
    public final boolean a;

    public mj50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mj50) && this.a == ((mj50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
