package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oet implements qet {
    public final String a;

    public oet(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oet) && this.a.equals(((oet) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
