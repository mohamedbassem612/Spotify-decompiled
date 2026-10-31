package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class off1 implements uff1 {
    public final boolean a;

    public off1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof off1) && this.a == ((off1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
