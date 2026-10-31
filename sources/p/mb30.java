package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mb30 implements ob30 {
    public final boolean a;

    public mb30(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb30) && this.a == ((mb30) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
