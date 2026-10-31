package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sue implements vue {
    public final String a;

    public sue(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sue) && u890.j(this.a, ((sue) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
