package p;

import android.os.Bundle;
import com.spotify.blend.tastematch.BlendTasteMatchFragment;
import com.spotify.scannables.scannables.ScannablesActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u5b implements wu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qc90 qc90Var = (qc90) obj;
                qc90Var.getClass();
                x2p x2pVar = (x2p) ((w2p) obj2).a.b;
                o5b o5bVar = (o5b) x2pVar.c;
                x0b x0bVar = (x0b) o5bVar.a.get();
                c8o.l(x0bVar);
                lzn0 lzn0Var = (lzn0) o5bVar.e.get();
                c8o.l(lzn0Var);
                BlendTasteMatchFragment blendTasteMatchFragment = (BlendTasteMatchFragment) x2pVar.d;
                kt91 kt91Var = (kt91) o5bVar.b.get();
                c8o.l(kt91Var);
                i8h1 i8h1Var = (i8h1) o5bVar.i.get();
                c8o.l(i8h1Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                ntk0 ntk0Var = new ntk0(yon1.f0().c);
                Scheduler scheduler = (Scheduler) o5bVar.j.get();
                c8o.l(scheduler);
                r5b r5bVar = new r5b(x0bVar, lzn0Var, blendTasteMatchFragment, kt91Var, i8h1Var, ntk0Var, scheduler);
                o5b o5bVar2 = (o5b) x2pVar.c;
                String str = (String) o5bVar2.k.get();
                c8o.l(str);
                gw70 gw70Var = (gw70) o5bVar2.c.get();
                c8o.l(gw70Var);
                hf4 hf4Var = (hf4) o5bVar2.f.get();
                c8o.l(hf4Var);
                return new v5b(r5bVar, str, gw70Var, hf4Var, qc90Var);
            case 1:
                return ((k4p) obj2).a((bi90) obj);
            case 2:
                List list = (List) obj;
                nlp nlpVar = (nlp) obj2;
                switch (nlpVar.a) {
                    case 0:
                        p2o0 p2o0Var = (p2o0) ((blp) nlpVar.b).c;
                        return new czb0((olp) ((jly0) p2o0Var.d).get(), (plp) ((jly0) p2o0Var.f).get(), list);
                    default:
                        cp31 cp31Var = (cp31) ((blp) nlpVar.b).c;
                        return new czb0((olp) ((jly0) cp31Var.c).get(), (plp) ((jly0) cp31Var.e).get(), list);
                }
            case 3:
                t7e0 t7e0Var = ((v6e0) obj2).i;
                if (t7e0Var == null) {
                    return mno1.g();
                }
                Bundle bundleG = mno1.g();
                t7e0Var.d.o(bundleG);
                return bundleG;
            case 4:
                return ((q1n0) obj2).a((q6e0) obj);
            case 5:
                j2q j2qVar = ((q1q) obj2).a.c;
                return new o8e0((r8e0) j2qVar.Q3.get(), (q8e0) j2qVar.R3.get(), (o9v0) obj);
            case 6:
                Boolean bool = (Boolean) obj;
                ScannablesActivity scannablesActivity = (ScannablesActivity) obj2;
                mbq mbqVar = scannablesActivity.h1;
                if (mbqVar == null) {
                    u890.C("pageElementFactory");
                    throw null;
                }
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                yxo yxoVar = (yxo) mbqVar.a.d;
                xh41 xh41Var = new xh41(zBooleanValue, (nbq) yxoVar.t.get(), (ScannablesActivity) yxoVar.c);
                scannablesActivity.i1 = xh41Var;
                return xh41Var;
            case 7:
                ib3 ib3Var = (ib3) ((ctq) obj2).a.c;
                return new yvo0((utf1) ((jly0) ib3Var.G).get(), (tm30) ((jly0) ib3Var.t).get(), (Observable) obj);
            default:
                orm1 orm1Var = (orm1) obj;
                s880 s880Var = (s880) obj2;
                zrj1 zrj1Var = (zrj1) s880Var.f;
                orm1Var.getClass();
                nrm1 nrm1Var = new nrm1((zrj1) zrj1Var.b, (cik1) zrj1Var.c, (erm1) zrj1Var.d, orm1Var);
                s880Var.h = nrm1Var;
                return nrm1Var;
        }
    }
}
