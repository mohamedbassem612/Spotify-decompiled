package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rue1 implements tue1 {
    public final String a;

    public rue1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rue1) && this.a.equals(((rue1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
