package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sj20 {
    public final String a;

    public sj20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj20) && u890.j(this.a, ((sj20) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}
