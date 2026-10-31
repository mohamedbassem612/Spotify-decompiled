package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m200 implements b600 {
    public final String a;

    public m200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m200) && this.a.equals(((m200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
