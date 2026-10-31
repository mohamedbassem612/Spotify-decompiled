package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rfv {
    public final String a;

    public rfv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfv) && u890.j(this.a, ((rfv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
