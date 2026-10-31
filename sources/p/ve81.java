package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ve81 {
    public final String a;

    public ve81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve81) && this.a.equals(((ve81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
