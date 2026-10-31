package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class apw0 implements bpw0 {
    public final boolean a;

    public apw0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apw0) && this.a == ((apw0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
