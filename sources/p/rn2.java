package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rn2 implements tn2 {
    public final String a;

    public rn2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn2) && u890.j(this.a, ((rn2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
