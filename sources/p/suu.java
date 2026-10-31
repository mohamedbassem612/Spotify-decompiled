package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class suu implements hac0 {
    public final hx7 a;
    public final Scheduler b;
    public final nuu c;
    public final lzn0 d;
    public final z5h1 e;
    public final rku f = new rku();

    public suu(hx7 hx7Var, Scheduler scheduler, nuu nuuVar, lzn0 lzn0Var, z5h1 z5h1Var) {
        this.a = hx7Var;
        this.b = scheduler;
        this.c = nuuVar;
        this.d = lzn0Var;
        this.e = z5h1Var;
    }

    public final void a(ouu ouuVar, v1v v1vVar, puu puuVar, quu quuVar) {
        nuu nuuVar = this.c;
        Context context = nuuVar.a;
        int iOrdinal = ouuVar.ordinal();
        if (iOrdinal == 0) {
            if (v1vVar.a) {
                nuuVar.a(context.getString(2131955108), context.getString(2131955102), context.getString(2131955107), context.getString(2131955106), new ruu(this, (byte) 1), k6b.e).b();
                return;
            } else if (!v1vVar.b) {
                puuVar.a();
                return;
            } else {
                nuuVar.b(new ruu(this, (byte) 0), new ln5(this, puuVar, (byte) 9), new whr(this, (byte) 2)).b();
                this.e.a(dx7.c);
                return;
            }
        }
        if (iOrdinal == 1) {
            quuVar.b(z6x.a);
            return;
        }
        if (iOrdinal != 2) {
            eg.o();
            return;
        }
        List list = v1vVar.c;
        if (list.isEmpty()) {
            nuuVar.a(context.getString(2131955099), context.getString(2131955087), context.getString(2131955098), context.getString(2131955097), new oad(quuVar, (byte) 14), k6b.f).b();
            return;
        }
        nuuVar.a(context.getString(list.size() > 1 ? 2131955090 : 2131955094), context.getString(list.size() > 1 ? 2131955088 : 2131955092, o7h.y0(list, ", ", (String) null, (String) null, juu.U0, 30)), context.getString(list.size() > 1 ? 2131955089 : 2131955093), context.getString(2131955091), new ln5(quuVar, list, (byte) 10), k6b.g).b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    public final void b(xwp0 xwp0Var, v1v v1vVar, puu puuVar, quu quuVar) {
        ouu ouuVar;
        if (xwp0Var instanceof rwp0) {
            ouuVar = ouu.a;
        } else {
            boolean z = xwp0Var instanceof vwp0;
            ouu ouuVar2 = ouu.b;
            if (z || (xwp0Var instanceof jwp0)) {
                ouuVar = ouuVar2;
            } else {
                boolean z2 = xwp0Var instanceof hwp0;
                ouu ouuVar3 = ouu.c;
                if (!z2) {
                    if ((xwp0Var instanceof lwp0) || (xwp0Var instanceof pwp0) || (xwp0Var instanceof nwp0)) {
                        ouuVar = ouuVar2;
                    } else if (!(xwp0Var instanceof twp0)) {
                        eg.o();
                        return;
                    }
                }
                ouuVar = ouuVar3;
            }
        }
        a(ouuVar, v1vVar, puuVar, quuVar);
    }
}
