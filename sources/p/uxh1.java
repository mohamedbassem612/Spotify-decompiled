package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uxh1 implements yxh1 {
    public final String a;

    public uxh1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxh1) && this.a.equals(((uxh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
