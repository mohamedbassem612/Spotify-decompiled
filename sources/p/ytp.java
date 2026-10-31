package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ytp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ytp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final bwo0 a(List list) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                k9k k9kVar = (k9k) ((bsp) jly0Var).c;
                rvo0 rvo0Var = (rvo0) k9kVar.b;
                z8o0 z8o0Var = (z8o0) rvo0Var.d.get();
                c8o.l(z8o0Var);
                pvo0 pvo0Var = (pvo0) ((jly0) k9kVar.c).get();
                i8h1 i8h1Var = (i8h1) rvo0Var.o.get();
                c8o.l(i8h1Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                bnj0 bnj0Var = new bnj0(i8h1Var, new fjl0(yon1.P3().a, nik1.W2.a, (byte) 26), (byte) 18);
                lcs lcsVar = (lcs) rvo0Var.m.get();
                c8o.l(lcsVar);
                Context context = (Context) rvo0Var.b.get();
                c8o.l(context);
                Scheduler scheduler = (Scheduler) rvo0Var.j.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) rvo0Var.i.get();
                c8o.l(scheduler2);
                wvo0 wvo0Var = new wvo0(z8o0Var, pvo0Var, bnj0Var, lcsVar, context, scheduler, scheduler2);
                mvo0 mvo0Var = (mvo0) ((jly0) k9kVar.d).get();
                xfx xfxVar = (xfx) ((rvo0) k9kVar.b).k.get();
                c8o.l(xfxVar);
                oto0 oto0Var = (oto0) ((rvo0) k9kVar.b).n.get();
                c8o.l(oto0Var);
                dto0 dto0Var = (dto0) ((rvo0) k9kVar.b).l.get();
                c8o.l(dto0Var);
                lcs lcsVar2 = (lcs) ((rvo0) k9kVar.b).m.get();
                c8o.l(lcsVar2);
                i8h1 i8h1Var2 = (i8h1) ((rvo0) k9kVar.b).o.get();
                c8o.l(i8h1Var2);
                r6h1 r6h1Var = r6h1.c;
                return new bwo0(wvo0Var, mvo0Var, list, xfxVar, oto0Var, dto0Var, lcsVar2, i8h1Var2, new rrk0((byte) 11));
            default:
                toj0 toj0Var = (toj0) ((bsp) jly0Var).c;
                cwo0 cwo0Var = (cwo0) toj0Var.b;
                z8o0 z8o0Var2 = (z8o0) cwo0Var.c.get();
                c8o.l(z8o0Var2);
                pvo0 pvo0Var2 = (pvo0) ((jly0) toj0Var.c).get();
                i8h1 i8h1Var3 = (i8h1) cwo0Var.l.get();
                c8o.l(i8h1Var3);
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                bnj0 bnj0Var2 = new bnj0(i8h1Var3, new fjl0(yon1.P3().a, nik1.W2.a, (byte) 26), (byte) 18);
                lcs lcsVar3 = (lcs) cwo0Var.j.get();
                c8o.l(lcsVar3);
                gj5 gj5Var = (gj5) cwo0Var.a.get();
                c8o.l(gj5Var);
                Scheduler scheduler3 = (Scheduler) cwo0Var.g.get();
                c8o.l(scheduler3);
                Scheduler scheduler4 = (Scheduler) cwo0Var.f.get();
                c8o.l(scheduler4);
                wvo0 wvo0Var2 = new wvo0(z8o0Var2, pvo0Var2, bnj0Var2, lcsVar3, gj5Var, scheduler3, scheduler4);
                mvo0 mvo0Var2 = (mvo0) ((jly0) toj0Var.d).get();
                xfx xfxVar2 = (xfx) ((cwo0) toj0Var.b).h.get();
                c8o.l(xfxVar2);
                oto0 oto0Var2 = (oto0) ((cwo0) toj0Var.b).k.get();
                c8o.l(oto0Var2);
                dto0 dto0Var2 = (dto0) ((cwo0) toj0Var.b).i.get();
                c8o.l(dto0Var2);
                lcs lcsVar4 = (lcs) ((cwo0) toj0Var.b).j.get();
                c8o.l(lcsVar4);
                i8h1 i8h1Var4 = (i8h1) ((cwo0) toj0Var.b).l.get();
                c8o.l(i8h1Var4);
                r6h1 r6h1Var2 = r6h1.c;
                return new bwo0(wvo0Var2, mvo0Var2, list, xfxVar2, oto0Var2, dto0Var2, lcsVar4, i8h1Var4, new rrk0((byte) 11));
        }
    }
}
