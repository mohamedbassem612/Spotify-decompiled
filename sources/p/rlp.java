package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rlp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ rlp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ug3 a(iu30 iu30Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) jly0Var).c;
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                sfx sfxVar = new sfx(xfxVarC0.e, (byte) 4);
                urk0 urk0Var = new urk0((byte) 4);
                Activity activityS = kopVar.a.s();
                c8o.l(activityS);
                return new ug3(sfxVar, urk0Var, activityS, iu30Var);
            default:
                apq apqVar = (apq) ((ykq) jly0Var).c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                sfx sfxVar2 = new sfx(xfxVarC1.e, (byte) 4);
                urk0 urk0Var2 = new urk0((byte) 4);
                Activity activityS2 = apqVar.a.s();
                c8o.l(activityS2);
                return new ug3(sfxVar2, urk0Var2, activityS2, iu30Var);
        }
    }
}
