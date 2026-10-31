package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hmk implements omk {
    public final String a;

    public hmk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmk) && u890.j(this.a, ((hmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
