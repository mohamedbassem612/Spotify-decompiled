package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x4b1 implements z4b1 {
    public final String a;

    public x4b1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4b1) && u890.j(this.a, ((x4b1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
