package p;

import android.view.View;
import android.view.ViewStub;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mwv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwv0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        Object z1w0Var;
        bpb1 bpb1Var;
        byte b = this.a;
        byte b2 = 28;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Long lValueOf = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((hjc) ((rt01) obj2).c).a((l0i) null);
            case 1:
                ((qtr) obj).b(new jaz(obj2, (lnm) lValueOf, b2));
                return rih1Var;
            case 2:
                return new oyv0(((txo0) obj).a, ((xy4) ((e7o) obj2).c).a());
            case 3:
                f4w0 f4w0Var = (f4w0) obj;
                pee0 pee0Var = (pee0) obj2;
                if (f4w0Var instanceof t3w0) {
                    pee0Var.accept(j1w0.a);
                    return rih1Var;
                }
                if (f4w0Var instanceof x3w0) {
                    pee0Var.accept(new o1w0(null));
                    return rih1Var;
                }
                if (f4w0Var instanceof d4w0) {
                    pee0Var.accept(new f2w0(((d4w0) f4w0Var).a, null));
                    return rih1Var;
                }
                if (f4w0Var instanceof c4w0) {
                    pee0Var.accept(new b2w0(null));
                    return rih1Var;
                }
                if (f4w0Var instanceof y3w0) {
                    y3w0 y3w0Var = (y3w0) f4w0Var;
                    pee0Var.accept(new u1w0(y3w0Var.a, !y3w0Var.b));
                    return rih1Var;
                }
                if (f4w0Var instanceof w3w0) {
                    pee0Var.accept(n1w0.a);
                    return rih1Var;
                }
                if (f4w0Var instanceof v3w0) {
                    pee0Var.accept(new m1w0(((v3w0) f4w0Var).a, null));
                    return rih1Var;
                }
                if (f4w0Var instanceof z3w0) {
                    pee0Var.accept(new x1w0(null));
                    return rih1Var;
                }
                if (f4w0Var instanceof a4w0) {
                    pee0Var.accept(y1w0.a);
                    return rih1Var;
                }
                if (f4w0Var instanceof e4w0) {
                    pee0Var.accept(e2w0.a);
                    return rih1Var;
                }
                if (f4w0Var instanceof b4w0) {
                    int i = ((b4w0) f4w0Var).a.b;
                    int iC = l1d.C(i);
                    if (iC == 0 || iC == 1) {
                        z1w0Var = new z1w0(i != 2);
                    } else if (iC == 2) {
                        z1w0Var = new q1w0(null);
                    } else {
                        eg.o();
                    }
                    pee0Var.accept(z1w0Var);
                    return rih1Var;
                }
                if (f4w0Var instanceof u3w0) {
                    pee0Var.accept(new i1w0(null));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 4:
                ((qtr) obj).b(new k1((smp0) obj2, (lnm) null, (byte) 26));
                return rih1Var;
            case 5:
                return t7w0.a((t7w0) obj, (d9w0) obj2, false, 1);
            case 6:
                return ((e9w0) ((e8w0) obj2).a.get(((Number) obj).intValue())).a;
            case 7:
                ((qtr) obj).b(new pnp0((s8w0) obj2, (lnm) null, (byte) 11));
                return rih1Var;
            case 8:
                ((qtr) obj).b(new k1((hf2) obj2, (lnm) null, (byte) 27));
                return rih1Var;
            case 9:
                String str = (String) obj;
                pdw0 pdw0Var = (pdw0) obj2;
                i091 i091Var = pdw0Var.Q0;
                if (i091Var == null) {
                    r091 r091Var = (r091) pdw0Var.a.b;
                    i091Var = (r091Var == null || (bpb1Var = r091Var.g) == null) ? null : (i091) bpb1Var.getValue();
                }
                Long l = (Long) pdw0Var.R0.getAndSet(null);
                long jLongValue = 0;
                long j = i091Var != null ? i091Var.e : 0L;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    lValueOf = i091Var != null ? Long.valueOf(ebp1.o(i091Var, Long.valueOf(pdw0Var.e.b()))) : null;
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    }
                }
                return new s731(j, jLongValue, str);
            case 10:
                return new xwm0((gfw0) obj2, (byte) 10);
            case 11:
                fpw0 fpw0Var = (fpw0) obj2;
                jpw0 jpw0Var = fpw0Var.a;
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = jpw0Var.c;
                mr20[] mr20VarArr = {new c1v0(rqt0.u(new c1v0(jpw0Var.b.a("list-private-by-default", false), (byte) 12)), (byte) 13), new hxk(k4p1.B(jpw0Var.a.a), (byte) 2)};
                companion.getClass();
                cas casVar = (a7m0) obj;
                casVar.b = new b(q8nVar, mr20VarArr);
                casVar.d = new epw0(fpw0Var, (byte) 0);
                casVar.e = new epw0(fpw0Var, (byte) 1);
                return rih1Var;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mpw0 mpw0Var = (mpw0) obj2;
                mpw0Var.c.a.l(bool);
                mpw0Var.d.g();
                return rih1Var;
            case 13:
                return ((d5d) obj2).j;
            case 14:
                return new t1v(yoi1.g(((o241) obj2).a), (Set) obj, (byte) 1);
            case 15:
                wzw0 wzw0Var = (wzw0) obj;
                ProfileCompletionSheetHostActivity profileCompletionSheetHostActivity = (ProfileCompletionSheetHostActivity) obj2;
                int i2 = ProfileCompletionSheetHostActivity.k1;
                String str2 = profileCompletionSheetHostActivity.j1;
                if (str2 != null) {
                    b0x0 b0x0Var = profileCompletionSheetHostActivity.h1;
                    if (b0x0Var == null) {
                        u890.C("resultHolder");
                        throw null;
                    }
                    SingleSubject singleSubject = (SingleSubject) b0x0Var.a.remove(str2);
                    if (singleSubject != null) {
                        singleSubject.onSuccess(wzw0Var);
                    }
                }
                profileCompletionSheetHostActivity.finish();
                return rih1Var;
            case 16:
                ((mwv0) obj2).invoke((wzw0) obj);
                return rih1Var;
            case 17:
                return ((zfx) obj2).a((l0i) null);
            case 18:
                ((k3x0) obj2).f7p.a((z2x0) obj);
                return rih1Var;
            case 19:
                return new ge8((x3x0) obj2, (byte) 7);
            case 20:
                r830 r830Var = (r830) obj;
                m42 m42Var = (m42) ((g1b) obj2).i;
                if (m42Var != null) {
                    m42Var.invoke(r830Var);
                }
                return rih1Var;
            case 21:
                return ((dgx) ((ug3) obj2).b).a(null);
            case 22:
                int iIntValue = ((Number) obj).intValue();
                return ((odx0) obj2).a() + "_" + iIntValue;
            case 23:
                jbk1 jbk1Var = (jbk1) obj;
                z511 z511Var = (z511) obj2;
                vgu vguVar = jbk1Var.b;
                if (vguVar == null) {
                    u890.C("attachStateListener");
                    throw null;
                }
                jbk1Var.removeOnAttachStateChangeListener(vguVar);
                if (jbk1Var.c) {
                    w611 w611Var = jbk1Var.a;
                    if (w611Var == null) {
                        u890.C("viewHolder");
                        throw null;
                    }
                    z511Var.u(w611Var);
                }
                w611 w611Var2 = jbk1Var.a;
                if (w611Var2 == null) {
                    u890.C("viewHolder");
                    throw null;
                }
                z511Var.v(w611Var2);
                jbk1Var.removeAllViews();
                return rih1Var;
            case 24:
                View view = (View) obj;
                if (!(view instanceof ViewStub) && !((Set) ((f0a) obj2).Q0).contains(Integer.valueOf(view.getId()))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                ((m0t) ((mfx0) obj2).b).c.onNext(new cal1(((Number) obj).longValue()));
                return rih1Var;
            case 26:
                Set set = (Set) obj;
                xix0 xix0Var = (xix0) obj2;
                return new qsc0(yoi1.g(xix0Var.d.a(set)), xix0Var, set, (byte) 28);
            case 27:
                b261.C((e261) obj, new af5(((rlx0) obj2).g));
                return rih1Var;
            case 28:
                return new rxc0(((zlx0) obj2).a);
            default:
                h6w h6wVar = (h6w) obj2;
                s1g s1gVar = new s1g(new fu20(d3p1.F(h6wVar.b, h6wVar.c, (tmx0) obj), new zio0(2, (lnm) null, (byte) 20), (byte) 1), (byte) 10);
                Flowable flowable = (Flowable) h6wVar.h;
                vbm[] vbmVarArr = q601.a;
                return h5p1.s(s1gVar, new kge(flowable), ((kko) h6wVar.i).a(), new vd2(4, (lnm) null, (byte) 23));
        }
    }
}
