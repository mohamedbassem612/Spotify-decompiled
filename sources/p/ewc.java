package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ewc extends hwc {
    public final boolean a;

    public ewc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewc) && this.a == ((ewc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
