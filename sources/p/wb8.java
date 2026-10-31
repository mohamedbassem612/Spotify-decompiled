package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wb8 {
    public final String a;

    public wb8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb8) && this.a.equals(((wb8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
