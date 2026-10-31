package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k730 implements m730 {
    public final String a;

    public k730(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k730) && u890.j(this.a, ((k730) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
