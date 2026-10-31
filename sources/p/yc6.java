package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yc6 extends bd6 {
    public final String a;

    public yc6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yc6) && u890.j(this.a, ((yc6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
