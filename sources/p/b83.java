package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b83 {
    public final String a;

    public b83(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b83) && u890.j(this.a, ((b83) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
