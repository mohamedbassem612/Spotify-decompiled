package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ji11 {
    public final String a;

    public ji11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji11) && this.a.equals(((ji11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
