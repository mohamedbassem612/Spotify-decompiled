package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jnu0 implements knu0 {
    public final boolean a;

    public jnu0(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnu0) && this.a == ((jnu0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
