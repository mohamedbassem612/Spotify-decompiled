package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import j$.net.URLEncoder;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u830 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u830(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte[] bArr;
        String str = null;
        switch (this.a) {
            case 0:
                wfx wfxVar = ((px6) this.b).b.c;
                return new nwr(wfxVar.b, wfxVar.a, (byte) 1);
            case 1:
                diu diuVar = ((ziu) this.b).f;
                b261.n((e261) obj, diuVar.c.b + ", " + diuVar.d.a);
                return rih1.a;
            case 2:
                ((mg30) this.b).c.accept(((drn0) obj).a);
                return deh.a;
            case 3:
                return new zzh((ii30) this.b, (hnn0) obj, (byte) 1);
            case 4:
                int iIntValue = ((Number) obj).intValue();
                sj30 sj30Var = (sj30) this.b;
                synchronized (sj30Var) {
                    try {
                        bArr = sj30Var.b;
                        if (bArr == null || bArr.length < iIntValue) {
                            sj30Var.b = new byte[iIntValue];
                            bArr = sj30Var.b;
                            bArr.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bArr;
            case 5:
                jm30 jm30Var = (jm30) this.b;
                return new rhl0(jm30Var.u.path(), jm30Var.v.a, (r6h1) obj);
            case 6:
                float fFloatValue = ((Number) obj).floatValue();
                EncoreButton encoreButton = ((nn30) this.b).C;
                if (encoreButton != null) {
                    encoreButton.setAlpha(fFloatValue);
                    return rih1.a;
                }
                u890.C("sceneButton");
                throw null;
            case 7:
                wfx wfxVar2 = ((px6) this.b).b.c;
                return new nwr(wfxVar2.b, wfxVar2.a, (byte) 1);
            case 8:
                ShowDecorateRequest.ProtoDecorateEpisodeItem protoDecorateEpisodeItem = (ShowDecorateRequest.ProtoDecorateEpisodeItem) obj;
                return new mmr0(protoDecorateEpisodeItem.getLink(), ((vo30) this.b).b(protoDecorateEpisodeItem.s() ? protoDecorateEpisodeItem.o() : null, protoDecorateEpisodeItem.t() ? protoDecorateEpisodeItem.p() : null, protoDecorateEpisodeItem.u() ? protoDecorateEpisodeItem.q() : null, protoDecorateEpisodeItem.r() ? protoDecorateEpisodeItem.n() : null, (String) null));
            case 9:
                cas casVar = (a7m0) obj;
                casVar.a = bp30.f;
                casVar.d = bc30.i;
                casVar.e = bc30.t;
                rq30 rq30Var = (rq30) this.b;
                casVar.c = new lud(rq30Var.c, rq30Var.d, new xr00(rq30Var, (lnm) null, (byte) 16));
                casVar.a(new z5z(1, (byte) 13), new z5z(1, (byte) 14));
                return rih1.a;
            case 10:
                ((qtr) obj).b(new skv((ar30) this.b, str, (byte) 9));
                return rih1.a;
            case 11:
                if (!((bzy0) obj).equals(bzy0.a)) {
                    eg.o();
                    return null;
                }
                ur00 ur00Var = (ur00) this.b;
                String str2 = (String) ur00Var.e;
                if (str2 != null) {
                    ((rku) ur00Var.f).b(((l8s) ur00Var.b).a(str2).subscribe());
                }
                return rih1.a;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hw30 hw30Var = (hw30) this.b;
                mbm1 mbm1Var = hw30Var.g;
                Object obj2 = hw30Var.h;
                synchronized (mbm1Var) {
                    LinkedHashSet linkedHashSet = mbm1Var.b;
                    if (zBooleanValue) {
                        linkedHashSet.add(obj2);
                    } else {
                        linkedHashSet.remove(obj2);
                    }
                }
                return rih1.a;
            case 13:
                h72 h72Var = (h72) ((xw30) this.b).b.a.c;
                zw30 zw30Var = (zw30) h72Var.c;
                xfx xfxVar = (xfx) ((yw30) h72Var.b).h.get();
                c8o.l(xfxVar);
                acq acqVar = (acq) ((yw30) h72Var.b).F.get();
                c8o.l(acqVar);
                q7r0 q7r0Var = (q7r0) h72Var.d;
                yw30 yw30Var = (yw30) h72Var.b;
                Map map = (Map) yw30Var.o.get();
                c8o.l(map);
                zw30 zw30Var2 = (zw30) h72Var.c;
                kly0 kly0Var = yw30Var.l;
                tp60 tp60Var = (tp60) kly0Var.get();
                c8o.l(tp60Var);
                yt91 yt91Var = new yt91(map, zw30Var2, tp60Var, (byte) 28);
                tp60 tp60Var2 = (tp60) kly0Var.get();
                c8o.l(tp60Var2);
                wo60 wo60Var = (wo60) yw30Var.m.get();
                c8o.l(wo60Var);
                aks0 aks0Var = (aks0) ((jly0) h72Var.e).get();
                nip nipVar = (nip) ((jly0) h72Var.f).get();
                rsm0 rsm0Var = (rsm0) ((jly0) h72Var.h).get();
                wl7 wl7Var = (wl7) ((jly0) h72Var.i).get();
                hun0 hun0Var = (hun0) yw30Var.r.get();
                c8o.l(hun0Var);
                ew5 ew5Var = (ew5) yw30Var.q.get();
                c8o.l(ew5Var);
                lzn0 lzn0Var = (lzn0) yw30Var.n.get();
                c8o.l(lzn0Var);
                wen0 wen0Var = (wen0) yw30Var.c.get();
                c8o.l(wen0Var);
                c690 c690Var = (c690) yw30Var.H.get();
                c8o.l(c690Var);
                n431 n431Var = (n431) yw30Var.I.get();
                c8o.l(n431Var);
                s331 s331Var = (s331) yw30Var.J.get();
                c8o.l(s331Var);
                fkk1 fkk1Var = (fkk1) yw30Var.M.get();
                c8o.l(fkk1Var);
                luk lukVar = (luk) yw30Var.x.get();
                c8o.l(lukVar);
                cgr0 cgr0Var = new cgr0(q7r0Var, yt91Var, tp60Var2, wo60Var, aks0Var, nipVar, rsm0Var, wl7Var, hun0Var, ew5Var, lzn0Var, wen0Var, c690Var, n431Var, s331Var, fkk1Var, new m25(lukVar), (chp) h72Var.t);
                ur41 ur41Var = (ur41) ((yw30) h72Var.b).s.get();
                c8o.l(ur41Var);
                pe peVar = (pe) ((yw30) h72Var.b).y.get();
                c8o.l(peVar);
                ti31 ti31Var = (ti31) ((yw30) h72Var.b).i.get();
                c8o.l(ti31Var);
                kj31 kj31Var = (kj31) ((yw30) h72Var.b).j.get();
                c8o.l(kj31Var);
                wen0 wen0Var2 = (wen0) ((yw30) h72Var.b).c.get();
                c8o.l(wen0Var2);
                b35 b35Var = (b35) ((yw30) h72Var.b).w.get();
                c8o.l(b35Var);
                boolean zBooleanValue2 = ((Boolean) ((yw30) h72Var.b).G.get()).booleanValue();
                q7r0 q7r0Var2 = (q7r0) h72Var.d;
                mbm1 mbm1Var2 = (mbm1) ((yw30) h72Var.b).a.get();
                c8o.l(mbm1Var2);
                uo11 uo11Var = (uo11) ((yw30) h72Var.b).u.get();
                c8o.l(uo11Var);
                return new bx30(zw30Var, xfxVar, acqVar, cgr0Var, ur41Var, (cir0) obj, peVar, ti31Var, kj31Var, wen0Var2, b35Var, zBooleanValue2, q7r0Var2, mbm1Var2, uo11Var);
            case 14:
                ((iw30) this.b).t.l((p600) obj);
                return rih1.a;
            case 15:
                u740 u740Var = (u740) o7h.s0(((v740) obj).a);
                str = u740Var != null ? u740Var.a : null;
                if (str == null) {
                    str = "";
                }
                lc20 lc20Var = (lc20) this.b;
                Set set = s4b1.f;
                int iOrdinal = uic.x(str).c.ordinal();
                if (iOrdinal == 844) {
                    return w6d1.A((epb1) lc20Var.b, new zf10(lc20Var, str, (byte) 22));
                }
                if (iOrdinal != 860) {
                    return new kdn0();
                }
                return new soy0(((uu00) lc20Var.c).b(new oi("gated-content-banner-state-source", false, new kq00(str, (byte) 24))).filter(fkj0.U0).map(new njp1(str, (byte) 10)).toFlowable(BackpressureStrategy.d));
            case 16:
                id40 id40Var = (id40) this.b;
                xc40 xc40Var = xc40.a;
                hd40 hd40Var = ((zc40) obj).a;
                if (!(hd40Var instanceof dd40)) {
                    return u890.j(id40Var.a, hd40Var) ? Next.a(Effects.a(new xc40[]{xc40Var})) : Next.i(id40.a(id40Var, hd40Var, false, false, false, false, 30), Effects.a(new xc40[]{xc40Var}));
                }
                eg.m("Check failed.");
                return null;
            case 17:
                nmu0 nmu0Var = (nmu0) obj;
                ixb ixbVar = ixb.c;
                ig40 ig40Var = (ig40) this.b;
                ResultReceiver resultReceiver = ig40Var.b.b;
                if (resultReceiver != null) {
                    pqr0 pqr0Var = new pqr0(nmu0Var);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("generation_mode_initial", pqr0Var);
                    resultReceiver.send(-1, bundle);
                    ig40Var.c.a(ixbVar);
                } else {
                    dh30 dh30Var = ig40Var.d;
                    ((rg40) dh30Var.b).a.l(nmu0Var);
                    ((los) dh30Var.c).a(ixbVar);
                }
                return rih1.a;
            case 18:
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((dhm) this.b).c)), ((h3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 19:
                return ((zfx) this.b).a(null);
            case 20:
                return new k6r((yt40) this.b, (byte) 12);
            case 21:
                DrawScope drawScope = (DrawScope) obj;
                Paint paint = (Paint) this.b;
                u84 u84VarP = drawScope.a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.drawRect(0.0f, 0.0f, Float.intBitsToFloat((int) (drawScope.j() >> 32)), Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)), paint);
                return rih1.a;
            case 22:
                String str3 = (String) obj;
                Object objOpt = ((JSONObject) this.b).opt(str3);
                if (objOpt == null) {
                    return null;
                }
                try {
                    return URLEncoder.encode(str3, "UTF-8") + '=' + URLEncoder.encode(objOpt.toString(), "UTF-8");
                } catch (Exception unused) {
                    return null;
                }
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                Bundle bundle2 = (Bundle) obj;
                if (bundle2 == null) {
                    return new p750(((y750) this.b).d.a, false, false);
                }
                Parcelable parcelable = bundle2.getParcelable("graduation_approved_model");
                if (parcelable != null) {
                    return (p750) parcelable;
                }
                hhg1.n("Required value was null.");
                return null;
            case 24:
                Bundle bundle3 = (Bundle) obj;
                if (bundle3 == null) {
                    u850 u850Var = ((s850) this.b).d;
                    return new p850(u850Var.b, u850Var.c, !u850Var.a, "https://support.spotify.com/article/graduating-to-a-self-managed-account/plain", false, false, z7w.a);
                }
                Parcelable parcelable2 = bundle3.getParcelable("graduation_education_model");
                if (parcelable2 != null) {
                    return (p850) parcelable2;
                }
                hhg1.n("Required value was null.");
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                Bundle bundle4 = (Bundle) obj;
                if (bundle4 == null) {
                    return new s950(((u950) this.b).d.a, false);
                }
                Parcelable parcelable3 = bundle4.getParcelable("graduation_rejected_model");
                if (parcelable3 != null) {
                    return (s950) parcelable3;
                }
                hhg1.n("Required value was null.");
                return null;
            case 26:
                return new hnd0(((dd50) this.b).a);
            case 27:
                wp20 wp20Var = (wp20) this.b;
                ((vku) wp20Var.e).a(((FlowableMap) wp20Var.a).z().map(ta20.e).filter(ua20.e).subscribe(new lgr((df50) obj, wp20Var, (byte) 26), k530.Y));
                return rih1.a;
            case 28:
                ((Number) obj).intValue();
                String strM = l1d.m("spotify:chat:", ((yg50) this.b).b.a);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-listening-activity-group-audience-selection";
                x6h1VarI.f = "0.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = strM;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("listeningactivity/group/audience-selection");
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            default:
                return ((oi50) this.b).b;
        }
    }
}
