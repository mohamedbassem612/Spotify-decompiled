package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class arl1 implements nbj1 {
    public final boolean a;

    public arl1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arl1) && this.a == ((arl1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
