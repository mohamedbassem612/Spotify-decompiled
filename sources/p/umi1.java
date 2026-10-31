package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class umi1 implements xmi1 {
    public final String a;

    public umi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof umi1) && u890.j(this.a, ((umi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
