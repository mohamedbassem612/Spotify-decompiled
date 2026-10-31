package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xbb0 implements zbb0 {
    public final String a;

    public xbb0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbb0) && u890.j(this.a, ((xbb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
