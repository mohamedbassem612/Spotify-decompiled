package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bdg0 extends fdg0 {
    public final boolean a;

    public bdg0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdg0) && this.a == ((bdg0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
