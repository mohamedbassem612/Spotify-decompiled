package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.authentication.login5setupimpl.NativeLogin5SetupImpl;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowablePublish;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableUsing;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i26 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i26(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 2;
        ocr0 ocr0Var = ocr0.a;
        pcr0 pcr0Var = pcr0.a;
        jcr0 jcr0Var = jcr0.a;
        kcr0 kcr0Var = kcr0.a;
        qcr0 qcr0Var = qcr0.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                m26 m26Var = (m26) obj;
                luk lukVar = m26Var.s;
                if (lukVar != null) {
                    return lukVar.e(new d26(m26Var, (byte) 3));
                }
                return null;
            case 1:
                return v8r.q(((fa6) obj).a.c);
            case 2:
                ((be6) obj).g.k();
                return rih1Var;
            case 3:
                return Integer.valueOf(((ue6) ((lf6) obj).f).b.size());
            case 4:
                return (Boolean) ((Function0) ((w0d) obj).f).invoke();
            case 5:
                Float fValueOf = Float.valueOf(0.0f);
                ((vu30) obj).invoke(fValueOf, fValueOf);
                return rih1Var;
            case 6:
                ((jfe) obj).l(new tj31("triggerTopArtist"));
                return rih1Var;
            case 7:
                asn asnVar = (asn) ((yzo) obj).a.b;
                lzn0 lzn0Var = (lzn0) ((g0q) asnVar.b).a.i.get();
                c8o.l(lzn0Var);
                return new kpg0(new ldo(lzn0Var, asnVar.d()), gn6.T0);
            case 8:
                wzn wznVar = (wzn) ((a0p) ((fb3) obj).c).a.c;
                koc0 koc0Var = ((bct) wznVar.a).d;
                qs6 qs6Var = (qs6) ((lzp) wznVar.b).a.Z7.get();
                c8o.l(qs6Var);
                return q1o1.u(new jpg0(new bs0(new km3(koc0Var, qs6Var, (byte) 13), (b0p) ((jly0) wznVar.c).get()), gn6.Y0), u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 9:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                d520 d520Var = (d520) obj;
                linkedHashMap.put(qcr0Var, (vfr0) ((jkp0) d520Var.c).b);
                linkedHashMap.put(kcr0Var, ((mko) d520Var.d).b());
                linkedHashMap.put(jcr0Var, ((nix0) d520Var.e).h);
                linkedHashMap.put(pcr0Var, (stt0) d520Var.f);
                linkedHashMap.put(ocr0Var, (gst0) d520Var.g);
                return new tcr0(linkedHashMap);
            case 10:
                return cwl1.I(((yv6) obj).e);
            case 11:
                ((yud) obj).b.invoke();
                return rih1Var;
            case 12:
                rfu0 rfu0Var = (sfu0) obj;
                long jCurrentTimeMillis = System.currentTimeMillis() - rfu0Var.d;
                float fO = yoi1.o(rfu0Var.c + (jCurrentTimeMillis / rfu0Var.b), 0.0f, 1.0f);
                long j = rfu0Var.b;
                return new qkw0(fO, (int) yoi1.r(j - jCurrentTimeMillis, 0L, j));
            case 13:
                he7 he7Var = (he7) obj;
                ((RecyclerView) he7Var.i).post(new s10(he7Var, (byte) 10));
                return rih1Var;
            case 14:
                return Observable.defer(new ke7((le7) obj)).replay(1).f();
            case 15:
                ((mg7) obj).R0.invoke();
                return rih1Var;
            case 16:
                return DateFormat.getPatternInstance("MMMMd", (Locale) ((idd1) ((km3) obj).b).getValue());
            case 17:
                bg3 bg3Var = (bg3) obj;
                p1p p1pVar = (p1p) bg3Var.e;
                x6o0 x6o0Var = (x6o0) bg3Var.f;
                cp31 cp31Var = (cp31) p1pVar.a.c;
                fl90 fl90Var = (fl90) cp31Var.b;
                yk90 yk90Var = fl90Var.f;
                yzc0 yzc0Var = fl90Var.a;
                kzp kzpVar = (kzp) cp31Var.c;
                daq daqVar = kzpVar.a;
                yqg yqgVar = (yqg) daqVar.J1.get();
                c8o.l(yqgVar);
                qop qopVar = (qop) cp31Var.a;
                muz muzVarE = qopVar.e();
                lik1 lik1VarG = qopVar.g();
                d0r d0rVar = fl90Var.b;
                teq teqVar = kzpVar.b;
                f1n0 f1n0Var = (f1n0) teqVar.T2.get();
                c8o.l(f1n0Var);
                tzo tzoVar = qopVar.a;
                a690 a690VarL = u1n0.l((q7r0) ((uap) tzoVar.b).H);
                gn10 gn10VarD = ((uap) tzoVar.b).d();
                vb2 vb2Var = (vb2) teqVar.n3.get();
                c8o.l(vb2Var);
                l78 l78VarY = daqVar.y();
                i1r0 i1r0Var = (i1r0) teqVar.y3.get();
                c8o.l(i1r0Var);
                Flowable flowable = (Flowable) kzpVar.a.D5.get();
                c8o.l(flowable);
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                b7r0 b7r0Var = (b7r0) daqVar.p7.get();
                c8o.l(b7r0Var);
                y5v0 y5v0Var = (y5v0) teqVar.T4.get();
                c8o.l(y5v0Var);
                rit0 rit0Var = new rit0(yzc0Var, yqgVar, muzVarE, lik1VarG, d0rVar, f1n0Var, a690VarL, gn10VarD, vb2Var, l78VarY, i1r0Var, kgeVar, b7r0Var, y5v0Var, cp31Var.r().l());
                String strD = qopVar.d();
                d0r d0rVar2 = ((fl90) cp31Var.b).b;
                bl3 bl3Var = (bl3) daqVar.q8.get();
                c8o.l(bl3Var);
                oj3 oj3Var = (oj3) teqVar.k1.get();
                c8o.l(oj3Var);
                nm1 nm1Var = new nm1(d0rVar2, bl3Var, oj3Var, cp31Var.r());
                q1p q1pVar = (q1p) ((jly0) cp31Var.d).get();
                f1n0 f1n0Var2 = (f1n0) teqVar.T2.get();
                c8o.l(f1n0Var2);
                nm1 nm1Var2 = new nm1(d0rVar2, f1n0Var2, cp31Var.r());
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                suu suuVar = (suu) teqVar.s3.get();
                c8o.l(suuVar);
                x1v x1vVar = (x1v) teqVar.v3.get();
                c8o.l(x1vVar);
                l78 l78VarY2 = daqVar.y();
                ayl aylVar = (ayl) teqVar.x3.get();
                c8o.l(aylVar);
                i1r0 i1r0Var2 = (i1r0) teqVar.y3.get();
                c8o.l(i1r0Var2);
                y5v0 y5v0Var2 = (y5v0) teqVar.T4.get();
                c8o.l(y5v0Var2);
                drp0 drp0Var = (drp0) teqVar.G4.get();
                c8o.l(drp0Var);
                q8n q8nVar = (q8n) daqVar.V2.get();
                c8o.l(q8nVar);
                xvu xvuVar = new xvu(context, suuVar, x1vVar, l78VarY2, aylVar, i1r0Var2, y5v0Var2, drp0Var, d0rVar2, q8nVar);
                Context context2 = (Context) daqVar.x1.a;
                c8o.l(context2);
                f6g1 f6g1Var = (f6g1) teqVar.I8.get();
                c8o.l(f6g1Var);
                fp7 fp7Var = new fp7(context2, f6g1Var.a());
                qlb qlbVar = new qlb(d0rVar2, cp31Var.r(), (byte) 6);
                bpb1 bpb1Var = ((lix0) ((uap) tzoVar.b).R.get()).a;
                if (bpb1Var == null) {
                    hhg1.n("Trying to access ProgressStateApi too early. Its only available at plugin creation point and onwards.");
                    return null;
                }
                ngs0 ngs0Var = new ngs0(bpb1Var);
                l78 l78VarY3 = daqVar.y();
                Flowable flowable2 = (Flowable) kzpVar.a.D5.get();
                c8o.l(flowable2);
                kge kgeVar2 = new kge(flowable2);
                luk lukVar2 = (luk) daqVar.L1.get();
                c8o.l(lukVar2);
                boolean zA = new gp4(false, lukVar2).a();
                dxz0 dxz0Var = (dxz0) daqVar.I4.get();
                c8o.l(dxz0Var);
                ezc ezcVarG = yoi1.g(dxz0Var.e());
                zr00 zr00Var = (zr00) daqVar.f9.get();
                c8o.l(zr00Var);
                mr20 mr20Var = zr00Var.a;
                c8o.m(mr20Var);
                fdc fdcVar = new fdc(l78VarY3, kgeVar2, zA, ezcVarG, mr20Var, (byte) 1);
                return new wqw(new xzq(new kp7(yk90Var, rit0Var, strD, nm1Var, q1pVar, nm1Var2, xvuVar, fp7Var, qlbVar, ngs0Var, fdcVar, x6o0Var), new rr6(bg3Var, (byte) 14)));
            case 18:
                wdm wdmVar = (wdm) obj;
                r091 r091Var = (r091) wdmVar.X;
                if (r091Var != null) {
                    r091Var.g();
                }
                wdmVar.X = null;
                xab1 xab1Var = (xab1) wdmVar.Z;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                wdmVar.Z = null;
                return rih1Var;
            case 19:
                y08 y08Var = (y08) obj;
                return y08Var.b.a(y08Var.h, y08Var.d);
            case 20:
                g38 g38Var = (g38) obj;
                yj1 yj1Var = new yj1(g38Var, b2);
                tg tgVar = new tg((Object) g38Var, (byte) 20);
                int i = Flowable.a;
                FlowableSubscribeOn flowableSubscribeOnW = new FlowableUsing(yj1Var, tgVar).W(g38Var.d);
                int i2 = Flowable.a;
                ObjectHelper.a(i2, "bufferSize");
                return new FlowableRefCount(new FlowablePublish(flowableSubscribeOnW, i2));
            case 21:
                return ((lly) ((idd1) ((h98) obj).c).getValue()).c;
            case 22:
                return t5p1.j(((yc8) ((kly0) ((uu0) obj).d).get()).a(), 3);
            case 23:
                return f6o1.A(new xho(((mko) ((p1f0) obj).b).b()), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2);
            case 24:
                Disposable disposable = (Disposable) ((AtomicReference) obj).get();
                if (disposable != null) {
                    disposable.dispose();
                }
                return rih1Var;
            case 25:
                NativeLogin5SetupImpl nativeLogin5SetupImpl = ((gg8) obj).a.O0;
                if (nativeLogin5SetupImpl != null) {
                    return new fg8(new wve0(nativeLogin5SetupImpl.getNativeTransport()));
                }
                u890.C("nativeLogin5Setup");
                throw null;
            case 26:
                return new uh8(new y48(((zh8) obj).a.a().getNativeAuthStorageTransport()));
            case 27:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                em0 em0Var = (em0) obj;
                linkedHashMap2.put(qcr0Var, (vfr0) ((jkp0) em0Var.c).b);
                linkedHashMap2.put(kcr0Var, ((mko) em0Var.d).b());
                linkedHashMap2.put(jcr0Var, ((nix0) em0Var.e).h);
                linkedHashMap2.put(pcr0Var, (stt0) em0Var.f);
                linkedHashMap2.put(ocr0Var, (gst0) em0Var.g);
                linkedHashMap2.put(lcr0.a, (zxu) em0Var.h);
                List list = ((oyu) em0Var.t).o;
                if (list == null) {
                    u890.C("_gates");
                    throw null;
                }
                linkedHashMap2.put(mcr0.a, list);
                linkedHashMap2.put(ncr0.a, (k740) em0Var.i);
                return new tcr0(linkedHashMap2);
            case 28:
                ix7 ix7Var = (ix7) obj;
                Observable map = ((mt8) ix7Var.b).a(EnabledShowsCountRequest.n()).map(bya0.t);
                Boolean bool = Boolean.FALSE;
                return map.first(bool).onErrorReturnItem(bool).flatMap(new ps7(ix7Var, (byte) 4)).observeOn((Scheduler) ix7Var.c);
            default:
                return ((o241) obj).b("offline").map(olj0.X).firstOrError();
        }
    }
}
