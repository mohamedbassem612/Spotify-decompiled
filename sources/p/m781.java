package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m781 {
    public final boolean a;

    public m781(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m781) && this.a == ((m781) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
