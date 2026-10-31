package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ofq0 {
    public final String a;

    public ofq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofq0) && u890.j(this.a, ((ofq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
