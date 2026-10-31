package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class das implements Update {
    public static final das a = new das();

    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    public final Next a(Object obj, Object obj2) {
        HashSet hashSetA;
        ph20 ph20Var = (ph20) obj;
        jh20 jh20Var = (lh20) obj2;
        ph20Var.getClass();
        jh20Var.getClass();
        if (jh20Var instanceof kh20) {
            String str = ((kh20) jh20Var).a;
            return Next.i(ph20.a(ph20Var, str, null, null, 30), ph20Var.a == null ? Effects.a(new c2p1[]{new dh20(bq80.e), new eh20(str)}) : Effects.a(new eh20[]{new eh20(str)}));
        }
        if (jh20Var instanceof ih20) {
            return Next.a(Effects.a(new c2p1[]{new dh20(bq80.c), bh20.c}));
        }
        if (!(jh20Var instanceof jh20)) {
            if (jh20Var instanceof hh20) {
                return Next.a(Effects.a(new dh20[]{new dh20(bq80.d)}));
            }
            if (jh20Var instanceof gh20) {
                return Next.h(ph20.a(ph20Var, null, null, null, 27));
            }
            if (jh20Var instanceof fh20) {
                return Next.h(ph20.a(ph20Var, null, null, ((fh20) jh20Var).a, 23));
            }
            eg.o();
            return null;
        }
        if (!ph20Var.e) {
            return Next.h(ph20.a(ph20Var, null, jh20Var.a, null, 29));
        }
        zsq0 zsq0Var = jh20Var.a;
        ph20 ph20VarA = ph20.a(ph20Var, null, zsq0Var, null, 29);
        if (zsq0Var instanceof zsq0) {
            m851 m851Var = (m851) zsq0Var.a;
            if (m851Var.a.b.isEmpty()) {
                hashSetA = Effects.a(new c2p1[0]);
            } else {
                List list = m851Var.a.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i1z) it.next()).a);
                }
                hashSetA = Effects.a(new ch20[]{new ch20(arrayList)});
            }
        } else {
            hashSetA = Effects.a(new c2p1[0]);
        }
        return Next.i(ph20VarA, hashSetA);
    }
}
