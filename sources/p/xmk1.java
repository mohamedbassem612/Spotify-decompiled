package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xmk1 implements cnk1 {
    public final String a;

    public xmk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmk1) && this.a.equals(((xmk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
