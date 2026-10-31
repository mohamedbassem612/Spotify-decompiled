package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j070 implements q070 {
    public final String a;

    public j070(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j070) && this.a.equals(((j070) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
