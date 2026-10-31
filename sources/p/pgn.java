package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pgn implements ugn {
    public final String a;

    public pgn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgn) && this.a.equals(((pgn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
