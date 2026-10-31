package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h5i1 implements r5i1 {
    public final String a;

    public h5i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5i1) && this.a.equals(((h5i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
