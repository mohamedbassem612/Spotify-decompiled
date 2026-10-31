package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vbt0 {
    public final String a;
    public final String b;
    public final Instant c;
    public final String d;
    public final Integer e;
    public final tbt0 f;
    public final lax g;

    public /* synthetic */ vbt0(String str, Instant instant, String str2, tbt0 tbt0Var, lax laxVar, int i) {
        this(str, null, (i & 4) != 0 ? null : instant, str2, null, (i & 32) != 0 ? bk20.W0 : tbt0Var, (i & 64) != 0 ? iax.a : laxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbt0)) {
            return false;
        }
        vbt0 vbt0Var = (vbt0) obj;
        return u890.j(this.a, vbt0Var.a) && u890.j(this.b, vbt0Var.b) && u890.j(this.c, vbt0Var.c) && u890.j(this.d, vbt0Var.d) && u890.j(this.e, vbt0Var.e) && u890.j(this.f, vbt0Var.f) && u890.j(this.g, vbt0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.c;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public vbt0(String str, String str2, Instant instant, String str3, Integer num, tbt0 tbt0Var, lax laxVar) {
        this.a = str;
        this.b = str2;
        this.c = instant;
        this.d = str3;
        this.e = num;
        this.f = tbt0Var;
        this.g = laxVar;
    }
}
