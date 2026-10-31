package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xai1 implements abi1 {
    public final String a;

    public xai1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xai1) && this.a.equals(((xai1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
