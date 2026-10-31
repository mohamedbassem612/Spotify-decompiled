package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gy21 extends jy21 {
    public final String a;

    public gy21(String str) {
        this.a = str;
    }

    @Override // p.jy21
    public final String a() {
        return "not_found";
    }

    @Override // p.jy21
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy21) && this.a.equals(((gy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
