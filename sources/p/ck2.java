package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ck2 extends zr7 {
    public final String d;

    public ck2(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck2) && this.d.equals(((ck2) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
