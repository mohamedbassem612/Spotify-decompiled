package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ar implements dr {
    public final boolean a;

    public ar(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar) && this.a == ((ar) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
