package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fr6 {
    public final String a;

    public fr6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr6) && this.a.equals(((fr6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
