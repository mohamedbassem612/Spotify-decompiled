package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o5a1 {
    public final Long a;

    public o5a1(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5a1) && u890.j(this.a, ((o5a1) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        return Boolean.hashCode(false) + ((l == null ? 0 : l.hashCode()) * 31);
    }
}
