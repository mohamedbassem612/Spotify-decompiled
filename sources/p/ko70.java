package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ko70 {
    public final String a;

    public ko70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko70) && u890.j(this.a, ((ko70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
