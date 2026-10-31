package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hs91 implements qs91 {
    public final String a;

    public hs91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs91) && u890.j(this.a, ((hs91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
