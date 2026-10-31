package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qnw extends tnw {
    public final String a;

    public qnw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnw) && u890.j(this.a, ((qnw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
