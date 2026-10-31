package p;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.k;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsRequest;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.home.explicitfeedback.proto.Feedback;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t7y implements r1v0, kdm, Function, k2i1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public t7y(mh4 mh4Var, tjh tjhVar, ov20 ov20Var, d0r d0rVar, String str) {
        this.a = (byte) 3;
        this.b = mh4Var;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.j(new l4r(new xv00(jd11Var.b(p6v0.class)), 2, i7z.c, new j4r(i7z.Y), i7z.d), new l4r(new wlu(jd11Var.b(jo70.class)), 2, i7z.e, new j4r(i7z.Z), i7z.f), new l4r(new xv00(jd11Var.b(zvh.class)), 2, i7z.g, new j4r(i7z.N0), i7z.h), new l4r(new xv00(jd11Var.b(ddz.class)), 2, i7z.i, new j4r(i7z.O0), i7z.t), new l4r(new xv00(jd11Var.b(prl.class)), 2, i7z.X, new j4r(i7z.P0), w4z.d1), new l4r(new xv00(jd11Var.b(mtl.class)), 2, w4z.e1, new j4r(i7z.Q0), i7z.b), mcm.e);
    }

    public static iwg i(iwg iwgVar, List list) {
        iwgVar.getClass();
        Map map = iwgVar.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new iwg(map2);
    }

    public static t7y n(LayoutInflater layoutInflater, qcy qcyVar) {
        layoutInflater.inflate(2131624585, (ViewGroup) qcyVar);
        int i = 2131428673;
        EntityActionView entityActionViewT = m5n1.t(qcyVar, 2131428673);
        if (entityActionViewT != null) {
            i = 2131428674;
            EntityActionView entityActionViewT2 = m5n1.t(qcyVar, 2131428674);
            if (entityActionViewT2 != null) {
                return new t7y((Object) qcyVar, (Object) entityActionViewT, (Object) entityActionViewT2, (byte) 1);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(qcyVar.getResources().getResourceName(i)));
        return null;
    }

    public zob1 a() {
        return (zob1) ((iu30) this.b).invoke((iac0) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02ee A[PHI: r13
      0x02ee: PHI (r13v14 java.lang.String) = (r13v3 java.lang.String), (r13v12 java.lang.String) binds: [B:74:0x02ec, B:87:0x0324] A[DONT_GENERATE, DONT_INLINE]] */
    public Object apply(Object obj) {
        spq0 spq0VarSkipTo;
        SkipToTrack skipToTrack;
        spq0 spq0VarTrackUri;
        CompletableCreate completableCreateL;
        byte b = this.a;
        String str = null;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                xgt0 xgt0Var = (xgt0) obj;
                if (!(xgt0Var instanceof wgt0)) {
                    if (xgt0Var instanceof vgt0) {
                        return Single.just(xgt0Var);
                    }
                    eg.o();
                    return null;
                }
                jd2 jd2Var = (jd2) obj2;
                PlayCommand playCommand = (PlayCommand) this.c;
                jd2Var.getClass();
                String strUri = playCommand.context().uri();
                xj61 xj61Var = jd2Var.c;
                Set set = s4b1.f;
                if (xj61Var.a.containsKey(uic.x(strUri).c)) {
                    str = strUri;
                } else {
                    PreparePlayOptions preparePlayOptions = (PreparePlayOptions) playCommand.options().h();
                    if (preparePlayOptions != null && (spq0VarSkipTo = preparePlayOptions.skipTo()) != null && (skipToTrack = (SkipToTrack) spq0VarSkipTo.h()) != null && (spq0VarTrackUri = skipToTrack.trackUri()) != null && (strUri = (String) spq0VarTrackUri.h()) != null) {
                        if (xj61Var.a.containsKey(uic.x(strUri).c)) {
                            str = strUri;
                        }
                    }
                }
                wgt0 wgt0Var = wgt0.a;
                return (str != null ? jd2Var.a.b("AgeAssurancePlayCommandInterceptor", Collections.singletonList(str), false).map(new eyh0(str, playCommand, jd2Var, (byte) 26)).onErrorReturn(uml1.d) : Single.just(wgt0Var)).onErrorReturnItem(wgt0Var);
            case 7:
                h900 h900Var = (h900) obj;
                mmr0 mmr0Var = (mmr0) this.c;
                m900 m900Var = (m900) obj2;
                if (m900Var.a(h900Var)) {
                    Logger.d("Expired concerts returned for artist: %s", new Object[]{mmr0Var.a});
                    return f900.a;
                }
                if (!(h900Var instanceof g900) && !(h900Var instanceof f900)) {
                    return h900Var;
                }
                m900Var.e.put(mmr0Var, h900Var);
                return h900Var;
            case 14:
                return ((Boolean) obj).booleanValue() ? CompletableEmpty.a : j2h1.D(o6x.a, new d610((g610) obj2, (String) this.c, (lnm) null, (byte) 0));
            case 15:
                dxu dxuVar = dxu.T0;
                p031 p031Var = (s031) obj;
                ijg ijgVar = (ijg) this.c;
                q610 q610Var = (q610) obj2;
                if (p031Var.equals(q031.a)) {
                    q610Var.getClass();
                    t031 t031VarO = RestrictedIntegrationsRequest.o();
                    t031VarO.n("not-received");
                    RestrictedIntegrationsRequest restrictedIntegrationsRequestBuild = t031VarO.build();
                    restrictedIntegrationsRequestBuild.getClass();
                    return ijgVar.a(restrictedIntegrationsRequestBuild).subscribeOn(q610Var.c).doOnSuccess(dxuVar).map(o610.b);
                }
                if (!(p031Var instanceof p031)) {
                    if (p031Var instanceof r031) {
                        return Single.just(new aqc(false, ((r031) p031Var).a));
                    }
                    eg.o();
                    return null;
                }
                RestrictedIntegrationsResponse restrictedIntegrationsResponse = p031Var.a;
                String strO = restrictedIntegrationsResponse.o();
                q610Var.getClass();
                t031 t031VarO2 = RestrictedIntegrationsRequest.o();
                t031VarO2.n(strO);
                RestrictedIntegrationsRequest restrictedIntegrationsRequestBuild2 = t031VarO2.build();
                restrictedIntegrationsRequestBuild2.getClass();
                return ijgVar.a(restrictedIntegrationsRequestBuild2).subscribeOn(q610Var.c).doOnSuccess(dxuVar).map(new jl00(p031Var, (byte) 2)).onErrorReturnItem(new aqc(false, restrictedIntegrationsResponse));
            case 20:
                xz10 xz10Var = (xz10) obj;
                b020 b020Var = (b020) obj2;
                boolean z = ((vaw) this.c).f;
                sy00 sy00Var = xz10Var.c;
                String str2 = xz10Var.a;
                PlayerState playerState = xz10Var.b;
                List list = sy00Var.a;
                if (list.isEmpty()) {
                    return Observable.just(z6x.a);
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ulu0) it.next()).a());
                }
                String strConcat = str2.concat(":recommended");
                t7y t7yVar = b020Var.b;
                String strConcat2 = str2.concat(":recommended");
                r5h r5hVar = (r5h) t7yVar.b;
                e3h e3hVarP = CollectionDecorateRequest.p();
                e3hVarP.n(arrayList);
                e3hVarP.s(strConcat2);
                e3hVarP.y((CollectionTrackDecorationPolicy) ((idd1) t7yVar.c).getValue());
                return r5hVar.b(e3hVarP.build()).map(v560.d1).toObservable().map(new hr8(b020Var, strConcat, playerState, z, list));
            case 21:
                ((fu) obj2).invoke(gs41.a);
                return new z400((ContextTrack) this.c, (Throwable) obj);
            default:
                List list3 = (List) obj;
                kp00 kp00Var = (kp00) ((uny) obj2).c;
                z460 z460Var = (z460) this.c;
                list3.getClass();
                FilterMetadataDatabase filterMetadataDatabase = (FilterMetadataDatabase) kp00Var.b;
                if (z460Var instanceof woa1) {
                    xoa1 xoa1VarX = filterMetadataDatabase.x();
                    woa1 woa1Var = (woa1) z460Var;
                    String str3 = woa1Var.a;
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new r8s0((String) it2.next()));
                    }
                    completableCreateL = m5n1.l(xoa1VarX.a, new iv81(xoa1VarX, new yoa1(str3, arrayList2, woa1Var.c, woa1Var.d, woa1Var.e, woa1Var.f, woa1Var.g), (byte) 24));
                } else if (z460Var instanceof noa1) {
                    ooa1 ooa1VarW = filterMetadataDatabase.w();
                    noa1 noa1Var = (noa1) z460Var;
                    String str4 = noa1Var.a;
                    List list5 = list3;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new r8s0((String) it3.next()));
                    }
                    completableCreateL = m5n1.l(ooa1VarW.a, new iv81(ooa1VarW, new poa1(str4, noa1Var.c, noa1Var.d, arrayList3), (byte) 22));
                } else if (z460Var instanceof fb10) {
                    gb10 gb10VarV = filterMetadataDatabase.v();
                    fb10 fb10Var = (fb10) z460Var;
                    String str5 = fb10Var.a;
                    List list6 = list3;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list6, 10));
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new r8s0((String) it4.next()));
                    }
                    completableCreateL = m5n1.l(gb10VarV.a, new f0z(gb10VarV, new hb10(str5, fb10Var.c, fb10Var.d, arrayList4), (byte) 28));
                } else {
                    if (!(z460Var instanceof za10)) {
                        eg.o();
                        return null;
                    }
                    ab10 ab10VarU = filterMetadataDatabase.u();
                    za10 za10Var = (za10) z460Var;
                    String str6 = za10Var.a;
                    List list7 = list3;
                    ArrayList arrayList5 = new ArrayList(q7h.U(list7, 10));
                    Iterator it5 = list7.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(new r8s0((String) it5.next()));
                    }
                    completableCreateL = m5n1.l(ab10VarU.a, new f0z(ab10VarU, new bb10(str6, za10Var.c, za10Var.d, arrayList5), (byte) 26));
                }
                return completableCreateL.s((Scheduler) kp00Var.c);
        }
    }

    public void b(Uri uri) {
        try {
            ((Activity) ((lan1) this.b).b).startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            Logger.e(e, "Couldn't launch external app to handle URI %s", new Object[]{uri});
            dg30 dg30Var = ((gw40) this.c).a;
            Parcelable wvfVar = new wvf(dg30Var.getString(2131953824), dg30Var.getString(2131953823), dg30Var.getString(R.string.ok), (String) null);
            dwf dwfVar = new dwf();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_KEY", wvfVar);
            dwfVar.T0(bundle);
            dwfVar.g1(dg30Var.e0(), "EXTERNAL_APP_NOT_FOUND_TAG");
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    public a2z c(i1z i1zVar, List list, int i, boolean z, lnn1 lnn1Var, h131 h131Var) {
        String str;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int iG = nbc.g(i1zVar);
        String str2 = i1zVar.a;
        g281 g281Var = i1zVar.z;
        int iC = l1d.C(iG);
        if (iC == 0) {
            return new o4z(i1zVar);
        }
        if (iC != 1) {
            if (iC != 2) {
                return null;
            }
            laz lazVar = (laz) this.b;
            l1d.C(nbc.g(i1zVar));
            return new q9z(i1zVar, ((vxr) lazVar.b).a(new kbz(g281Var != null ? g281Var.d : null, i1zVar, list, z, i == list.size() - 1, i, lnn1Var, h131Var, false, null, false)));
        }
        ogr ogrVar = (ogr) this.c;
        l1d.C(nbc.g(i1zVar));
        k9r k9rVar = (k9r) ogrVar.b;
        if (g281Var == null || (str = g281Var.d) == null) {
            str = "";
        }
        String str3 = str;
        cce cceVar = (cce) k9rVar.c;
        cceVar.d = lnn1Var;
        boolean z3 = lnn1Var instanceof i2z;
        i2z i2zVar = z3 ? (i2z) lnn1Var : null;
        if (i2zVar != null) {
            String str4 = i2zVar.c;
            if (str4.length() <= 0 || !str4.equals(str2)) {
                z2 = false;
            } else {
                i2z i2zVar2 = z3 ? (i2z) lnn1Var : null;
                if (i2zVar2 != null ? i2zVar2.g : false) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        boolean zD = cce.D((lnn1) cceVar.d, str2, (lik1) cceVar.c);
        int iO = dsa0.o(i1zVar.k, i1zVar.l);
        int iC2 = l1d.C(((jma) cceVar.b).i(i1zVar, iO, h131Var));
        if (iC2 == 0) {
            i2 = 1;
        } else if (iC2 == 1) {
            i2 = 2;
        } else {
            if (iC2 != 2) {
                eg.o();
                return null;
            }
            i2 = 3;
        }
        long j = ((long) i1zVar.q) * 1000;
        Integer num = i1zVar.r;
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z4 = z2;
        String str5 = i1zVar.c;
        int i5 = iIntValue;
        String string = ((otu) k9rVar.d).a(new y9z(str3, i1zVar.y, i1zVar.q, i5, i1zVar.s, zD, false, false, (iix0) null)).toString();
        long j2 = ((long) i5) * 1000;
        boolean z5 = i1zVar.s;
        long jS = ((long) cce.s((lnn1) cceVar.d)) * 1000;
        if (!z4) {
            WeakHashMap weakHashMap = xoi1.a;
            jS = j - Math.min(j2, j);
            if (!z5 || jS == 0) {
            }
        }
        if (zD) {
            i4 = z4 ? 3 : 4;
            i3 = 1;
        } else if (z4) {
            i3 = 1;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 2;
        }
        String strB = i1zVar.b(i3);
        ArrayList arrayListD = e4y.d((lik1) k9rVar.b, (i1z[]) list.toArray(new i1z[0]));
        boolean z6 = i1zVar.B == d1z.c;
        b9v0 b9v0VarA = i1zVar.D.a(b9v0.class);
        return new qnm(i1zVar, new unm(str5, str2, string, j, jS, i4, iO, i2, strB, arrayListD, i, z6, b9v0VarA != null ? b9v0VarA.d : false, c921.u(i1zVar.A, z), h131Var));
    }

    public boolean d(String str) {
        ((upp0) ((ynb0) this.c).get()).getClass();
        return upp0.b(str);
    }

    public void e() {
        ((ConcurrentLinkedQueue) this.c).clear();
    }

    @Override // p.r1v0
    public yrg0 f(vi11 vi11Var) {
        FrameLayout frameLayout = new FrameLayout((Context) vi11Var.f);
        llc0 llc0Var = (llc0) this.b;
        llc0Var.getClass();
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(frameLayout.getContext()).inflate(2131625118, (ViewGroup) null, false);
        int i = 2131429780;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429780);
        if (textView != null) {
            i = 2131429781;
            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131429781);
            if (recyclerViewT != null) {
                llc0Var.b = new plb0(constraintLayoutInflate, textView, recyclerViewT);
                int dimension = (int) frameLayout.getResources().getDimension(2131165967);
                plb0 plb0Var = llc0Var.b;
                if (plb0Var == null) {
                    u890.C("binding");
                    throw null;
                }
                RecyclerView recyclerView = plb0Var.c;
                recyclerView.setAdapter(llc0Var.c);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.j(new j1e(dimension, (byte) 8));
                plb0 plb0Var2 = llc0Var.b;
                if (plb0Var2 == null) {
                    u890.C("binding");
                    throw null;
                }
                plb0Var2.a.setVisibility(8);
                plb0 plb0Var3 = llc0Var.b;
                if (plb0Var3 == null) {
                    u890.C("binding");
                    throw null;
                }
                frameLayout.addView(plb0Var3.a);
                frameLayout.addOnAttachStateChangeListener(new c9s(this, vi11Var, (byte) 3));
                return new yrg0(frameLayout, (byte) 7);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public mr20 g(String str) {
        return rqt0.u(new x010(new ld2(h(Collections.singletonList(str)), str, (byte) 12), ((ux3) this.c).b(), new ce2(3, (lnm) null, (byte) 17), (byte) 1));
    }

    public mr20 h(List list) {
        return list.isEmpty() ? new huz(b7x.a, (byte) 10) : rqt0.u(new lt20(new ipr(new ht20(((qns0) this.b).c(), new qjr(2, (lnm) null, (byte) 24)), this, list, (byte) 11), new re1(3, (lnm) null, (byte) 26), (byte) 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.share.file.api.FileDownloader$DownloadException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r11 == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d6, code lost:
    
        if (p.fn31.Y(r0, r9, r1) == r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(android.net.Uri r9, p.l420 r10, p.onm r11) throws com.spotify.share.file.api.FileDownloader.DownloadException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t7y.j(android.net.Uri, p.l420, p.onm):java.lang.Object");
    }

    public void k(vu30 vu30Var) {
        Iterator it = ((ConcurrentLinkedQueue) this.c).iterator();
        int i = 0;
        while (it.hasNext()) {
            Feedback feedback = (Feedback) it.next();
            feedback.getClass();
            if (((Boolean) vu30Var.invoke(feedback, Integer.valueOf(i))).booleanValue()) {
                it.remove();
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable l(List list, onm onmVar) {
        qr00 qr00Var;
        if (onmVar instanceof qr00) {
            qr00Var = (qr00) onmVar;
            int i = qr00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qr00Var.c = i - Integer.MIN_VALUE;
            } else {
                qr00Var = new qr00(this, onmVar);
            }
        } else {
            qr00Var = new qr00(this, onmVar);
        }
        Object objA = qr00Var.a;
        int i2 = qr00Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qns0 qns0Var = (qns0) this.b;
                qr00Var.c = 1;
                objA = qns0Var.a("search", list, qr00Var, true);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            Iterable<qfd> iterable = (Iterable) objA;
            int iS = zno1.s(q7h.U(iterable, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (qfd qfdVar : iterable) {
                linkedHashMap.put(qfdVar.a, Boolean.valueOf(qfdVar.b));
            }
            return linkedHashMap;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return b7x.a;
        }
    }

    public void m(ld30 ld30Var) {
        pd30 pd30Var = (pd30) this.b;
        if (ld30Var instanceof jd30) {
            jd30 jd30Var = (jd30) ld30Var;
            pd30Var.f((hpq) this.c, jd30Var.a, jd30Var.b, jd30Var.c, jd30Var.d);
            return;
        }
        if (ld30Var instanceof id30) {
            return;
        }
        if (ld30Var instanceof hd30) {
            pd30Var.b((hpq) this.c, ((hd30) ld30Var).a);
            return;
        }
        if (!(ld30Var instanceof gd30)) {
            if (!(ld30Var instanceof kd30)) {
                eg.o();
                return;
            }
            hpq hpqVar = (hpq) this.c;
            List list = ((kd30) ld30Var).a;
            Logger.b("stopEnsureForegroundStart() private method called: service=" + hpqVar.getClass().getSimpleName() + ", reasons=" + list, new Object[0]);
            pd30Var.b(hpqVar, 2131430173);
            return;
        }
        hpq hpqVar2 = (hpq) this.c;
        Intent intent = ((gd30) ld30Var).a;
        synchronized (pd30Var) {
            if (!intent.getBooleanExtra("needs_foreground_start", false)) {
                Logger.b("Intent is not marked for foreground start, skipping", new Object[0]);
                return;
            }
            int i = pd30Var.j;
            if (i != -1) {
                md30 md30Var = (md30) pd30Var.g.get(i);
                if (md30Var != null) {
                    pd30Var.e(pd30Var.j, md30Var.a, md30Var.c, hpqVar2);
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 26) {
                    return;
                }
                Logger.b("Adding placeholder notification", new Object[0]);
                pd30Var.f(hpqVar2, 2131430173, pd30Var.b.j(), true, i2 >= 31 ? 2 : null);
            }
        }
    }

    public boolean o(int i) {
        boolean zH;
        k84 k84Var = (k84) ((l7m0) this.c).b;
        int iC = l1d.C(i);
        if (iC == 0) {
            zH = k84Var.h();
        } else if (iC == 1) {
            zH = k84Var.g();
        } else if (iC == 2) {
            zH = k84Var.i();
        } else if (iC == 3) {
            zH = k84Var.f();
        } else if (iC == 4) {
            zH = k84Var.n();
        } else {
            if (iC != 5) {
                eg.o();
                return false;
            }
            zH = k84Var.j();
        }
        return zH && ((k) ((fna) this.b).b).d() >= 9;
    }

    public rl1 p(m210 m210Var) {
        long jB = ((yqg) this.b).b();
        UUID uuidRandomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(jB);
        sb.append(uuidRandomUUID);
        return new rl1(m210Var, sb.toString(), (h241) this.c, (byte) 13);
    }

    public void q(int i, int i2, Intent intent) {
        gzc gzcVar;
        gzc gzcVar2 = (gzc) ((hzc) this.c).a.get(Integer.valueOf(i));
        if (gzcVar2 != null) {
            gzcVar2.a(intent, i2);
            return;
        }
        synchronized (hzc.b) {
            gzcVar = (gzc) hzc.c.get(Integer.valueOf(i));
        }
        if (gzcVar != null) {
            gzcVar.a(intent, i2);
        }
    }

    public void r(iwg iwgVar) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            if (entry.getKey() != null) {
                bhn0.d();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!i(iwgVar, list).equals(i((iwg) this.c, list))) {
                    throw null;
                }
            }
        }
        this.c = iwgVar;
    }

    public void s(zf30 zf30Var) {
        wf10.i(((xf10) this.b).b.getApplicationContext(), new qlr(new gi00(this, zf30Var), (byte) 3));
    }

    public Single t(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams) {
        xut0 xut0Var = (xut0) ((ynb0) this.b).get();
        String str = (String) loggingParams.interactionId().h();
        if (str == null) {
            str = "";
        }
        return rqt0.F(xut0Var.a, new ofk0(xut0Var, playOrigin, preparePlayOptions, str, (lnm) null, (byte) 28)).onErrorReturnItem(new beh("Failed to play"));
    }

    public void u(sf10 sf10Var) {
        wf10.i(((xf10) this.b).b.getApplicationContext(), new qlr(new zf10(this, sf10Var, (byte) 0), (byte) 3));
    }

    public /* synthetic */ t7y(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
    }

    public t7y(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.b = new HashMap();
                this.c = iwg.b;
                break;
            default:
                this.b = new frl1((byte) 22);
                break;
        }
    }

    public t7y(yqg yqgVar) {
        this.a = (byte) 19;
        this.b = yqgVar;
        this.c = new ConcurrentLinkedQueue();
    }

    public t7y(lcq lcqVar, uk00 uk00Var, m720 m720Var, s530 s530Var) {
        this.a = (byte) 23;
        this.b = m720Var;
        this.c = s530Var;
    }

    public t7y(xf10 xf10Var) {
        this.a = (byte) 17;
        this.b = xf10Var;
        this.c = new hzc();
    }

    public t7y(r5h r5hVar) {
        this.a = (byte) 11;
        this.b = r5hVar;
        this.c = new idd1(xy00.a);
    }

    public /* synthetic */ t7y(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public t7y(Animation animation) {
        this.a = (byte) 29;
        this.b = animation;
        this.c = null;
    }

    public t7y(Animator animator) {
        this.a = (byte) 29;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }
}
