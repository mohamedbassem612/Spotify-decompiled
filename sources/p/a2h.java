package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class a2h implements Update {
    public static final a2h a = new a2h();

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final Next a(Object obj, Object obj2) {
        Set setSingleton;
        i2h i2hVar = (i2h) obj;
        p1h p1hVar = (v1h) obj2;
        q2r0 q2r0Var = i2hVar.a;
        imb1 imb1Var = i2hVar.c;
        if (p1hVar instanceof m1h) {
            q2r0 q2r0Var2 = ((m1h) p1hVar).a;
            if (q2r0Var2.equals(q2r0Var)) {
                return Next.j();
            }
            i2h i2hVarA = i2h.a(i2hVar, q2r0Var2, null, null, 6);
            if ((q2r0Var instanceof r2r0) && (q2r0Var2 instanceof q2r0)) {
                String str = q2r0Var2.a.b;
                if (str.length() > 0) {
                    setSingleton = Collections.singleton(new n0h(str));
                } else {
                    setSingleton = w7x.a;
                }
            } else {
                setSingleton = w7x.a;
            }
            return Next.i(i2hVarA, setSingleton);
        }
        if (p1hVar instanceof p1h) {
            qnb1 qnb1Var = p1hVar.a;
            return !qnb1Var.equals(imb1Var) ? Next.h(i2h.a(i2hVar, null, null, qnb1Var, 3)) : Next.j();
        }
        if (p1hVar instanceof k1h) {
            int i = ((k1h) p1hVar).a;
            Integer num = i2hVar.b;
            return (num != null && i == num.intValue()) ? Next.j() : Next.h(i2h.a(i2hVar, null, Integer.valueOf(i), null, 5));
        }
        if (p1hVar instanceof h1h) {
            return Next.a(Effects.a(new p0h[]{new p0h(new o8k1(((h1h) p1hVar).a))}));
        }
        if (p1hVar instanceof j1h) {
            j1h j1hVar = (j1h) p1hVar;
            if (q2r0Var instanceof q2r0) {
                return Next.a(Effects.a(new v0h[]{new v0h(j1hVar.a, !q2r0Var.a.c)}));
            }
            hhg1.n("Failed requirement.");
            return null;
        }
        if (p1hVar instanceof i1h) {
            i1h i1hVar = (i1h) p1hVar;
            if (q2r0Var instanceof q2r0) {
                return Next.a(Effects.a(new u0h[]{new u0h(i1hVar.a, q2r0Var.a.e.equals("no"))}));
            }
            hhg1.n("Failed requirement.");
            return null;
        }
        if (p1hVar instanceof l1h) {
            l1h l1hVar = (l1h) p1hVar;
            if (imb1Var instanceof imb1) {
                return Next.a(Effects.a(new p0h[]{new p0h(new g9k1(l1hVar.a, imb1Var.a))}));
            }
            hhg1.n("Failed requirement.");
            return null;
        }
        if (p1hVar instanceof n1h) {
            ou80 ou80Var = ((n1h) p1hVar).a;
            if (!(imb1Var instanceof imb1)) {
                hhg1.n("Failed requirement.");
                return null;
            }
            imb1 imb1Var2 = imb1Var;
            u2h u2hVar = imb1Var2.c;
            if (u2hVar.equals(n2h.a)) {
                return Next.a(Effects.a(new q0h[]{new q0h(ou80Var, imb1Var2.d)}));
            }
            if (u2hVar instanceof o2h) {
                return Next.a(Effects.a(new t0h[]{new t0h(ou80Var)}));
            }
            if (u2hVar instanceof p2h) {
                return Next.a(Effects.a(new o0h[]{new o0h(ou80Var)}));
            }
            eg.o();
            return null;
        }
        if (p1hVar.equals(o1h.a)) {
            if (imb1Var instanceof imb1) {
                return Next.a(Effects.a(new w0h[]{new w0h(!imb1Var.d)}));
            }
            hhg1.n("Failed requirement.");
            return null;
        }
        if (p1hVar instanceof q1h) {
            q1h q1hVar = (q1h) p1hVar;
            if (imb1Var instanceof imb1) {
                return Next.a(Effects.a(new m0h[]{new m0h(q1hVar.a, q1hVar.b, imb1Var.d)}));
            }
            hhg1.n("Failed requirement.");
            return null;
        }
        if (p1hVar instanceof r1h) {
            r1h r1hVar = (r1h) p1hVar;
            return Next.a(Effects.a(new p0h[]{new p0h(new q9k1(r1hVar.a.b.a, r1hVar.b))}));
        }
        if (p1hVar instanceof s1h) {
            s1h s1hVar = (s1h) p1hVar;
            return Next.a(Effects.a(new p0h[]{new p0h(new q9k1(s1hVar.a.b.a, s1hVar.b))}));
        }
        if (p1hVar instanceof u1h) {
            u1h u1hVar = (u1h) p1hVar;
            return Next.a(Effects.a(new s0h[]{new s0h(u1hVar.a, u1hVar.b)}));
        }
        if (p1hVar instanceof g1h) {
            g1h g1hVar = (g1h) p1hVar;
            return Next.a(Effects.a(new p0h[]{new p0h(new a9k1(g1hVar.a.b.a, g1hVar.b))}));
        }
        if (!(p1hVar instanceof t1h)) {
            eg.o();
            return null;
        }
        t1h t1hVar = (t1h) p1hVar;
        boolean z = t1hVar.a;
        tv80 tv80Var = t1hVar.d;
        if (z) {
            return Next.a(Collections.singleton(new r0h(t1hVar.c, tv80Var.a, t1hVar.e)));
        }
        Integer num2 = t1hVar.b;
        return Next.a(Effects.a(new p0h[]{num2 != null ? new p0h(new r8k1(num2.intValue(), tv80Var)) : new p0h(new o9k1())}));
    }
}
