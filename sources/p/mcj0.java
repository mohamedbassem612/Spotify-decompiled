package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mcj0 implements qcj0 {
    public final String a;

    public mcj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcj0) && this.a.equals(((mcj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
