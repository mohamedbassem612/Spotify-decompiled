package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class zf7 implements Update {
    public final Next a(Object obj, Object obj2) {
        String str;
        p6r0 p6r0VarE;
        Object next;
        dg7 dg7Var = (dg7) obj;
        xf7 xf7Var = (xf7) obj2;
        sd7 sd7Var = dg7Var.j;
        me7 me7Var = dg7Var.i;
        List list = dg7Var.c;
        if (xf7Var instanceof pf7) {
            sd7 sd7Var2 = ((pf7) xf7Var).a;
            return Next.i(dg7.a(dg7Var, false, false, null, false, false, false, false, null, sd7Var2, 511), Collections.singleton(new ve7(sd7Var2.a, sd7Var2.f.size())));
        }
        if (xf7Var instanceof jf7) {
            jf7 jf7Var = (jf7) xf7Var;
            hi90 hi90Var = jf7Var.a;
            int iOrdinal = me7Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return Next.a(Collections.singleton(new cf7(Collections.singletonList(hi90Var), jf7Var.b)));
            }
            if (iOrdinal == 2) {
                return Next.h(dg7.a(dg7Var, false, false, o7h.O0(hi90Var, list), false, false, false, false, null, null, 1019));
            }
            eg.o();
            return null;
        }
        if (xf7Var instanceof vf7) {
            return Next.a(Collections.singleton(ye7.d));
        }
        if (xf7Var instanceof rf7) {
            rf7 rf7Var = (rf7) xf7Var;
            yd7 yd7Var = rf7Var.b;
            if (yd7Var instanceof td7) {
                bh90 bh90Var = ((td7) yd7Var).a;
                if (bh90Var.d) {
                    return Next.a(Collections.singleton(new ff7(bh90Var.a)));
                }
            }
            if (yd7Var instanceof ud7) {
                ch90 ch90Var = ((ud7) yd7Var).a;
                if (ch90Var.d) {
                    return Next.a(Collections.singleton(new ff7(ch90Var.a)));
                }
            }
            return Next.a(Collections.singleton(new ze7(rf7Var.a, yd7Var)));
        }
        if (xf7Var instanceof lf7) {
            return (me7Var != me7.c || list.isEmpty()) ? Next.a(Collections.singleton(xe7.d)) : Next.a(Collections.singleton(new cf7(list, null)));
        }
        if (!(xf7Var instanceof tf7)) {
            if (xf7Var instanceof kf7) {
                kf7 kf7Var = (kf7) xf7Var;
                return Next.a(Collections.singleton(new ef7(kf7Var.a, kf7Var.b)));
            }
            if (xf7Var instanceof sf7) {
                return Next.a(Collections.singleton(new af7(((sf7) xf7Var).a)));
            }
            if (xf7Var instanceof qf7) {
                return Next.h(dg7.a(dg7Var, false, false, o7h.N0(((qf7) xf7Var).a, list), false, false, false, false, null, null, 1019));
            }
            if (xf7Var instanceof wf7) {
                wf7 wf7Var = (wf7) xf7Var;
                return Next.a(Collections.singleton(new hf7(wf7Var.a, wf7Var.b)));
            }
            if (xf7Var instanceof nf7) {
                nf7 nf7Var = (nf7) xf7Var;
                return Next.i(dg7.a(dg7Var, nf7Var.a, false, null, false, false, false, false, null, null, 1022), (dg7Var.a || !nf7Var.a) ? w7x.a : Collections.singleton(new hf7(sd7Var.a, null)));
            }
            if (xf7Var instanceof mf7) {
                return Next.a(Collections.singleton(we7.d));
            }
            if (xf7Var instanceof uf7) {
                return Next.h(dg7.a(dg7Var, false, false, null, false, false, false, false, ((uf7) xf7Var).a, null, 895));
            }
            if (xf7Var instanceof of7) {
                of7 of7Var = (of7) xf7Var;
                return Next.h(dg7.a(dg7Var, false, of7Var.a, null, of7Var.b, of7Var.c, of7Var.d, of7Var.e, null, null, 901));
            }
            eg.o();
            return null;
        }
        tf7 tf7Var = (tf7) xf7Var;
        String str2 = tf7Var.a;
        if (dg7Var.e && tf7Var.c) {
            Iterator it = sd7Var.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((hi90) next).getUri(), str2));
            hi90 hi90Var2 = (hi90) next;
            return Next.a(Collections.singleton(new df7(str2, hi90Var2 != null ? hi90Var2.getImageUri() : null)));
        }
        if (dg7Var.d && tf7Var.e && !tf7Var.f) {
            return Next.a(Collections.singleton(new gf7(str2)));
        }
        if (tf7Var.d) {
            return Next.a(Collections.singleton(new ff7(str2)));
        }
        String str3 = tf7Var.b;
        tv80 tv80Var = tf7Var.g;
        yd7 yd7Var2 = sd7Var.h;
        if (yd7Var2 == null || (p6r0VarE = yd7Var2.e()) == null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            str = yon1.G1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 183, "assisted-curation").c;
        } else {
            str = p6r0VarE.c;
        }
        return Next.a(Collections.singleton(new bf7(str3, str3, str2, str, tv80Var)));
    }
}
