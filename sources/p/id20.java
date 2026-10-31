package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class id20 implements od20 {
    public final String a;

    public id20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id20) && u890.j(this.a, ((id20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
