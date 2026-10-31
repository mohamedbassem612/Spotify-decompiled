package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wcg0 extends fdg0 {
    public final boolean a;

    public wcg0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcg0) && this.a == ((wcg0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
