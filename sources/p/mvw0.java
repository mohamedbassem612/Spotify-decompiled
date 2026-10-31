package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mvw0 extends qvw0 {
    public final boolean a;

    public mvw0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvw0) && this.a == ((mvw0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
