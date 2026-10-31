package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eyi1 implements gyi1 {
    public final String a;

    public eyi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyi1) && this.a.equals(((eyi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
