package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m5x extends ln90 {
    public String c;
    public final boolean d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5x(String str, int i, int i2) {
        super(3);
        boolean z = (i2 & 2) != 0;
        i = (i2 & 4) != 0 ? 0 : i;
        this.c = str;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5x)) {
            return false;
        }
        m5x m5xVar = (m5x) obj;
        return u890.j(this.c, m5xVar.c) && this.d == m5xVar.d && this.e == m5xVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xcg1.g(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiViewData(emoji=");
        sb.append(this.c);
        sb.append(", updateToSticky=");
        sb.append(this.d);
        sb.append(", dataIndex=");
        return l1d.o(sb, this.e, ')');
    }
}
