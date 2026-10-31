package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kc40 extends k1u {
    public final String f;

    public kc40(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc40) && this.f.equals(((kc40) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
