package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class arn implements ern {
    public final String a;
    public final Long b;
    public final Integer c;

    public arn(String str, Long l, Integer num) {
        this.a = str;
        this.b = l;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arn)) {
            return false;
        }
        arn arnVar = (arn) obj;
        return this.a.equals(arnVar.a) && u890.j(this.b, arnVar.b) && u890.j(this.c, arnVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
