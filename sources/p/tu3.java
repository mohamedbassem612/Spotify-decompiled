package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tu3 {
    public final String a;

    public tu3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu3) && u890.j(this.a, ((tu3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
