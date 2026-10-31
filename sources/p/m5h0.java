package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m5h0 implements z5h0 {
    public final String a;

    public m5h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5h0) && this.a.equals(((m5h0) obj).a);
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 29791);
    }
}
