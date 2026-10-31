package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u8b extends tx9 {
    public final String d;

    public u8b(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8b) && u890.j(this.d, ((u8b) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
