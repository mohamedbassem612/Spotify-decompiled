package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profile.proto.ProfilelistResponse;
import com.spotify.profile.profile.proto.ProfilelistResponse$SmallProfileList;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vgq0 implements Function, SingleTransformer, qiw, Predicate, fq50, jrn0, n2i1, Producer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ vgq0(n0v0 n0v0Var) {
        this.a = (byte) 24;
        this.b = ((v280) n0v0Var.b).g();
    }

    public Object a(Object obj) {
        return ((vxz0) obj).a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0247  */
    /* JADX WARN: Code duplicated, block: B:46:0x0268 A[LOOP:4: B:44:0x0262->B:46:0x0268, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x027c  */
    /* JADX WARN: Code duplicated, block: B:50:0x027e  */
    public Object apply(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        String str;
        String str2;
        byte b = this.a;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                List list = ((z310) obj).a;
                return (!u890.j(((u310) obj3).a, "spotify:section:0JQ5DAIiKWzVFULQfUm85Y") || list.size() <= 8) ? list : list.subList(0, 8);
            case 2:
            case 5:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 18:
            default:
                qpz0 qpz0Var = (qpz0) obj3;
                if (((Boolean) obj).booleanValue()) {
                    Observable observableOnErrorReturn = qpz0Var.a.a().map(rdx0.c).onErrorReturn(new n0v0(qpz0Var, (byte) 16));
                    observableOnErrorReturn.getClass();
                    return observableOnErrorReturn;
                }
                vqv0 vqv0Var = qpz0Var.b;
                qd70 builder = ((re70) ee70.a.a()).toBuilder();
                wwo1 wwo1VarQ = gd70.c.a.Q(u970.e);
                cd70 cd70Var = dd70.c.a;
                j4b1 j4b1Var = j4b1.e;
                wwo1 wwo1VarF = wwo1VarQ.F(cd70Var.L("OFFLINE").k());
                hd70 hd70Var = id70.c.a;
                gj5 gj5Var = (gj5) vqv0Var.b;
                wwo1 wwo1VarL = wwo1VarF.L(hd70Var.d(gj5Var.getString(2131955740)).a(gj5Var.getString(2131955739)));
                HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
                Observable observableJust = Observable.just(new epz0(builder.p(new y570[]{wwo1VarL.y(hubsImmutableComponentBundle.a.J("radio-hub-placeholder", "radio-hub-no-network-empty-view").o()).H(hubsImmutableComponentBundle.a.J("ui:group", "radio-hub-no-network-empty-view").o()).x()}).f()));
                observableJust.getClass();
                return observableJust;
            case 3:
                lbw lbwVar = (lbw) obj;
                gbs0 gbs0Var = (gbs0) obj3;
                fcs0 fcs0Var = gbs0Var.a;
                mcs0 mcs0VarN = PaymentSdkNativeServiceProto.GetPaymentSessionRequest.n();
                mcs0VarN.n(lbwVar.a);
                return fcs0Var.c(mcs0VarN.build()).map(ua20.V0).onErrorResumeNext(va20.V0).compose(new dn81((byte) 2)).flatMap(new cbs0(gbs0Var, lbwVar)).onErrorReturn(new e5l0(lbwVar, (byte) 20));
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    return yoi1.i(new k6e0(new k6e0(new xr0(d5p1.h(((zgs0) obj3).b.e), (byte) 28), (byte) 21), (byte) 22), o6x.a);
                }
                Observable observableEmpty = Observable.empty();
                observableEmpty.getClass();
                return observableEmpty;
            case 7:
                jnh jnhVar = (jnh) obj;
                so soVar = (so) obj3;
                jwe1 jwe1Var = (iwe1) soVar.c;
                String str3 = (String) soVar.b;
                sn51 sn51Var = jnhVar.a;
                tv80 tv80Var = jnhVar.b;
                jwe1 jwe1Var2 = jwe1Var;
                Flowable flowable = jwe1Var2.e;
                return ydh.f(flowable, flowable).B(new hce1(str3, jwe1Var2, sn51Var, tv80Var, (byte) 2));
            case 8:
                fuc fucVar = (fuc) obj;
                ztc ztcVar = (ztc) obj3;
                List<r5k> list2 = fucVar.b;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (r5k r5kVar : list2) {
                    arrayList3.add(new q5k(r5kVar.a, r5kVar.b));
                }
                for (Object obj4 : arrayList3) {
                    String str4 = ((q5k) obj4).a;
                    String str5 = (String) o7h.s0(ztcVar.c);
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (str4.equals(str5)) {
                        obj2 = obj4;
                        q5k q5kVar = (q5k) obj2;
                        List<ytc> list3 = fucVar.a;
                        arrayList = new ArrayList(q7h.U(list3, 10));
                        for (ytc ytcVar : list3) {
                            String str6 = ytcVar.b;
                            String str7 = ytcVar.a;
                            String str8 = ytcVar.c;
                            ArrayList arrayList4 = ytcVar.e;
                            arrayList2 = new ArrayList(q7h.U(arrayList4, 10));
                            it = arrayList4.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((wsc) it.next()).a);
                            }
                            str = ytcVar.d.b.a;
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            arrayList.add(new avt0(str6, str7, str8, arrayList2, str2, ytcVar.f, ytcVar.g, ytcVar.h));
                        }
                        return new spc(arrayList, arrayList3, q5kVar, fucVar.d, ztcVar.a, fucVar.e);
                    }
                }
                q5k q5kVar2 = (q5k) obj2;
                List<ytc> list4 = fucVar.a;
                arrayList = new ArrayList(q7h.U(list4, 10));
                while (r2.hasNext()) {
                    String str9 = ytcVar.b;
                    String str10 = ytcVar.a;
                    String str11 = ytcVar.c;
                    ArrayList arrayList5 = ytcVar.e;
                    arrayList2 = new ArrayList(q7h.U(arrayList5, 10));
                    it = arrayList5.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((wsc) it.next()).a);
                    }
                    str = ytcVar.d.b.a;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    arrayList.add(new avt0(str9, str10, str11, arrayList2, str2, ytcVar.f, ytcVar.g, ytcVar.h));
                }
                return new spc(arrayList, arrayList3, q5kVar2, fucVar.d, ztcVar.a, fucVar.e);
            case 9:
                w9u0 w9u0Var = ((t1u0) obj3).t;
                w9u0Var.getClass();
                return w9u0Var.a((q9u0) obj);
            case 14:
                yeu0 yeu0Var = (yeu0) obj3;
                String str12 = ((kbv0) obj).a;
                q6v0 q6v0Var = (q6v0) yeu0Var.c;
                q6v0Var.getClass();
                return ((Observable) new idd1(new wpu0(q6v0Var, str12, (byte) 21)).getValue()).flatMap(new yqu0(str12, yeu0Var)).distinctUntilChanged().map(bk20.b1).onErrorReturn(b610.c1);
            case 16:
                return ((gal) obj3).j((mvv0) obj);
            case 17:
                return sqg0.O((LinkedHashMap) obj3, (Map) obj);
            case 19:
                return new nmr0((String) ((vqb0) obj3).c, (Object) null);
            case 20:
                p8x0 p8x0Var = (p8x0) obj;
                return ((k8x0) obj3).i(p8x0Var.c).map(o9x0.b).onErrorReturn(new n0v0(p8x0Var, (byte) 6));
            case 21:
                ArrayList arrayList6 = new ArrayList();
                for (ProfilelistResponse.SmallProfile smallProfile : ((ProfilelistResponse$SmallProfileList) obj).o()) {
                    smallProfile.getClass();
                    String uri = smallProfile.getUri();
                    uri.getClass();
                    nbx0 nbx0VarU = tzr0.u(uri);
                    boolean isFollowing = smallProfile.getIsFollowing();
                    boolean zP = smallProfile.p();
                    int iN = smallProfile.n();
                    q730 q730Var = new q730(iN, smallProfile.o(), isFollowing, zP);
                    String name = smallProfile.getName();
                    int iMax = Math.max(isFollowing ? 1 : 0, iN);
                    arrayList6.add(new obx0(nbx0VarU, uri, name, ((Activity) ((tzr0) obj3).b).getResources().getQuantityString(2131820864, iMax, Integer.valueOf(iMax)), smallProfile.getImageUrl(), q730Var, (String) null, 4032));
                }
                return new j8x0(3, o7h.l1(arrayList6), (String) null, false, 124);
        }
    }

    public boolean b() {
        return ((q55) this.b).a();
    }

    public Single c(Single single) {
        gks0 gks0Var = (gks0) this.b;
        yqg yqgVar = gks0Var.a;
        ohv0 ohv0Var = gks0Var.b;
        nhc nhcVar = gks0Var.c;
        jxa jxaVar = new jxa((byte) 19);
        fza fzaVar = new fza((byte) 19);
        p811 p811Var = new p811();
        return single.doOnSubscribe(new fks0(p811Var, gks0Var, ohv0Var, yqgVar, nhcVar)).doOnError(new wrk(p811Var, jxaVar, (byte) 4)).doOnSuccess(new wrk(p811Var, fzaVar, (byte) 5));
    }

    public void d() {
        ((krw0) this.b).a();
    }

    public void e() {
        krw0 krw0Var = (krw0) this.b;
        int i = krw0Var.a + 1;
        krw0Var.a = i;
        if (i == 1 && krw0Var.d) {
            krw0Var.f.g(k8c0.ON_START);
            krw0Var.d = false;
        }
    }

    public Iterator f() {
        return ((Iterable) this.b).iterator();
    }

    public Object get() {
        return new DispatcherWorker(((haz0) this.b).e);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    public irn0 l(Intent intent, th61 th61Var) {
        c840 c840Var;
        String string;
        String string2;
        trc0 trc0Var;
        x8v0 x8v0Var = (x8v0) this.b;
        String str = null;
        if (!((Boolean) ((o241) x8v0Var.c).a.map(dj20.a1).blockingFirst()).booleanValue()) {
            w6b1 w6b1VarA = f7b1.a(blc0.L7);
            List list = w6b1VarA != null ? w6b1VarA.c : null;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                eg.m("HOME_ROOT link type uri not found. Can't navigate.");
                return null;
            }
            String str2 = (String) list.get(0);
            Set set = s4b1.f;
            return new ern0(uic.x(str2));
        }
        Set set2 = s4b1.f;
        String strK = zjy.k(intent);
        if (strK == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        tos tosVar = (tos) x8v0Var.b;
        fn31.T(cto1.q(tosVar.d), (o8n) null, 0, new p1r(tosVar, strK, str, (byte) 7), 3);
        Uri data = intent.getData();
        if (data != null && !data.isOpaque() && data.getQueryParameter("bcs") != null) {
            return crn0.a;
        }
        boolean zJ = u890.j(intent.getStringExtra("filter"), "downloaded");
        Bundle extras = intent.getExtras();
        ozc0 ozc0Var = (extras == null || (string = extras.getString("extra_playback_context_uri")) == null || (string2 = extras.getString("extra_playback_row_id")) == null || (trc0Var = (trc0) jhc1.t(extras, "extra_playback_state", trc0.class)) == null) ? null : new ozc0(string, string2, trc0Var);
        Uri data2 = intent.getData();
        if (data2 == null || data2.isOpaque()) {
            c840Var = null;
        } else if (data2.getQueryParameterNames().contains("supporter")) {
            c840Var = c840.b;
        } else if (data2.getQueryParameterNames().contains("refresh")) {
            String queryParameter = data2.getQueryParameter("e");
            c840 c840Var2 = c840.a;
            if (queryParameter != null && queryParameter.hashCode() == 110) {
                queryParameter.equals("n");
            }
            c840Var = c840Var2;
        } else {
            c840Var = null;
        }
        String str3 = th61Var.a;
        Set set3 = f881.a;
        String stringExtra = intent.getStringExtra("show_page_bottom_sheet_uri");
        if (stringExtra != null && f881.a(stringExtra)) {
            str = stringExtra;
        }
        Bundle bundle = new Bundle();
        bundle.putString("uri", strK);
        bundle.putBoolean("enable_downloads_filter", zJ);
        if (c840Var != null) {
            bundle.putSerializable("refresh_experience", c840Var);
        }
        bundle.putString("username", str3);
        if (str != null) {
            bundle.putString("bottom_sheet_uri", str);
        }
        if (ozc0Var != null) {
            bundle.putParcelable("extra_list_playback_context", ozc0Var);
        }
        return new frn0(bundle, k481.class);
    }

    public boolean s(Uri uri) {
        return ((frv0) this.b).a(uri);
    }

    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (((lbu0) this.b).c.h(playerState)) {
            return true;
        }
        String str = (String) playerState.contextMetadata().get("loading.status");
        if (str == null) {
            str = "";
        }
        return str.length() > 0 && !str.equals("loading");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView] */
    public void v(Object obj) {
        fbo0 fbo0Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                kzs0 kzs0Var = (kzs0) obj;
                for (EditText editText : (List) ((b14) obj2).e) {
                    if (kzs0Var.equals(kzs0.b)) {
                        fbo0Var = null;
                    } else if (!kzs0Var.equals(kzs0.a)) {
                        eg.o();
                    } else {
                        fbo0Var = new fbo0();
                    }
                    editText.setTransformationMethod(fbo0Var);
                    break;
                }
                break;
            case 22:
                List list = (List) obj;
                cqx0 cqx0Var = (cqx0) obj2;
                qxx0 qxx0Var = cqx0Var.d;
                RecyclerView recyclerView = (RecyclerView) cqx0Var.a.c;
                LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    boolean z = layoutManager.h1() >= ((emc0) qxx0Var).d.f.size() - 1;
                    qxx0Var.C(list);
                    if (z) {
                        recyclerView.y0(Math.max(p7h.L(list), 0));
                    }
                } else {
                    hhg1.n("Required value was null.");
                }
                break;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                ytp0 ytp0Var = (ytp0) obj2;
                String str = (String) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                p1f0 p1f0Var = (p1f0) ytp0Var.d;
                ShapeableImageView shapeableImageView = (ShapeableImageView) p1f0Var.b;
                ?? r5 = (SeeMoreTextView) p1f0Var.d;
                shapeableImageView.setVisibility((str == null || !zBooleanValue) ? 8 : 0);
                if (((pe) ytp0Var.c).b(2)) {
                    ((ProgressBar) p1f0Var.c).setVisibility(zBooleanValue ? 0 : 8);
                }
                if (str != null) {
                    r5.animate().translationY(-(r5.getHeight() / 2.0f)).alpha(0.0f).setDuration(450L).withEndAction(new an90(new g1x0(ytp0Var, str, (byte) 9), (byte) 26)).start();
                } else {
                    r5.setVisibility(8);
                }
                r5.N0 = new uux0(ytp0Var, (byte) 1);
                break;
        }
    }

    public /* synthetic */ vgq0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public /* synthetic */ vgq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
