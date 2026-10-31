package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class apm0 {
    public final int a;

    public apm0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apm0) && this.a == ((apm0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
