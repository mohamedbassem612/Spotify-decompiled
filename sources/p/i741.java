package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i741 extends k741 {
    public final String a;

    public i741(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i741) && this.a.equals(((i741) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
