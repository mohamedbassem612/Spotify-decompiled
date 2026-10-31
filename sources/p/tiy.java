package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tiy extends viy {
    public final boolean a;

    public tiy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tiy) && this.a == ((tiy) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
