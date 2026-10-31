package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class wwi1 implements Update {
    public final Next a(Object obj, Object obj2) {
        vf51 vf51Var;
        Object next;
        ywi1 ywi1Var = (ywi1) obj;
        vwi1 vwi1Var = (vwi1) obj2;
        kyi1 kyi1Var = ywi1Var.c;
        List list = kyi1Var.a;
        if (vwi1Var.equals(kwi1.a)) {
            return Next.a(Effects.a(new awi1[]{awi1.c}));
        }
        if (vwi1Var instanceof twi1) {
            twi1 twi1Var = (twi1) vwi1Var;
            return Next.a(Effects.a(new dwi1[]{new dwi1(twi1Var.a, twi1Var.b, twi1Var.c)}));
        }
        if (vwi1Var instanceof jwi1) {
            jwi1 jwi1Var = (jwi1) vwi1Var;
            return Next.a(Effects.a(new cwi1[]{new cwi1(jwi1Var.a, jwi1Var.b)}));
        }
        if (vwi1Var instanceof pwi1) {
            pwi1 pwi1Var = (pwi1) vwi1Var;
            return Next.a(Effects.a(new cwi1[]{new cwi1(pwi1Var.a, pwi1Var.b)}));
        }
        if (vwi1Var instanceof swi1) {
            return Next.h(ywi1.a(ywi1Var, new kyi1(list, ((swi1) vwi1Var).a), null, 11));
        }
        if (vwi1Var instanceof rwi1) {
            return Next.a(Effects.a(new cwi1[]{new cwi1(((rwi1) vwi1Var).a, null)}));
        }
        if (!vwi1Var.equals(qwi1.a)) {
            if (vwi1Var instanceof uwi1) {
                return Next.h(((uwi1) vwi1Var).a);
            }
            if (vwi1Var instanceof owi1) {
                owi1 owi1Var = (owi1) vwi1Var;
                return Next.a(Effects.a(new cwi1[]{new cwi1(owi1Var.a, owi1Var.b)}));
            }
            if (vwi1Var instanceof lwi1) {
                return Next.h(ywi1.a(ywi1Var, null, new p1a(((lwi1) vwi1Var).a), 7));
            }
            if (vwi1Var.equals(mwi1.a)) {
                return Next.h(ywi1.a(ywi1Var, null, o1a.a, 7));
            }
            if (vwi1Var instanceof nwi1) {
                nwi1 nwi1Var = (nwi1) vwi1Var;
                return Next.a(Effects.a(new cwi1[]{new cwi1(nwi1Var.a, nwi1Var.b)}));
            }
            eg.o();
            return null;
        }
        kfd1 kfd1Var = (kfd1) o7h.t0(kyi1Var.b, list);
        if (kfd1Var != null) {
            Iterator it = kfd1Var.b.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ArrayList arrayList = ((vf51) next).a;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((f6m) it2.next()).b instanceof oyi1) {
                            break loop0;
                        }
                    }
                }
            }
            vf51Var = (vf51) next;
        } else {
            vf51Var = null;
        }
        String str = vf51Var != null ? vf51Var.b : null;
        return (str == null || str.length() == 0) ? Next.j() : Next.a(Effects.a(new bwi1[]{new bwi1(ywi1Var)}));
    }
}
