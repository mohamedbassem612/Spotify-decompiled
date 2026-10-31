package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zrh0 implements fsh0 {
    public final int a;

    public zrh0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrh0) && this.a == ((zrh0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
