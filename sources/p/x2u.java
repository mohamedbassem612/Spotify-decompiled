package p;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@kzn0("dialog")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lp/x2u;", "Lp/mzn0;", "Lp/v2u;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x2u extends mzn0 {
    public final Context c;
    public final th30 d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final ek2 f = new ek2(this, (byte) 8);
    public final LinkedHashMap g = new LinkedHashMap();

    public x2u(Context context, th30 th30Var) {
        this.c = context;
        this.d = th30Var;
    }

    @Override // p.mzn0
    public final vnn0 a() {
        return new v2u(this);
    }

    @Override // p.mzn0
    public final void d(List list, qon0 qon0Var) {
        th30 th30Var = this.d;
        if (th30Var.U()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hnn0 hnn0Var = (hnn0) it.next();
            k(hnn0Var).g1(th30Var, hnn0Var.f);
            hnn0 hnn0Var2 = (hnn0) o7h.C0((List) b().e.a.getValue());
            boolean zI0 = o7h.i0((Iterable) b().f.a.getValue(), hnn0Var2);
            b().j(hnn0Var);
            if (hnn0Var2 != null && !zI0) {
                b().c(hnn0Var2);
            }
        }
    }

    @Override // p.mzn0
    public final void e(mnn0 mnn0Var) {
        tac0 tac0Var;
        super.e(mnn0Var);
        Iterator it = ((List) mnn0Var.e.a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            th30 th30Var = this.d;
            if (!zHasNext) {
                th30Var.q.add(new li30() { // from class: p.u2u
                    public final void a(zf30 zf30Var) {
                        x2u x2uVar = this.a;
                        LinkedHashSet linkedHashSet = x2uVar.e;
                        if (w0h1.i(linkedHashSet).remove(zf30Var.a1)) {
                            zf30Var.s1.a(x2uVar.f);
                        }
                        LinkedHashMap linkedHashMap = x2uVar.g;
                        w0h1.k(linkedHashMap).remove(zf30Var.a1);
                    }
                });
                return;
            }
            hnn0 hnn0Var = (hnn0) it.next();
            t2u t2uVarG = th30Var.G(hnn0Var.f);
            if (t2uVarG == null || (tac0Var = ((zf30) t2uVarG).s1) == null) {
                this.e.add(hnn0Var.f);
            } else {
                tac0Var.a(this.f);
            }
        }
    }

    @Override // p.mzn0
    public final void f(hnn0 hnn0Var) {
        String str = hnn0Var.f;
        th30 th30Var = this.d;
        if (th30Var.U()) {
            return;
        }
        t2u t2uVar = (t2u) this.g.get(str);
        if (t2uVar == null) {
            t2u t2uVarG = th30Var.G(str);
            t2uVar = t2uVarG instanceof t2u ? t2uVarG : null;
        }
        if (t2uVar != null) {
            ((zf30) t2uVar).s1.d(this.f);
            t2uVar.dismiss();
        }
        k(hnn0Var).g1(th30Var, str);
        mnn0 mnn0VarB = b();
        List list = (List) mnn0VarB.e.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            hnn0 hnn0Var2 = (hnn0) listIterator.previous();
            if (hnn0Var2.f.equals(str)) {
                bpb1 bpb1Var = mnn0VarB.c;
                bpb1Var.m((Object) null, dm61.x0(hnn0Var, dm61.x0(hnn0Var2, (Set) bpb1Var.getValue())));
                mnn0VarB.d(hnn0Var);
                return;
            }
        }
        bhn0.t("List contains no element matching the predicate.");
    }

    @Override // p.mzn0
    public final void i(hnn0 hnn0Var, boolean z) {
        th30 th30Var = this.d;
        if (th30Var.U()) {
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(hnn0Var);
        Iterator it = o7h.T0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            t2u t2uVarG = th30Var.G(((hnn0) it.next()).f);
            if (t2uVarG != null) {
                t2uVarG.dismiss();
            }
        }
        l(iIndexOf, hnn0Var, z);
    }

    public final t2u k(hnn0 hnn0Var) {
        v2u v2uVar = (v2u) hnn0Var.b;
        String str = v2uVar.Y;
        if (str == null) {
            eg.m("DialogFragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        t2u t2uVarA = this.d.N().a(context.getClassLoader(), str);
        if (t2u.class.isAssignableFrom(t2uVarA.getClass())) {
            t2u t2uVar = t2uVarA;
            t2uVar.T0(hnn0Var.a());
            ((zf30) t2uVar).s1.a(this.f);
            this.g.put(hnn0Var.f, t2uVar);
            return t2uVar;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = v2uVar.Y;
        if (str2 != null) {
            hhg1.f(l1d.n(str2, " is not an instance of DialogFragment", sb));
            return null;
        }
        eg.m("DialogFragment class was not set");
        return null;
    }

    public final void l(int i, hnn0 hnn0Var, boolean z) {
        hnn0 hnn0Var2 = (hnn0) o7h.t0(i - 1, (List) b().e.a.getValue());
        boolean zI0 = o7h.i0((Iterable) b().f.a.getValue(), hnn0Var2);
        b().g(hnn0Var, z);
        if (hnn0Var2 == null || zI0) {
            return;
        }
        b().c(hnn0Var2);
    }
}
