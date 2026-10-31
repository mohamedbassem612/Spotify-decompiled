package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zx31 implements qm70 {
    public final String a;

    public zx31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx31) && this.a.equals(((zx31) obj).a);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
