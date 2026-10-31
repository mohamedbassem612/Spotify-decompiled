package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z2k extends ijm1 implements v3h1, xku {
    public final tzj j;
    public final cce k = new cce(this);
    public ibg l;
    public List m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f151p;
    public int q;
    public int r;
    public final bpb1 s;
    public final bpb1 t;
    public final bpb1 u;
    public final bpb1 v;
    public final bpb1 w;
    public List x;

    public z2k(tzj tzjVar) {
        this.j = tzjVar;
        z6x z6xVar = z6x.a;
        this.l = new ibg(z6xVar);
        this.m = z6xVar;
        this.n = -1;
        this.o = -1;
        w7x w7xVar = w7x.a;
        this.s = gio1.b(w7xVar);
        this.t = gio1.b(w7xVar);
        this.u = gio1.b(z6xVar);
        this.v = gio1.b(w7xVar);
        this.w = gio1.b(0);
        tzjVar.g(this);
        this.x = z6xVar;
    }

    public static final mmr0 E(ArrayList arrayList, int i, int i2) {
        if (i2 < 0 || i2 >= i) {
            hhg1.n("Failed requirement.");
            return null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            mmr0 mmr0Var = (mmr0) listIterator.previous();
            if (((Number) mmr0Var.a).intValue() <= i2) {
                return mmr0Var;
            }
        }
        bhn0.t("List contains no element matching the predicate.");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final y3h1 A(int i) throws NoWhenBranchMatchedException {
        hbg hbgVarE = this.l.e(i);
        ibg ibgVar = this.l;
        if (hbgVarE == null) {
            throw new IllegalStateException(("Index " + i + " out of bounds (size: " + ibgVar.d() + ")").toString());
        }
        fbg fbgVarA = ((dbg) ibgVar.c().get(hbgVarE.a())).a();
        if (!(fbgVarA instanceof fbg)) {
            if (fbgVarA instanceof ebg) {
                return ((v3h1) this.m.get(((ebg) fbgVarA).a())).i(hbgVarE.b());
            }
            eg.o();
            return null;
        }
        uzj uzjVar = (vzj) this.x.get(hbgVarE.b() + ((rr80) fbgVarA.a()).a);
        if (!(uzjVar instanceof uzj)) {
            eg.m("Invalid chunk state: expected Item");
            return null;
        }
        uzj uzjVar2 = uzjVar;
        uo5 uo5Var = new uo5(uzjVar2.d().getId(), (Object) uzjVar2.d(), (Object) uzjVar2.f(), (byte) 10);
        int iA = hbgVarE.a();
        int iF = this.r;
        for (int i2 = 0; i2 < iA; i2++) {
            iF += F(i2);
        }
        y3h1 y3h1Var = new y3h1(uo5Var, new ytl(hbgVarE.b() + iF), null, null);
        lwb0 lwb0VarE = uzjVar2.e();
        if (lwb0VarE == null) {
            return y3h1Var;
        }
        Iterator it = ((ArrayList) lwb0VarE.b()).iterator();
        while (it.hasNext()) {
            y3h1Var = ((kl90) it.next()).b(y3h1Var, i);
        }
        if (lwb0VarE.c() != null && y3h1Var.c == null) {
            y3h1Var = y3h1.a(y3h1Var, null, lwb0VarE.c(), null, 11);
        }
        vu30 vu30VarA = lwb0VarE.a();
        return vu30VarA != null ? y3h1.a(y3h1Var, null, null, voo1.k(vu30VarA, y3h1Var.d), 7) : y3h1Var;
    }

    public final void B() {
        if (u()) {
            r();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean C() throws NoWhenBranchMatchedException {
        tzj tzjVar = this.j;
        List listA = tzjVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof tzj) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListB = this.k.B(arrayList);
        this.m = arrayListB;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList2.add(((v3h1) it.next()).c());
        }
        bpb1 bpb1Var = this.u;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, arrayList2);
        bpb1 bpb1Var2 = this.w;
        bpb1Var2.m((Object) null, Integer.valueOf(((Number) bpb1Var2.getValue()).intValue() + 1));
        this.x = o7h.l1(tzjVar.a());
        ArrayList arrayList3 = new ArrayList();
        Integer numValueOf = null;
        int i = 0;
        int i2 = 0;
        for (vzj vzjVar : tzjVar.a()) {
            int i3 = i + 1;
            if (!(vzjVar instanceof uzj)) {
                if (!(vzjVar instanceof tzj)) {
                    eg.o();
                    return false;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    arrayList3.add(new dbg(new fbg(yoi1.Q(iIntValue, i)), i - iIntValue));
                    numValueOf = null;
                }
                arrayList3.add(new dbg(new ebg(i2), ((v3h1) this.m.get(i2)).a()));
                i2++;
            } else if (numValueOf == null) {
                numValueOf = Integer.valueOf(i);
            }
            i = i3;
        }
        int size = tzjVar.a().size();
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            arrayList3.add(new dbg(new fbg(yoi1.Q(iIntValue2, size)), size - iIntValue2));
        }
        ibg ibgVar = new ibg(arrayList3);
        if (ibgVar.equals(this.l)) {
            return false;
        }
        this.l = ibgVar;
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int F(int i) throws NoWhenBranchMatchedException {
        dbg dbgVar = (dbg) this.l.c().get(i);
        ebg ebgVarA = dbgVar.a();
        if (ebgVarA instanceof fbg) {
            return dbgVar.b();
        }
        if (ebgVarA instanceof ebg) {
            return ((v3h1) this.m.get(ebgVarA.a())).o();
        }
        eg.o();
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(lnm lnmVar) throws KotlinNothingValueException {
        t2k t2kVar;
        if (lnmVar instanceof t2k) {
            t2kVar = (t2k) lnmVar;
            int i = t2kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2kVar.c = i - Integer.MIN_VALUE;
            } else {
                t2kVar = new t2k(this, (onm) lnmVar);
            }
        } else {
            t2kVar = new t2k(this, (onm) lnmVar);
        }
        Object obj = t2kVar.a;
        int i2 = t2kVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            bag bagVar = new bag(this, (lnm) null, (byte) 22);
            t2kVar.c = 1;
            Object objS = smo1.s(bagVar, t2kVar);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jah.d();
        return null;
    }

    public final void H() {
        int i = this.r;
        tr80 tr80VarK = p7h.K(this.l.c());
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarK, 10));
        lr80 it = tr80VarK.iterator();
        while (((sr80) it).c) {
            arrayList.add(Integer.valueOf(F(it.nextInt())));
        }
        ArrayList arrayListX = u4p1.X(i, arrayList);
        Iterator it2 = this.l.c().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            ebg ebgVarA = ((dbg) it2.next()).a();
            if (ebgVarA instanceof ebg) {
                ((v3h1) this.m.get(ebgVarA.a())).j(((Number) arrayListX.get(i2)).intValue());
            }
            i2 = i3;
        }
    }

    public final void I() {
        Set setC = this.j.c();
        boolean zIsEmpty = setC.isEmpty();
        Set set = w7x.a;
        bpb1 bpb1Var = this.t;
        if (zIsEmpty) {
            bpb1Var.getClass();
            bpb1Var.m((Object) null, set);
            return;
        }
        if (!tx9.i(s(), yoi1.Q(0, Math.max(this.l.d(), 1)))) {
            setC = set;
        }
        bpb1Var.getClass();
        bpb1Var.m((Object) null, setC);
    }

    @Override // p.v3h1
    public final zob1 c() {
        return this.v;
    }

    @Override // p.v3h1
    public final boolean d() {
        D();
        List list = this.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((v3h1) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p.xku
    public final void dispose() {
        this.j.g((z2k) null);
        this.k.o();
    }

    public final void e(v3h1 v3h1Var) {
        y();
        z();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.v3h1
    public final eyl f() throws NoWhenBranchMatchedException {
        eyl eylVarQ;
        D();
        List list = this.m;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((v3h1) it.next()).d()) {
                    List listC = this.l.c();
                    ArrayList arrayList = new ArrayList(q7h.U(listC, 10));
                    int i = 0;
                    for (Object obj : listC) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        dbg dbgVar = (dbg) obj;
                        int iB = this.l.b(i);
                        ebg ebgVarA = dbgVar.a();
                        if (ebgVarA instanceof ebg) {
                            eylVarQ = qpn1.r((v3h1) this.m.get(ebgVarA.a()));
                        } else {
                            if (!(ebgVarA instanceof fbg)) {
                                eg.o();
                                return null;
                            }
                            eylVarQ = qpn1.q(dbgVar.b(), new ym(this, iB, (byte) 10));
                        }
                        arrayList.add(oqn1.n(Integer.valueOf(iB), eylVarQ));
                        i = i2;
                    }
                    ArrayList<mmr0> arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((eyl) ((mmr0) obj2).b).b() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    int iD = this.l.d();
                    s2k s2kVar = new s2k(iD, arrayList2, (byte) 0);
                    s2k s2kVar2 = new s2k(iD, arrayList2, (byte) 1);
                    ArrayList arrayList3 = new ArrayList();
                    for (mmr0 mmr0Var : arrayList2) {
                        int iIntValue = ((Number) mmr0Var.a).intValue();
                        Map mapA = ((eyl) mmr0Var.b).a();
                        ArrayList arrayList4 = new ArrayList(mapA.size());
                        for (Map.Entry entry : mapA.entrySet()) {
                            arrayList4.add(oqn1.n(Integer.valueOf(((Number) entry.getKey()).intValue() + iIntValue), (xu30) entry.getValue()));
                        }
                        r7h.W(arrayList4, arrayList3);
                    }
                    return new eyl(iD, s2kVar, s2kVar2, sqg0.T(arrayList3));
                }
            }
        }
        return null;
    }

    @Override // p.v3h1
    public final void h(int i) {
        D();
        hbg hbgVarE = this.l.e(i);
        if (hbgVarE == null) {
            return;
        }
        ebg ebgVarA = ((dbg) this.l.c().get(hbgVarE.a())).a();
        if (ebgVarA instanceof ebg) {
            ((v3h1) this.m.get(ebgVarA.a())).h(hbgVarE.b());
        }
    }

    @Override // p.v3h1
    public final void j(int i) {
        if (i == this.r) {
            return;
        }
        this.r = i;
        H();
    }

    @Override // p.v3h1
    public final int k() {
        return this.j.f();
    }

    @Override // p.v3h1
    public final void l() {
        this.q++;
        y();
        Iterator it = this.k.t().iterator();
        while (it.hasNext()) {
            ((v3h1) it.next()).l();
        }
    }

    @Override // p.v3h1
    public final Function0 m(int i) {
        D();
        hbg hbgVarE = this.l.e(i);
        if (hbgVarE == null) {
            return null;
        }
        ebg ebgVarA = ((dbg) this.l.c().get(hbgVarE.a())).a();
        if (ebgVarA instanceof ebg) {
            return ((v3h1) this.m.get(ebgVarA.a())).m(hbgVarE.b());
        }
        return null;
    }

    public final void r() {
        f1r f1rVarC;
        tr80 tr80VarS = s();
        Iterator it = this.l.c().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ebg ebgVarA = ((dbg) it.next()).a();
            if (ebgVarA instanceof ebg) {
                ((v3h1) this.m.get(ebgVarA.a())).p(this.l.a(i, tr80VarS));
            }
            i = i2;
        }
        H();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i3 = 0;
        for (dbg dbgVar : this.l.c()) {
            int i4 = i3 + 1;
            fbg fbgVarA = dbgVar.a();
            if (fbgVarA instanceof fbg) {
                tr80 tr80VarA = this.l.a(i3, s());
                int iMax = Math.max(((rr80) tr80VarA).a, 0);
                int iMin = Math.min(((rr80) tr80VarA).b, dbgVar.b() - 1);
                if (iMax <= iMin) {
                    while (true) {
                        uzj uzjVar = (vzj) this.x.get(((rr80) fbgVarA.a()).a + iMax);
                        if ((uzjVar instanceof uzj) && (f1rVarC = uzjVar.c()) != null) {
                            linkedHashSet.add(f1rVarC);
                        }
                        if (iMax != iMin) {
                            iMax++;
                        }
                    }
                }
            }
            i3 = i4;
        }
        bpb1 bpb1Var = this.s;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, linkedHashSet);
        I();
    }

    public final List v() {
        int i = this.n;
        tzj tzjVar = this.j;
        if (i != tzjVar.d() || this.o != tzjVar.f()) {
            List<uzj> listA = tzjVar.a();
            boolean z = false;
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                for (uzj uzjVar : listA) {
                    if (uzjVar instanceof uzj) {
                        lwb0 lwb0VarE = uzjVar.e();
                        List listB = lwb0VarE != null ? lwb0VarE.b() : null;
                        if (listB != null && !listB.isEmpty()) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            this.f151p = z;
            this.n = tzjVar.d();
            this.o = tzjVar.f();
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(Integer.valueOf(q()));
        smc0VarN.add(Integer.valueOf(tzjVar.f()));
        smc0VarN.add(Integer.valueOf(tzjVar.d()));
        smc0VarN.add(Integer.valueOf(tzjVar.e()));
        if (this.f151p) {
            smc0VarN.add(Integer.valueOf(hqn1.o()));
            smc0VarN.add(Integer.valueOf(this.q));
        }
        for (v3h1 v3h1Var : this.m) {
            smc0VarN.add(v3h1Var);
            smc0VarN.add(Integer.valueOf(v3h1Var.g()));
        }
        return k4p1.k(smc0VarN);
    }

    public final int w() {
        return this.l.d();
    }

    public final nlx0 x() {
        ArrayList arrayList = new ArrayList();
        tzj tzjVar = this.j;
        int i = 0;
        for (tzj tzjVar2 : tzjVar.a()) {
            if (tzjVar2 instanceof tzj) {
                arrayList.add(Integer.valueOf(tzjVar2.e()));
                arrayList.add(Integer.valueOf(i < this.m.size() ? ((v3h1) this.m.get(i)).q() : -1));
                i++;
            }
        }
        return new nlx0(0, tzjVar.f(), 29, arrayList);
    }
}
