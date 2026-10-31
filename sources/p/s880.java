package p;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlay;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlay;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s880 implements qc51, Function {
    public Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public s880(Flowable flowable, w9u0 w9u0Var, ip91 ip91Var, mzr0 mzr0Var, jo91 jo91Var, ln91 ln91Var, ijr ijrVar, Scheduler scheduler, sas sasVar, sas sasVar2) {
        this.b = w9u0Var;
        this.c = ip91Var;
        this.d = mzr0Var;
        this.e = jo91Var;
        this.f = ijrVar;
        this.g = sasVar;
        this.h = sasVar2;
        this.a = new FlowableRefCount(flowable.J(bj20.Q0).t(Functions.a).X(new mre0(this, (byte) 16)).N(new j5o0(false, false, "", "", "")).W(scheduler).Q());
    }

    public static s880 e(Context context, String str, dm70 dm70Var, vhc vhcVar, String str2, String str3, d520 d520Var, p68 p68Var) {
        String strA = dm70Var.a.a(dm70Var.b);
        mta mtaVar = new mta((byte) 27);
        ep31 ep31Var = new ep31(mtaVar, (byte) 11);
        fp8 fp8Var = new fp8(d520Var);
        Locale locale = Locale.US;
        gap1 gap1Var = new gap1((byte) 8, vhcVar, f4i1.f("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str, "/settings"));
        String str4 = Build.MANUFACTURER;
        String str5 = dm70.h;
        String strI = xcg1.i(str4.replaceAll(str5, ""), "/", Build.MODEL.replaceAll(str5, ""));
        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str5, "");
        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str5, "");
        int iX = eth.x(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iX == 0) {
            iX = eth.x(context, "com.crashlytics.android.build_id", "string");
        }
        String[] strArr = {iX != 0 ? context.getResources().getString(iX) : null, str, str3, str2};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            String str6 = strArr[i];
            int i2 = i;
            if (str6 != null) {
                arrayList.add(str6.replace("-", "").toLowerCase(Locale.US));
            }
            i = i2 + 1;
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        return new s880(context, new at61(str, strI, strReplaceAll, strReplaceAll2, dm70Var, string.length() > 0 ? eth.S(string) : null, str3, str2, eqq.g(strA == null ? 1 : 4)), mtaVar, ep31Var, fp8Var, gap1Var, p68Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void a(apl aplVar, String str, String str2, boolean z, Function0 function0, w4i1 w4i1Var, qim0 qim0Var, boolean z2, boolean z3, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-243362944);
        int i2 = i | (x340Var.i(aplVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.g(w4i1Var) ? 131072 : 65536) | 1572864 | (x340Var.h(z2) ? 8388608 : 4194304) | (x340Var.h(z3) ? 67108864 : 33554432) | (x340Var.i(this) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            if (aplVar instanceof mpl) {
                x340Var.i0(-1943542786);
                String str3 = ((mpl) aplVar).a;
                tyq tyqVar = (tyq) ((idd1) this.g).getValue();
                jd6 jd6Var = (jd6) this.f;
                if (!z3) {
                    jd6Var = null;
                }
                o4o1.k(str3, tyqVar, jd6Var, z, function0, z2, x340Var, (64512 & i2) | 196608 | ((i2 >> 3) & 3670016));
                x340Var = x340Var;
                x340Var.r(false);
            } else if (aplVar instanceof wol) {
                x340Var.i0(-1943529674);
                oqn1.a((wol) aplVar, (bs40) ((idd1) this.h).getValue(), z, w4i1Var.b, x340Var, ((i2 >> 3) & 896) | (i2 & 14) | 24576);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (!(aplVar instanceof ppl)) {
                    throw p3d1.k(x340Var, -1943543930, false);
                }
                x340Var.i0(-1943521182);
                Parcelable.Creator creator = w4i1.CREATOR;
                sio1.i(str, str2, (ppl) aplVar, z, (wmh0) ((idd1) this.a).getValue(), w4i1Var, x340Var, (i2 & 458752) | ((i2 >> 3) & 126) | ((i2 << 6) & 896) | (i2 & 7168) | 1572864);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zoe(this, aplVar, str, str2, z, function0, w4i1Var, qim0Var2, z2, z3, i);
        }
    }

    public Object apply(Object obj) {
        gn10 gn10Var;
        List list = (List) obj;
        upz upzVarN = EsPlay.PlayRequest.n();
        bo91 bo91Var = (bo91) this.b;
        cmz cmzVarP = EsContext.Context.p();
        cmzVarP.t((String) this.c);
        String str = (String) this.d;
        bo91Var.getClass();
        String strConcat = "context://".concat(str);
        if (!list.isEmpty()) {
            strConcat = f4i1.f(strConcat, "?spotify-apply-lenses=", o7h.y0(list, ",", (String) null, (String) null, (iu30) null, 62));
        }
        cmzVarP.u(strConcat);
        EsContext.Context contextBuild = cmzVarP.build();
        EsPlayOrigin.PlayOrigin playOrigin = (EsPlayOrigin.PlayOrigin) this.e;
        String str2 = (String) this.f;
        String str3 = (String) this.g;
        kqz kqzVar = (kqz) this.h;
        jqz jqzVarN = EsPreparePlay.PreparePlayRequest.n();
        jqzVarN.n(contextBuild);
        if (playOrigin == null) {
            String uri = contextBuild.getUri();
            zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
            q7j0 q7j0Var = bo91Var.k;
            if (q7j0.c(uri)) {
                gn10Var = mno1.O;
            } else {
                if (!q7j0Var.b(uri)) {
                    eg.m("Could not resolve feature identifier");
                    return null;
                }
                gn10Var = mno1.m;
            }
            zpzVarY.s(gn10Var.getName());
            playOrigin = (EsPlayOrigin.PlayOrigin) zpzVarY.build();
        }
        jqzVarN.r(playOrigin);
        lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
        imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
        ppz ppzVarN = EsOptional.OptionalBoolean.n();
        ppzVarN.n(true);
        imzVarO.t(ppzVarN.build());
        imzVarO.q("context_enhancement", "RECOMMENDATION");
        lqzVarS.x(imzVarO.build());
        if (str2 != null || str3 != null) {
            wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
            if (str2 != null) {
                wrzVarP.t(str2);
            }
            if (str3 != null) {
                wrzVarP.s(str3);
            }
            lqzVarS.D(wrzVarP);
        }
        if (kqzVar != null) {
            lqzVarS.t(kqzVar);
        }
        jqzVarN.q(lqzVarS.build());
        upzVarN.r(jqzVarN.build());
        String str4 = (String) this.a;
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        cozVarR.n(str4);
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(bo91Var.i.b());
        cozVarR.s(qpzVarP.build());
        y6r0 y6r0Var = bo91Var.h.get();
        String str5 = y6r0Var != null ? y6r0Var.a : null;
        if (str5 == null) {
            str5 = "";
        }
        cozVarR.q(str5);
        upzVarN.n(cozVarR.build());
        EsPlay.PlayRequest playRequestBuild = upzVarN.build();
        ujm ujmVar = bo91Var.a;
        playRequestBuild.getClass();
        Completable completableFlatMapCompletable = ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Play", playRequestBuild).map(een.Z0).doOnSuccess(w841.Y0).flatMapCompletable(new q881(bo91Var, (byte) 5));
        CompletableError completableErrorJ = Completable.j(new TimeoutException());
        completableFlatMapCompletable.getClass();
        return completableFlatMapCompletable.t(5L, TimeUnit.SECONDS, Schedulers.b, completableErrorJ).g(ps4.Y0).h(w841.Z0);
    }

    /* JADX WARN: Code duplicated, block: B:398:0x0d7f  */
    /* JADX WARN: Code duplicated, block: B:515:0x0d82 A[SYNTHETIC] */
    @Override // p.qc51
    public lw41 b(pc51 pc51Var, lw41 lw41Var) {
        List list;
        ezb1 ezb1Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        String str3;
        String str4;
        xlf1 w2v0Var;
        xlf1 ona0Var;
        xlf1 un8Var;
        List list2;
        String str5;
        boolean z5;
        boolean z6;
        boolean z7;
        z6x z6xVar;
        lle lleVar;
        boolean z8;
        String str6;
        d8r0 d8r0Var;
        int i;
        z6x z6xVarSingletonList;
        d8r0 d8r0Var2;
        o5a o5aVar;
        xaz0 xaz0Var = (xaz0) this.h;
        int size = pc51Var.b;
        fw41 fw41Var = pc51Var.j;
        m131 m131Var = pc51Var.e;
        boolean z9 = m131Var.a || m131Var.b;
        boolean z10 = fw41Var.e;
        e7r0 e7r0Var = pc51Var.h;
        d8r0 d8r0Var3 = new d8r0(e7r0Var.a, e7r0Var.b.c, e7r0Var.c, e7r0Var.e);
        z851 z851Var = pc51Var.a;
        boolean z11 = z851Var instanceof z851;
        z6x z6xVarK = z6x.a;
        if (z11) {
            pvp0 pvp0Var = z851Var.a;
            if (pvp0Var.a() == 0) {
                return xaz0Var.j(d8r0Var3);
            }
            cqp0 cqp0Var = (cqp0) this.a;
            Resources resources = cqp0Var.a;
            di4 di4Var = cqp0Var.b;
            cqp0Var.c = 0;
            zxp0 zxp0Var = pvp0Var.b;
            z6x z6xVar2 = zxp0Var != null ? zxp0Var.a : z6xVarK;
            nrp0 nrp0Var = pvp0Var.c;
            z6x z6xVar3 = nrp0Var != null ? nrp0Var.a : z6xVarK;
            gup0 gup0Var = pvp0Var.d;
            z6x z6xVar4 = gup0Var != null ? gup0Var.a : z6xVarK;
            ArrayList<znp0> arrayList = pvp0Var.e;
            ArrayList arrayList2 = new ArrayList();
            Collection collection = (Collection) (((Collection) z6xVar2).isEmpty() ? z6xVarK : Collections.singletonList(cqp0.a("tracks", di4Var.j0() ? 2131961542 : 2131961543, d8r0Var3)));
            Iterable iterable = (Iterable) z6xVar2;
            ArrayList arrayList3 = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                pxp0 pxp0Var = (pxp0) it.next();
                di4 di4Var2 = di4Var;
                String strM = l1d.m("offline-track-", pxp0Var.a);
                String str7 = pxp0Var.a;
                Iterator it2 = it;
                String str8 = pxp0Var.b;
                String str9 = pxp0Var.i;
                z6x z6xVar5 = z6xVar3;
                sxp0 sxp0Var = pxp0Var.e;
                String strJ0 = bmq0.j0(str9, sxp0Var != null ? sxp0Var.a : null);
                String str10 = pxp0Var.c;
                int i2 = pxp0Var.g ? 1 : pxp0Var.f ? 2 : 3;
                int i3 = cqp0Var.c;
                cqp0Var.c = i3 + 1;
                d8r0 d8r0Var4 = d8r0Var3;
                d8r0Var3 = d8r0Var4;
                arrayList3.add(new qvp0(strM, d8r0Var3, new wvp0(str7, str8, strJ0, str10, 1, i2, pxp0Var.h, d8r0Var4, i3)));
                di4Var = di4Var2;
                it = it2;
                z6xVar3 = z6xVar5;
            }
            di4 di4Var3 = di4Var;
            z6x z6xVar6 = z6xVar3;
            arrayList2.addAll(o7h.N0(arrayList3, collection));
            Collection collection2 = (Collection) (((Collection) z6xVar6).isEmpty() ? z6xVarK : Collections.singletonList(cqp0.a("episodes", di4Var3.j0() ? 2131961540 : 2131961537, d8r0Var3)));
            Iterable iterable2 = (Iterable) z6xVar6;
            ArrayList arrayList4 = new ArrayList(q7h.U(iterable2, 10));
            Iterator it3 = iterable2.iterator();
            while (it3.hasNext()) {
                lrp0 lrp0Var = (lrp0) it3.next();
                String strM2 = l1d.m("offline-episode-", lrp0Var.a);
                String str11 = lrp0Var.a;
                String str12 = lrp0Var.b;
                Iterator it4 = it3;
                String string = resources.getString(2131961520);
                String str13 = lrp0Var.c;
                int i4 = lrp0Var.e ? 1 : lrp0Var.d ? 2 : 3;
                int i5 = cqp0Var.c;
                cqp0Var.c = i5 + 1;
                d8r0 d8r0Var5 = d8r0Var3;
                d8r0Var3 = d8r0Var5;
                arrayList4.add(new qvp0(strM2, d8r0Var3, new wvp0(str11, str12, string, str13, 3, i4, false, d8r0Var5, i5)));
                it3 = it4;
            }
            arrayList2.addAll(o7h.N0(arrayList4, collection2));
            Collection collection3 = (Collection) (((Collection) z6xVar4).isEmpty() ? z6xVarK : Collections.singletonList(cqp0.a("playlists", di4Var3.j0() ? 2131961541 : 2131961538, d8r0Var3)));
            Iterable<eup0> iterable3 = (Iterable) z6xVar4;
            ArrayList arrayList5 = new ArrayList(q7h.U(iterable3, 10));
            for (eup0 eup0Var : iterable3) {
                String strM3 = l1d.m("offline-playlist-", eup0Var.a);
                String str14 = eup0Var.a;
                String str15 = eup0Var.b;
                String string2 = resources.getString(2131961528);
                String str16 = eup0Var.c;
                int i6 = cqp0Var.c;
                cqp0Var.c = i6 + 1;
                d8r0 d8r0Var6 = d8r0Var3;
                d8r0Var3 = d8r0Var6;
                arrayList5.add(new qvp0(strM3, d8r0Var3, new wvp0(str14, str15, string2, str16, 4, 3, false, d8r0Var6, i6)));
                resources = resources;
            }
            arrayList2.addAll(o7h.N0(arrayList5, collection3));
            if (!arrayList.isEmpty()) {
                z6xVarK = Collections.singletonList(cqp0.a("albums", di4Var3.j0() ? 2131961539 : 2131961536, d8r0Var3));
            }
            Collection collection4 = (Collection) z6xVarK;
            ArrayList arrayList6 = new ArrayList(q7h.U(arrayList, 10));
            for (znp0 znp0Var : arrayList) {
                String strM4 = l1d.m("offline-album-", znp0Var.a);
                String str17 = znp0Var.a;
                String str18 = znp0Var.b;
                String str19 = znp0Var.g;
                String str20 = znp0Var.c;
                int i7 = znp0Var.f ? 1 : znp0Var.e ? 2 : 3;
                int i8 = cqp0Var.c;
                cqp0Var.c = i8 + 1;
                d8r0 d8r0Var7 = d8r0Var3;
                d8r0Var3 = d8r0Var7;
                arrayList6.add(new qvp0(strM4, d8r0Var3, new wvp0(str17, str18, str19, str20, 2, i7, false, d8r0Var7, i8)));
            }
            arrayList2.addAll(o7h.N0(arrayList6, collection4));
            return new jw41(arrayList2);
        }
        if (!(z851Var instanceof a951)) {
            if (z851Var instanceof b951) {
                b951 b951Var = (b951) z851Var;
                return (b951Var.a.isEmpty() && b951Var.b.isEmpty()) ? xaz0Var.i(pc51Var.k instanceof ral, fw41Var.c, fw41Var.f, fw41Var.g, d8r0Var3) : new jw41(((m39) this.d).b(b951Var, d8r0Var3));
            }
            if (z851Var instanceof y851) {
                return new jw41(z6xVarK);
            }
            if (u890.j(z851Var, u851.a)) {
                return kw41.a;
            }
            if (z851Var instanceof w851) {
                return new jw41(((w29) this.e).a((w851) z851Var, d8r0Var3, pc51Var.i, fw41Var.e, z9, pc51Var.c, m131Var.c, m131Var.d));
            }
            if (z851Var instanceof x851) {
                x851 x851Var = (x851) z851Var;
                return new jw41(((ov41) this.f).a(x851Var, d8r0Var3, pc51Var.i, x851Var.a.a, pc51Var.c));
            }
            if (z851Var instanceof s851) {
                return ((up41) this.b).m((s851) z851Var, d8r0Var3);
            }
            eg.o();
            return null;
        }
        riq0 riq0Var = ((a951) z851Var).a;
        boolean z12 = riq0Var instanceof riq0;
        int i9 = 1;
        lle lleVar2 = lle.c;
        String str21 = "-";
        if (!z12) {
            int i10 = 1;
            if (!(riq0Var instanceof qiq0)) {
                eg.o();
                return null;
            }
            qiq0 qiq0Var = (qiq0) riq0Var;
            List list3 = qiq0Var.b;
            k851 k851Var = (k851) o7h.q0(list3);
            if (k851Var.b.a.isEmpty()) {
                return xaz0Var.h(k851Var.a, d8r0Var3);
            }
            c351 c351Var = (c351) this.c;
            List list4 = list3;
            if (lw41Var != null && size == 0) {
                size = list3.size();
            }
            List<k851> listK0 = o7h.k0(list4, size);
            ArrayList arrayList7 = new ArrayList(q7h.U(listK0, 10));
            for (k851 k851Var2 : listK0) {
                ArrayList arrayList8 = k851Var2.b.a;
                xo20 xo20Var = qiq0Var.a;
                String str22 = k851Var2.a;
                z6x z6xVar7 = qiq0Var.c;
                if (z6xVar7 == null) {
                    z6xVar7 = z6xVarK;
                }
                arrayList7.add(new b351(arrayList8, xo20Var, str22, z6xVar7));
            }
            boolean z13 = lw41Var instanceof jw41;
            int size2 = z13 ? ((jw41) lw41Var).a.size() : 0;
            boolean z14 = m131Var.c;
            boolean z15 = m131Var.d;
            ArrayList arrayList9 = new ArrayList();
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                b351 b351Var = (b351) it5.next();
                ezb1 ezb1Var2 = c351Var.a;
                String str23 = b351Var.c;
                boolean z16 = z13;
                boolean zY = d0p1.Y(b351Var.d, b351Var.b);
                ArrayList arrayList10 = b351Var.a;
                ArrayList arrayList11 = new ArrayList();
                Iterator it6 = arrayList10.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    Iterator it7 = it6;
                    ei90 ei90Var = ((lby) next).e;
                    int i11 = size2;
                    if (!(ei90Var instanceof k39) && !(ei90Var instanceof yf51)) {
                        arrayList11.add(next);
                    }
                    it6 = it7;
                    size2 = i11;
                }
                int i12 = size2;
                ArrayList arrayList12 = new ArrayList();
                Iterator it8 = arrayList11.iterator();
                int i13 = 0;
                while (it8.hasNext()) {
                    Object next2 = it8.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        p7h.T();
                        throw null;
                    }
                    lby lbyVar = (lby) next2;
                    int i15 = i13 + i12;
                    Iterator it9 = it8;
                    String str24 = lbyVar.a;
                    Iterator it10 = it5;
                    jjf1 jjf1Var = lbyVar.e;
                    boolean z17 = z14;
                    String strN = ab80.n("filter-", "-", i15, str24);
                    if (jjf1Var instanceof jjf1) {
                        ezb1 ezb1Var3 = ezb1Var2;
                        boolean z18 = z15;
                        String str25 = str23;
                        plf1 plf1VarI = ezb1Var3.i(lbyVar, jjf1Var, z10, z9, d8r0Var3, str25, i15, zY, z17, z18);
                        ezb1Var = ezb1Var3;
                        z = z10;
                        boolean z19 = zY;
                        z3 = z17;
                        z2 = z18;
                        w2v0Var = new xlf1(strN, d8r0Var3, plf1VarI);
                        z4 = z19;
                        str4 = str25;
                    } else {
                        ezb1Var = ezb1Var2;
                        z = z10;
                        boolean z20 = zY;
                        z2 = z15;
                        z3 = z17;
                        String str26 = str23;
                        if (jjf1Var instanceof cu7) {
                            yzu yzuVar = c351Var.b;
                            cu7 cu7Var = (cu7) jjf1Var;
                            tb51 tb51Var = (tb51) yzuVar.a;
                            tb51Var.getClass();
                            boolean z21 = z9;
                            d8r0 d8r0Var8 = d8r0Var3;
                            d8r0Var3 = d8r0Var8;
                            z9 = z21;
                            w2v0Var = yon1.E5(yzuVar.u(lbyVar, cu7Var, d8r0Var8, str26, tb51.i(tb51Var, lbyVar, z20, false, 4).toString(), i15, z21, z2, null, null), strN, d8r0Var3);
                            z4 = z20;
                            str4 = str26;
                        } else {
                            z4 = z20;
                            z2 = z2;
                            if (jjf1Var instanceof fww0) {
                                d8r0 d8r0Var9 = d8r0Var3;
                                str = str26;
                                d8r0Var3 = d8r0Var9;
                                w2v0Var = new u0x0(strN, d8r0Var3, new s0x0(lbyVar.a, lbyVar.b, ((tb51) c351Var.c.b).c(lbyVar).toString(), lbyVar.c, ((fww0) jjf1Var).a, str26, d8r0Var9, i15));
                            } else {
                                str = str26;
                                if (jjf1Var instanceof ji40) {
                                    w2v0Var = new ui40(strN, d8r0Var3, c351Var.d.m(lbyVar, d8r0Var3, str, i15));
                                } else if (jjf1Var instanceof jb6) {
                                    d8r0 d8r0Var10 = d8r0Var3;
                                    str4 = str;
                                    d8r0Var3 = d8r0Var10;
                                    z4 = z4;
                                    w2v0Var = new xl6(strN, d8r0Var3, c351Var.e.c(lbyVar, (jb6) jjf1Var, z, d8r0Var10, str4, i15));
                                    z2 = z2;
                                } else if (jjf1Var instanceof i53) {
                                    d8r0 d8r0Var11 = d8r0Var3;
                                    n63 n63Var = c351Var.f;
                                    str4 = str;
                                    s63 s63VarA = n63Var.a(lbyVar, (i53) jjf1Var, z, d8r0Var11, str4, n63Var.a.c(lbyVar).toString(), i15, (Integer) null, (String) null);
                                    z = z;
                                    d8r0Var3 = d8r0Var11;
                                    z4 = z4;
                                    z2 = z2;
                                    w2v0Var = new d73(strN, d8r0Var3, s63VarA);
                                } else if (jjf1Var instanceof tfu0) {
                                    z = z;
                                    yeu0 yeu0Var = c351Var.g;
                                    z4 = z4;
                                    boolean zB = ((fza1) yeu0Var.c).b(lbyVar.a);
                                    d8r0 d8r0Var12 = d8r0Var3;
                                    str4 = str;
                                    d8r0Var3 = d8r0Var12;
                                    w2v0Var = new lhu0(strN, d8r0Var3, new fhu0(lbyVar.a, lbyVar.b, tb51.i((tb51) yeu0Var.b, lbyVar, false, zB, 2), lbyVar.c, str4, d8r0Var12, i15, ((tfu0) jjf1Var).c, (Integer) null, (String) null, zB, lbyVar.g));
                                    z2 = z2;
                                } else {
                                    z4 = z4;
                                    if (jjf1Var instanceof v68) {
                                        z = z;
                                        zwg zwgVar = c351Var.h;
                                        boolean z22 = z9;
                                        d8r0 d8r0Var13 = d8r0Var3;
                                        x78 x78VarT = zwgVar.t(lbyVar, (v68) jjf1Var, z22, d8r0Var13, str, ((tb51) zwgVar.a).c(lbyVar).toString(), i15, (Integer) null, (String) null);
                                        str2 = str;
                                        d8r0Var3 = d8r0Var13;
                                        z9 = z22;
                                        un8Var = new e88(strN, d8r0Var3, x78VarT);
                                    } else if (jjf1Var instanceof tm8) {
                                        z = z;
                                        str2 = str;
                                        un8Var = new un8(strN, d8r0Var3, c351Var.i.a(lbyVar, d8r0Var3, str2, i15));
                                    } else {
                                        if (jjf1Var instanceof k48) {
                                            z = z;
                                            str2 = str;
                                            d8r0 d8r0Var14 = d8r0Var3;
                                            str3 = str2;
                                            d8r0Var3 = d8r0Var14;
                                            ona0Var = new k381(strN, d8r0Var3, scx0.a(c351Var.j, lbyVar, (k48) jjf1Var, d8r0Var14, str3, i15));
                                        } else {
                                            str3 = str2;
                                            if (jjf1Var instanceof i6k) {
                                                z = z;
                                                str2 = str;
                                                d8r0 d8r0Var15 = d8r0Var3;
                                                d8r0Var3 = d8r0Var15;
                                                ona0Var = new hfk(strN, d8r0Var3, c351Var.k.b(lbyVar, (i6k) jjf1Var, d8r0Var15, str3, i15, (Integer) null, (String) null));
                                            } else if (jjf1Var instanceof xui1) {
                                                z = z;
                                                str2 = str;
                                                d8r0 d8r0Var16 = d8r0Var3;
                                                d8r0Var3 = d8r0Var16;
                                                ona0Var = new wvi1(strN, d8r0Var3, ltf1.h(c351Var.l, lbyVar, (xui1) jjf1Var, d8r0Var16, str3, i15));
                                            } else if (jjf1Var instanceof yma0) {
                                                z = z;
                                                str2 = str;
                                                d8r0 d8r0Var17 = d8r0Var3;
                                                v6a0 v6a0Var = c351Var.m;
                                                sna0 sna0VarR = v6a0Var.r(lbyVar, (yma0) jjf1Var, d8r0Var17, str3, tb51.g((tb51) v6a0Var.b, lbyVar), i15);
                                                d8r0Var3 = d8r0Var17;
                                                ona0Var = new ona0(strN, d8r0Var3, sna0VarR);
                                            } else if (jjf1Var instanceof o2v0) {
                                                o2v0 o2v0Var = (o2v0) jjf1Var;
                                                if (o2v0Var.t == lleVar2 && c351Var.o.Q()) {
                                                    String str27 = o2v0Var.i;
                                                    if (str27 == null) {
                                                        z = z;
                                                        str2 = str;
                                                        str27 = lbyVar.c;
                                                    }
                                                    z = z;
                                                    str2 = str;
                                                    z3 = z3;
                                                    z2 = z2;
                                                    str4 = str3;
                                                    w2v0Var = new xlf1(strN, d8r0Var3, ezb1Var.i(lby.a(lbyVar, str27, (jjf1) null, 123), t6p1.q(o2v0Var), z, z9, d8r0Var3, str3, i15, z4, z3, z2));
                                                    i10 = i10;
                                                } else {
                                                    z = z;
                                                    str2 = str;
                                                    z = z;
                                                    str2 = str;
                                                    str4 = str3;
                                                    z2 = z2;
                                                    z3 = z3;
                                                    d8r0 d8r0Var18 = d8r0Var3;
                                                    i10 = i10;
                                                    boolean z23 = z9;
                                                    d8r0Var3 = d8r0Var18;
                                                    z9 = z23;
                                                    w2v0Var = new w2v0(strN, d8r0Var3, c351Var.n.j(lbyVar, o2v0Var, d8r0Var18, str4, i15, i10, z23, z2));
                                                }
                                            } else {
                                                str4 = str3;
                                                z2 = z2;
                                                i10 = i10;
                                                z3 = z3;
                                                if (!(jjf1Var instanceof k39) && !(jjf1Var instanceof yf51)) {
                                                    z = z;
                                                    str2 = str;
                                                    eg.o();
                                                    return null;
                                                }
                                                z = z;
                                                str2 = str;
                                                z = z;
                                                str2 = str;
                                                w2v0Var = null;
                                            }
                                        }
                                        w2v0Var = ona0Var;
                                        str4 = str3;
                                        z2 = z2;
                                    }
                                    w2v0Var = un8Var;
                                    str4 = str2;
                                    z2 = z2;
                                }
                                if (w2v0Var != null) {
                                    arrayList12.add(w2v0Var);
                                }
                                it8 = it9;
                                i10 = i10;
                                z15 = z2;
                                z14 = z3;
                                str23 = str4;
                                i13 = i14;
                                it5 = it10;
                                ezb1Var2 = ezb1Var;
                                zY = z4;
                                z10 = z;
                            }
                            str4 = str;
                            i10 = i10;
                            if (w2v0Var != null) {
                                arrayList12.add(w2v0Var);
                            }
                            it8 = it9;
                            i10 = i10;
                            z15 = z2;
                            z14 = z3;
                            str23 = str4;
                            i13 = i14;
                            it5 = it10;
                            ezb1Var2 = ezb1Var;
                            zY = z4;
                            z10 = z;
                        }
                        z3 = z3;
                        if (w2v0Var != null) {
                            arrayList12.add(w2v0Var);
                        }
                        it8 = it9;
                        i10 = i10;
                        z15 = z2;
                        z14 = z3;
                        str23 = str4;
                        i13 = i14;
                        it5 = it10;
                        ezb1Var2 = ezb1Var;
                        zY = z4;
                        z10 = z;
                    }
                    z3 = z3;
                    if (w2v0Var != null) {
                        arrayList12.add(w2v0Var);
                    }
                    it8 = it9;
                    i10 = i10;
                    z15 = z2;
                    z14 = z3;
                    str23 = str4;
                    i13 = i14;
                    it5 = it10;
                    ezb1Var2 = ezb1Var;
                    zY = z4;
                    z10 = z;
                }
                size2 = arrayList12.size() + i12;
                r7h.W(arrayList12, arrayList9);
                z14 = z14;
                z13 = z16;
            }
            boolean z24 = z13;
            smc0 smc0VarN = k4p1.n();
            jw41 jw41Var = z24 ? (jw41) lw41Var : null;
            if (jw41Var != null && (list = jw41Var.a) != null) {
                smc0VarN.addAll(list);
            }
            smc0VarN.addAll(arrayList9);
            return new jw41(k4p1.k(smc0VarN));
        }
        List list5 = riq0Var.a;
        k851 k851Var3 = (k851) o7h.q0(list5);
        if (k851Var3.b.a.isEmpty() && k851Var3.b.d == null) {
            return xaz0Var.h(k851Var3.a, d8r0Var3);
        }
        sd51 sd51Var = (sd51) this.g;
        ezb1 ezb1Var4 = sd51Var.i;
        int i16 = pc51Var.i;
        String str28 = pc51Var.c;
        String str29 = pc51Var.d;
        boolean z25 = m131Var.c;
        boolean z26 = m131Var.d;
        di4 di4Var4 = sd51Var.r;
        smc0 smc0VarN2 = k4p1.n();
        if (!list5.isEmpty()) {
            String str30 = ((k851) list5.get(0)).a;
            String str31 = str28;
            if (i16 == 2 || (o5aVar = ((k851) list5.get(0)).b.d) == null) {
                list2 = list5;
                str5 = str30;
            } else {
                list2 = list5;
                String strM5 = l1d.m("secondstep-banner-", o5aVar.a);
                qwi0 qwi0Var = new qwi0(o5aVar.b, o5aVar.c, o5aVar.d, o5aVar.e, o5aVar.a, str30, d8r0Var3, !((k851) o7h.q0(list2)).b.a.isEmpty());
                str5 = str30;
                d8r0Var3 = d8r0Var3;
                smc0VarN2.add(new owi0(strM5, d8r0Var3, qwi0Var));
            }
            List list6 = list2;
            ArrayList arrayList13 = new ArrayList();
            Iterator it11 = list6.iterator();
            while (it11.hasNext()) {
                k851 k851Var4 = (k851) it11.next();
                List list7 = list6;
                boolean z27 = z26;
                Iterator it12 = it11;
                boolean z28 = z25;
                ArrayList arrayList14 = new ArrayList(q7h.U(k851Var4.b.a, 10));
                for (Iterator it13 = r2.iterator(); it13.hasNext(); it13 = it13) {
                    arrayList14.add(new mmr0((lby) it13.next(), k851Var4.a));
                }
                r7h.W(arrayList14, arrayList13);
                list6 = list7;
                it11 = it12;
                z25 = z28;
                z26 = z27;
            }
            List list8 = list6;
            boolean z29 = z26;
            boolean z30 = z25;
            ArrayList arrayList15 = new ArrayList();
            for (Object obj : arrayList13) {
                ei90 ei90Var2 = ((lby) ((mmr0) obj).a).e;
                if ((ei90Var2 instanceof i53) || (ei90Var2 instanceof jb6) || (ei90Var2 instanceof cu7) || (ei90Var2 instanceof k48) || (ei90Var2 instanceof v68) || (ei90Var2 instanceof tm8) || (ei90Var2 instanceof ji40) || (ei90Var2 instanceof tfu0) || (ei90Var2 instanceof fww0) || (ei90Var2 instanceof yf51) || (ei90Var2 instanceof jjf1) || (ei90Var2 instanceof i6k) || (ei90Var2 instanceof yma0) || (ei90Var2 instanceof xui1) || (ei90Var2 instanceof o2v0)) {
                    arrayList15.add(obj);
                } else if (!(ei90Var2 instanceof k39)) {
                    eg.o();
                    return null;
                }
            }
            ArrayList arrayList16 = new ArrayList();
            Iterator it14 = arrayList15.iterator();
            int i17 = 0;
            while (it14.hasNext()) {
                Object next3 = it14.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    p7h.T();
                    throw null;
                }
                mmr0 mmr0Var = (mmr0) next3;
                lby lbyVar2 = (lby) mmr0Var.a;
                String str32 = (String) mmr0Var.b;
                String str33 = lbyVar2.a;
                Iterator it15 = it14;
                i53 i53Var = lbyVar2.e;
                String strN2 = ab80.n("secondstep-", str21, i17, str33);
                int i19 = i17;
                if (u890.j(lbyVar2.f, dby.a) && (i53Var instanceof i53)) {
                    d8r0 d8r0Var19 = d8r0Var3;
                    d8r0Var3 = d8r0Var19;
                    z6xVarSingletonList = Collections.singletonList(new ud60(strN2, d8r0Var3, sd51Var.m.w(lbyVar2, d8r0Var19, str32, i19, z10)));
                } else {
                    if (i53Var instanceof i53) {
                        d8r0 d8r0Var20 = d8r0Var3;
                        d8r0Var3 = d8r0Var20;
                        z6xVarSingletonList = Collections.singletonList(new d73(strN2, d8r0Var3, n63.b(sd51Var.a, lbyVar2, i53Var, z10, d8r0Var20, str32, i19)));
                    } else {
                        if (i53Var instanceof jb6) {
                            d8r0 d8r0Var21 = d8r0Var3;
                            boolean z31 = z10;
                            z7 = z31;
                            d8r0Var3 = d8r0Var21;
                            z6xVarSingletonList = Collections.singletonList(new xl6(strN2, d8r0Var3, sd51Var.b.a(lbyVar2, (jb6) i53Var, z31, d8r0Var21, str32, i19, (Integer) null, (String) null)));
                            z6xVar = z6xVarK;
                            lleVar = lleVar2;
                        } else {
                            z7 = z10;
                            if (i53Var instanceof v68) {
                                z6xVar = z6xVarK;
                                str6 = str21;
                                boolean z32 = z9;
                                d8r0 d8r0Var22 = d8r0Var3;
                                x78 x78VarU = zwg.u(sd51Var.c, lbyVar2, (v68) i53Var, z32, d8r0Var22, str32, i19);
                                d8r0Var2 = d8r0Var22;
                                z9 = z32;
                                lleVar = lleVar2;
                                z6xVarSingletonList = Collections.singletonList(new e88(strN2, d8r0Var2, x78VarU));
                            } else {
                                z6xVar = z6xVarK;
                                lle lleVar3 = lleVar2;
                                String str34 = str21;
                                if (i53Var instanceof k48) {
                                    d8r0 d8r0Var23 = d8r0Var3;
                                    d8r0Var2 = d8r0Var23;
                                    z6xVarSingletonList = Collections.singletonList(new k381(strN2, d8r0Var2, scx0.a(sd51Var.d, lbyVar2, (k48) i53Var, d8r0Var23, str32, i19)));
                                } else if (i53Var instanceof tfu0) {
                                    d8r0 d8r0Var24 = d8r0Var3;
                                    d8r0Var2 = d8r0Var24;
                                    z6xVarSingletonList = Collections.singletonList(new lhu0(strN2, d8r0Var2, yeu0.k(sd51Var.g, lbyVar2, (tfu0) i53Var, d8r0Var24, str32, i19)));
                                } else {
                                    str21 = str34;
                                    if (i53Var instanceof fww0) {
                                        d8r0 d8r0Var25 = d8r0Var3;
                                        d8r0Var3 = d8r0Var25;
                                        z6xVarSingletonList = Collections.singletonList(new u0x0(strN2, d8r0Var3, new s0x0(lbyVar2.a, lbyVar2.b, tb51.g((tb51) sd51Var.h.b, lbyVar2), lbyVar2.c, ((fww0) i53Var).a, str32, d8r0Var25, i19)));
                                        lleVar = lleVar3;
                                    } else {
                                        if (i53Var instanceof jjf1) {
                                            str6 = str21;
                                            z8 = z29;
                                            lleVar = lleVar3;
                                            z6xVarSingletonList = Collections.singletonList(new xlf1(strN2, d8r0Var3, ezb1Var4.h(lbyVar2, (jjf1) i53Var, z7, z9, d8r0Var3, str32, i19, (Integer) null, (String) null, z30, z8)));
                                        } else {
                                            lleVar = lleVar3;
                                            z8 = z29;
                                            if (i53Var instanceof cu7) {
                                                str6 = str21;
                                                d8r0 d8r0Var26 = d8r0Var3;
                                                boolean z33 = z9;
                                                d8r0Var3 = d8r0Var26;
                                                z9 = z33;
                                                z6xVarSingletonList = Collections.singletonList(yon1.E5(yzu.E(sd51Var.e, lbyVar2, (cu7) i53Var, d8r0Var26, str32, i19, z33, z8), strN2, d8r0Var3));
                                            } else if (i53Var instanceof ji40) {
                                                d8r0 d8r0Var27 = d8r0Var3;
                                                d8r0Var3 = d8r0Var27;
                                                z6xVarSingletonList = Collections.singletonList(new ui40(strN2, d8r0Var3, bm00.l(sd51Var.f, lbyVar2, (ji40) i53Var, d8r0Var27, str32, i19)));
                                                str6 = str21;
                                                d8r0Var = d8r0Var3;
                                                i = i9;
                                            } else if (i53Var instanceof yf51) {
                                                lby lbyVar3 = lbyVar2;
                                                String str35 = str21;
                                                String str36 = str31;
                                                boolean z34 = z9;
                                                d8r0 d8r0Var28 = d8r0Var3;
                                                List listS = sd51Var.k.s((yf51) i53Var, lbyVar2.b, i19, d8r0Var28, str32, str36, z7, z34, z30, z8);
                                                d8r0Var3 = d8r0Var28;
                                                str31 = str36;
                                                z10 = z7;
                                                z9 = z34;
                                                z29 = z8;
                                                List list9 = listS;
                                                z6x arrayList17 = new ArrayList(q7h.U(list9, 10));
                                                int i20 = 0;
                                                for (Object obj2 : list9) {
                                                    int i21 = i20 + 1;
                                                    if (i20 < 0) {
                                                        p7h.T();
                                                        throw null;
                                                    }
                                                    arrayList17.add(yon1.E5((cwl) obj2, "secondstep-" + lbyVar3.a + "-section-" + i20, d8r0Var3));
                                                    str35 = str35;
                                                    lbyVar3 = lbyVar3;
                                                    i20 = i21;
                                                }
                                                str6 = str35;
                                                z6xVarSingletonList = arrayList17;
                                                z7 = z10;
                                                d8r0Var = d8r0Var3;
                                                z8 = z29;
                                                i = i9;
                                            } else {
                                                str31 = str31;
                                                z29 = z8;
                                                z10 = z7;
                                                if (i53Var instanceof tm8) {
                                                    str21 = str21;
                                                    z6xVarSingletonList = Collections.singletonList(new un8(strN2, d8r0Var3, sd51Var.l.a(lbyVar2, d8r0Var3, str32, i19)));
                                                } else if (i53Var instanceof i6k) {
                                                    str21 = str21;
                                                    d8r0 d8r0Var29 = d8r0Var3;
                                                    d8r0Var3 = d8r0Var29;
                                                    z6xVarSingletonList = Collections.singletonList(new hfk(strN2, d8r0Var3, sd51Var.n.b(lbyVar2, (i6k) i53Var, d8r0Var29, str32, i19, (Integer) null, (String) null)));
                                                } else if (i53Var instanceof xui1) {
                                                    str21 = str21;
                                                    d8r0 d8r0Var30 = d8r0Var3;
                                                    d8r0Var3 = d8r0Var30;
                                                    z6xVarSingletonList = Collections.singletonList(new wvi1(strN2, d8r0Var3, ltf1.h(sd51Var.o, lbyVar2, (xui1) i53Var, d8r0Var30, str32, i19)));
                                                } else if (i53Var instanceof yma0) {
                                                    str21 = str21;
                                                    d8r0 d8r0Var31 = d8r0Var3;
                                                    v6a0 v6a0Var2 = sd51Var.p;
                                                    sna0 sna0VarR2 = v6a0Var2.r(lbyVar2, (yma0) i53Var, d8r0Var31, str32, tb51.g((tb51) v6a0Var2.b, lbyVar2), i19);
                                                    d8r0Var3 = d8r0Var31;
                                                    z6xVarSingletonList = Collections.singletonList(new ona0(strN2, d8r0Var3, sna0VarR2));
                                                } else if (i53Var instanceof o2v0) {
                                                    o2v0 o2v0Var2 = (o2v0) i53Var;
                                                    if (o2v0Var2.t == lleVar && di4Var4.Q()) {
                                                        String str37 = o2v0Var2.i;
                                                        if (str37 == null) {
                                                            str21 = str21;
                                                            str37 = lbyVar2.c;
                                                        }
                                                        str21 = str21;
                                                        lby lbyVarA = lby.a(lbyVar2, str37, (jjf1) null, 123);
                                                        str6 = str21;
                                                        z8 = z29;
                                                        z7 = z10;
                                                        z6xVarSingletonList = Collections.singletonList(new xlf1(strN2, d8r0Var3, ezb1Var4.h(lbyVarA, t6p1.q(o2v0Var2), z10, z9, d8r0Var3, str32, i19, (Integer) null, (String) null, z30, z8)));
                                                        d8r0Var = d8r0Var3;
                                                        i = i9;
                                                    } else {
                                                        str21 = str21;
                                                        str21 = str21;
                                                        str6 = str21;
                                                        z7 = z10;
                                                        z8 = z29;
                                                        boolean z35 = z9;
                                                        d8r0 d8r0Var32 = d8r0Var3;
                                                        int i22 = i9;
                                                        u2v0 u2v0VarJ = sd51Var.q.j(lbyVar2, o2v0Var2, d8r0Var32, str32, i19, i22, z35, z8);
                                                        d8r0Var = d8r0Var32;
                                                        i = i22;
                                                        z9 = z35;
                                                        z6xVarSingletonList = Collections.singletonList(new w2v0(strN2, d8r0Var, u2v0VarJ));
                                                    }
                                                } else {
                                                    str21 = str21;
                                                    str6 = str21;
                                                    z7 = z10;
                                                    d8r0Var = d8r0Var3;
                                                    z8 = z29;
                                                    i = i9;
                                                    n57.e("Unsupported entity type in top results: " + rc11.a.b(i53Var.getClass()));
                                                    z6xVarSingletonList = z6xVar;
                                                }
                                                str6 = str21;
                                                z7 = z10;
                                                d8r0Var = d8r0Var3;
                                                z8 = z29;
                                                i = i9;
                                            }
                                        }
                                        d8r0Var = d8r0Var3;
                                        i = i9;
                                    }
                                }
                                lleVar = lleVar3;
                                str6 = str34;
                            }
                            d8r0Var = d8r0Var2;
                            z8 = z29;
                            i = i9;
                        }
                        str6 = str21;
                        d8r0Var = d8r0Var3;
                        z8 = z29;
                        i = i9;
                    }
                    r7h.W((Iterable) z6xVarSingletonList, arrayList16);
                    lleVar2 = lleVar;
                    str21 = str6;
                    d8r0Var3 = d8r0Var;
                    str31 = str31;
                    i9 = i;
                    z6xVarK = z6xVar;
                    it14 = it15;
                    i17 = i18;
                    z10 = z7;
                    z29 = z8;
                }
                str31 = str31;
                z6xVar = z6xVarK;
                lleVar = lleVar2;
                str6 = str21;
                z7 = z10;
                d8r0Var = d8r0Var3;
                z8 = z29;
                i = i9;
                r7h.W((Iterable) z6xVarSingletonList, arrayList16);
                lleVar2 = lleVar;
                str21 = str6;
                d8r0Var3 = d8r0Var;
                str31 = str31;
                i9 = i;
                z6xVarK = z6xVar;
                it14 = it15;
                i17 = i18;
                z10 = z7;
                z29 = z8;
            }
            String str38 = str31;
            boolean z36 = z10;
            d8r0 d8r0Var33 = d8r0Var3;
            boolean z37 = z29;
            smc0VarN2.addAll(arrayList16);
            ArrayList arrayList18 = new ArrayList();
            Iterator it16 = list8.iterator();
            while (it16.hasNext()) {
                r7h.W(((k851) it16.next()).b.a, arrayList18);
            }
            lby lbyVar4 = (lby) o7h.s0(arrayList18);
            xy01 xy01Var = ((k851) o7h.q0(list2)).b.c;
            if (lbyVar4 == null || xy01Var == null) {
                z5 = true;
            } else {
                ArrayList arrayListE = sd51Var.j.e(xy01Var, lbyVar4, d8r0Var33, str5);
                ArrayList arrayList19 = new ArrayList(q7h.U(arrayListE, 10));
                int i23 = 0;
                for (Object obj3 : arrayListE) {
                    int i24 = i23 + 1;
                    if (i23 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList19.add(yon1.E5((cwl) obj3, "secondstep-recs-" + i23, d8r0Var33));
                    i23 = i24;
                }
                z5 = true;
                smc0VarN2.addAll(1 > arrayList16.size() ? arrayList16.size() : 1, arrayList19);
            }
            ArrayList arrayList20 = new ArrayList();
            Iterator it17 = list8.iterator();
            while (it17.hasNext()) {
                r7h.W(((k851) it17.next()).b.a, arrayList20);
            }
            if (arrayList20.isEmpty()) {
                z6 = false;
                break;
            }
            Iterator it18 = arrayList20.iterator();
            while (true) {
                if (!it18.hasNext()) {
                    z6 = false;
                    break;
                }
                yf51 yf51Var = ((lby) it18.next()).e;
                if ((yf51Var instanceof yf51) && yf51Var.b == 12) {
                    z6 = z5;
                    break;
                }
            }
            if (di4Var4.l() && di4Var4.j() && z6) {
                smc0VarN2.add(o7h.s0(smc0VarN2) instanceof owi0 ? 1 : 0, new fco("secondstep-crossword-overview", d8r0Var33, new sbo("spotify:search", 0, d8r0Var33, str5, (String) null, (String) null, fg91.b, (String) null, (List) null, (String) null, new qbo(str38, str29, z36, z9, z30, z37), 1792)));
            }
            z6xVarK = k4p1.k(smc0VarN2);
        }
        return new jw41(z6xVarK);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    public Notification c(PlayerState playerState, String str, Bitmap bitmap, Boolean bool, s6g1 s6g1Var) {
        tbu0 tbu0Var;
        String strF0;
        PendingIntent activity;
        zo5 zo5Var = (zo5) this.f;
        idd1 idd1Var = (idd1) this.a;
        i35 i35Var = (i35) this.g;
        Context context = (Context) this.b;
        Iterator it = ((b3h) this.c).a.iterator();
        do {
            if (!it.hasNext()) {
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            }
            tbu0Var = (tbu0) it.next();
        } while (!tbu0Var.e(playerState, s6g1Var));
        List<ojo0> listD = tbu0Var.d(playerState, bool);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listD) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            Integer numValueOf = ((ojo0) obj).c ? Integer.valueOf(i) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i = i2;
        }
        int[] iArrK1 = o7h.k1(arrayList);
        if (iArrK1.length > 3) {
            eg.m("Can't have more than 3 compact actions!");
            return null;
        }
        SpannableString spannableStringB = tbu0Var.b(playerState, s6g1Var);
        SpannableString spannableStringA = tbu0Var.a(playerState, s6g1Var);
        SpannableString spannableString = str != null ? new SpannableString(Html.fromHtml(context.getResources().getString(2131954219, str), 63)) : tbu0Var.c(playerState);
        boolean z = str == null && !playerState.isPaused();
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        String str2 = s6g1Var.g;
        if (str2 == null) {
            contextTrack.getClass();
            strF0 = l4o1.f0(contextTrack);
            if (strF0 == null) {
                strF0 = "";
            }
        } else {
            strF0 = str2.length() > 0 ? str2 : null;
            if (strF0 == null) {
                contextTrack.getClass();
                strF0 = l4o1.f0(contextTrack);
                if (strF0 == null) {
                    strF0 = "";
                }
            }
        }
        StringBuilder sb = new StringBuilder(strF0);
        contextTrack.getClass();
        String strL = l4o1.l(contextTrack);
        if (strL.length() > 0) {
            sb.append(" — ");
            sb.append(strL);
        }
        String string = sb.toString();
        dko0 dko0Var = new dko0(context, "playback_channel");
        if (i35Var.a()) {
            activity = (PendingIntent) ((idd1) this.h).getValue();
        } else {
            Intent intentA = ((xs80) this.d).a(context);
            intentA.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
            intentA.setFlags(805306368);
            activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
        }
        dko0Var.g = activity;
        Notification notification = dko0Var.D;
        notification.icon = 2131233418;
        dko0Var.m(bitmap);
        dko0Var.j(spannableStringB);
        dko0Var.i(spannableStringA);
        dko0Var.m = dko0.d(spannableString);
        notification.deleteIntent = i35Var.a() ? (PendingIntent) idd1Var.getValue() : zo5Var.a(AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE, new Bundle());
        dko0Var.l(2, z);
        notification.when = 0L;
        dko0Var.v = 1;
        dko0Var.l(8, true);
        dko0Var.s(string);
        dko0Var.u = context.getColor(2131102443);
        for (ojo0 ojo0Var : listD) {
            vjo0 vjo0Var = ojo0Var.a;
            dko0Var.a(vjo0Var.a, ojo0Var.b, context.getResources().getString(vjo0Var.b));
        }
        jko0 jko0Var = new jko0();
        jko0Var.f = ((d6b1) this.e).a().a();
        if (i35Var.a()) {
        } else {
            zo5Var.a(AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE, new Bundle());
        }
        jko0Var.e = Arrays.copyOf(iArrK1, iArrK1.length);
        dko0Var.r(jko0Var);
        return dko0Var.c();
    }

    public nm1 d(iu30 iu30Var) {
        j3r j3rVar = rzq.y;
        rzq rzqVarF = l2p1.f((dv00) this.d);
        int dimensionPixelSize = ((Context) this.e).getResources().getDimensionPixelSize(2131166942);
        wgi0 wgi0Var = (wgi0) this.b;
        ipd0 ipd0Var = ((sw41) this.h).c;
        cgi0 cgi0Var = cgi0.g;
        kpg0 kpg0Var = new kpg0(wgi0Var.b(rzqVarF, new beh0(this, (byte) 0), ipd0Var, null, new uei0(false, new har0(dimensionPixelSize), true, false, false, false, true, false, false, 7673), new wei0(false, true, 4), (16384 & 64) != 0 ? new cgi0(63) : cgi0Var, (16384 & 128) != 0 ? z7i0.g : new beh0(this, (byte) 1), (16384 & 256) != 0 ? null : null, (16384 & 512) != 0 ? null : null, (16384 & 1024) != 0 ? null : null, (16384 & 2048) != 0 ? null : null, (ojv0) this.c, (16384 & 8192) != 0 ? null : null, (16384 & 16384) != 0 ? null : new k2g0(iu30Var, (byte) 5)), zdh0.Z);
        return new nm1(rzqVarF, new szj(kpg0Var, kpg0Var.a()), (kly0) this.a);
    }

    public cpf1 f(qzh qzhVar) {
        return new cpf1((FlowableMap) this.b, (d0r) this.c, (xrn0) this.d, (yna0) this.e, (kof1) this.f, (Resources) this.g, ((ln4) this.h).a(), (vbs) this.a, qzhVar);
    }

    public jgb1 g() {
        int i;
        jed0 jed0Var = (jed0) this.e;
        hgd0 hgd0Var = (hgd0) this.b;
        if (hgd0Var.l()) {
            i = 2131957440;
        } else {
            i = hgd0Var.n() ? 2131957441 : 2131957439;
        }
        Integer numValueOf = Integer.valueOf(i);
        cg60 cg60Var = new cg60(jed0Var.d(), (byte) 4);
        c0g.x.getClass();
        cxo1 cxo1Var = cxo1.P0;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new cg60(jed0Var.d(), (byte) 5));
        smc0VarN.add(new pzs(new mnc0(((b7n) this.c).a(r6n.a), (byte) 17), 2131957445, (byte) 19));
        if (!hgd0Var.d()) {
            smc0VarN.add(new pzs(new mnc0(((ov20) this.d).c("campfire", "DISABLED_CANNOT_ENABLE"), (byte) 18), 2131957444, (byte) 19));
        }
        mr20[] mr20VarArr = (mr20[]) k4p1.k(smc0VarN).toArray(new mr20[0]);
        return new jgb1("listeningActivity", 2131957442, (String) null, numValueOf, (sp00) null, (Integer) null, (a2i) null, cg60Var, cxo1Var, jmo1.e((mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length)), new ibd1(new xad1(41, false), new ebd1(ecd0.U0, new ugd0(this, (byte) 0), x5d0.X, new k2d0(this, (byte) 6))), Collections.singletonMap("listeningActivityToggleOn", new ugd0(this, (byte) 1)), 4026);
    }

    public kqw h(tcr0 tcr0Var, zob1 zob1Var, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, mr20 mr20Var) {
        qcr0 qcr0Var = qcr0.a;
        vfr0 vfr0Var = (vfr0) tcr0Var.a(qcr0Var);
        String str = vfr0Var.a;
        h3h1 h3h1Var = new h3h1(new ymg1(this, (byte) 9));
        j4h1 j4h1Var = new j4h1(new lhx((b160) this.e, (kko) tcr0Var.a(kcr0.a), zob1Var, new j060(str, vfr0Var.b, vfr0Var.d), (byte) 14));
        ne neVar = (ne) this.d;
        jto jtoVarI = new ham(new fjc1(neVar, (byte) 10), new ccb1(tcr0Var, neVar, (byte) 24), (byte) 17).i();
        x8c0 lifecycle = ((iac0) neVar.b).getLifecycle();
        lifecycle.a(new zh0(new nda1(0, jtoVarI, jto.class, "dispose", "dispose()V", 0, (byte) 20), lifecycle, (byte) 11));
        k4h1 k4h1Var = new k4h1(new kj21(jtoVarI, neVar, tcr0Var, new w3l0("", ((vfr0) tcr0Var.a(qcr0Var)).a), (byte) 18));
        hoc hocVar = (hoc) this.h;
        iac0 iac0VarH = x9p1.h(viewGroup);
        qe41 qe41VarW = hm5.w(viewGroup);
        if (iac0VarH == null) {
            hhg1.n("Page should have lifecycleOwner");
            return null;
        }
        if (qe41VarW == null) {
            hhg1.n("Page should have SavedStateRegistry");
            return null;
        }
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131626290, viewGroup, false);
        x9p1.p(coordinatorLayoutInflate, iac0VarH);
        hocVar.b(coordinatorLayoutInflate);
        return new kqw(str, coordinatorLayoutInflate, k4h1Var, j4h1Var, h3h1Var, qe41VarW, mr20Var, bundle);
    }

    public jm61 i(int i) throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        try {
            if (l1d.d(2, i)) {
                return null;
            }
            fp8 fp8Var = (fp8) this.e;
            Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                File file = (File) fp8Var.b;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(eth.T(fileInputStream));
                    } catch (Exception unused) {
                        eth.k(fileInputStream);
                        jSONObject = null;
                    } catch (Throwable th) {
                        th = th;
                        eth.k(fileInputStream);
                        throw th;
                    }
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    fileInputStream = null;
                    jSONObject = null;
                }
                eth.k(fileInputStream);
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            if (jSONObject == null) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                return null;
            }
            jm61 jm61VarG = (jSONObject.getInt("settings_version") != 3 ? new hfb((byte) 7) : new sjb((byte) 24)).g((mta) ((ep31) this.d).b, jSONObject);
            jSONObject.toString();
            Log.isLoggable("FirebaseCrashlytics", 3);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!l1d.d(3, i) && jm61VarG.c < jCurrentTimeMillis) {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return null;
            }
            try {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return jm61VarG;
            } catch (Exception unused3) {
                return jm61VarG;
            }
        } catch (Exception unused4) {
            return null;
        }
    }

    public LinkedHashSet j() {
        ky50 ky50Var = (ky50) ((b160) this.e).i.getValue();
        ex50 ex50Var = ky50Var.a;
        xw50 xw50Var = ex50Var.a;
        bkj0 bkj0Var = xw50Var.a;
        bkj0 bkj0Var2 = xw50Var.b;
        bkj0 bkj0Var3 = xw50Var.c;
        bkj0 bkj0Var4 = xw50Var.d;
        cx50 cx50Var = ex50Var.b;
        List listI0 = f46.i0(new bkj0[]{bkj0Var, bkj0Var2, bkj0Var3, bkj0Var4, null, cx50Var != null ? cx50Var.a : null, cx50Var != null ? cx50Var.b : null, ex50Var.c, ky50Var.b, ky50Var.c, ky50Var.d});
        ArrayList arrayList = new ArrayList();
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            r7h.W(((bkj0) it.next()).b, arrayList);
        }
        return dm61.y0(o7h.p1(arrayList), c13.i(xkk1.class));
    }

    public hfp1 k() {
        return ((bsd1) ((AtomicReference) this.a).get()).a;
    }

    public jm61 l() {
        return (jm61) ((AtomicReference) this.h).get();
    }

    public hfp1 m(uo5 uo5Var) throws Throwable {
        jm61 jm61VarI;
        AtomicReference atomicReference = (AtomicReference) this.a;
        AtomicReference atomicReference2 = (AtomicReference) this.h;
        if (((Context) this.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((at61) this.c).f) && (jm61VarI = i(1)) != null) {
            atomicReference2.set(jm61VarI);
            ((bsd1) atomicReference.get()).d(jm61VarI);
            return o0c.z((Object) null);
        }
        jm61 jm61VarI2 = i(3);
        if (jm61VarI2 != null) {
            atomicReference2.set(jm61VarI2);
            ((bsd1) atomicReference.get()).d(jm61VarI2);
        }
        p68 p68Var = (p68) this.g;
        return fc11.Z(((bsd1) p68Var.g).a, p68Var.n()).k((djn) uo5Var.b, new nn61(this, uo5Var, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (p.hap1.i(1000, r1) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(p.onm r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.dg30 r0 = (p.dg30) r0
            boolean r1 = r7 instanceof p.s0w0
            if (r1 == 0) goto L17
            r1 = r7
            p.s0w0 r1 = (p.s0w0) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.c = r2
            goto L1c
        L17:
            p.s0w0 r1 = new p.s0w0
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.a
            int r2 = r1.c
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            p.hm5.M(r7)
            goto L58
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L35:
            p.hm5.M(r7)
            goto L45
        L39:
            p.hm5.M(r7)
            r1.c = r4
            java.lang.Object r7 = r6.o(r1)
            if (r7 != r5) goto L45
            goto L57
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L94
            r1.c = r3
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = p.hap1.i(r2, r1)
            if (r7 != r5) goto L58
        L57:
            return r5
        L58:
            java.lang.Object r6 = r6.d
            p.dto0 r6 = (p.dto0) r6
            p.uwy0 r7 = new p.uwy0
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131960388(0x7f132244, float:1.9557443E38)
            java.lang.String r1 = r1.getString(r2)
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131960385(0x7f132241, float:1.9557437E38)
            java.lang.String r2 = r2.getString(r3)
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131960387(0x7f132243, float:1.9557441E38)
            java.lang.String r3 = r3.getString(r4)
            android.content.res.Resources r4 = r0.getResources()
            r5 = 2131960386(0x7f132242, float:1.955744E38)
            java.lang.String r4 = r4.getString(r5)
            r7.<init>(r1, r2, r3, r4)
            p.xuv0 r1 = p.xuv0.a1
            p.hxy0 r2 = p.hxy0.NPV_PRERELEASE_PRESAVE_BUTTON
            r6.c(r0, r2, r7, r1)
        L94:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s880.n(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(onm onmVar) {
        t0w0 t0w0Var;
        if (onmVar instanceof t0w0) {
            t0w0Var = (t0w0) onmVar;
            int i = t0w0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t0w0Var.c = i - Integer.MIN_VALUE;
            } else {
                t0w0Var = new t0w0(this, onmVar);
            }
        } else {
            t0w0Var = new t0w0(this, onmVar);
        }
        Object objO = t0w0Var.a;
        int i2 = t0w0Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            r0w0 r0w0Var = new r0w0(this, null, (byte) 1);
            t0w0Var.c = 1;
            objO = rc2.O(2000L, r0w0Var, t0w0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        Boolean bool = (Boolean) objO;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    public s880(kly0 kly0Var, pe peVar, gw70 gw70Var, mpp mppVar, dxy dxyVar, ppp pppVar, q8n q8nVar, q8n q8nVar2) {
        this.b = kly0Var;
        this.c = peVar;
        this.d = gw70Var;
        this.e = mppVar;
        this.f = dxyVar;
        this.g = pppVar;
        this.a = q8nVar;
        this.h = q8nVar2;
    }

    public s880(Flowable flowable, HorizontalScrollView horizontalScrollView, View view, View view2, View view3, FrameLayout frameLayout, dtw dtwVar) {
        this.b = flowable;
        this.c = horizontalScrollView;
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.g = frameLayout;
        this.h = dtwVar;
        this.a = new rku();
    }

    public s880(d0r d0rVar, awb1 awb1Var, sgq sgqVar, tgq tgqVar, jd6 jd6Var) {
        this.b = d0rVar;
        this.c = awb1Var;
        this.d = sgqVar;
        this.e = tgqVar;
        this.f = jd6Var;
        this.g = new idd1(new jg31(this, (byte) 2));
        this.h = new idd1(new jg31(this, (byte) 0));
        this.a = new idd1(new jg31(this, (byte) 1));
    }

    public s880(esw eswVar, iu30 iu30Var, di4 di4Var, y751 y751Var) {
        this.b = di4Var;
        this.c = new d9b0(eswVar, iu30Var);
        this.d = new p8b0(eswVar, iu30Var);
        this.e = new o860(eswVar, iu30Var, di4Var, y751Var, (byte) 19);
        this.f = new w8b0(eswVar, iu30Var);
        this.g = new p8b0(eswVar, iu30Var);
        this.h = new w8b0(eswVar, iu30Var);
        this.a = new d9b0(eswVar, iu30Var);
    }

    public s880(Context context, i8h1 i8h1Var, jjz jjzVar, bfd bfdVar, dg30 dg30Var, kt91 kt91Var, rm5 rm5Var) {
        this.b = context;
        this.c = i8h1Var;
        this.d = jjzVar;
        this.e = bfdVar;
        this.f = dg30Var;
        this.g = kt91Var;
        this.h = rm5Var;
        this.a = new idd1(n521.e);
    }

    public s880(Single single, q1n0 q1n0Var, i1n0 i1n0Var, n6r0 n6r0Var, zrj1 zrj1Var) {
        blc0 blc0Var = lqm1.a;
        this.b = single;
        this.c = q1n0Var;
        this.d = i1n0Var;
        this.e = n6r0Var;
        this.f = zrj1Var;
    }

    public s880(lzn0 lzn0Var, dg30 dg30Var, dto0 dto0Var, s4w0 s4w0Var, q8n q8nVar) {
        this.b = lzn0Var;
        this.c = dg30Var;
        this.d = dto0Var;
        this.e = s4w0Var;
        this.a = q8nVar;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960399});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.f = new er91((fs91) null, "", 2131960399, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
    }

    public s880(i8h1 i8h1Var, hvp0 hvp0Var) {
        this.b = i8h1Var;
        this.c = hvp0Var;
        this.d = new idd1(h0x0.h);
        this.e = new idd1(h0x0.i);
        this.f = new idd1(h0x0.e);
        this.g = new idd1(h0x0.f);
        this.h = new idd1(h0x0.d);
        this.a = new idd1(h0x0.g);
    }

    public s880(l1o l1oVar, t9h1 t9h1Var, ne neVar, b160 b160Var, q8n q8nVar, l9p l9pVar, frr frrVar, hoc hocVar) {
        this.b = l1oVar;
        this.c = t9h1Var;
        this.d = neVar;
        this.e = b160Var;
        this.a = q8nVar;
        this.f = l9pVar;
        this.g = frrVar;
        this.h = hocVar;
    }

    public s880(v8n0 v8n0Var, v8n0 v8n0Var2, a1r0 a1r0Var, am30 am30Var, ynb0 ynb0Var, q8n q8nVar, ff81 ff81Var) {
        this.b = v8n0Var;
        this.c = v8n0Var2;
        this.d = a1r0Var;
        this.e = am30Var;
        this.f = ynb0Var;
        this.a = q8nVar;
        this.g = ff81Var;
    }

    public s880(Context context, b3h b3hVar, xs80 xs80Var, d6b1 d6b1Var, zo5 zo5Var, yxp yxpVar, i35 i35Var) {
        this.b = context;
        this.c = b3hVar;
        this.d = xs80Var;
        this.e = d6b1Var;
        this.f = zo5Var;
        this.g = i35Var;
        this.h = new idd1(new u0u0(this, (byte) 1));
        new idd1(new u0u0(this, (byte) 2));
        this.a = new idd1(new u0u0(this, (byte) 0));
    }

    public /* synthetic */ s880(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.a = obj8;
    }

    public s880(ftr ftrVar, Context context, iw01 iw01Var, iw01 iw01Var2, bb01 bb01Var, agc0 agc0Var, cua cuaVar, vh4 vh4Var) {
        this.b = ftrVar;
        this.c = context;
        this.d = iw01Var;
        this.e = iw01Var2;
        this.f = bb01Var;
        this.g = agc0Var;
        this.h = vh4Var;
        this.a = new SimpleDateFormat(cy30.o("EEEE", cy30.o("MMMM", ((SimpleDateFormat) DateFormat.getDateInstance(0, Locale.getDefault())).toPattern(), "MMM"), "EEE"), Locale.getDefault());
    }

    public s880(Context context, at61 at61Var, mta mtaVar, ep31 ep31Var, fp8 fp8Var, gap1 gap1Var, p68 p68Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.a = new AtomicReference(new bsd1());
        this.b = context;
        this.c = at61Var;
        this.d = ep31Var;
        this.e = fp8Var;
        this.f = gap1Var;
        this.g = p68Var;
        atomicReference.set(hfb.j(mtaVar));
    }

    public s880(Activity activity, r880 r880Var, RetrofitMaker retrofitMaker, luk lukVar, yqg yqgVar, q8n q8nVar, cir0 cir0Var, jc9 jc9Var) {
        this.b = activity;
        this.c = r880Var;
        this.d = retrofitMaker;
        this.e = lukVar;
        this.f = yqgVar;
        this.g = cir0Var;
        this.h = jc9Var;
        this.a = q8nVar;
    }

    public s880(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, yqg yqgVar, kvs0 kvs0Var, rh11 rh11Var, u4q0 u4q0Var, a1r0 a1r0Var) {
        this.b = flowable;
        this.c = flowable2;
        this.d = w9u0Var;
        this.f = yqgVar;
        this.e = kvs0Var;
        this.g = rh11Var;
        this.h = u4q0Var;
        this.a = a1r0Var;
    }
}
