package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mf9 implements pf9 {
    public final String a;

    public mf9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf9) && this.a.equals(((mf9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
