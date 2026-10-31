package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hq21 extends iq21 {
    public final String a;

    public hq21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq21) && u890.j(this.a, ((hq21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
