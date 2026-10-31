package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hp81 extends eq81 {
    public final boolean a;

    public hp81(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp81) && this.a == ((hp81) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
