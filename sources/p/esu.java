package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class esu {
    public final String a;

    public esu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esu) && u890.j(this.a, ((esu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
