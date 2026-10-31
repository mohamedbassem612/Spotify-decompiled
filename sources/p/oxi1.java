package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oxi1 extends sxi1 {
    public final String a;

    public oxi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxi1) && this.a.equals(((oxi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
