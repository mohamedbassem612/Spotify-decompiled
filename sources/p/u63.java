package p;

import android.view.ViewGroup;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u63 implements wpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final rsw d;

    public u63(ggx ggxVar, j1q j1qVar, cfq cfqVar, h5q h5qVar, r7q r7qVar, a3u0 a3u0Var, i8h1 i8h1Var, lik1 lik1Var, muz muzVar, tgt0 tgt0Var, iac0 iac0Var, xaj1 xaj1Var, bjx0 bjx0Var) {
        this.a = (byte) 11;
        boolean zF = ((v65) r7qVar.get()).f();
        this.b = new nw2(i8h1Var, lik1Var);
        ywv0 ywv0VarA = h5qVar.a(muzVar);
        ytp0 ytp0VarA = a3u0Var.a(iac0Var);
        thq thqVar = cfqVar.a;
        lzn0 lzn0Var = (lzn0) thqVar.c.i.get();
        daq daqVar = thqVar.b;
        ywv0 ywv0Var = new ywv0(lzn0Var, (b7r0) daqVar.p7.get(), daqVar.a.N1, (Observable) daqVar.l6.get(), (pe) daqVar.p9.get(), ywv0VarA, ytp0VarA, iac0Var);
        boolean zE = ((v65) r7qVar.get()).e();
        this.c = w3p1.q(new xaj1(ywv0Var, (byte) 19), new cb8(zE, ywv0Var, (byte) 24), new kf2(zE, ywv0Var, (byte) 29), (o8n) null, new m9i1(ywv0Var, xaj1Var, tgt0Var, bjx0Var, (byte) 2), 8);
        this.d = zF ? new qdv0(j1qVar, lik1Var, (byte) 1) : jch0.j(new zyf1(ggxVar, (byte) 21));
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (hy00) obj2;
            case 1:
                return (rqw) obj;
            case 2:
                return (ia00) obj2;
            case 3:
                return (eih1) obj2;
            case 4:
                return (eih1) obj2;
            case 5:
                return (i7h1) obj2;
            case 6:
                return (ia00) obj;
            case 7:
                return (azg) obj2;
            case 8:
                return (eih1) obj;
            case 9:
                return new ghz(this, (byte) 11);
            case 10:
                return (emo0) obj;
            default:
                return (nw2) obj2;
        }
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return (js20) obj2;
            case 1:
                return (rey0) obj;
            case 2:
                return (poy0) obj2;
            case 3:
                return (js20) obj2;
            case 4:
                return (js20) obj2;
            case 5:
                return (rey0) obj2;
            case 6:
                return (e7m0) obj;
            case 7:
                return (js20) obj2;
            case 8:
                return (e7m0) obj;
            case 9:
                return (rey0) obj2;
            case 10:
                return (uq7) obj;
            default:
                return (js20) obj2;
        }
    }

    public u63(lzn0 lzn0Var, gw70 gw70Var, Optional optional, xe01 xe01Var, String str) {
        this.a = (byte) 7;
        this.c = w3p1.p(new x68(xe01Var, str, (byte) 3), q4r0.P0, w0q0.O0, (o8n) null, new ozp0(optional, lzn0Var, (byte) 23), 8);
        this.b = new azg((rqw) new i7h1(jgq0.t, jgq0.X), (byte) 3);
        this.d = f6o1.j((ViewGroup.LayoutParams) null, new j2i(-1890652706, new noi0(gw70Var, (byte) 1), true), 5);
    }

    public u63(y1c1 y1c1Var, lzn0 lzn0Var, n6r0 n6r0Var, au8 au8Var, q8n q8nVar) {
        this.a = (byte) 10;
        this.b = new uq7(y1c1Var, lzn0Var, q8nVar);
        this.c = new emo0(n6r0Var, (byte) 1);
        this.d = jch0.j(new z821(au8Var, (byte) 29));
    }

    public u63(urk0 urk0Var, zwg zwgVar, g23 g23Var, j2h1 j2h1Var, iu30 iu30Var) {
        hy00 hy00VarC;
        byte b = 0;
        this.a = (byte) 0;
        if (j2h1Var instanceof xsr0) {
            hy00VarC = n3o1.r(this).c(new z63(urk0Var, b), k63.e);
        } else if (j2h1Var instanceof ysr0) {
            hy00VarC = n3o1.r(this).c(new y63(urk0Var, ((ysr0) j2h1Var).d, b), k63.d);
        } else {
            eg.o();
            throw null;
        }
        this.b = hy00VarC;
        this.c = w3p1.q(new t6((mr20) zwgVar.a, (f8b) zwgVar.b, (ne) zwgVar.e, (byte) 14), b03.Z, ah1.c1, (o8n) null, new t6(iu30Var, this, zwgVar, (byte) 13), 8);
        this.d = lnn1.h(b03.N0, new x63(g23Var, (byte) 0), new x63(g23Var, (byte) 1));
    }

    public u63(yxk0 yxk0Var) {
        this.a = (byte) 9;
        this.b = yxk0Var;
        this.c = ila0.D();
        this.d = jch0.j(gou0.c1);
    }

    public u63() {
        this.a = (byte) 4;
        this.c = w3p1.q(god0.d, god0.e, x5d0.Z, (o8n) null, (iu30) null, 24);
        this.b = new eih1();
        this.d = jch0.j(i2d0.c1);
    }

    public u63(hjc hjcVar, urk0 urk0Var, iu30 iu30Var) {
        this.a = (byte) 5;
        this.b = new i7h1(new z63(urk0Var, (byte) 23), fri0.Z);
        this.c = new rey0(new ipy(iu30Var, (byte) 18));
        this.d = lnn1.h(hvi0.h, hvi0.i, new nwi0(hjcVar, this, (byte) 1));
    }

    public u63(zob1 zob1Var, int i) {
        this.a = (byte) 3;
        this.c = w3p1.q(new wrs(zob1Var, this, (byte) 23), new z5d(this, zob1Var), fdv.d, (o8n) null, (iu30) null, 24);
        this.b = new eih1();
        this.d = new osw(new yfv(i, (byte) 0));
    }

    public u63(pp ppVar, urk0 urk0Var, yu3 yu3Var, yqg yqgVar, hz5 hz5Var, di4 di4Var, xrk xrkVar, kly0 kly0Var, j2h1 j2h1Var, iu30 iu30Var) {
        ia00 ia00VarA;
        di4 di4Var2;
        nsw nswVarH;
        byte b = 2;
        this.a = (byte) 2;
        boolean z = j2h1Var instanceof xsr0;
        byte b2 = 1;
        if (z) {
            ia00VarA = n3o1.q(this).a(new z63(urk0Var, b), oy5.N0);
        } else if (j2h1Var instanceof ysr0) {
            ia00VarA = n3o1.q(this).a(new y63(urk0Var, ((ysr0) j2h1Var).d, b2), oy5.Z);
        } else {
            eg.o();
            throw null;
        }
        this.b = ia00VarA;
        this.c = y3o1.X(new t6((g7h) yu3Var.b, (f8b) yu3Var.c, (sd41) yu3Var.e, (byte) 28), ag6.W0, ad5.X, new xg6(iu30Var, yu3Var, (byte) 6), 8);
        if (xrkVar.b()) {
            di4Var2 = di4Var;
            nswVarH = jch0.j(new rl6(ppVar, di4Var2, yqgVar, kly0Var, iu30Var, (byte) 0));
        } else {
            di4Var2 = di4Var;
            nswVarH = lnn1.h(ag6.X0, new vf3(yqgVar, b2), new xg6(ppVar, di4Var2, (byte) 8));
        }
        if (!(j2h1Var instanceof ysr0)) {
            if (z) {
                nswVarH = new eyn(nswVarH, new sl6(di4Var2, (byte) 0), hz5Var);
            } else {
                eg.o();
                throw null;
            }
        }
        this.d = nswVarH;
    }

    public u63(iu30 iu30Var, iu30 iu30Var2, EventSource eventSource) {
        this.a = (byte) 8;
        this.b = sbl.z(new dzs0(), t7p0.e, new ku1(iu30Var2, (byte) 25), cps0.U0, new jfh(eventSource, (byte) 1));
        this.c = new eih1();
        this.d = jch0.j(new wh(this, iu30Var, (byte) 24));
    }

    public u63(rok0 rok0Var, t9q0 t9q0Var) {
        this.a = (byte) 6;
        q9q0 q9q0Var = new q9q0(null, null);
        t7p0 t7p0Var = t7p0.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        r9q0 r9q0Var = new r9q0(t9q0Var, (byte) 0);
        Scheduler scheduler = t9q0Var.c;
        subtypeEffectHandlerBuilderC.d(v9q0.class, r9q0Var, scheduler);
        subtypeEffectHandlerBuilderC.g(y9q0.class, new s9q0(t9q0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.d(u9q0.class, new r9q0(t9q0Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.g(x9q0.class, new s9q0(t9q0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(w9q0.class, new s9q0(t9q0Var, (byte) 2));
        this.b = sbl.B(q9q0Var, t7p0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), new afm0(this, (byte) 26), new cnp0(this, (byte) 19));
        this.c = n3o1.q(this).a(new aaq0(this, (byte) 0), rmp0.U0);
        this.d = jch0.j(new x3o0(rok0Var, (byte) 11));
    }

    public u63(tzv0 tzv0Var, q01 q01Var) {
        this.a = (byte) 1;
        this.b = new rey0(new o2(q01Var, (byte) 29));
        this.c = tzv0Var.d;
        this.d = tzv0Var.e;
    }
}
