package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fy21 extends jy21 {
    public final String a;

    public fy21(String str) {
        this.a = str;
    }

    public final String a() {
        return "internal_error";
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy21) && this.a.equals(((fy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
