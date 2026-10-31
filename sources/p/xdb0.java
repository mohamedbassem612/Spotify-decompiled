package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xdb0 implements aeb0 {
    public final String a;

    public xdb0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdb0) && this.a.equals(((xdb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
