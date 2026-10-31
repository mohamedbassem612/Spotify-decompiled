package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ull implements nve0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ull(ytp0 ytp0Var, r4z r4zVar) {
        this.a = (byte) 6;
        hep hepVar = (hep) ytp0Var.e;
        String str = r4zVar.b;
        jar0 jar0Var = (jar0) ytp0Var.b;
        Scheduler scheduler = (Scheduler) ((yrg0) ytp0Var.f).b;
        f9p f9pVar = (f9p) hepVar.a.c;
        c3s c3sVar = (c3s) ((e7z) f9pVar.X).c0.get();
        c8o.l(c3sVar);
        e7p0 e7p0Var = (e7p0) ((e7z) f9pVar.X).e0.get();
        c8o.l(e7p0Var);
        e7z e7zVar = (e7z) f9pVar.X;
        srj0 srj0Var = (srj0) e7zVar.f0.get();
        c8o.l(srj0Var);
        rmr rmrVar = new rmr((g7z) f9pVar.t, (byte) 26);
        t8u0 t8u0Var = (t8u0) e7zVar.i.get();
        c8o.l(t8u0Var);
        ruz ruzVarA = t8u0Var.a(f9pVar.p().getLifecycle()).a();
        PlayOrigin playOrigin = new myq0((q7r0) f9pVar.Y).get();
        muz muzVarU = f9pVar.u();
        tgt0 tgt0Var = (tgt0) ((lbp) f9pVar.O0).get();
        vb2 vb2Var = (vb2) e7zVar.g0.get();
        c8o.l(vb2Var);
        wdp wdpVar = srj0Var.b;
        qns0 qns0Var = srj0Var.a;
        boolean z = srj0Var.c;
        zdp zdpVar = (zdp) wdpVar.a.c;
        xdp xdpVar = (xdp) zdpVar.b.get();
        ydp ydpVar = (ydp) zdpVar.c.get();
        g3z g3zVar = zdpVar.a;
        z8c0 z8c0Var = new z8c0(new w62(rmrVar, ruzVarA, playOrigin, muzVarU, tgt0Var, qns0Var, vb2Var, z, xdpVar, ydpVar, (Flowable) g3zVar.j.get(), (Scheduler) g3zVar.t.get()), (byte) 19);
        pxr pxrVar = (pxr) e7zVar.h0.get();
        c8o.l(pxrVar);
        this.b = new v7z(str, jar0Var, c3sVar, e7p0Var, z8c0Var, pxrVar, f9pVar.b().o(), scheduler);
    }

    public final Connectable a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (lgx0) obj;
            case 1:
                return (Connectable) obj;
            case 2:
                return null;
            case 3:
                return (ku1) obj;
            case 4:
                return (u421) obj;
            case 5:
                return (f9v0) obj;
            case 6:
                return (v7z) obj;
            case 7:
                return (ed2) obj;
            case 8:
            default:
                return null;
        }
    }

    public final Update b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return xxb0.f;
            case 1:
                return xxb0.f;
            case 2:
                return (dq7) obj;
            case 3:
                return rve0.f;
            case 4:
                return rve0.i;
            case 5:
                return rve0.g;
            case 6:
                return t2m.n;
            case 7:
                return t7p0.f;
            case 8:
                return (wam0) obj;
            default:
                return (wam0) obj;
        }
    }

    public ull(jc9 jc9Var) {
        this.a = (byte) 0;
        dcq dcqVar = (dcq) jc9Var.b;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = dcqVar.a(yon1.O3());
    }

    public ull(yzu yzuVar, byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = (u421) yzuVar.c;
                break;
            case 5:
                this.b = (f9v0) yzuVar.d;
                break;
            default:
                this.b = (ku1) yzuVar.b;
                break;
        }
    }

    public ull(boolean z, kvn kvnVar, n6r0 n6r0Var) {
        xis xisVarA;
        this.a = (byte) 1;
        if (z) {
            xisVarA = new xis((ajx0) kvnVar.w.a.d.X2.get(), n6r0Var);
        } else {
            xisVarA = kvnVar.v.a(n6r0Var);
        }
        this.b = xisVarA;
    }

    public ull(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                int i = th10.a;
                this.b = new ed2((byte) 13);
                break;
            case 8:
                this.b = new wam0(this, (byte) 20);
                break;
            case 9:
                this.b = new wam0(this, (byte) 22);
                break;
            default:
                this.b = new dq7(new tgo1(4), (byte) 27);
                break;
        }
    }
}
