package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rci1 implements vci1 {
    public final String a;

    public rci1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rci1) && u890.j(this.a, ((rci1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
