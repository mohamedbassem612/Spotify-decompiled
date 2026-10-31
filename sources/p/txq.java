package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class txq implements uxq {
    public final String a;

    public txq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txq) && this.a.equals(((txq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
