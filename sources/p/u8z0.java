package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u8z0 extends z8z0 {
    public final String a;

    public u8z0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8z0) && u890.j(this.a, ((u8z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
