package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ofn implements ugn {
    public final String a;

    public ofn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofn) && u890.j(this.a, ((ofn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
