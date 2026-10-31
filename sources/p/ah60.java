package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ah60 implements bh60 {
    public final String a;

    public ah60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah60) && this.a.equals(((ah60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
