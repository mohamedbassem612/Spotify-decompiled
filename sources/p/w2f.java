package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w2f implements q3f {
    public final String a;

    public w2f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2f) && u890.j(this.a, ((w2f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
