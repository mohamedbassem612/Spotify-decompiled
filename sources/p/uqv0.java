package p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.spotify.checkout.premiumcheckout.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.ai.creation.v2.Problem;
import com.spotify.playlist.ai.creation.v2.ReportProblemRequest;
import com.spotify.playlistreaction.v1.ReactionPayload;
import com.spotify.premiumdestination.destination.mobius.domain.JsonException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeWhile;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import spotify.party.orchestra.v1.RegisterNotifications;
import spotify.profile_esperanto.proto.ChangeDisplayNameRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class uqv0 implements Function, k1q0, ya, qiw, w011, av30 {
    public final /* synthetic */ byte a;
    public Object b;

    public uqv0(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.b = new LinkedHashMap();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    public static boolean g(String str, cr01 cr01Var) {
        boolean z;
        boolean z2;
        if (cr01Var.m != null) {
            if (cr01Var.e == br01.b && eyo1.t(cr01Var.b)) {
                yq01 yq01Var = cr01Var.m;
                if ((yq01Var != null ? yq01Var.b : 0) > 0) {
                    z = true;
                } else if (zxo1.w(str)) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (zxo1.w(str)) {
                z = true;
            } else {
                z = false;
            }
            List list = cr01Var.f;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((ft01) it.next()).b.length() > 0) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    public Object a(lnm lnmVar) {
        return ((l2t) this.b).E(lnmVar);
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 6:
                return ((uh4) this.b).f();
            default:
                return ((ksk) obj).c == le30.R0 && ((wp4) this.b).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0236  */
    /* JADX WARN: Code duplicated, block: B:68:0x0244  */
    /* JADX WARN: Code duplicated, block: B:73:0x0252  */
    public Object apply(Object obj) throws JsonException {
        Double dValueOf;
        String str;
        String str2;
        Problem problem;
        int i = 3;
        switch (this.a) {
            case 0:
                wqv0 wqv0Var = (wqv0) this.b;
                String url = ((GetCheckoutPageResponse) obj).n().getUrl();
                Uri uri = Uri.parse(url);
                x8g x8gVar = wqv0Var.e;
                zxf zxfVar = wqv0Var.a.b;
                uri.getClass();
                v5g v5gVarB = x8gVar.b(zxfVar, uri);
                if (v5gVarB != null) {
                    return new zqv0(v5gVarB);
                }
                url.getClass();
                return new arv0(url);
            case 1:
                try {
                    return (re70) ((nfa0) this.b).a((String) obj, se70.a);
                } catch (Exception e) {
                    throw new JsonException(e);
                }
            case 2:
            case 3:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 24:
            case 25:
            default:
                ta41 ta41Var = (ta41) obj;
                String str3 = ta41Var.c;
                String str4 = ta41Var.d;
                v5n v5nVar = (v5n) this.b;
                v5nVar.getClass();
                if (ihc1.y0(str3)) {
                    eg.m("Parameter 'username' MUST NOT be empty");
                    return null;
                }
                be beVar = v5nVar.a;
                vce vceVarN = ChangeDisplayNameRequest.n();
                vceVarN.q(str3);
                vceVarN.n(str4);
                return beVar.callSingle("spotify.profile_esperanto.proto.v1.ProfileService", "ChangeDisplayName", vceVarN.build()).map(xpv0.c).flatMapCompletable(new fna(v5nVar, (byte) 25)).d(Observable.just(new ib41(true))).onErrorReturn(r6x0.i);
            case 4:
                dg30 dg30Var = (dg30) ((otu) this.b).b;
                if (x74.j(dg30Var, "android.permission.CAMERA") == 0) {
                    i = 1;
                } else if (ag0.C0(dg30Var, "android.permission.CAMERA")) {
                    i = 2;
                }
                return new wyw0(i);
            case 5:
                return Observable.create(new yeu0((kp5) this.b, (e5x0) obj, (byte) 25));
            case 8:
                return ((Boolean) obj).booleanValue() ? new hrn0(zry0.class, new bsy0(((Intent) this.b).getBooleanExtra("puffin_setup_flow_should_resume_music_when_exiting_flow", false)), new c6w0(1, false, (hd5) null, 14)) : crn0.a;
            case 10:
                uv00 uv00Var = (uv00) obj;
                List list = ((b5z0) this.b).d;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : list) {
                    ro7 ro7Var = uv00Var.a(ro7.class, (String) obj2).b;
                    if (ro7Var != null) {
                        double d = ro7Var.a;
                        dValueOf = Double.valueOf(d);
                        if (Math.abs(d) > Double.MAX_VALUE || d <= 0.0d) {
                            dValueOf = null;
                        }
                    } else {
                        dValueOf = null;
                    }
                    if (ro7Var != null) {
                        str = ro7Var.d.a;
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (ro7Var != null) {
                        str2 = ro7Var.d.b;
                        if (ihc1.y0(str2)) {
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put(obj2, new hlk0(dValueOf, str, str2));
                }
                return new r7z0(linkedHashMap);
            case 11:
                return ((feh) obj) instanceof beh ? d8z0.a : new e8z0(((t5z0) this.b).d);
            case 12:
                String strContextUri = ((PlayerState) obj).contextUri();
                yxb0 yxb0Var = (yxb0) this.b;
                hj91 hj91Var = (hj91) yxb0Var.c;
                strContextUri.getClass();
                return hj91Var.d(strContextUri).filter(l9x0.d).take(1L).timeout(5L, TimeUnit.SECONDS).flatMapCompletable(new m7y0(yxb0Var, (byte) 3));
            case 20:
                gxd0 gxd0Var = (gxd0) obj;
                ye11 ye11Var = (ye11) this.b;
                ze11 ze11Var = ye11Var.b;
                we11 we11VarN = RegisterNotifications.RegisterNotificationRequest.n();
                we11VarN.n(gxd0Var.a);
                return ze11Var.a(we11VarN.build()).doOnSuccess(new lyw0(ye11Var, gxd0Var, (byte) 21)).map(new zgz0(gxd0Var, (byte) 5)).onErrorReturn(new m7y0(gxd0Var, (byte) 9));
            case 21:
                return apo.x((chm0) this.b);
            case 22:
                return new v101(((j101) this.b).a, (Throwable) obj);
            case 23:
                zh21 zh21Var = (zh21) obj;
                lux0 lux0Var = ((ai21) this.b).a;
                String str5 = zh21Var.a;
                String str6 = zh21Var.b;
                pqw0 pqw0Var = zh21Var.c;
                kux0 kux0Var = lux0Var.a;
                ReportProblemRequest.Builder builderNewBuilder = ReportProblemRequest.newBuilder();
                builderNewBuilder.setSessionId(str5);
                builderNewBuilder.setMessageId(str6);
                if (pqw0Var.equals(oqw0.a)) {
                    problem = Problem.PROBLEM_NO_MUSIC;
                } else if (pqw0Var instanceof pqw0) {
                    problem = Problem.PROBLEM_OTHER_OR_GENERIC;
                } else if (pqw0Var.equals(qqw0.a)) {
                    problem = Problem.PROBLEM_UNSPECIFIED;
                } else {
                    if (!pqw0Var.equals(rqw0.a)) {
                        eg.o();
                        return null;
                    }
                    problem = Problem.PROBLEM_UNTRUE_OR_INACCURATE;
                }
                builderNewBuilder.setProblem(problem);
                builderNewBuilder.setProblemDetail(pqw0Var instanceof pqw0 ? pqw0Var.a : "");
                return kux0Var.a((ReportProblemRequest) builderNewBuilder.build()).map(a2x0.c).map(hcx0.g).onErrorReturnItem(ji21.a).toObservable();
            case 26:
                AtomicInteger atomicInteger = new AtomicInteger(0);
                yc31 yc31Var = (yc31) this.b;
                FlowableTakeWhile flowableTakeWhile = new FlowableTakeWhile((Flowable) obj, new m7y0(atomicInteger, yc31Var, (byte) 15));
                m021 m021Var = new m021(atomicInteger, yc31Var, (byte) 9);
                int i2 = Flowable.a;
                return flowableTakeWhile.A(m021Var, i2, i2);
            case 27:
                bo31 bo31Var = (bo31) this.b;
                return cwl1.e0(bo31Var.j, new d821(bo31Var, (jn3) obj, (lnm) null, (byte) 21));
            case 28:
                u741 u741Var = (u741) this.b;
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(Boolean.FALSE);
                }
                goq goqVar = u741Var.a;
                return yoi1.i(rqt0.u(new qer((php0) goqVar.g, goqVar, (byte) 27)), o6x.a).switchMap(new m7y0(u741Var, (byte) 18));
        }
    }

    public void b(Integer num, String str) {
        if (num != null) {
            ((LinkedHashMap) this.b).put(str, String.valueOf(num.intValue()));
        }
    }

    public Object c(String str, String str2, String str3, a8d1 a8d1Var) {
        xyc0 xyc0Var = (iyc0) this.b;
        gyz0 gyz0VarN = ReactionPayload.n();
        gyz0VarN.n(str3);
        Object objT = xyc0Var.t(str, str2, "set-reaction", ((ReactionPayload) gyz0VarN.build()).toByteString(), a8d1Var);
        return objT == d9n.a ? objT : rih1.a;
    }

    public mlw0 d() {
        return new mlw0(this);
    }

    public bm00 e(String str) {
        jc11 jc11VarF;
        Class clsL = r1p1.l((ClassLoader) this.b, str);
        if (clsL == null || (jc11VarF = v1p1.f(clsL)) == null) {
            return null;
        }
        return new bm00(jc11VarF, (byte) 25);
    }

    public boolean f(String str, cr01 cr01Var, yy71 yy71Var) {
        if (str.length() > 0 && !eyo1.p(str) && !eyo1.r(str) && yy71Var.a == null) {
            return false;
        }
        if ((eyo1.q(str) || eyo1.u(str)) && yy71Var.c == null) {
            return false;
        }
        if (g(str, cr01Var) && yy71Var.e == null) {
            return false;
        }
        return (eyo1.t(str) && ((vh4) this.b).d() && yy71Var.f == null) ? false : true;
    }

    public Object h(String str, String str2, String str3, onm onmVar) {
        xyc0 xyc0Var = (iyc0) this.b;
        gyz0 gyz0VarN = ReactionPayload.n();
        gyz0VarN.n(str3);
        Object objT = xyc0Var.t(str, str2, "remove-reaction", ((ReactionPayload) gyz0VarN.build()).toByteString(), onmVar);
        return objT == d9n.a ? objT : rih1.a;
    }

    public void i(nnm nnmVar) {
        this.b = nnmVar;
    }

    public void j(String str) {
        k511 k511Var = (k511) this.b;
        bpb1 bpb1VarA = k511Var.a(str);
        boolean zBooleanValue = ((Boolean) bpb1VarA.getValue()).booleanValue();
        bpb1VarA.m((Object) null, Boolean.valueOf(!zBooleanValue));
        dma1 dma1Var = k511Var.a;
        bma1 bma1Var = l511.a;
        Set setO1 = o7h.o1(dma1Var.a(bma1Var));
        if (zBooleanValue) {
            setO1.add(str);
        } else {
            setO1.remove(str);
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.e(bma1Var, setO1);
        hma1VarEdit.g();
    }

    public void v(Object obj) {
        mmr0 mmr0Var = (mmr0) obj;
        boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
        int iIntValue = ((Number) mmr0Var.b).intValue();
        dtw dtwVar = ((a901) this.b).t;
        if (dtwVar != null) {
            dtwVar.f(new u5s0(iIntValue, zBooleanValue));
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        int i = hsl1Var.a.i(519).a;
        o0g1 o0g1Var = (o0g1) this.b;
        o0g1Var.b = i;
        j4w0 j4w0Var = (j4w0) o0g1Var.f;
        if (j4w0Var != null) {
            ((uhs) o0g1Var.d).f(j4w0.a(j4w0Var, i));
        }
        return hsl1Var;
    }

    public /* synthetic */ uqv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public uqv0(cdk0 cdk0Var) {
        this.a = (byte) 3;
        this.b = new buz(((ldk0) cdk0Var).g(), (byte) 2);
    }

    public uqv0(agc0 agc0Var, vh4 vh4Var) {
        this.a = (byte) 16;
        this.b = vh4Var;
    }
}
