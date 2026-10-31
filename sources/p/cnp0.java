package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.protobuf.Any;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.watchfeed.component.item.v2.OnboardingComponentV2;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cnp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cnp0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        long j;
        long jL0;
        long j2;
        long jL1;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                return ((dnp0) this.b).b;
            case 1:
                ((qtr) obj).b(new gp9((rm0) this.b, (lnm) null, (byte) 7));
                return rih1.a;
            case 2:
                return new bnc0(((app0) this.b).a);
            case 3:
                ((qtr) obj).b(new w3a((umf0) this.b, (lnm) null, (byte) 5));
                return rih1.a;
            case 4:
                return new sii0((mr20) obj, (uqg) this.b, (byte) 18);
            case 5:
                et90 et90Var = (et90) this.b;
                return new x010((ezc) et90Var.d, (ezc) et90Var.e, new irp0(3, (lnm) null, (byte) 0), (byte) 1);
            case 6:
                z72 z72Var = (z72) this.b;
                mr20 mr20VarU = rqt0.u(new lt20(new uop0(yoi1.g(((svw0) ((ynb0) z72Var.g).get()).a.a), (byte) 20), new q8t0(3, (lnm) null, (byte) 5), (byte) 0));
                mr20 mr20VarA = ((n3v) ((ynb0) z72Var.e).get()).a();
                iu8 iu8Var = (iu8) ((ynb0) z72Var.f).get();
                return h5p1.r(mr20VarU, mr20VarA, rqt0.u(new lt20(new nf(yoi1.g(iu8Var.a.b(iu8Var.b)), (byte) 16), new re1(3, (lnm) null, (byte) 6), (byte) 0)), ((lut0) ((ynb0) z72Var.h).get()).c, new mp6(5, (lnm) null, (byte) 4));
            case 7:
                wtp0 wtp0Var = (wtp0) this.b;
                return new x010((mr20) obj, new sii0(rqt0.u(new j5b0(wtp0Var.c.d(), (byte) 12)), wtp0Var, (byte) 26), new ax9(3, (lnm) null, (byte) 2), (byte) 1);
            case 8:
                return ivp0.b((ivp0) ((yup0) this.b).c).map(qs10.V0).toFlowable(BackpressureStrategy.d);
            case 9:
                return ((nfx) ((bs0) this.b).d).a((l0i) null);
            case 10:
                wvp0 wvp0Var = (wvp0) obj;
                String str = wvp0Var.a;
                String str2 = wvp0Var.b;
                String str3 = wvp0Var.c;
                String str4 = wvp0Var.d;
                int i = wvp0Var.e;
                int i2 = wvp0Var.f;
                waz0 waz0Var = (waz0) ((p410) this.b).h;
                return new xvp0(str, str2, str3, str4, i, i2, false, false, waz0Var.b(waz0Var.a(), wvp0Var.a), wvp0Var.g, 3, false, false, false);
            case 11:
                return ((zfx) this.b).a((l0i) null);
            case 12:
                Set set = (Set) obj;
                vpp0 vpp0Var = (vpp0) this.b;
                woz wozVarO = EsOffline.GetContextsProgressRequest.o();
                wozVarO.n(set);
                return new ow9(rqt0.u(new uop0(yoi1.g(vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContextsProgress", wozVarO.build()).map(yi20.S0)), (byte) 3)), set, (byte) 5);
            case 13:
                ((zyp0) obj).a((p090) this.b);
                return rih1.a;
            case 14:
                ((sp21) obj).d = ((kf01) this.b).g.a;
                return rih1.a;
            case 15:
                ((mxc) obj).e = (ln21) this.b;
                return rih1.a;
            case 16:
                DrawScope drawScope = (DrawScope) obj;
                moj0 moj0Var = (moj0) this.b;
                float f = moj0Var.e;
                long jG1 = drawScope.g1();
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).t(f, f, jG1);
                    c1q0.f(drawScope, moj0Var);
                    c1q0.h(drawScope, moj0Var);
                    i3a.n(cabVarA1, jU);
                    float f2 = moj0Var.d;
                    long jG2 = drawScope.g1();
                    cab cabVarA2 = drawScope.a1();
                    long jU2 = cabVarA2.u();
                    cabVarA2.p().q();
                    try {
                        ((dg8) cabVarA2.b).t(f2, f2, jG2);
                        c1q0.g(drawScope, moj0Var);
                        return rih1.a;
                    } finally {
                        i3a.n(cabVarA2, jU2);
                    }
                } catch (Throwable th) {
                    i3a.n(cabVarA1, jU);
                    throw th;
                }
            case 17:
                vt9 vt9Var = (vt9) obj;
                r1q0 r1q0Var = (r1q0) this.b;
                m1q0 m1q0Var = r1q0Var.c;
                if (m1q0Var == null) {
                    n36 n36Var = r1q0Var.b;
                    ListIterator listIterator = n36Var.listIterator(n36Var.b());
                    while (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        if (((m1q0) objPrevious).a) {
                            obj2 = objPrevious;
                            m1q0Var = (m1q0) obj2;
                        }
                    }
                    m1q0Var = (m1q0) obj2;
                }
                if (m1q0Var != null) {
                    m1q0Var.c(vt9Var);
                }
                return rih1.a;
            case 18:
                return t5p1.j(((g3q0) ((et90) this.b).c).a(((a3q0) obj).a), 3);
            case 19:
                ((a7m0) obj).a = new afm0(this.b, (byte) 27);
                return rih1.a;
            case 20:
                return new vh((rok0) this.b, (iu30) obj);
            case 21:
                Map map = (Map) ((ibq0) this.b).a.get();
                OnboardingComponentV2 onboardingComponentV2R = OnboardingComponentV2.r(((Any) obj).q());
                cbq0 cbq0Var = new cbq0((p5j1) null, (ug7) null);
                OnboardingComponentV2 onboardingComponentV2 = onboardingComponentV2R.q() ? onboardingComponentV2R : null;
                if (onboardingComponentV2 != null) {
                    Any anyO = onboardingComponentV2.o();
                    b1i b1iVar = (b1i) map.get(anyO.p());
                    q5j1 q5j1Var = b1iVar instanceof q5j1 ? (q5j1) b1iVar : null;
                    cbq0Var = new cbq0(q5j1Var != null ? (p5j1) q5j1Var.a(anyO) : null, (ug7) null);
                }
                if (!onboardingComponentV2R.p()) {
                    onboardingComponentV2R = null;
                }
                if (onboardingComponentV2R == null) {
                    return cbq0Var;
                }
                Any anyN = onboardingComponentV2R.n();
                b1i b1iVar2 = (b1i) map.get(anyN.p());
                vg7 vg7Var = b1iVar2 instanceof vg7 ? (vg7) b1iVar2 : null;
                return new cbq0(cbq0Var.a, vg7Var != null ? (ug7) vg7Var.a(anyN) : null);
            case 22:
                return ((dgx) ((ug3) this.b).b).a((l0i) null);
            case 23:
                t311 t311Var = (uga) obj;
                z6a0 z6a0Var = ((bjq0) this.b).a;
                synchronized (z6a0Var.d) {
                    j = z6a0Var.Y;
                    ytw0 ytw0Var = jfv.b;
                    long j3 = z6a0Var.Z;
                    ngv ngvVar = ngv.b;
                    jL0 = fdg1.l0(j3, ngvVar);
                    j2 = z6a0Var.N0;
                    jL1 = fdg1.l0(z6a0Var.O0, ngvVar);
                }
                t311 t311Var2 = t311Var;
                t311Var2.a("ui.stutter.frame_count", j);
                t311Var2.a("ui.stutter.frame_duration", jfv.i(jL0) / 1.0E9d);
                t311Var2.a("ui.frame_count", j + j2);
                t311Var2.a("ui.frame_duration", jfv.i(jfv.q(jL0, jL1)) / 1.0E9d);
                return rih1.a;
            case 24:
                return obj == ((ydn0) this.b) ? "(this)" : String.valueOf(obj);
            case 25:
                return ((asq0) this.b).b.b;
            case 26:
                return ((osq0) this.b).a.b;
            case 27:
                return new xwm0((nwb) this.b, (byte) 5);
            case 28:
                return ((mwq0) this.b).d;
            default:
                Set set2 = s4b1.f;
                return Boolean.valueOf(uic.g((String) obj, (blc0) this.b));
        }
    }
}
