package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w23 implements d33 {
    public final String a;

    public w23(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w23) && this.a.equals(((w23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
