package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kyd {
    public final boolean a;

    public kyd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyd) && this.a == ((kyd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
