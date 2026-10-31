package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ehn0 extends cgj1 {
    public final String c;

    public ehn0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehn0) && u890.j(this.c, ((ehn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
