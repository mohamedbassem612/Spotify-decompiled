package p;

import android.content.Context;
import android.text.Html;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vxr {
    public final Context a;
    public final lik1 b;
    public final otu c;
    public final cst0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vxr(Context context, lik1 lik1Var, otu otuVar, cst0 cst0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = context;
        this.b = lik1Var;
        this.c = otuVar;
        this.d = cst0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final jbz a(kbz kbzVar) {
        int i;
        boolean z;
        boolean z2;
        String str;
        e2k1 e2k1Var;
        int i2;
        ?? r16;
        i540 i540Var;
        Object next;
        wsi1 wsi1Var;
        cen cenVar;
        mq70 mq70Var;
        List list;
        h131 h131Var = kbzVar.h;
        String str2 = kbzVar.a;
        i1z i1zVar = kbzVar.b;
        int i3 = i1zVar.q;
        String str3 = i1zVar.a;
        tu00 tu00Var = i1zVar.D;
        long j = ((long) i3) * 1000;
        Integer num = i1zVar.r;
        int iIntValue = num != null ? num.intValue() : 0;
        int iO = dsa0.o(i1zVar.k, i1zVar.l);
        bst0 bst0VarI = this.d.i(i1zVar, kbzVar.g, h131Var);
        boolean z3 = bst0VarI.b;
        String string = this.c.a(new y9z(str2 == null ? "" : str2, i1zVar.y, i1zVar.q, num != null ? num.intValue() : 0, i1zVar.s, bst0VarI.a, i1zVar.m, this.h, kbzVar.j)).toString();
        int iC = l1d.C(bst0VarI.d);
        if (iC == 0) {
            i = 1;
        } else if (iC == 1) {
            i = 2;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            i = 3;
        }
        if (i1zVar.m && this.g) {
            z2 = true;
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        boolean z4 = (!kbzVar.d || z2) ? false : z;
        b9v0 b9v0VarA = tu00Var.a(b9v0.class);
        boolean z5 = b9v0VarA != null ? b9v0VarA.d : false;
        v740 v740VarA = tu00Var.a(v740.class);
        String str4 = str2;
        xkk1 xkk1VarA = tu00Var.a(xkk1.class);
        if (xkk1VarA == null || (mq70Var = xkk1VarA.b) == null || (list = mq70Var.a) == null) {
            str = null;
        } else {
            str = !list.isEmpty() ? ((up70) o7h.q0(list)).a.a : null;
        }
        e2k1 e2k1VarA = tu00Var.a(e2k1.class);
        int i4 = i;
        String str5 = i1zVar.c;
        if (this.f) {
            str4 = null;
        }
        String str6 = kbzVar.a;
        g281 g281Var = i1zVar.z;
        String str7 = g281Var != null ? g281Var.e : null;
        String str8 = (g281Var == null || (cenVar = g281Var.j) == null) ? null : cenVar.a;
        String str9 = str7;
        String strReplace = Html.fromHtml(i1zVar.f, 0).toString().replace('\n', ' ');
        int length = strReplace.length() - 1;
        int i5 = 0;
        boolean z6 = false;
        while (true) {
            if (i5 > length) {
                e2k1Var = e2k1VarA;
                i2 = length;
                break;
            }
            i2 = length;
            if (!z6) {
                length = i5;
            }
            e2k1Var = e2k1VarA;
            boolean z7 = u890.q(strReplace.charAt(length), 32) <= 0 ? z : false;
            if (!z6) {
                if (z7) {
                    i5++;
                } else {
                    z6 = z;
                }
                length = i2;
            } else {
                if (!z7) {
                    break;
                }
                length = i2 - 1;
            }
            e2k1VarA = e2k1Var;
        }
        String string2 = strReplace.subSequence(i5, i2 + 1).toString();
        long j2 = ((long) iIntValue) * 1000;
        boolean z8 = i1zVar.s;
        long jMin = bst0VarI.c;
        if (!z3) {
            WeakHashMap weakHashMap = xoi1.a;
            jMin = j - Math.min(j2, j);
            if (z8 && jMin == 0) {
                jMin = j;
            }
        }
        boolean z9 = i1zVar.s;
        iix0 iix0Var = kbzVar.j;
        if (bst0VarI.a) {
            r16 = z3 ? 3 : 4;
        } else {
            r16 = z3 ? z : 2;
        }
        poz0 poz0VarU = c921.u(i1zVar.A, z4);
        String strB = i1zVar.b(z ? 1 : 0);
        boolean z10 = kbzVar.e;
        d1z d1zVar = i1zVar.B;
        long j3 = jMin;
        i1z[] i1zVarArr = (i1z[]) kbzVar.c.toArray(new i1z[0]);
        lik1 lik1Var = this.b;
        ArrayList arrayListD = e4y.d(lik1Var, i1zVarArr);
        xwp0 xwp0Var = i1zVar.A;
        d1z d1zVar2 = i1zVar.B;
        boolean z11 = d1zVar2 == d1z.c;
        boolean z12 = d1zVar2 == d1z.a;
        int i6 = kbzVar.f;
        boolean z13 = i1zVar.u;
        Context context = this.a;
        fap1 mz1Var = z13 ? new mz1(context.getString(2131964004)) : new lz1(context.getString(2131964004));
        b9v0 b9v0VarA2 = tu00Var.a(b9v0.class);
        int i7 = b9v0VarA2 != null ? b9v0VarA2.c : 0;
        int i8 = i7 == 0 ? -1 : uxr.a[l1d.C(i7)];
        int i9 = 1;
        if (i8 == 1) {
            i9 = 2;
        } else if (i8 != 2) {
            i9 = 0;
        }
        String string3 = context.getString(2131955576);
        boolean z14 = i1zVar.m;
        String str10 = lik1Var.a;
        boolean z15 = kbzVar.i;
        if (v740VarA != null) {
            List list2 = v740VarA.a;
            if (list2.isEmpty()) {
                i540Var = null;
            } else {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Iterator it2 = it;
                    if (((u740) next).a.equals(str3)) {
                        break;
                    }
                    it = it2;
                }
                u740 u740Var = (u740) next;
                String str11 = (u740Var == null || (wsi1Var = (wsi1) o7h.s0(u740Var.b)) == null) ? null : wsi1Var.a;
                i540Var = str11 != null ? new i540(str11) : j540.a;
            }
        } else {
            i540Var = null;
        }
        n5a1 n5a1Var = e2k1Var != null ? new n5a1(Long.valueOf(e2k1Var.a)) : null;
        ytw0 ytw0Var = jfv.b;
        return new jbz(str5, str4, str6, str9, str8, string2, string, j, iix0Var, j3, z9, iO, i4, r16, poz0VarU, strB, z10, i6, str3, d1zVar, new Date(jfv.h(fdg1.k0(i1zVar.y, ngv.e))), arrayListD, xwp0Var, z11, z12, mz1Var, this.e, i9, z5, string3, z14, h131Var, str10, z15, i540Var, str, n5a1Var, kbzVar.k);
    }
}
