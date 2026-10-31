package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class usy0 extends xfo1 {
    public final boolean b;

    public usy0(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usy0) && this.b == ((usy0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
