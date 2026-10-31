package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m1i1 extends n1i1 {
    public final String a;

    public m1i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1i1) && this.a.equals(((m1i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
