package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iy21 extends jy21 {
    public final String a;

    public iy21(String str) {
        this.a = str;
    }

    @Override // p.jy21
    public final String a() {
        return "unknown";
    }

    @Override // p.jy21
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy21) && this.a.equals(((iy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
