package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class afk {
    public final String a;

    public afk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afk) && u890.j(this.a, ((afk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
