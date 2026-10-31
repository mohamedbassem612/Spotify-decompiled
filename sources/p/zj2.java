package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zj2 extends zr7 {
    public final String d;

    public zj2(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj2) && this.d.equals(((zj2) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
