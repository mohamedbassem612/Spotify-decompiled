package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hy21 extends jy21 {
    public final String a;

    public hy21(String str) {
        this.a = str;
    }

    public final String a() {
        return "unavailable_for_legal_reasons";
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy21) && this.a.equals(((hy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
