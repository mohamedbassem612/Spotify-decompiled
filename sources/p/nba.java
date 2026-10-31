package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class nba implements vih0 {
    public final ruk a;
    public final x610 b;
    public final lxh0 c;
    public final qhh0 d;
    public final g510 e;
    public final oyr f;
    public final k811 g;
    public final yqg h;
    public final xgb0 i;
    public final u210 j;
    public final oih0 k;
    public final CompositeDisposable l = new CompositeDisposable();
    public final SerialDisposable m = new SerialDisposable();
    public long n;
    public final rl1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f59p;

    public nba(ruk rukVar, x610 x610Var, lxh0 lxh0Var, qhh0 qhh0Var, g510 g510Var, oyr oyrVar, k811 k811Var, r8l r8lVar, yqg yqgVar, xgb0 xgb0Var, u210 u210Var, oih0 oih0Var, uic uicVar) {
        this.a = rukVar;
        this.b = x610Var;
        this.c = lxh0Var;
        this.d = qhh0Var;
        this.e = g510Var;
        this.f = oyrVar;
        this.g = k811Var;
        this.h = yqgVar;
        this.i = xgb0Var;
        this.j = u210Var;
        this.k = oih0Var;
        rl1 rl1VarP = x610Var.a.c.p(rukVar.a());
        this.o = rl1VarP;
        rl1VarP.J();
        k811Var.x(rukVar.b(), UUID.randomUUID().toString());
        r8lVar.b.put(rukVar.b(), rukVar.a());
        this.n = yqgVar.b();
        this.f59p = true;
    }

    @Override // p.vih0
    public Set a() {
        return this.a.e();
    }

    @Override // p.vih0
    public void c(vsr0 vsr0Var, Bundle bundle, iu30 iu30Var) {
        this.n = this.h.b();
        r9c r9cVarM = m(vsr0Var);
        ou80 ou80VarN = n(r9cVarM);
        ruk rukVar = this.a;
        String strB = rukVar.b();
        String strE = r9cVarM.e();
        boolean zJ = u890.j(rukVar.c(), vsr0Var);
        xgb0 xgb0Var = this.i;
        fdc fdcVarB = xgb0Var.b(strB, strE, zJ);
        if (!"empty".equals(rukVar.d().c())) {
            this.l.b(((c610) this.b.a.e.get()).c(r9cVarM, bundle).map(new kba(this, (byte) 0)).subscribe(new qg7(this, fdcVarB, iu30Var, (byte) 2), new lba((byte) 0, ou80VarN, this, fdcVarB, r9cVarM, iu30Var)));
        } else {
            Logger.d("MBS: Requested to load children with empty root list type", new Object[0]);
            iu30Var.invoke(z6x.a);
            xgb0Var.a(fdcVarB, 4, 1);
        }
    }

    @Override // p.vih0
    public void d(String str, Bundle bundle, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, Function0 function0) {
        ruk rukVar = this.a;
        this.m.a(this.k.b(new nih0(str2, rukVar.b(), str, 10, false, q1mVar, 16)).map(new q59(this, str2 == null ? rukVar.b() : str2, (byte) 9)).doOnDispose(new z64(iu30Var, function0, (byte) 1)).subscribe(new a74(iu30Var, (byte) 1), new mba(vu30Var, (byte) 0)));
    }

    @Override // p.vih0
    public void destroy() {
        this.a.getClass();
        this.l.g();
        this.m.dispose();
        this.o.t();
        this.g.c();
    }

    @Override // p.vih0
    public final vsr0 e() {
        return this.a.c();
    }

    @Override // p.vih0
    public final lxh0 f() {
        return this.c;
    }

    @Override // p.vih0
    public final long g() {
        return this.n;
    }

    @Override // p.vih0
    public boolean k() {
        return this.f59p;
    }

    @Override // p.vih0
    public final String l() {
        return this.a.b();
    }

    public final r9c m(vsr0 vsr0Var) {
        UbiSpecificationId ubiSpecificationId;
        String strR = uic.r(vsr0Var);
        ruk rukVar = this.a;
        String strB = rukVar.b();
        String str = rukVar.a().b;
        boolean zJ = u890.j(rukVar.c(), vsr0Var);
        m210 m210VarA = rukVar.a();
        String strC = rukVar.d().c();
        String strB2 = rukVar.d().b();
        String strB3 = rukVar.b();
        boolean zD = rukVar.d().d();
        for (Map.Entry entry : this.f.b.entrySet()) {
            ubiSpecificationId = (UbiSpecificationId) entry.getKey();
            ((r64) entry.getValue()).getClass();
            if (jo31.o(strB)) {
                return new r9c(strC, strR, strB3, strB2, m210VarA, zJ, zD, (hlr0) null, 0, 2, ubiSpecificationId, false, 249248);
            }
        }
        ubiSpecificationId = UbiSpecificationId.UNKNOWN;
        return new r9c(strC, strR, strB3, strB2, m210VarA, zJ, zD, (hlr0) null, 0, 2, ubiSpecificationId, false, 249248);
    }

    public ou80 n(r9c r9cVar) {
        i5w0 i5w0Var;
        UbiSpecificationId ubiSpecificationIdH = r9cVar.h();
        if (ubiSpecificationIdH != UbiSpecificationId.UNKNOWN) {
            String strE = r9cVar.e();
            oyr oyrVar = this.f;
            q710 q710Var = (q710) oyrVar.b(strE, ubiSpecificationIdH).h();
            r710 r710Var = new r710(ubiSpecificationIdH, strE, q710Var != null ? Integer.valueOf(q710Var.b()) : null, 4);
            r64 r64Var = (r64) oyrVar.b.get(r710Var.c());
            if (r64Var == null || "spotify_media_browser_root_android_auto".equals(r710Var.d())) {
                i5w0Var = j5.a;
            } else {
                List list = r64.b;
                i5w0Var = new i5w0(r6x0.a(r710Var.d(), r64Var.a.a).h(r710Var.b(), strE).a(strE));
            }
            w7h1 w7h1Var = (w7h1) i5w0Var.h();
            if (w7h1Var != null) {
                m210 m210VarA = this.a.a();
                g510 g510Var = this.e;
                return g510Var.r(m210VarA, g510Var.h.a(strE), w7h1Var);
            }
        }
        return null;
    }
}
