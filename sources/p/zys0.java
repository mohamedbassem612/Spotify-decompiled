package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zys0 implements czs0 {
    public final int a;

    public zys0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zys0) && this.a == ((zys0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
