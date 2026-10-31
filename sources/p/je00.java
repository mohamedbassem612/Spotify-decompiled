package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class je00 implements ke00 {
    public final String a;

    public je00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je00) && this.a.equals(((je00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
