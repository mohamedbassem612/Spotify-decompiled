package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fd90 extends gd90 {
    public final String a;

    public fd90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd90) && u890.j(this.a, ((fd90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
