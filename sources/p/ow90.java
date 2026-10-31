package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ow90 implements qw90 {
    public final String a;

    public ow90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow90) && u890.j(this.a, ((ow90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(2131956923) * 31);
    }
}
