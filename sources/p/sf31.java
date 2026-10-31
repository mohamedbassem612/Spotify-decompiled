package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sf31 implements tf31 {
    public final String a;

    public sf31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf31) && u890.j(this.a, ((sf31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
