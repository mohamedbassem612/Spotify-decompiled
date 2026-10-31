package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pj10 implements vj10 {
    public final String a;

    public pj10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj10) && this.a.equals(((pj10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
