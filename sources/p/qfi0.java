package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qfi0 implements gfh0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ yae1 b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ boolean d;

    public qfi0(String str, yae1 yae1Var, lee1 lee1Var, boolean z) {
        this.a = str;
        this.b = yae1Var;
        this.c = lee1Var;
        this.d = z;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m1033measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        q5t0 q5t0VarH;
        afh0 afh0Var;
        Object next;
        Object next2;
        int i = hjl.i(j);
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            q5t0VarH = null;
            if (!it.hasNext()) {
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            }
            afh0Var = (afh0) it.next();
        } while (!u890.j(t3k1.s(afh0Var), "creator"));
        Iterator it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!u890.j(t3k1.s((afh0) next), "date"));
        afh0 afh0Var2 = (afh0) next;
        Iterator it3 = list2.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!u890.j(t3k1.s((afh0) next2), "postfix"));
        afh0 afh0Var3 = (afh0) next2;
        q5t0 q5t0VarH2 = afh0Var2 != null ? afh0Var2.H(jjl.b(0, i, 0, 0, 13)) : null;
        int i2 = q5t0VarH2 != null ? q5t0VarH2.a : 0;
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = 0;
        }
        q5t0 q5t0VarH3 = afh0Var.H(jjl.b(0, i3, 0, 0, 13));
        int i4 = (i - q5t0VarH3.a) - i2;
        if (afh0Var3 != null && i4 > 0) {
            String str = this.a;
            if (i4 >= (str != null ? (int) (yae1.a(this.b, str, this.c, 0, false, 1, 0L, (flb0) null, (xat) null, 1004).c >> 32) : 0)) {
                q5t0VarH = afh0Var3.H(jjl.b(0, i4, 0, 0, 13));
            }
        }
        q5t0 q5t0Var = q5t0VarH;
        int iMax = Math.max(q5t0VarH3.b, Math.max(q5t0VarH2 != null ? q5t0VarH2.b : 0, q5t0Var != null ? q5t0Var.b : 0));
        if (this.d) {
            i = jjl.g(q5t0VarH3.a + i2 + (q5t0Var != null ? q5t0Var.a : 0), j);
        }
        return ifh0Var.S(i, iMax, b7x.a, new fu(q5t0VarH3, q5t0VarH2, i2, q5t0Var, (byte) 11));
    }
}
