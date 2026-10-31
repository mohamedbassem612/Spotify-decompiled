package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ey21 extends jy21 {
    public final String a;

    public ey21(String str) {
        this.a = str;
    }

    public final String a() {
        return "insufficient_storage";
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey21) && this.a.equals(((ey21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
