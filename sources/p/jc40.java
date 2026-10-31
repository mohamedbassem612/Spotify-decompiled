package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jc40 extends k1u {
    public final String f;

    public jc40(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc40) && this.f.equals(((jc40) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
