package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.lyrics.offlineimpl.database.LyricsDatabase;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class uge0 implements jly0 {
    public static q2f0 A(yfu yfuVar) {
        return new q2f0(yfuVar);
    }

    public static xge0 B(g420 g420Var) {
        return new xge0(g420Var.a());
    }

    public static iqp a(dj5 dj5Var) {
        return new iqp(dj5Var);
    }

    public static sva b(ynb0 ynb0Var) {
        return new sva(ynb0Var, (byte) 1);
    }

    public static w7w c(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 19);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static bne0 d(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, r7q r7qVar, r7q r7qVar2) {
        bne0 bne0Var = new bne0();
        bne0Var.a = kly0Var;
        bne0Var.b = kly0Var2;
        bne0Var.c = kly0Var3;
        bne0Var.d = r7qVar;
        bne0Var.e = r7qVar2;
        return bne0Var;
    }

    public static cne0 e(r7q r7qVar, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2) {
        cne0 cne0Var = new cne0();
        cne0Var.a = kly0Var;
        cne0Var.b = r7qVar;
        cne0Var.c = caqVar;
        cne0Var.d = caqVar2;
        cne0Var.e = kly0Var2;
        return cne0Var;
    }

    public static h9f0 f(caq caqVar, kly0 kly0Var, jly0 jly0Var, caq caqVar2, jly0 jly0Var2, jo80 jo80Var, g5t g5tVar) {
        h9f0 h9f0Var = new h9f0();
        h9f0Var.a = caqVar;
        h9f0Var.b = kly0Var;
        h9f0Var.c = jly0Var;
        h9f0Var.d = caqVar2;
        h9f0Var.e = jly0Var2;
        h9f0Var.f = jo80Var;
        h9f0Var.g = g5tVar;
        return h9f0Var;
    }

    public static w7w g(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 20);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static w7w h(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 24);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static ps7 i(lqp lqpVar) {
        return new ps7(new t7f0(false, (luk) lqpVar.a.a.get()), (byte) 12);
    }

    public static Intent j(Context context, pbk1 pbk1Var) {
        i2i1 i2i1VarA = pbk1Var.a(context, "spotify:home");
        i2i1VarA.c();
        return (Intent) i2i1VarA.b;
    }

    public static x8c0 k(LoginActivity loginActivity) {
        tac0 tac0Var = ((f0i) loginActivity).a;
        c8o.m(tac0Var);
        return tac0Var;
    }

    public static ObservableRefCount l(tge0 tge0Var) {
        return tge0Var.a;
    }

    public static n4b m(yfu yfuVar) {
        return new n4b((Object) yfuVar, (byte) 22);
    }

    public static b9o n(lqp lqpVar) {
        return new b9o((o241) lqpVar.a.d.get(), (byte) 8);
    }

    public static lqp o(uy2 uy2Var) {
        return new lqp(uy2Var);
    }

    public static o3e0 p(lqp lqpVar) {
        uy2 uy2Var = lqpVar.a;
        return new o3e0(new eip0((Flowable) uy2Var.c.get(), (byte) 1), new b9o((o241) uy2Var.d.get(), (byte) 8), new u8g((Context) uy2Var.b.get()), (byte) 7);
    }

    public static iff0 q(Context context, u2n u2nVar) {
        bn31 bn31VarT = u890.t(context, LyricsDatabase.class, "lyrics_db");
        bn31VarT.b(u2nVar);
        bn31VarT.a(new trj0[]{jch0.c});
        iff0 iff0VarU = bn31VarT.c().u();
        c8o.m(iff0VarU);
        return iff0VarU;
    }

    public static pjf0 r(paq paqVar, Activity activity, a1r0 a1r0Var) {
        daq daqVar = (daq) paqVar.a.c;
        return new pjf0(activity, a1r0Var, daqVar.a.l2, (mwn0) daqVar.Wd.get(), (fwn0) daqVar.Pe.get());
    }

    public static b2r0 s(c2r0 c2r0Var, qe41 qe41Var) {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return c2r0Var.e(qe41Var, yon1.G1("LOGIN", "login", 937, "login"), (qir0) null);
    }

    public static mir0 t(b2r0 b2r0Var) {
        return new mir0(((uba) b2r0Var).a());
    }

    public static u690 u(n4b n4bVar) {
        return new u690((zwz0) ((yfu) n4bVar.b).b);
    }

    public static m771 v(n4b n4bVar) {
        return new m771(n4bVar.A());
    }

    public static g871 w(n4b n4bVar) {
        return n4bVar.A();
    }

    public static s6b1 x(iqp iqpVar) {
        s6b1 s6b1Var = (s6b1) iqpVar.b.get();
        c8o.m(s6b1Var);
        return s6b1Var;
    }

    public static jn7 y(iqp iqpVar) {
        return new jn7(new CosmosCoroutineTransport(new p0c1((CallbackRouter) iqpVar.a.r.get())));
    }

    public static eip0 z(lqp lqpVar) {
        return new eip0((Flowable) lqpVar.a.c.get(), (byte) 1);
    }
}
