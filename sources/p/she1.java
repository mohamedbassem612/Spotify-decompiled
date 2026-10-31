package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class she1 implements uhe1 {
    public final String a;

    public she1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof she1) && this.a.equals(((she1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
