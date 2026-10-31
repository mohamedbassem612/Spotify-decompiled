package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rpe0 extends spe0 {
    public final String a;

    public rpe0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpe0) && u890.j(this.a, ((rpe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
