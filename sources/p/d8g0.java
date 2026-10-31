package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d8g0 extends hon1 {
    public final String e;

    public d8g0(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8g0) && u890.j(this.e, ((d8g0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
