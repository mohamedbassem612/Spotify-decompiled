package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u8c {
    public static final a1i b = new a1i(wnb.g, wnb.h);
    public final String a;

    public u8c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8c) && this.a.equals(((u8c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
