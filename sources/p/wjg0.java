package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wjg0 extends yjg0 {
    public final String a;

    public wjg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjg0) && this.a.equals(((wjg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
