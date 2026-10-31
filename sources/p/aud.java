package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aud implements iud {
    public final wkt a;
    public final int b;

    public aud(wkt wktVar, int i) {
        this.a = wktVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aud)) {
            return false;
        }
        aud audVar = (aud) obj;
        return this.a.equals(audVar.a) && this.b == audVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
