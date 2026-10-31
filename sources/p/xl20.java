package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xl20 implements am20 {
    public final boolean a;

    public xl20(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl20) && this.a == ((xl20) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
