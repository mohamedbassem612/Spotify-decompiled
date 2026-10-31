package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g9d0 {
    public final Object a;
    public lls0 b = new lls0((byte) 24);
    public boolean c;
    public boolean d;

    public g9d0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g9d0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((g9d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
