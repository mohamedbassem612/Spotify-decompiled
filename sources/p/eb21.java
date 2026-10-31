package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eb21 {
    public final String a;

    public eb21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb21) && u890.j(this.a, ((eb21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
