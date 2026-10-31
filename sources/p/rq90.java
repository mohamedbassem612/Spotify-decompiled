package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rq90 implements but {
    public final g0l a;
    public final c9c0 b;
    public final Context c;
    public final il00 d;
    public final byp e;
    public final b0a0 f;
    public final llm g;
    public final il00 h;

    public rq90(g0l g0lVar, c9c0 c9c0Var, Context context, il00 il00Var, il00 il00Var2, byp bypVar, b0a0 b0a0Var, q8n q8nVar) {
        this.a = g0lVar;
        this.b = c9c0Var;
        this.c = context;
        this.d = il00Var2;
        this.e = bypVar;
        this.f = b0a0Var;
        this.g = i3a.k(q8nVar);
        this.h = il00Var;
    }

    public static ArrayList d(List list) {
        List<po90> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (po90 po90Var : list2) {
            arrayList.add(po90Var.e ? new te10("", "", (String) null, true) : new te10(po90Var.b, po90Var.a, po90Var.c, false));
        }
        return arrayList;
    }

    public final u9h1 a() {
        return this.h;
    }

    public final mr20 b() {
        return new x010(yoi1.g(this.a.j()), this.b.c.available(), new qr0(this, null, (byte) 25), (byte) 1);
    }

    public final ou80 c(zv31 zv31Var, int i, String str) {
        Object obj = zv31Var.j;
        int i2 = 1;
        if (qq90.a[l1d.C(1)] != 1) {
            eg.o();
            return null;
        }
        if (i1a0.a[0] != 1) {
            eg.o();
            return null;
        }
        tz5 tz5Var = (tz5) ((tz01) this.d.b).b;
        c0a0 c0a0Var = (c0a0) obj;
        String str2 = c0a0Var.b;
        String str3 = zv31Var.a;
        boolean z = c0a0Var.a;
        f0u f0uVar = c0a0Var.d;
        int i3 = c0a0Var.e;
        int iM = c0a0Var.h == 3 ? 5 : yap1.m(f0uVar);
        int i4 = 6;
        if (i3 != 0) {
            if (z && i3 == 4) {
                i2 = 6;
            } else {
                int iC = l1d.C(i3);
                if (iC == 0) {
                    i2 = 3;
                } else if (iC != 1) {
                    if (iC == 2) {
                        i2 = 4;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        i2 = 5;
                    }
                }
            }
            i4 = i2;
        }
        ou80 ou80VarA = tz5Var.a(str2, i, new qq80(str3, new sq80(iM, i4)), str);
        fn31.T(this.g, (o8n) null, 0, new f530(this, ou80VarA, c0a0Var.g, (lnm) null, (byte) 29), 3);
        return ou80VarA;
    }

    public final List e(qo90 qo90Var) {
        zqc1 zqc1Var;
        Object next;
        zqc1 zqc1Var2;
        xqc1 xqc1Var = new xqc1(tnx.c, 2);
        Iterator it = qo90Var.d.iterator();
        do {
            zqc1Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((po90) next).d);
        po90 po90Var = (po90) next;
        String str = po90Var != null ? po90Var.a : null;
        Context context = this.c;
        zqc1 zqc1Var3 = new zqc1(xqc1Var, new brc1(context.getString(2131956954, str), 2, (String) null));
        int iC = l1d.C(qo90Var.e.d);
        if (iC != 0) {
            if (iC == 2) {
                zqc1Var2 = new zqc1(new xqc1(slx.c, 1), new brc1(context.getString(2131954246), 1, (String) null));
            }
            return f46.i0(new zqc1[]{zqc1Var3, zqc1Var});
        }
        zqc1Var2 = new zqc1(new xqc1(wkx.c, 1), new brc1(context.getString(2131954245), 1, (String) null));
        zqc1Var = zqc1Var2;
        return f46.i0(new zqc1[]{zqc1Var3, zqc1Var});
    }

    public final wly0 getType() {
        return wly0.c;
    }
}
