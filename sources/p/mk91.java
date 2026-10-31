package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mk91 extends yk91 {
    public final boolean a;

    public mk91(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk91) && this.a == ((mk91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
