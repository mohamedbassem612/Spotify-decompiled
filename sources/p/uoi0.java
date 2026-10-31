package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uoi0 implements voi0 {
    public final String a;

    public uoi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uoi0) && this.a.equals(((uoi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
