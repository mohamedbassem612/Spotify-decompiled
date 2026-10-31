package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c8g0 extends hon1 {
    public final String e;

    public c8g0(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8g0) && u890.j(this.e, ((c8g0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
