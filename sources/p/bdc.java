package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bdc {
    public final int a;
    public final String b;
    public final List c;

    public bdc(String str, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdc)) {
            return false;
        }
        bdc bdcVar = (bdc) obj;
        return this.a == bdcVar.a && u890.j(this.b, bdcVar.b) && this.c.equals(bdcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "EmojiDataCategory(headerIconId=" + this.a + ", categoryName=" + this.b + ", emojiDataList=" + this.c + ')';
    }
}
