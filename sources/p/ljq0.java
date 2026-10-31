package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ljq0 extends x2i1 {
    public final String a;

    public ljq0(String str) {
        this.a = str;
    }

    @Override // p.x2i1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljq0) && this.a.equals(((ljq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
