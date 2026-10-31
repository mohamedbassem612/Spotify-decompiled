package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eph1 implements fph1 {
    public final String a;

    public eph1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eph1) && u890.j(this.a, ((eph1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
