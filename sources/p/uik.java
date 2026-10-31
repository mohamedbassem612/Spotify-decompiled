package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uik extends vik {
    public final String a;

    public uik(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uik) && this.a.equals(((uik) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
