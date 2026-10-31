package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zl21 {
    public final String a;

    public zl21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl21) && this.a.equals(((zl21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
