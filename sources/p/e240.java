package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e240 implements i240 {
    public final String a;

    public e240(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e240) && this.a.equals(((e240) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
