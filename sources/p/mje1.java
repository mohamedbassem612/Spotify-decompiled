package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mje1 implements oje1 {
    public final String a;

    public mje1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mje1) && this.a.equals(((mje1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
