package p;

import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e27 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public e27(Flowable flowable, Flowable flowable2, ykf0 ykf0Var, npf0 npf0Var, caq caqVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = (byte) 8;
        r7j0 r7j0Var = new r7j0(scheduler, (byte) 21);
        xxb0 xxb0Var = xxb0.n;
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(new FlowableOnBackpressureLatest(flowable2).j(new cax(flowable, (byte) 5)));
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(pqf0.class, new o4e0(observableFromPublisher, (byte) 2));
        subtypeEffectHandlerBuilderC.c(oqf0.class, new rwa0(ykf0Var, (byte) 20));
        subtypeEffectHandlerBuilderC.d(nqf0.class, zzc0.e, scheduler2);
        subtypeEffectHandlerBuilderC.g(qqf0.class, new o4e0(npf0Var, (byte) 3));
        subtypeEffectHandlerBuilderC.c(rqf0.class, new rwa0(npf0Var, (byte) 21));
        this.b = sbl.A(new j2d0(caqVar, npf0Var, (byte) 18), xxb0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), ujf0.X, r7j0Var);
        this.c = n3o1.q(this).a(rb80.Y, rb80.Z);
        j2i j2iVar = gyi.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return (i7h1) obj2;
            case 1:
                return (eih1) obj2;
            case 2:
                return (ia00) obj;
            case 3:
                return (eih1) obj2;
            case 4:
                return (ia00) obj2;
            case 5:
                return (eih1) obj2;
            case 6:
                return (eih1) obj2;
            case 7:
                return (eih1) obj2;
            case 8:
                return (ia00) obj2;
            case 9:
                return (u7h1) obj2;
            case 10:
                return (eih1) obj2;
            case 11:
                return (ia00) obj;
            case 12:
                return (eih1) obj2;
            case 13:
                return (dvm0) this.d;
            case 14:
                return (eih1) obj2;
            default:
                return (eih1) obj2;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (psw) obj;
            case 1:
                return (f70) obj;
            case 2:
                return (psw) obj;
            case 3:
                return (lz9) obj;
            case 4:
                return (etl) obj;
            case 5:
                return (f70) obj;
            case 6:
                return (lz9) obj;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj;
            case 9:
                return (psw) obj;
            case 10:
                return (f70) obj;
            case 11:
                return (psw) obj;
            case 12:
                return (f70) obj;
            case 13:
                j2i j2iVar = new j2i(-736250311, new l6i1(this, (byte) 2), true);
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 14:
                return (f70) obj;
            default:
                return (avp0) obj;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void e(jgn0 jgn0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        int i2;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-552595155);
        int i4 = i | (b0kVar3.e(jgn0Var.ordinal()) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.i(this) ? 2048 : 1024);
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            int i5 = i4 & 14;
            int iOrdinal = jgn0Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 1120888924;
                i3 = 2131959074;
            } else if (iOrdinal == 1) {
                i2 = 1120891871;
                i3 = 2131959072;
            } else if (iOrdinal == 2) {
                i2 = 1120894779;
                i3 = 2131959073;
            } else if (iOrdinal == 3) {
                i2 = 1120897596;
                i3 = 2131959075;
            } else {
                if (iOrdinal != 4) {
                    throw p3d1.k(b0kVar3, 1120887891, false);
                }
                i2 = 1120900378;
                i3 = 2131959071;
            }
            String strK = x0d.k(b0kVar3, i2, i3, b0kVar3, false);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z = ((i4 & 112) == 32) | (i5 == 4);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new s2n0(iu30Var, jgn0Var, (byte) 10);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strK), function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(726576241, new qdg0(strK, (byte) 13), b0kVar3), b0kVar2, 0, 196608, 32702);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, this, jgn0Var, iu30Var, qim0Var2, (byte) 26);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (rey0) obj2;
            case 1:
                return (uq7) obj2;
            case 2:
                return (poy0) obj;
            case 3:
                return (jz9) obj2;
            case 4:
                return (rey0) obj2;
            case 5:
                return (rey0) obj2;
            case 6:
                return (jwy) obj2;
            case 7:
                return (ks20) obj2;
            case 8:
                return (e7m0) obj2;
            case 9:
                return (rey0) obj2;
            case 10:
                return (t9y0) obj2;
            case 11:
                return (k8d1) obj;
            case 12:
                return (uq7) obj2;
            case 13:
                return new rey0(new e9f1(this, (byte) 24));
            case 14:
                return (t9y0) obj2;
            default:
                return (uq7) obj2;
        }
    }

    public e27(kly0 kly0Var, vt1 vt1Var, boolean z) {
        this.a = (byte) 4;
        this.b = k1o1.p();
        this.c = n3o1.q(this).a(h40.t, ngl.t);
        this.d = new etl(kly0Var, vt1Var, z);
    }

    public e27(urk0 urk0Var, yu3 yu3Var, ix7 ix7Var, iu30 iu30Var) {
        this.a = (byte) 2;
        this.b = n3o1.q(this).a(new z63(urk0Var, (byte) 7), jb8.Z);
        this.c = d4o1.f(new rx6((di4) yu3Var.e, (g7h) yu3Var.b, (f8b) yu3Var.c), oc8.T0, new mu6(yu3Var, (byte) 16), new kd8((Object) iu30Var, (Object) yu3Var, (byte) 2), 8);
        j2i j2iVar = new j2i(1672422548, new i43(ix7Var, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public e27(uq7 uq7Var, avp0 avp0Var) {
        this.a = (byte) 15;
        this.b = uq7Var;
        this.c = new eih1();
        this.d = avp0Var;
    }

    public e27(ix7 ix7Var, f3b f3bVar) {
        this.a = (byte) 11;
        this.b = n3o1.q(this).a(new aaq0((Object) this, (byte) 14), rw01.Y);
        this.c = k1o1.u(new cz40((Object) ix7Var, (Object) f3bVar, (lnm) null, (byte) 4));
        j2i j2iVar = lcj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public e27(gw70 gw70Var, lzn0 lzn0Var) {
        this.a = (byte) 13;
        this.b = lzn0Var;
        this.c = gw70Var;
        this.d = new dvm0(new rvd1(this, (byte) 27), new kk11(this, (byte) 10));
    }

    public e27(f70 f70Var, t9y0 t9y0Var) {
        this.a = (byte) 10;
        this.b = t9y0Var;
        this.c = new eih1();
        this.d = f70Var;
    }

    public e27(f70 f70Var, uq7 uq7Var) {
        this.a = (byte) 1;
        this.b = uq7Var;
        this.c = new eih1();
        this.d = f70Var;
    }

    public e27(lz9 lz9Var, jz9 jz9Var) {
        this.a = (byte) 3;
        this.b = jz9Var;
        this.c = new eih1();
        this.d = lz9Var;
    }

    public e27(jwy jwyVar, lz9 lz9Var) {
        this.a = (byte) 6;
        this.b = jwyVar;
        this.c = new eih1();
        this.d = lz9Var;
    }

    public e27(f70 f70Var, t9y0 t9y0Var, byte b) {
        this.a = (byte) 14;
        this.b = t9y0Var;
        this.c = new eih1();
        this.d = f70Var;
    }

    public e27(f70 f70Var, uq7 uq7Var, byte b) {
        this.a = (byte) 12;
        this.b = uq7Var;
        this.c = new eih1();
        this.d = f70Var;
    }

    public e27(byte b) {
        this.a = b;
        switch (b) {
            case 5:
                this.b = k1o1.p();
                this.c = new eih1();
                this.d = new f70((byte) 6);
                break;
            case 9:
                this.b = new rey0(gce0.e1);
                this.c = eth.a0((vu30) null, mgn0.b, 1);
                j2i j2iVar = new j2i(414200289, new hmk0(this, (byte) 20), true);
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = new rey0(o40.V0);
                this.c = new i7h1(d27.b, d27.c);
                j2i j2iVar2 = d7i.a;
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public e27(vek1 vek1Var) {
        this.a = (byte) 7;
        k110 k110Var = new k110(vek1Var, (byte) 0);
        bhh1 bhh1Var = igu.b;
        rtr rtrVar = new rtr();
        k110Var.invoke(rtrVar);
        this.b = new ks20(rtrVar, bhh1Var);
        this.c = new eih1();
        j2i j2iVar = new j2i(962883150, new yhy(vek1Var, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
