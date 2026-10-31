package p;

import android.os.Build;
import com.spotify.externalintegration.loggingservice.events.proto.AudioRouteSegmentEnd;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d48 {
    public final u38 a;
    public final t2j0 b;
    public final Flowable c;
    public final Scheduler d;
    public final qfb e;
    public final g0l f;
    public final ypd g;
    public final vku h = new vku();
    public boolean i;
    public a48 j;
    public String k;
    public zpd l;

    public d48(u38 u38Var, t2j0 t2j0Var, Flowable flowable, Scheduler scheduler, qfb qfbVar, g0l g0lVar, ypd ypdVar) {
        this.a = u38Var;
        this.b = t2j0Var;
        this.c = flowable;
        this.d = scheduler;
        this.e = qfbVar;
        this.f = g0lVar;
        this.g = ypdVar;
    }

    public static boolean a(a48 a48Var) {
        if (a48Var.c() == null) {
            return false;
        }
        String strC = a48Var.c();
        strC.getClass();
        return strC.length() > 0 && !u890.j(a48Var.c(), Build.MODEL);
    }

    public final void b(a48 a48Var, String str) {
        b48 b48VarN = AudioRouteSegmentEnd.n();
        b48VarN.y("end_song");
        b48VarN.s(String.valueOf(a48Var.d()));
        b48VarN.q(a48Var.b());
        b48VarN.t(str);
        if (a(a48Var)) {
            b48VarN.r(a48Var.c());
        }
        zpd zpdVar = this.l;
        if (zpdVar != null) {
            b48VarN.n(zpdVar.a);
        }
        this.b.a(b48VarN.build());
    }
}
