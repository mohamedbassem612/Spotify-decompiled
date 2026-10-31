package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qnk implements snk {
    public final String a;

    public qnk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnk) && u890.j(this.a, ((qnk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
