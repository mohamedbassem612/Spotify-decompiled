package p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.messages.PuffinCloudSyncEvent;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jqb0 implements Function0 {
    public final /* synthetic */ byte a;
    public Object b;

    public jqb0(o860 o860Var, lqb0 lqb0Var) {
        this.a = (byte) 0;
        this.b = o860Var;
    }

    public final Object invoke() {
        sw9 sw9Var;
        String property;
        List listQ0;
        byte b = this.a;
        int length = 0;
        o6x o6xVar = o6x.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Object obj = ((o860) this.b).b;
                return o7h.p1(new ArrayList());
            case 1:
                ((tqb0) this.b).o.getClass();
                return null;
            case 2:
                return (a8b0) ((e8b0) ((wvb0) this.b).c.invoke());
            case 3:
                return (Completable) ((e6u) this.b).invoke();
            case 4:
                m7c0 m7c0Var = (j7c0) this.b;
                return yoi1.i(new ry50(rqt0.u(hu20.e(m7c0Var.b.b(), new zz90((lnm) null, m7c0Var, (byte) 2))), (byte) 26), o6xVar).distinctUntilChanged();
            case 5:
                ((ild0) this.b).c.d();
                return rih1Var;
            case 6:
                return new b8d0((mr20) this.b, this, (byte) 22);
            case 7:
                Function0 function0 = ((x8o0) this.b).b;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
            case 8:
                return yoi1.i(rqt0.u(new p3t(((ov20) this.b).a, (byte) 23)), o6xVar);
            case 9:
                return (sck1) ((nbs0) this.b).invoke();
            case 10:
                g3t0 g3t0Var = (g3t0) this.b;
                return yoi1.i(new x010(g3t0Var.a(), rqt0.u(hu20.e(g3t0Var.a.b(), new t4o0((lnm) null, g3t0Var, (byte) 12))), new o2t0(3, null, (byte) 0), (byte) 1), o6xVar).distinctUntilChanged();
            case 11:
                return sfb1.l.a(((tnw0) this.b).b);
            case 12:
                ibz0 ibz0Var = (ibz0) this.b;
                ibz0Var.T0 = ibz0Var.Q0.a();
                return rih1Var;
            case 13:
                gn01 gn01Var = (gn01) this.b;
                return yoi1.i(gn01Var.b.r(gn01.d), o6xVar).map(new xaz0(gn01Var, (byte) 4)).startWith(Observable.fromCallable(new sra(gn01Var, (byte) 20))).map(r6x0.e).filter(new vyq0(gn01Var, (byte) 28)).distinctUntilChanged().map(y6x0.d);
            case 14:
                hc11 hc11Var = (hc11) this.b;
                Member memberB = hc11Var.e().getCaller().b();
                if (memberB instanceof Method) {
                    if (!Modifier.isStatic(((Method) memberB).getModifiers())) {
                        bhn0.s(memberB, "Only static methods are supported for now: ");
                        return null;
                    }
                    sw9Var = new sw9(memberB, hc11Var.n(), (byte) 15);
                } else {
                    if (!(memberB instanceof Constructor)) {
                        mna0.d(memberB, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) memberB;
                    if (rc11.a.b(constructor.getDeclaringClass()).j() && (property = System.getProperty("java.version")) != null && nhc1.Y(property, "1.", false)) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    sw9Var = new sw9(memberB, hc11Var.n() + length, (byte) 15);
                }
                int i = sw9Var.b;
                Member member = (Member) sw9Var.c;
                if (member instanceof Method) {
                    listQ0 = f46.Q0(((Method) member).getParameterAnnotations()[i]);
                } else {
                    listQ0 = member instanceof Constructor ? f46.Q0(((Constructor) member).getParameterAnnotations()[i]) : z6x.a;
                }
                return bpi1.t(listQ0);
            case 15:
                return (zpi0) ((io41) this.b).b.invoke(g8b0.b);
            case 16:
                return (SearchFragment) this.b;
            case 17:
                return (sck1) ((jqb0) this.b).invoke();
            case 18:
                return (qq91) this.b;
            case 19:
                return (sck1) ((jqb0) this.b).invoke();
            case 20:
                return jzn1.B(((phb1) this.b).a);
            case 21:
                ((yo2) this.b).J();
                return rih1Var;
            case 22:
                dpc1 dpc1Var = (dpc1) this.b;
                return dpc1Var.h(c8o.o(dpc1Var.b, null, 3));
            case 23:
                ((t2j0) this.b).a(PuffinCloudSyncEvent.n().build());
                return rih1Var;
            case 24:
                return bkz.b(zjz.Y0, ((vnd1) this.b).toString());
            case 25:
                return (kii1) this.b;
            case 26:
                return (sck1) ((jqb0) this.b).invoke();
            case 27:
                return (List) ((ssi1) this.b).Z.getValue();
            default:
                return (tl7) this.b;
        }
    }

    public /* synthetic */ jqb0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ jqb0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }
}
