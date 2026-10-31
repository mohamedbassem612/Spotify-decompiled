package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tk70 {
    public final hux a;

    public tk70(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk70) && u890.j(this.a, ((tk70) obj).a);
    }

    public final int hashCode() {
        return l1d.C(3) + (this.a.hashCode() * 31);
    }
}
