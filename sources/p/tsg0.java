package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tsg0 extends vsg0 {
    public final String a;

    public tsg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsg0) && u890.j(this.a, ((tsg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
