package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m761 {
    public final String a;

    public m761(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m761) && u890.j(this.a, ((m761) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
