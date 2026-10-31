package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w5g implements c6g {
    public final swf a;

    public w5g(swf swfVar) {
        this.a = swfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5g) && this.a.equals(((w5g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
