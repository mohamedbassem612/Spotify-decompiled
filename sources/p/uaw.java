package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uaw {
    public final String a;

    public uaw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uaw) && u890.j(this.a, ((uaw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
