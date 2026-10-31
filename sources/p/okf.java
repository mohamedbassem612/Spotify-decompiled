package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class okf implements pkf {
    public final String a;

    public okf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okf) && u890.j(this.a, ((okf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
