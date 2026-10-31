package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f0w0 extends cxm {
    public final String d;

    public f0w0(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0w0) && this.d.equals(((f0w0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
