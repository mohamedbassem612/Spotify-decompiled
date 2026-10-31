package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ldz {
    public final String a;

    public ldz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldz) && this.a.equals(((ldz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
