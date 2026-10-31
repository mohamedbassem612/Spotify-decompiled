package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m32 implements n32 {
    public final String a;

    public m32(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m32) && this.a.equals(((m32) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
