package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ehm implements khm {
    public final String a;

    public ehm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehm) && this.a.equals(((ehm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
