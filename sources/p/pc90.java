package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class pc90 {
    public static final nc90 Companion = new nc90();
    public static final znb0[] j = {dm5.S(2, lx70.N0), dm5.S(2, lx70.O0), null, null, null, null, null, null, null};
    public final dhr0 a;
    public final List b;
    public final r2b c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ pc90(int i, dhr0 dhr0Var, List list, r2b r2bVar, String str, String str2, String str3, String str4, String str5, String str6) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, mc90.a.getDescriptor());
            throw null;
        }
        this.a = dhr0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = r2bVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc90)) {
            return false;
        }
        pc90 pc90Var = (pc90) obj;
        return this.a == pc90Var.a && u890.j(this.b, pc90Var.b) && u890.j(this.c, pc90Var.c) && u890.j(this.d, pc90Var.d) && u890.j(this.e, pc90Var.e) && u890.j(this.f, pc90Var.f) && u890.j(this.g, pc90Var.g) && u890.j(this.h, pc90Var.h) && u890.j(this.i, pc90Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        r2b r2bVar = this.c;
        int iHashCode3 = (iHashCode2 + (r2bVar == null ? 0 : r2bVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }
}
