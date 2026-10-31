package p;

import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qby0 {
    public static final qby0 a = new qby0();

    public static boolean a(eux0 eux0Var) {
        if (!(eux0Var.d instanceof vtx0)) {
            return false;
        }
        kqf1 kqf1Var = eux0Var.i;
        List list = kqf1Var != null ? kqf1Var.c : null;
        if (list == null) {
            list = z6x.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((iqf1) it.next()).a());
        }
        return !arrayList.equals(eux0Var.s);
    }

    public static b9f b(eux0 eux0Var) {
        Object objPrevious;
        List list = eux0Var.u;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            b9f b9fVar = (b9f) objPrevious;
            if ((b9fVar instanceof a9f) || (b9fVar instanceof j8f)) {
                return (b9f) objPrevious;
            }
        }
        objPrevious = null;
        return (b9f) objPrevious;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if ((r0 instanceof p.c8f) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.spotify.mobius.Next c(p.eux0 r4) {
        /*
            p.ttx0 r0 = r4.w
            p.dux0 r1 = r4.e
            boolean r2 = r0 instanceof p.stx0
            if (r2 == 0) goto L19
            p.b9f r2 = b(r4)
            boolean r3 = r2 instanceof p.z8f
            if (r3 != 0) goto L52
            boolean r3 = r2 instanceof p.x8f
            if (r3 != 0) goto L52
            boolean r2 = r2 instanceof p.i8f
            if (r2 == 0) goto L19
            goto L52
        L19:
            java.util.List r2 = r1.a
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5d
            java.util.List r2 = r1.b
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5d
            java.util.List r1 = r1.c
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5d
            boolean r1 = a(r4)
            if (r1 != 0) goto L5d
            boolean r0 = r0 instanceof p.stx0
            if (r0 == 0) goto L52
            p.b9f r0 = b(r4)
            boolean r1 = r0 instanceof p.b8f
            if (r1 != 0) goto L5d
            boolean r1 = r0 instanceof p.y8f
            if (r1 != 0) goto L5d
            boolean r0 = r0 instanceof p.c8f
            if (r0 == 0) goto L52
            goto L5d
        L52:
            p.gvx0 r4 = p.gvx0.a
            java.util.Set r4 = java.util.Collections.singleton(r4)
            com.spotify.mobius.Next r4 = com.spotify.mobius.Next.a(r4)
            return r4
        L5d:
            p.ovx0 r0 = new p.ovx0
            boolean r4 = r4.y
            r0.<init>(r4)
            java.util.Set r4 = java.util.Collections.singleton(r0)
            com.spotify.mobius.Next r4 = com.spotify.mobius.Next.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qby0.c(p.eux0):com.spotify.mobius.Next");
    }

    public static Next d(eux0 eux0Var, ktx0 ktx0Var) {
        Next nextH = fxx0.H(eux0Var, ktx0Var);
        if (nextH.d()) {
            eux0Var = (eux0) nextH.g();
        }
        eux0 eux0Var2 = eux0Var;
        eux0Var2.getClass();
        return Next.i(eux0.a(eux0Var2, null, new dux0(), false, null, null, false, null, null, null, false, null, null, 33554415), nextH.b());
    }
}
