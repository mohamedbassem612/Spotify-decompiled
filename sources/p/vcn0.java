package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vcn0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final kf30 b;
    public final tka0 c;

    public vcn0(kf30 kf30Var, tka0 tka0Var) {
        this.b = kf30Var;
        this.c = tka0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public final Object invoke(Object obj) throws i9n {
        tka0 tka0VarN;
        switch (this.a) {
            case 0:
                tka0 tka0Var = this.c;
                kf30 kf30Var = this.b;
                ucn0 ucn0Var = (ucn0) obj;
                List typeParameters = tka0Var.getTypeParameters();
                ArrayList arrayList = new ArrayList(q7h.U(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    qma0 qma0Var = new qma0(null, ucn0Var, ((qma0) it.next()).c, (u890.j(kf30Var, rfb1.J) || u890.j(kf30Var, rfb1.I)) ? 3 : 1);
                    qma0Var.f = Collections.singletonList(pfb1.b);
                    arrayList.add(qma0Var);
                }
                return arrayList;
            default:
                kf30 kf30Var2 = this.b;
                tka0 tka0Var2 = this.c;
                ucn0 ucn0Var2 = (ucn0) obj;
                if (u890.j(kf30Var2, rfb1.K)) {
                    oma0 oma0VarA = rc11.a(Iterable.class, tma0.c);
                    jd11 jd11Var = rc11.a;
                    tka0VarN = ((b7) jd11Var.d(oma0VarA)).n();
                    if (tka0VarN == null) {
                        throw new i9n(us71.f(jd11Var, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (u890.j(kf30Var2, rfb1.L)) {
                    oma0 oma0VarA2 = rc11.a(Collection.class, tma0.c);
                    jd11 jd11Var2 = rc11.a;
                    tka0VarN = ((b7) jd11Var2.d(oma0VarA2)).n();
                    if (tka0VarN == null) {
                        throw new i9n(us71.f(jd11Var2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (u890.j(kf30Var2, rfb1.N)) {
                    oma0 oma0VarA3 = rc11.a(Collection.class, tma0.c);
                    jd11 jd11Var3 = rc11.a;
                    tka0VarN = ((b7) jd11Var3.d(oma0VarA3)).n();
                    if (tka0VarN == null) {
                        throw new i9n(us71.f(jd11Var3, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (u890.j(kf30Var2, rfb1.M)) {
                    oma0 oma0VarA4 = rc11.a(Iterator.class, tma0.c);
                    jd11 jd11Var4 = rc11.a;
                    tka0VarN = ((b7) jd11Var4.d(oma0VarA4)).n();
                    if (tka0VarN == null) {
                        throw new i9n(us71.f(jd11Var4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    tka0VarN = null;
                }
                List<qma0> list = ucn0Var2.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (qma0 qma0Var2 : list) {
                    tma0 tma0Var = tma0.c;
                    arrayList2.add(bqn1.y(anm1.u(qma0Var2, (ArrayList) null, 7)));
                }
                List listI0 = f46.i0(new tka0[]{tka0Var2, tka0VarN});
                ArrayList arrayList3 = new ArrayList(q7h.U(listI0, 10));
                Iterator it2 = listI0.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(anm1.u((tka0) it2.next(), arrayList2, 6));
                }
                return arrayList3;
        }
    }

    public vcn0(tka0 tka0Var, kf30 kf30Var) {
        this.c = tka0Var;
        this.b = kf30Var;
    }
}
