package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rnh implements snh {
    public final String a;

    public rnh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnh) && u890.j(this.a, ((rnh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
