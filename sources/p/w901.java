package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w901 implements x901 {
    public final String a;

    public w901(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w901) && this.a.equals(((w901) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
