package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m1m1 implements r1m1 {
    public final String a;

    public m1m1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1m1) && this.a.equals(((m1m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
