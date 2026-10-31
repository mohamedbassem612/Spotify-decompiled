package p;

import com.spotify.mobius.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r800 {
    public final List a;
    public final String b;
    public final String c;
    public final Consumer d;

    public r800(List list, String str, String str2, Consumer consumer) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = consumer;
    }

    public final Consumer a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r800)) {
            return false;
        }
        r800 r800Var = (r800) obj;
        return this.a.equals(r800Var.a) && u890.j(this.b, r800Var.b) && u890.j(this.c, r800Var.c) && this.d.equals(r800Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
