package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class crc {
    public final uqo a;
    public final vrc b;
    public final Long c;
    public final Long d;
    public final boolean e;

    public crc(uqo uqoVar, vrc vrcVar, Long l, Long l2, boolean z) {
        this.a = uqoVar;
        this.b = vrcVar;
        this.c = l;
        this.d = l2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crc)) {
            return false;
        }
        crc crcVar = (crc) obj;
        return this.a.equals(crcVar.a) && u890.j(this.b, crcVar.b) && u890.j(this.c, crcVar.c) && u890.j(this.d, crcVar.d) && this.e == crcVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }
}
