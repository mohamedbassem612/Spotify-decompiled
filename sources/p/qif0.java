package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qif0 implements yif0 {
    public final boolean a;

    public qif0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qif0) && this.a == ((qif0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
