package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class p2y implements Update {
    public static final p2y a = new p2y();

    public final Next a(Object obj, Object obj2) {
        boolean zEquals;
        o2y o2yVar = (o2y) obj;
        n2y n2yVar = (n2y) obj2;
        boolean z = o2yVar.d;
        if (n2yVar instanceof m2y) {
            return Next.h(o2y.a(o2yVar, ((m2y) n2yVar).a, false, null, false, null, 252));
        }
        boolean zEquals2 = n2yVar.equals(i2y.a);
        s1y s1yVar = s1y.a;
        if (zEquals2) {
            return Next.i(o2y.a(o2yVar, null, false, null, false, null, 249), Collections.singleton(s1yVar));
        }
        if (n2yVar instanceof j2y) {
            rpu rpuVar = ((j2y) n2yVar).a;
            if (o2yVar.b || o2yVar.c || o2yVar.f) {
                return Next.j();
            }
            String str = o2yVar.a;
            if (str == null) {
                zEquals = rpuVar == rpu.STANDARD;
            } else {
                zEquals = str.equals(rpuVar.a);
            }
            if (zEquals) {
                return Next.j();
            }
            return z ? Next.i(o2y.a(o2yVar, null, false, rpuVar, false, null, 239), Collections.singleton(new o1y(rpuVar))) : Next.i(o2y.a(o2yVar, null, false, null, true, null, 159), f46.S0(new t1y[]{new r1y(rpuVar), new p1y(rpuVar)}));
        }
        if (n2yVar instanceof g2y) {
            rpu rpuVar2 = o2yVar.e;
            return rpuVar2 != null ? Next.i(o2y.a(o2yVar, null, false, null, true, ((g2y) n2yVar).a, 143), Collections.singleton(new r1y(rpuVar2))) : Next.j();
        }
        if (n2yVar.equals(f2y.a)) {
            return Next.h(o2y.a(o2yVar, null, false, null, false, null, 239));
        }
        if (n2yVar instanceof l2y) {
            return Next.i(o2y.a(o2yVar, ((l2y) n2yVar).a.a, false, null, false, null, 14), z ? Collections.singleton(new q1y(o2yVar.g)) : w7x.a);
        }
        if (n2yVar.equals(k2y.a)) {
            return Next.i(o2y.a(o2yVar, null, false, null, false, null, 143), Collections.singleton(s1yVar));
        }
        if (n2yVar instanceof h2y) {
            return Next.h(o2y.a(o2yVar, null, ((h2y) n2yVar).a, null, false, null, 247));
        }
        eg.o();
        return null;
    }
}
