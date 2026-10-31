package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class yav {
    public static final xav Companion = new xav();
    public static final znb0[] d = {dm5.S(2, xzu.g), null, null};
    public final List a;
    public final String b;
    public final boolean c;

    public /* synthetic */ yav(int i, String str, List list, boolean z) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, wav.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yav)) {
            return false;
        }
        yav yavVar = (yav) obj;
        return u890.j(this.a, yavVar.a) && u890.j(this.b, yavVar.b) && this.c == yavVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
