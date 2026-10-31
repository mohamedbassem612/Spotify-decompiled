package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ssg0 extends vsg0 {
    public final String a;

    public ssg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssg0) && u890.j(this.a, ((ssg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
