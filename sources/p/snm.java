package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class snm implements o01 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ snm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final n01 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ham hamVar = (ham) obj;
                pp ppVar = new pp(((xfx) hamVar.b).c, (byte) 27);
                otu otuVar = new otu(ppVar, (rxr) hamVar.c);
                yir yirVarA = ppVar.a((l0i) null);
                otuVar.c = yirVarA;
                return new rnm(otuVar, (ConstraintLayout) yirVarA.c);
            default:
                bjx bjxVar = (bjx) obj;
                w0d w0dVar = new w0d(new nfx(((xfx) bjxVar.b).c), (rxr) bjxVar.c, ((do4) bjxVar.d).c(), (nlu) ((kly0) bjxVar.e).get(), (bf3) bjxVar.f, ((f6g1) bjxVar.g).a());
                return new r9z(w0dVar.d(), w0dVar);
        }
    }

    public final void b(a2z a2zVar, w611 w611Var) {
        k4m k4mVar;
        switch (this.a) {
            case 0:
                otu otuVar = ((rnm) w611Var).U0;
                unm unmVar = ((qnm) a2zVar).c;
                qzh qzhVar = (qzh) otuVar.c;
                if (qzhVar == null) {
                    u890.C("row");
                    throw null;
                }
                String str = unmVar.i;
                String str2 = unmVar.c;
                String str3 = unmVar.a;
                int iC = l1d.C(unmVar.g);
                if (iC == 0) {
                    k4mVar = k4m.b;
                } else if (iC == 1) {
                    k4mVar = k4m.a;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    k4mVar = k4m.d;
                }
                k4m k4mVar2 = k4mVar;
                int iR = dsa0.r(unmVar.f);
                long j = unmVar.d;
                long j2 = unmVar.e;
                float f = j;
                float f2 = 0.0f;
                if (f > 0.0f) {
                    f2 = j2 > j ? 1.0f : j2 / f;
                }
                qzhVar.f(new w9z(str3, str, str2, k4mVar2, new saz(0L, 0L, f2, false, unmVar.h, iR, unmVar.m, (iix0) null, 331)));
                qzh qzhVar2 = (qzh) otuVar.c;
                if (qzhVar2 != null) {
                    qzhVar2.n(new w3w(otuVar, unmVar, (byte) 12));
                    return;
                } else {
                    u890.C("row");
                    throw null;
                }
            default:
                ((r9z) w611Var).U0.a(((q9z) a2zVar).c);
                return;
        }
    }
}
