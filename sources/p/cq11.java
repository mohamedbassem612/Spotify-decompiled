package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cq11 implements hq11 {
    public final String a;

    public cq11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq11) && u890.j(this.a, ((cq11) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }
}
