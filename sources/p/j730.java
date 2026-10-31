package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j730 implements m730 {
    public final String a;

    public j730(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j730) && u890.j(this.a, ((j730) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
