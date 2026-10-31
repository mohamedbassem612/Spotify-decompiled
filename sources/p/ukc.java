package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ukc extends jlc {
    public final boolean a;

    public ukc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukc) && this.a == ((ukc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
