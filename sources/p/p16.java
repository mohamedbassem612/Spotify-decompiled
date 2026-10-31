package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p16 {
    public final String a;

    public p16(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p16) && this.a.equals(((p16) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
