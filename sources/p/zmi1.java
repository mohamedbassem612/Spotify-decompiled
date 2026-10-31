package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class zmi1 implements Update {
    public static final zmi1 a = new zmi1();

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    public final Next a(Object obj, Object obj2) {
        Next nextA;
        bh41 ah41Var;
        bni1 bni1Var = (bni1) obj;
        xmi1 xmi1Var = (xmi1) obj2;
        String str = bni1Var.d;
        b7x b7xVar = bni1Var.j;
        Set set = bni1Var.i;
        bh41 bh41Var = bni1Var.k;
        z6x z6xVar = bni1Var.b;
        Set set2 = bni1Var.h;
        boolean z = xmi1Var instanceof nmi1;
        ali1 ali1Var = ali1.a;
        if (z) {
            nmi1 nmi1Var = (nmi1) xmi1Var;
            String str2 = nmi1Var.b;
            String str3 = nmi1Var.a;
            if (bni1Var.a == 0) {
                throw null;
            }
            if (u890.j(str2, "wrapped-party")) {
                Iterable iterable = (Iterable) z6xVar;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    boolean z2 = bh41Var instanceof zg41;
                    ArrayList arrayListO0 = o7h.O0(new s4i1(str3), (Collection) z6xVar);
                    if (bh41Var instanceof wg41) {
                        ah41Var = new ah41(((wg41) bh41Var).a());
                    } else {
                        ah41Var = bh41Var;
                    }
                    nextA = Next.i(bni1.a(bni1Var, arrayListO0, null, null, null, null, 0, null, null, null, ah41Var, null, 7165), dm61.B0(new eli1[]{new zki1(str3), z2 ? ali1Var : null}));
                } else {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            boolean z3 = bh41Var instanceof zg41;
                            ArrayList arrayListO1 = o7h.O0(new s4i1(str3), (Collection) z6xVar);
                            if (bh41Var instanceof wg41) {
                                ah41Var = new ah41(((wg41) bh41Var).a());
                            } else {
                                ah41Var = bh41Var;
                            }
                            nextA = Next.i(bni1.a(bni1Var, arrayListO1, null, null, null, null, 0, null, null, null, ah41Var, null, 7165), dm61.B0(new eli1[]{new zki1(str3), z3 ? ali1Var : null}));
                        } else if (u890.j(((b5i1) it.next()).getUsername(), str3)) {
                            nextA = Next.j();
                        }
                    }
                }
            } else {
                nextA = Next.j();
            }
        } else if (xmi1Var instanceof emi1) {
            String str4 = ((emi1) xmi1Var).a;
            nextA = (set2.contains(str4) || set.contains(str4)) ? Next.j() : Next.i(bni1.a(bni1Var, null, null, null, null, null, 0, dm61.x0(str4, set2), null, sqg0.K(str4, b7xVar), null, null, 7551), Collections.singleton(new rki1(str4)));
        } else if (xmi1Var instanceof fmi1) {
            String str5 = ((fmi1) xmi1Var).a;
            nextA = !set2.contains(str5) ? Next.j() : Next.h(bni1.a(bni1Var, null, null, null, null, null, 0, dm61.u0(str5, set2), dm61.x0(str5, set), null, null, null, 7807));
        } else if (xmi1Var instanceof gmi1) {
            gmi1 gmi1Var = (gmi1) xmi1Var;
            String str6 = gmi1Var.a;
            LinkedHashSet linkedHashSetU0 = dm61.u0(str6, set2);
            nd90 nd90Var = gmi1Var.b;
            nextA = Next.i(bni1.a(bni1Var, null, null, null, null, null, 0, linkedHashSetU0, null, sqg0.P(b7xVar, new mmr0(str6, nd90Var)), null, null, 7551), Collections.singleton(new bli1(nd90Var)));
        } else if (xmi1Var instanceof rmi1) {
            rmi1 rmi1Var = (rmi1) xmi1Var;
            String str7 = rmi1Var.a;
            Integer num = rmi1Var.c;
            nextA = Next.i(bni1.a(bni1Var, null, null, str7, null, null, 0, null, null, null, num != null ? new ah41(num.intValue()) : yg41.a, null, 7159), Collections.singleton(new qki1(rmi1Var.b, str7)));
        } else if (xmi1Var instanceof smi1) {
            nextA = Next.h(bni1.a(bni1Var, null, null, null, null, null, 1, null, null, null, null, null, 8127));
        } else {
            boolean z4 = xmi1Var instanceof tmi1;
            wki1 wki1Var = wki1.a;
            if (z4) {
                nextA = !((tmi1) xmi1Var).a.equals(str) ? Next.j() : Next.i(bni1.a(bni1Var, null, null, null, null, null, 2, null, null, null, null, null, 8127), Collections.singleton(wki1Var));
            } else if (xmi1Var instanceof qmi1) {
                nextA = (((Collection) z6xVar).isEmpty() && (bh41Var instanceof xg41)) ? Next.i(bni1.a(bni1Var, null, null, null, null, null, 0, null, null, null, new zg41(((xg41) bh41Var).a), null, 7167), Collections.singleton(wki1Var)) : Next.j();
            } else if (xmi1Var instanceof lmi1) {
                b5i1 b5i1Var = ((lmi1) xmi1Var).a;
                Iterable<b5i1> iterable2 = (Iterable) z6xVar;
                ArrayList arrayList = new ArrayList(q7h.U(iterable2, 10));
                for (b5i1 b5i1Var2 : iterable2) {
                    if (u890.j(b5i1Var2.getUsername(), b5i1Var.getUsername())) {
                        b5i1Var2 = b5i1Var;
                    }
                    arrayList.add(b5i1Var2);
                }
                nextA = arrayList.equals(z6xVar) ? Next.j() : Next.h(bni1.a(bni1Var, arrayList, null, null, null, null, 0, null, null, null, null, null, 8189));
            } else if (xmi1Var instanceof hmi1) {
                boolean z5 = ((hmi1) xmi1Var).a;
                nextA = Boolean.valueOf(z5).equals(bni1Var.c) ? Next.j() : Next.h(bni1.a(bni1Var, null, Boolean.valueOf(z5), null, null, null, 0, null, null, null, null, null, 8187));
            } else if (xmi1Var instanceof mmi1) {
                mmi1 mmi1Var = (mmi1) xmi1Var;
                nextA = u890.j(mmi1Var.a, bni1Var.f) ? Next.j() : Next.h(bni1.a(bni1Var, null, null, null, null, mmi1Var.a, 0, null, null, null, null, null, 8159));
            } else if (xmi1Var instanceof imi1) {
                String str8 = ((imi1) xmi1Var).a;
                nextA = Next.i(bni1.a(bni1Var, null, null, null, new s4i1(str8), null, 0, null, null, null, null, null, 8175), Collections.singleton(new yki1(str8)));
            } else if (xmi1Var instanceof jmi1) {
                nextA = Next.h(bni1.a(bni1Var, null, null, null, ((jmi1) xmi1Var).a, null, 0, null, null, null, null, null, 8175));
            } else if (xmi1Var instanceof omi1) {
                nextA = Next.a(Collections.singleton(xki1.a));
            } else if (xmi1Var instanceof pmi1) {
                boolean z6 = bni1Var.g != 0;
                bh41 ah41Var2 = bh41Var instanceof wg41 ? new ah41(((wg41) bh41Var).a()) : bh41Var;
                if (z6) {
                    str = null;
                }
                if (z6) {
                    z6xVar = z6x.a;
                }
                z6x z6xVar2 = z6xVar;
                Set set3 = w7x.a;
                if (z6) {
                    set2 = set3;
                }
                Set set4 = z6 ? set3 : set;
                if (z6) {
                    b7xVar = b7x.a;
                }
                nextA = Next.i(bni1.a(bni1Var, z6xVar2, null, str, null, null, 0, set2, set4, b7xVar, ah41Var2, null, 6197), dm61.B0(new eli1[]{ali1Var, z6 ? tki1.a : null}));
            } else if (xmi1Var instanceof kmi1) {
                nextA = Next.a(Collections.singleton(ski1.a));
            } else if (xmi1Var instanceof vmi1) {
                nextA = str != null ? Next.a(Collections.singleton(new uki1(str))) : Next.j();
            } else if (xmi1Var instanceof umi1) {
                nextA = Next.h(bni1.a(bni1Var, null, null, null, null, null, 0, null, null, null, null, ((umi1) xmi1Var).a, 4095));
            } else {
                if (!(xmi1Var instanceof wmi1)) {
                    eg.o();
                    return null;
                }
                String str9 = bni1Var.m;
                nextA = str9 != null ? Next.a(Collections.singleton(new cli1(str9))) : Next.j();
            }
        }
        bni1 bni1Var2 = (bni1) nextA.f(bni1Var);
        bh41 bh41Var2 = bni1Var2.k;
        if (!bni1Var2.b() || !(bh41Var2 instanceof ah41)) {
            return (bni1Var2.b() || !(bh41Var2 instanceof xg41)) ? nextA : Next.i(bni1.a(bni1Var2, null, null, null, null, null, 0, null, null, null, new ah41(((xg41) bh41Var2).a), null, 7167), nextA.b());
        }
        int i = ((ah41) bh41Var2).a;
        return Next.i(bni1.a(bni1Var2, null, null, null, null, null, 0, null, null, null, new xg41(i), null, 7167), dm61.x0(new dli1(i), nextA.b()));
    }
}
