package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mdc0 {
    public final boolean a;

    public mdc0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdc0) && this.a == ((mdc0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
