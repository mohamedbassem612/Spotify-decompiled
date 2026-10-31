package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d6r0 implements f6r0 {
    public final String a;

    public d6r0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6r0) && this.a.equals(((d6r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
