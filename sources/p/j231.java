package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j231 extends m331 {
    public final String a;

    public j231(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j231) && u890.j(this.a, ((j231) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
