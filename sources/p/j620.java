package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j620 extends p620 {
    public final String a;

    public j620(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j620) && u890.j(this.a, ((j620) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
