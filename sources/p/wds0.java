package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wds0 implements ces0 {
    public final String a;

    public wds0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wds0) && this.a.equals(((wds0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
