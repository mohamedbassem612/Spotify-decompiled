package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ww11 implements Update {
    public static final ww11 a = new ww11();

    public final Next a(Object obj, Object obj2) {
        sx11 sx11Var = (sx11) obj;
        gw11 gw11Var = (gw11) obj2;
        if (gw11Var instanceof dw11) {
            return Next.h(((dw11) gw11Var).a);
        }
        if (gw11Var instanceof bw11) {
            if (!(sx11Var instanceof px11)) {
                return Next.j();
            }
            yw11 yw11Var = ((px11) sx11Var).a;
            return Next.a(Collections.singleton(new zv11(yw11Var.a, dm61.x0(((bw11) gw11Var).a, sj1.q(yw11Var)))));
        }
        if (gw11Var instanceof fw11) {
            if (!(sx11Var instanceof px11)) {
                return Next.j();
            }
            yw11 yw11Var2 = ((px11) sx11Var).a;
            Set<m620> setQ = sj1.q(yw11Var2);
            ArrayList arrayList = new ArrayList(q7h.U(setQ, 10));
            for (m620 m620VarA : setQ) {
                fw11 fw11Var = (fw11) gw11Var;
                if (u890.j(m620VarA, fw11Var.a)) {
                    Set<m620> set = m620VarA.e;
                    ArrayList arrayList2 = new ArrayList(q7h.U(set, 10));
                    for (m620 m620VarA2 : set) {
                        if (u890.j(m620VarA2.a, fw11Var.b)) {
                            m620VarA2 = m620.a(m620VarA2, true, null, 23);
                        }
                        arrayList2.add(m620VarA2);
                    }
                    m620VarA = m620.a(m620VarA, false, o7h.p1(arrayList2), 15);
                }
                arrayList.add(m620VarA);
            }
            return Next.a(Collections.singleton(new zv11(yw11Var2.a, o7h.p1(arrayList))));
        }
        if (gw11Var instanceof aw11) {
            if (!(sx11Var instanceof px11)) {
                return Next.j();
            }
            yw11 yw11Var3 = ((px11) sx11Var).a;
            return Next.a(Collections.singleton(new zv11(yw11Var3.a, dm61.u0(((aw11) gw11Var).a, sj1.q(yw11Var3)))));
        }
        if (!(gw11Var instanceof ew11)) {
            if (gw11Var instanceof cw11) {
                return sx11Var instanceof px11 ? Next.a(Collections.singleton(new zv11(((px11) sx11Var).a.a, w7x.a))) : Next.j();
            }
            eg.o();
            return null;
        }
        if (!(sx11Var instanceof px11)) {
            return Next.j();
        }
        yw11 yw11Var4 = ((px11) sx11Var).a;
        Set<m620> setQ2 = sj1.q(yw11Var4);
        ArrayList arrayList3 = new ArrayList(q7h.U(setQ2, 10));
        for (m620 m620VarA3 : setQ2) {
            ew11 ew11Var = (ew11) gw11Var;
            if (u890.j(m620VarA3, ew11Var.a)) {
                Set<m620> set2 = m620VarA3.e;
                ArrayList arrayList4 = new ArrayList(q7h.U(set2, 10));
                for (m620 m620VarA4 : set2) {
                    if (u890.j(m620VarA4.a, ew11Var.b)) {
                        m620VarA4 = m620.a(m620VarA4, false, null, 23);
                    }
                    arrayList4.add(m620VarA4);
                }
                m620VarA3 = m620.a(m620VarA3, false, o7h.p1(arrayList4), 15);
            }
            arrayList3.add(m620VarA3);
        }
        return Next.a(Collections.singleton(new zv11(yw11Var4.a, o7h.p1(arrayList3))));
    }
}
