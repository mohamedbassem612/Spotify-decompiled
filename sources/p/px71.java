package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class px71 implements vx71 {
    public final String a;

    public px71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof px71) && this.a.equals(((px71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
