package p;

import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimeline;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class gse1 implements Update {
    public final Next a(Object obj, Object obj2) {
        int i;
        int i2;
        hqe1 hqe1Var;
        int i3;
        rqe1 rqe1Var = (rqe1) obj;
        ese1 ese1Var = (ese1) obj2;
        mqe1 mqe1Var = rqe1Var.b;
        if (ese1Var instanceof bse1) {
            return Next.h(rqe1.a(rqe1Var, ((bse1) ese1Var).a, null, null, null, 14));
        }
        boolean z = ese1Var instanceof wre1;
        iqe1 iqe1Var = iqe1.a;
        if (z) {
            wre1 wre1Var = (wre1) ese1Var;
            String str = wre1Var.c;
            int i4 = wre1Var.b;
            UserTimeline userTimeline = wre1Var.a;
            if (!u890.j(mqe1Var, iqe1Var) && !(mqe1Var instanceof kqe1) && !(mqe1Var instanceof hqe1) && !(mqe1Var instanceof lqe1) && !(mqe1Var instanceof jqe1)) {
                if (mqe1Var instanceof gqe1) {
                    return Next.h(rqe1.a(rqe1Var, 0, new gqe1(o7h.O0(new cte1(userTimeline, i4), ((gqe1) mqe1Var).a)), null, str, 5));
                }
                eg.o();
                return null;
            }
            ArrayList arrayList = new ArrayList(mqe1Var.A0());
            if (arrayList.isEmpty() || ((cte1) o7h.A0(arrayList)).b < i4) {
                arrayList.add(new cte1(userTimeline, i4));
            }
            return Next.h(rqe1.a(rqe1Var, 0, new jqe1(userTimeline.q(), arrayList), null, str, 5));
        }
        if (ese1Var instanceof ase1) {
            if (mqe1Var instanceof jqe1) {
                i3 = ((jqe1) mqe1Var).b;
            } else {
                if (!(mqe1Var instanceof hqe1)) {
                    return Next.j();
                }
                i3 = ((hqe1) mqe1Var).c;
            }
            if (i3 < 0) {
                return Next.h(rqe1.a(rqe1Var, 0, new gqe1(mqe1Var.A0()), null, null, 13));
            }
            return mqe1Var instanceof hqe1 ? Next.j() : Next.i(rqe1.a(rqe1Var, 0, new kqe1(mqe1Var.A0(), i3), null, null, 13), Collections.singleton(new kre1(i3)));
        }
        if (ese1Var instanceof vre1) {
            int i5 = ((vre1) ese1Var).a;
            boolean zIsEmpty = mqe1Var.A0().isEmpty();
            tre1 tre1Var = tre1.a;
            if (zIsEmpty) {
                hqe1Var = new hqe1(z6x.a, tre1Var, i5);
            } else if (mqe1Var instanceof hqe1) {
                hqe1Var = (hqe1) mqe1Var;
            } else {
                if (mqe1Var instanceof gqe1) {
                    return Next.j();
                }
                hqe1Var = new hqe1(mqe1Var.A0(), tre1Var, i5);
            }
            hqe1 hqe1Var2 = hqe1Var;
            return !mqe1Var.equals(hqe1Var2) ? Next.h(rqe1.a(rqe1Var, 0, hqe1Var2, null, null, 13)) : Next.j();
        }
        if (ese1Var instanceof yre1) {
            int i6 = ((yre1) ese1Var).b;
            if (mqe1Var instanceof jqe1) {
                i2 = ((jqe1) mqe1Var).b;
            } else {
                i2 = mqe1Var instanceof hqe1 ? ((hqe1) mqe1Var).c : i6;
            }
            if (i2 > i6) {
                i6 = i2;
            }
            return Next.h(rqe1.a(rqe1Var, 0, new hqe1(mqe1Var.A0(), sre1.a, i6), null, null, 13));
        }
        if (ese1Var.equals(zre1.a)) {
            return Next.a(Effects.a(new mre1[]{mre1.c}));
        }
        if (!(ese1Var instanceof xre1)) {
            if (ese1Var instanceof dse1) {
                return Next.h(rqe1.a(rqe1Var, 0, new lqe1(((dse1) ese1Var).a), null, null, 13));
            }
            if (ese1Var instanceof cse1) {
                return Next.h(rqe1.a(rqe1Var, 0, null, ((cse1) ese1Var).a, null, 11));
            }
            eg.o();
            return null;
        }
        if ((mqe1Var instanceof lqe1) || u890.j(mqe1Var, iqe1Var)) {
            i = 0;
        } else if (mqe1Var instanceof hqe1) {
            i = ((hqe1) mqe1Var).c;
        } else {
            if (!(mqe1Var instanceof jqe1)) {
                if ((mqe1Var instanceof kqe1) || (mqe1Var instanceof gqe1)) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            i = ((jqe1) mqe1Var).b;
        }
        return Next.i(rqe1.a(rqe1Var, 0, new kqe1(mqe1Var.A0(), i), null, null, 13), Effects.a(new kre1[]{new kre1(i)}));
    }
}
