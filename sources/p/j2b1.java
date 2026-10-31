package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j2b1 extends k2b1 {
    public final String a;

    public j2b1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2b1) && this.a.equals(((j2b1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
