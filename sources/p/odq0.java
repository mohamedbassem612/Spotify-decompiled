package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class odq0 implements ceq0 {
    public final boolean a;

    public odq0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odq0) && this.a == ((odq0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
