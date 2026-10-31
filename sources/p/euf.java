package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class euf {
    public final String a;

    public euf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof euf) && u890.j(this.a, ((euf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
