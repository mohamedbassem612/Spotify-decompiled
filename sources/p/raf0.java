package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class raf0 extends xaf0 {
    public final String a;

    public raf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof raf0) && u890.j(this.a, ((raf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
