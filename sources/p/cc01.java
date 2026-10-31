package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cc01 implements dc01 {
    public final String a;

    public cc01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc01) && this.a.equals(((cc01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
