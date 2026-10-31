package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class non implements oon {
    public final String a;

    public non(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof non) && u890.j(this.a, ((non) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
