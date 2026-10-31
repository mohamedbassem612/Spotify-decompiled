package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mgy {
    public final String a;

    public mgy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgy) && u890.j(this.a, ((mgy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
