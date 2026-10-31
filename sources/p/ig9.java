package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ig9 implements og9 {
    public final String a;

    public ig9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig9) && this.a.equals(((ig9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
