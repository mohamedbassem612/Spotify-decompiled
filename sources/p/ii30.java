package p;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@kzn0("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lp/ii30;", "Lp/mzn0;", "Lp/ji30;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ii30 extends mzn0 {
    public final Context c;
    public final th30 d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final rg h = new rg(this, 1);
    public final u830 i = new u830(this, (byte) 3);

    public static final class a extends xbk1 {
        public WeakReference b;

        public final void S() {
            WeakReference weakReference = this.b;
            if (weakReference == null) {
                u890.C("completeTransition");
                throw null;
            }
            Function0 function0 = (Function0) weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public ii30(Context context, th30 th30Var, int i) {
        this.c = context;
        this.d = th30Var;
        this.e = i;
    }

    public static void k(ii30 ii30Var, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = ii30Var.g;
        if (z2) {
            r7h.a0(arrayList, new kq00(str, (byte) 22));
        }
        arrayList.add(new mmr0(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // p.mzn0
    public final vnn0 a() {
        return new ji30(this);
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
            boolean zIsEmpty = ((List) b().e.a.getValue()).isEmpty();
            if (qon0Var == null || zIsEmpty || !qon0Var.b || !this.f.remove(hnn0Var.f)) {
                nu9 nu9VarM = m(hnn0Var, qon0Var);
                String str = hnn0Var.f;
                if (!zIsEmpty) {
                    hnn0 hnn0Var2 = (hnn0) o7h.C0((List) b().e.a.getValue());
                    if (hnn0Var2 != null) {
                        k(this, hnn0Var2.f, 6);
                    }
                    k(this, str, 6);
                    nu9VarM.c(str);
                }
                nu9VarM.f();
                if (n()) {
                    hnn0Var.toString();
                }
                b().j(hnn0Var);
            } else {
                th30Var.y(new sh30(th30Var, hnn0Var.f, (byte) 0), false);
                b().j(hnn0Var);
            }
        }
    }

    @Override // p.mzn0
    public final void e(final mnn0 mnn0Var) {
        super.e(mnn0Var);
        n();
        li30 li30Var = new li30() { // from class: p.hi30
            public final void a(zf30 zf30Var) {
                Object objPrevious;
                mnn0 mnn0Var2 = mnn0Var;
                List list = (List) mnn0Var2.e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!((hnn0) objPrevious).f.equals(zf30Var.a1));
                hnn0 hnn0Var = (hnn0) objPrevious;
                boolean zN = ii30.n();
                ii30 ii30Var = this;
                if (zN) {
                    zf30Var.toString();
                    Objects.toString(hnn0Var);
                    Objects.toString(ii30Var.d);
                }
                if (hnn0Var != null) {
                    zf30Var.v1.f(zf30Var, new es3(new djx(ii30Var, zf30Var, hnn0Var, (byte) 24), (byte) 4));
                    zf30Var.s1.a(ii30Var.h);
                    ii30Var.l(zf30Var, hnn0Var, mnn0Var2);
                }
            }
        };
        th30 th30Var = this.d;
        th30Var.q.add(li30Var);
        th30Var.o.add(new ki30(mnn0Var, this));
    }

    @Override // p.mzn0
    public final void f(hnn0 hnn0Var) {
        String str = hnn0Var.f;
        th30 th30Var = this.d;
        if (th30Var.U()) {
            return;
        }
        nu9 nu9VarM = m(hnn0Var, null);
        List list = (List) b().e.a.getValue();
        if (list.size() > 1) {
            hnn0 hnn0Var2 = (hnn0) o7h.t0(p7h.L(list) - 1, list);
            if (hnn0Var2 != null) {
                k(this, hnn0Var2.f, 6);
            }
            k(this, str, 4);
            th30Var.y(new qh30(th30Var, str, -1, 1), false);
            k(this, str, 2);
            nu9VarM.c(str);
        }
        nu9VarM.f();
        b().d(hnn0Var);
    }

    @Override // p.mzn0
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            r7h.W(stringArrayList, linkedHashSet);
        }
    }

    @Override // p.mzn0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return mno1.h(new mmr0[]{new mmr0("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet))});
    }

    @Override // p.mzn0
    public final void i(hnn0 hnn0Var, boolean z) {
        th30 th30Var = this.d;
        if (th30Var.U()) {
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(hnn0Var);
        List listSubList = list.subList(iIndexOf, list.size());
        hnn0 hnn0Var2 = (hnn0) o7h.q0(list);
        hnn0 hnn0Var3 = (hnn0) o7h.t0(iIndexOf - 1, list);
        if (hnn0Var3 != null) {
            k(this, hnn0Var3.f, 6);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            int i = -1;
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    k(this, ((hnn0) it2.next()).f, 4);
                }
                if (z) {
                    for (hnn0 hnn0Var4 : o7h.T0(list2)) {
                        if (u890.j(hnn0Var4, hnn0Var2)) {
                            Objects.toString(hnn0Var4);
                        } else {
                            th30Var.y(new sh30(th30Var, hnn0Var4.f, (byte) 1), false);
                            this.f.add(hnn0Var4.f);
                        }
                    }
                } else {
                    th30Var.y(new qh30(th30Var, hnn0Var.f, -1, 1), false);
                }
                if (n()) {
                    hnn0Var.toString();
                }
                b().g(hnn0Var, z);
                return;
            }
            Object next = it.next();
            hnn0 hnn0Var5 = (hnn0) next;
            String str = hnn0Var5.f;
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                String str2 = (String) ((mmr0) it3.next()).a;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                if (str.equals(str2)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0 || !hnn0Var5.f.equals(hnn0Var2.f)) {
                arrayList.add(next);
            }
        }
    }

    public final void l(zf30 zf30Var, hnn0 hnn0Var, mnn0 mnn0Var) {
        rck1 rck1VarO = zf30Var.o();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        tka0 tka0VarB = rc11.a.b(a.class);
        if (linkedHashMap.containsKey(tka0VarB)) {
            hhg1.f(f4i1.f("A `initializer` with the same `clazz` has already been added: ", tka0VarB.o(), "."));
            return;
        }
        linkedHashMap.put(tka0VarB, new zbk1(tka0VarB));
        zbk1[] zbk1VarArr = (zbk1[]) linkedHashMap.values().toArray(new zbk1[0]);
        hce1 hce1Var = new hce1(rck1VarO, new dd80((zbk1[]) Arrays.copyOf(zbk1VarArr, zbk1VarArr.length)), csn.b);
        tka0 tka0VarB2 = rc11.a.b(a.class);
        String strO = tka0VarB2.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
        } else {
            ((a) hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB2)).b = new WeakReference(new hs20(hnn0Var, mnn0Var, this, zf30Var));
        }
    }

    public final nu9 m(hnn0 hnn0Var, qon0 qon0Var) {
        ji30 ji30Var = (ji30) hnn0Var.b;
        Bundle bundleA = hnn0Var.a();
        String str = ji30Var.Y;
        if (str == null) {
            eg.m("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        th30 th30Var = this.d;
        zf30 zf30VarA = th30Var.N().a(context.getClassLoader(), str);
        zf30VarA.T0(bundleA);
        nu9 nu9Var = new nu9(th30Var);
        int i = qon0Var != null ? qon0Var.f : -1;
        int i2 = qon0Var != null ? qon0Var.g : -1;
        int i3 = qon0Var != null ? qon0Var.h : -1;
        int i4 = qon0Var != null ? qon0Var.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            nu9Var.o(i, i2, i3, i4 != -1 ? i4 : 0);
        }
        nu9Var.n(this.e, zf30VarA, hnn0Var.f);
        nu9Var.q(zf30VarA);
        nu9Var.r = true;
        return nu9Var;
    }
}
