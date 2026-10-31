package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h251 implements k251 {
    public final String a;

    public h251(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h251) && this.a.equals(((h251) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
