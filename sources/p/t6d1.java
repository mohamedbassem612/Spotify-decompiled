package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t6d1 implements v6d1 {
    public final boolean a;

    public t6d1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6d1) && this.a == ((t6d1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
