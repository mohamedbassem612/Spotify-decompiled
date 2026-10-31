package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwn {
    public final String a;

    public zwn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zwn) && this.a.equals(((zwn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
