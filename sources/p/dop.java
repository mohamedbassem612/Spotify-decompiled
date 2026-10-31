package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dop {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ dop(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final p40 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                kopVar.getClass();
                td20 td20Var = new td20(new urk0((byte) 4), (e8r0) kopVar.f16p.get(), new ulc((byte) 23));
                Activity activityS = kopVar.a.s();
                c8o.l(activityS);
                return new p40(td20Var, new j3v(new iro(activityS), (byte) 20), new mka((byte) 11), iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                apqVar.getClass();
                td20 td20Var2 = new td20(new urk0((byte) 4), (e8r0) apqVar.o.get(), new ulc((byte) 23));
                Activity activityS2 = apqVar.a.s();
                c8o.l(activityS2);
                return new p40(td20Var2, new j3v(new iro(activityS2), (byte) 20), new mka((byte) 11), iu30Var);
        }
    }
}
