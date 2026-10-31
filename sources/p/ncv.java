package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ncv implements vcv {
    public final String a;

    public ncv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncv) && u890.j(this.a, ((ncv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
