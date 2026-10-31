package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zxd0 implements azd0 {
    public final String a;

    public zxd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxd0) && this.a.equals(((zxd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
