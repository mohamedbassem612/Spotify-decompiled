package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ki60 {
    public final String a;

    public ki60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki60) && this.a.equals(((ki60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
