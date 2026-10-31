package p;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.glance.appwidget.protobuf.a;
import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteError;
import com.spotify.gpb.trackingimpl.events.proto.GpbOperation;
import com.spotify.pam.v2.Action;
import com.spotify.pam.v2.AstroMember;
import com.spotify.pam.v2.BenefitListItems;
import com.spotify.pam.v2.GetAstroOnManagementRequest;
import com.spotify.pam.v2.GetAstroOnManagementResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fp8 implements Function, ya, k1q0, io20, hu00, mkf1, xsi0, BiFunction, t751 {
    public final /* synthetic */ byte a;
    public Object b;

    public fp8(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.b = xdn0.d();
                break;
        }
    }

    public static fp8 i(owg owgVar) {
        fp8 fp8Var = owgVar.r;
        return fp8Var != null ? fp8Var : new fp8(owgVar);
    }

    public void a() {
        ((z72) this.b).k(false);
    }

    public boolean accept(Object obj) {
        return ((rxj0) this.b).A;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                f7h f7hVar = (f7h) ((Map) obj).get(((dp8) this.b).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 2:
                Restrictions restrictions = ((PlayerState) obj).restrictions();
                y0i0 y0i0Var = (y0i0) this.b;
                return (restrictions.disallowTogglingRepeatTrackReasons().isEmpty() || !(y0i0Var == y0i0.b)) ? y0i0Var : y0i0.a;
            case 5:
                ((noa) this.b).A1 = (doa) obj;
                return CompletableEmpty.a;
            case 14:
                return Collections.singletonMap(((csd) this.b).a, (mvd) obj);
            case 18:
                so soVar = (so) this.b;
                w6e0 w6e0Var = ((n451) ((ow3) soVar.b).c).a;
                return m5n1.l(((kh60) w6e0Var.d).a, new z5z(1, (byte) 19)).s((Scheduler) w6e0Var.c).c(new dgg(soVar)).w();
            case 21:
                m0h m0hVar = (m0h) obj;
                lls0 lls0Var = ((z0h) this.b).h;
                String str = m0hVar.a.b.a;
                boolean z = lls0Var.b;
                mls0 mls0Var = lls0.d;
                return (!z ? Single.just(mls0Var) : ((qns0) lls0Var.c).b("CollectionArtistPage", Collections.singletonList(str), false).map(new clv(str, (byte) 11)).onErrorReturnItem(mls0Var)).map(new ps7(m0hVar, (byte) 23));
            case 22:
                return ((a4h) this.b).e.getString(2131962613);
            case 23:
                beh behVar = (feh) obj;
                if (behVar instanceof beh) {
                    b8p1 b8p1Var = (b8p1) this.b;
                    u210 u210Var = (u210) b8p1Var.c;
                    int i = b8p1Var.b;
                    String str2 = (String) b8p1Var.d;
                    String str3 = behVar.a;
                    String str4 = (String) b8p1Var.e;
                    String lowerCase = bb00.s(i).toLowerCase(Locale.ROOT);
                    String strConcat = "Reasons:".concat(str3);
                    if (str2.length() != 0 || str4.length() != 0) {
                        t2j0 t2j0Var = u210Var.a;
                        s210 s210VarN = ExternalAccessoryRemoteError.n();
                        s210VarN.n(lowerCase);
                        s210VarN.r(str2);
                        s210VarN.q(strConcat);
                        s210VarN.s(str4);
                        t2j0Var.a(s210VarN.build());
                    }
                }
                return behVar;
            default:
                String str5 = (String) obj;
                l78 l78Var = ((zrh) this.b).a;
                str5.getClass();
                return l78Var.a(str5).flatMapObservable(new fl1(l78Var, (byte) 26)).filter(een.X0).map(new xrh(str5, (byte) 0));
        }
    }

    public Object b() {
        return Integer.valueOf(((dhb) ((kly0) this.b).get()).k());
    }

    public void c(String str) {
        ((z72) this.b).l(str);
    }

    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        mup mupVar = ((nkd) this.b).a;
        mr20 mr20Var = obj instanceof mr20 ? (mr20) obj : null;
        switch (mupVar.a) {
            case 0:
                p2p p2pVar = mupVar.b;
                nwp nwpVar = (nwp) p2pVar.c;
                v290 v290Var = (v290) ((daq) nwpVar.a.b).Kn.get();
                c8o.l(v290Var);
                l7m0 l7m0Var = new l7m0(nwpVar.g(), (byte) 10);
                kma kmaVarR = nwpVar.a.r();
                c8o.l(kmaVarR);
                woa woaVarS = nwpVar.a.s();
                c8o.l(woaVarS);
                k9k k9kVar = (k9k) p2pVar.d;
                t2j0 t2j0VarI0 = ((nwp) k9kVar.c).a.i0();
                c8o.l(t2j0VarI0);
                ii9 ii9Var = new ii9(t2j0VarI0);
                nwp nwpVar2 = (nwp) k9kVar.c;
                Flowable flowable = (Flowable) nwpVar2.l.get();
                t2j0 t2j0VarI1 = nwpVar2.a.i0();
                c8o.l(t2j0VarI1);
                ne neVar = new ne(flowable, t2j0VarI1);
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                Random random = (Random) ((daq) ((nwp) k9kVar.c).a.b).I1.get();
                c8o.l(random);
                return new vkd(v290Var, l7m0Var, kmaVarR, woaVarS, ii9Var, neVar, gw70VarA0, new i6b(random, (byte) 6), (iac0) ((jly0) k9kVar.d).get(), nwpVar.g(), viewGroup, mr20Var, y3o0Var);
            default:
                p2p p2pVar2 = mupVar.b;
                daq daqVar = (daq) p2pVar2.c;
                v290 v290Var2 = (v290) daqVar.Kn.get();
                l7m0 l7m0Var2 = new l7m0(daqVar.v(), (byte) 10);
                kma kmaVar = (kma) daqVar.Od.get();
                woa woaVar = (woa) daqVar.W8.get();
                g1i g1iVar = (g1i) p2pVar2.d;
                ii9 ii9Var2 = new ii9((t2j0) ((daq) g1iVar.c).f2.get());
                daq daqVar2 = (daq) g1iVar.c;
                return new vkd(v290Var2, l7m0Var2, kmaVar, woaVar, ii9Var2, new ne((Flowable) daqVar2.D5.get(), (t2j0) daqVar2.f2.get()), (gw70) daqVar.d8.get(), new i6b((Random) ((daq) g1iVar.c).I1.get(), (byte) 6), (iac0) ((jly0) g1iVar.d).get(), daqVar.v(), viewGroup, mr20Var, y3o0Var);
        }
    }

    public xdn0 e() {
        throw null;
    }

    public boolean f(String str, ine ineVar, int i, byte[] bArr) {
        Object objPutIfAbsent;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        if (i == 0) {
            Object linkedHashMap = concurrentHashMap.get(str);
            if (linkedHashMap == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (linkedHashMap = new LinkedHashMap()))) != null) {
                linkedHashMap = objPutIfAbsent;
            }
            ((Map) linkedHashMap).put(ineVar, p7h.O(new byte[][]{bArrCopyOf}));
            return true;
        }
        Map map = (Map) concurrentHashMap.get(str);
        List list = map != null ? (List) map.get(ineVar) : null;
        if (i >= 0 && list != null) {
            Iterator it = list.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((byte[]) it.next()).length;
            }
            if (length == i) {
                list.add(bArrCopyOf);
                return true;
            }
        }
        g(str, ineVar);
        return false;
    }

    public synchronized void g(String str, ine ineVar) {
        try {
            Map map = (Map) ((ConcurrentHashMap) this.b).get(str);
            if (map != null) {
            }
            Map map2 = (Map) ((ConcurrentHashMap) this.b).get(str);
            if (map2 != null && map2.isEmpty()) {
                ((ConcurrentHashMap) this.b).remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object j(String str, onm onmVar) {
        bv9 bv9Var;
        Integer numC0;
        if (onmVar instanceof bv9) {
            bv9Var = (bv9) onmVar;
            int i = bv9Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bv9Var.c = i - Integer.MIN_VALUE;
            } else {
                bv9Var = new bv9(this, onmVar);
            }
        } else {
            bv9Var = new bv9(this, onmVar);
        }
        Object objN = bv9Var.a;
        int i2 = bv9Var.c;
        if (i2 == 0) {
            hm5.M(objN);
            th7 th7VarA = th7.a((str == null || (numC0 = nhc1.c0(str)) == null) ? 0 : numC0.intValue());
            enr0.a.getClass();
            enr0 enr0Var = (enr0) this.b;
            wk40 wk40VarN = GetAstroOnManagementRequest.n();
            wk40VarN.q();
            wk40VarN.n(th7VarA);
            GetAstroOnManagementRequest getAstroOnManagementRequestBuild = wk40VarN.build();
            bv9Var.c = 1;
            objN = enr0Var.n(getAstroOnManagementRequestBuild, bv9Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objN);
        }
        GetAstroOnManagementResponse getAstroOnManagementResponse = (GetAstroOnManagementResponse) objN;
        String strQ = getAstroOnManagementResponse.q();
        String title = getAstroOnManagementResponse.getTitle();
        String description = getAstroOnManagementResponse.getDescription();
        String strP = getAstroOnManagementResponse.p();
        p10 p10Var = new p10(11, (String) null, (String) null, getAstroOnManagementResponse.t().getTitle(), (String) null, getAstroOnManagementResponse.t().getUri());
        String title2 = getAstroOnManagementResponse.r().getTitle();
        h290<AstroMember> h290VarO = getAstroOnManagementResponse.r().o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (AstroMember astroMember : h290VarO) {
            Action actionS = astroMember.s();
            if (getAstroOnManagementResponse.u()) {
                actionS = astroMember.o().getTitle().length() > 0 ? astroMember.o() : astroMember.n();
            }
            String strQ2 = astroMember.q();
            String name = astroMember.getName();
            String description2 = astroMember.getDescription();
            String strP2 = astroMember.p();
            String str2 = strP2.length() == 0 ? "#FFFFFF" : strP2;
            String strP3 = actionS.p();
            String strN = actionS.n();
            arrayList.add(new lh1(strQ2, name, description2, str2, new p10(8, strP3, strN.length() == 0 ? "#FFFFFF" : strN, actionS.getTitle(), (String) null, actionS.getUri()), astroMember.r()));
        }
        String strP4 = getAstroOnManagementResponse.r().n().p();
        String strN2 = getAstroOnManagementResponse.r().n().n();
        mh1 mh1Var = new mh1(title2, arrayList, new p10(8, strP4, strN2.length() == 0 ? "#FFFFFF" : strN2, getAstroOnManagementResponse.r().n().getTitle(), (String) null, getAstroOnManagementResponse.r().n().getUri()));
        String title3 = getAstroOnManagementResponse.n().getTitle();
        h290<BenefitListItems> h290VarN = getAstroOnManagementResponse.n().n();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
        for (BenefitListItems benefitListItems : h290VarN) {
            arrayList2.add(new p10(26, benefitListItems.n(), (String) null, benefitListItems.p(), (String) null, (String) null));
        }
        return new yg1(strQ, title, description, mh1Var, new ye1(title3, arrayList2, new p10(11, (String) null, (String) null, getAstroOnManagementResponse.n().o(), (String) null, getAstroOnManagementResponse.n().p())), strP, p10Var, new oh1(getAstroOnManagementResponse.s().getTitle(), getAstroOnManagementResponse.s().o(), getAstroOnManagementResponse.s().p()), getAstroOnManagementResponse.u(), new p10(2, getAstroOnManagementResponse.o().n().p(), (String) null, getAstroOnManagementResponse.o().n().getTitle(), getAstroOnManagementResponse.o().n().getSubtitle(), getAstroOnManagementResponse.o().n().getUri()));
    }

    public boolean k() {
        return ((si4) this.b).a();
    }

    public void l(msi0 msi0Var, MenuItem menuItem) {
        ((a2e) this.b).f.removeCallbacksAndMessages(msi0Var);
    }

    public Single m(String str) {
        return ((w0b) this.b).a(str).map(vrg.Y);
    }

    public void n(CaptureRequest.Key key, Object obj) {
        ((xdn0) this.b).s(z1d.J(key), osk.b, obj);
    }

    public void o(int i, Object obj, qm41 qm41Var) {
        owg owgVar = (owg) this.b;
        owgVar.A0(i, 3);
        qm41Var.f((a) obj, owgVar.r);
        owgVar.A0(i, 4);
    }

    public void p(msi0 msi0Var, ysi0 ysi0Var) {
        a2e a2eVar = (a2e) this.b;
        Handler handler = a2eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = a2eVar.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (msi0Var == ((z1e) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new y1e(this, i2 < arrayList.size() ? (z1e) arrayList.get(i2) : null, ysi0Var, msi0Var), msi0Var, SystemClock.uptimeMillis() + 200);
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        switch (this.a) {
            case 4:
                kda kdaVar = (kda) this.b;
                kdaVar.h = hsl1Var.a();
                kdaVar.i = hsl1Var.b();
                kdaVar.j = hsl1Var.c();
                kdaVar.f();
                break;
            default:
                cwb cwbVar = (cwb) this.b;
                bwb bwbVar = cwbVar.Z;
                if (bwbVar != null) {
                    cwbVar.f.D(bwbVar);
                }
                bwb bwbVar2 = new bwb(cwbVar.i, hsl1Var);
                cwbVar.Z = bwbVar2;
                cwbVar.f.t(bwbVar2);
                break;
        }
        return hsl1Var;
    }

    public /* synthetic */ fp8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ fp8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public fp8(owg owgVar) {
        this.a = (byte) 20;
        Charset charset = j290.a;
        this.b = owgVar;
        owgVar.r = this;
    }

    public fp8(d520 d520Var) {
        this.a = (byte) 10;
        this.b = d520Var.B("com.crashlytics.settings.json");
    }

    public Object apply(Object obj, Object obj2) {
        j331 j331Var = (j331) obj;
        j331 j331Var2 = (j331) obj2;
        vx40 vx40Var = ((s6g) this.b).d;
        e550 e550VarP = GpbOperation.p();
        pf61 pf61Var = (pf61) vx40Var.c;
        e550VarP.w(pf61Var.c());
        e550VarP.v(pf61Var.a());
        e550VarP.t("LOAD_UC_UCB_DATA");
        if (!(j331Var instanceof v231)) {
            vx40.B(e550VarP, j331Var, (iu30) null);
        } else if (!(j331Var2 instanceof v231)) {
            vx40.B(e550VarP, j331Var2, (iu30) null);
        } else {
            vx40.B(e550VarP, j331Var, new fz40(j331Var2, j331Var, (byte) 3));
        }
        ((t2j0) vx40Var.b).a(e550VarP.build());
        return new g7g(j331Var, j331Var2);
    }
}
