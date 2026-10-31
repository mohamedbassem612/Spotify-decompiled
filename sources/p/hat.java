package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hat extends iat {
    public final int a;

    public hat(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hat) && this.a == ((hat) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
