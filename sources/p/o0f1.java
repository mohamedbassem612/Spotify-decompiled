package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o0f1 implements p0f1 {
    public final String a;

    public o0f1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0f1) && this.a.equals(((o0f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
