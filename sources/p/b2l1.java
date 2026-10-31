package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b2l1 extends j2l1 {
    public final String a;

    public b2l1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2l1) && this.a.equals(((b2l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
