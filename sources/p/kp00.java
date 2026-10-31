package p;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions$Builder;
import com.spotify.scrollsita.v1.Chapters;
import com.spotify.scrollsita.v1.Comments;
import com.spotify.scrollsita.v1.CompanionContent;
import com.spotify.scrollsita.v1.CulturalMoments;
import com.spotify.scrollsita.v1.GatedContent;
import com.spotify.scrollsita.v1.ListeningParty;
import com.spotify.scrollsita.v1.LiveEvents;
import com.spotify.scrollsita.v1.Lyrics;
import com.spotify.scrollsita.v1.Merch;
import com.spotify.scrollsita.v1.NpvScrollResponse;
import com.spotify.scrollsita.v1.NpvScrollStructure;
import com.spotify.scrollsita.v1.Polls;
import com.spotify.scrollsita.v1.ResponseInfo;
import com.spotify.scrollsita.v1.Section;
import com.spotify.scrollsita.v1.SmartShuffle;
import com.spotify.scrollsita.v1.Transcript;
import com.spotify.unboxingfeatureflows.api.v1.proto.Action;
import com.spotify.unboxingfeatureflows.api.v1.proto.FlowStep;
import com.spotify.unboxingfeatureflows.api.v1.proto.GetFeatureFlowRequest;
import com.spotify.unboxingfeatureflows.api.v1.proto.GetFeatureFlowResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kp00 implements rbu0, Function, il60, kir0, n6j0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public kp00(ef40 ef40Var) {
        this.a = (byte) 27;
        m220 m220Var = ef40Var.a;
        m220Var.getClass();
        Iterator it = ((rg91) m220Var.a.entrySet()).iterator();
        this.b = it;
        if (it.hasNext()) {
            this.c = (Map.Entry) it.next();
        }
    }

    public Observable a() {
        return (zia) this.b;
    }

    public Object apply(Object obj) {
        PlayerOptionOverrides playerOptionOverridesBuild;
        spq0 spq0VarPlayerOptionsOverride;
        byte b = this.a;
        char c = 3;
        String str = null;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                fgr fgrVar = ((q410) obj2).i;
                String str2 = (String) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fgrVar.getClass();
                if (!nhc1.Y(str2, "spotify:artist:", false)) {
                    return str2;
                }
                String strH0 = ihc1.H0(str2, "spotify:artist:");
                return zBooleanValue ? "spotify:list:popular-release-segments-main-roles:artist_".concat(strH0) : "spotify:list:offline-playable-artist:".concat(strH0);
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                PreparePlayOptions preparePlayOptions = (PreparePlayOptions) obj2;
                Context context = (Context) this.c;
                PreparePlayOptions$Builder builder = preparePlayOptions != null ? preparePlayOptions.toBuilder() : PreparePlayOptions.builder();
                Set set = s4b1.f;
                String strUri = context.uri();
                blc0 blc0Var = blc0.Pg;
                if (!uic.g(strUri, blc0Var) && !uic.g(context.uri(), blc0.fh) && !uic.x(context.uri()).w()) {
                    c = !zBooleanValue2 ? (char) 2 : (char) 1;
                }
                if (c != 1) {
                    boolean z = c == 2;
                    if (preparePlayOptions != null && (spq0VarPlayerOptionsOverride = preparePlayOptions.playerOptionsOverride()) != null) {
                        str = (PlayerOptionOverrides) spq0VarPlayerOptionsOverride.h();
                    }
                    if (str == null) {
                        playerOptionOverridesBuild = PlayerOptionOverrides.builder().shufflingContext(Boolean.valueOf(z)).build();
                        playerOptionOverridesBuild.getClass();
                    } else {
                        playerOptionOverridesBuild = str.toBuilder().shufflingContext(Boolean.valueOf(z)).build();
                        playerOptionOverridesBuild.getClass();
                    }
                    builder.playerOptionsOverride(playerOptionOverridesBuild);
                }
                boolean zG = uic.g(context.uri(), blc0Var);
                if (!zBooleanValue2 && zG) {
                    builder.suppressions(Suppressions.create(Collections.singleton("mft")));
                }
                return builder.build();
            case 5:
                return ((c610) obj2).i.map(new w2z(((gpw) ((ipw) obj)).a, (r9c) this.c, (byte) 11)).filter(vgp1.d1).map(b610.b);
            case 6:
                z610 z610Var = (z610) this.c;
                g710 g710Var = (g710) obj2;
                if (((sp91) obj).b != rp91.c) {
                    return g710Var.a(z610Var);
                }
                z410 z410Var = g710Var.d;
                String str3 = z610Var.a;
                PreparePlayOptions preparePlayOptions2 = z610Var.d;
                PlayOrigin playOrigin = z610Var.e;
                LoggingParams loggingParams = z610Var.f;
                if (loggingParams == null) {
                    loggingParams = LoggingParams.EMPTY;
                }
                LoggingParams loggingParams2 = loggingParams;
                loggingParams2.getClass();
                return z410Var.a(preparePlayOptions2, str3).flatMap(new ur00(z410Var, str3, loggingParams2, playOrigin, preparePlayOptions2, (byte) 1));
            case 7:
            case 8:
            case 9:
            default:
                j8x0 j8x0Var = (j8x0) obj;
                List list = j8x0Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof obx0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(obx0.a((obx0) it.next(), gbx0.a, (String) null, (String) null, (String) null, (q730) null, (Integer) null, 0, 4094));
                }
                j8x0 j8x0Var2 = (j8x0) obj2;
                Activity activity = (Activity) ((p410) this.c).b;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.addAll(j8x0Var2.b);
                if (!arrayList2.isEmpty()) {
                    List<zbx0> list2 = j8x0Var2.b;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        smc0VarN.add(new zbx0(activity.getResources().getString(2131960521)));
                    } else {
                        for (zbx0 zbx0Var : list2) {
                            if (!(zbx0Var instanceof zbx0) || !u890.j(zbx0Var.a, activity.getResources().getString(2131960521))) {
                            }
                        }
                        smc0VarN.add(new zbx0(activity.getResources().getString(2131960521)));
                    }
                }
                smc0VarN.addAll(arrayList2);
                return j8x0.a(j8x0Var, 0, k4p1.k(smc0VarN), (String) null, false, false, 0, 2, 61);
            case 10:
                return new CompletableFromAction(new bm0((uny) obj2, (pqd0) this.c, (byte) 25));
            case 11:
                ContextTrack contextTrack = (ContextTrack) obj2;
                android.content.Context context2 = ((bw8) this.c).a;
                int iC = l1d.C(prn1.j(contextTrack));
                if (iC == 0) {
                    String string = context2.getResources().getString(2131952448);
                    o9p0 o9p0VarQ = NpvScrollStructure.q();
                    bf51 bf51VarT0 = Section.t0();
                    bf51VarT0.getClass();
                    bf51VarT0.z((Lyrics) Lyrics.n().build());
                    o9p0VarQ.n(bf51VarT0.build());
                    bf51 bf51VarT1 = Section.t0();
                    bf51VarT1.getClass();
                    bf51VarT1.u(CulturalMoments.o().build());
                    o9p0VarQ.n(bf51VarT1.build());
                    bf51 bf51VarT2 = Section.t0();
                    bf51VarT2.getClass();
                    bf51VarT2.x((ListeningParty) ListeningParty.n().build());
                    o9p0VarQ.n(bf51VarT2.build());
                    bf51 bf51VarT3 = Section.t0();
                    bf51VarT3.getClass();
                    bf51VarT3.D((SmartShuffle) SmartShuffle.n().build());
                    o9p0VarQ.n(bf51VarT3.build());
                    String strA0 = l4o1.a0(contextTrack, "artist_uri");
                    if (strA0 != null) {
                        o9p0VarQ.n(ltn1.y(new ec21(strA0, string, (byte) 2)));
                    }
                    o9p0VarQ.n(ltn1.y(new lj11(contextTrack, (byte) 1)));
                    bf51 bf51VarT4 = Section.t0();
                    bf51VarT4.getClass();
                    bf51VarT4.y(LiveEvents.p().build());
                    o9p0VarQ.n(bf51VarT4.build());
                    bf51 bf51VarT5 = Section.t0();
                    bf51VarT5.getClass();
                    bf51VarT5.A(Merch.o().build());
                    o9p0VarQ.n(bf51VarT5.build());
                    n9p0 n9p0VarP = NpvScrollResponse.p();
                    wz21 wz21VarP = ResponseInfo.p();
                    wz21VarP.n();
                    n9p0VarP.n(wz21VarP.build());
                    n9p0VarP.q(o9p0VarQ.build());
                    return n9p0VarP.build();
                }
                if (iC != 1) {
                    if (iC != 2) {
                        return NpvScrollResponse.p().build();
                    }
                    String string2 = context2.getResources().getString(2131952663);
                    o9p0 o9p0VarQ2 = NpvScrollStructure.q();
                    bf51 bf51VarT6 = Section.t0();
                    bf51VarT6.getClass();
                    bf51VarT6.r((CompanionContent) CompanionContent.n().build());
                    o9p0VarQ2.n(bf51VarT6.build());
                    String str4 = (String) contextTrack.metadata().get("author_uri");
                    if (str4 != null && !ihc1.y0(str4)) {
                        str = str4;
                    }
                    if (str != null) {
                        o9p0VarQ2.n(ltn1.y(new ec21(str, string2, (byte) 1)));
                    }
                    n9p0 n9p0VarP2 = NpvScrollResponse.p();
                    wz21 wz21VarP2 = ResponseInfo.p();
                    wz21VarP2.n();
                    n9p0VarP2.n(wz21VarP2.build());
                    n9p0VarP2.q(o9p0VarQ2.build());
                    return n9p0VarP2.build();
                }
                String string3 = context2.getResources().getString(2131955574);
                String string4 = context2.getResources().getString(2131962421);
                o9p0 o9p0VarQ3 = NpvScrollStructure.q();
                bf51 bf51VarT7 = Section.t0();
                bf51VarT7.getClass();
                bf51VarT7.w((GatedContent) GatedContent.n().build());
                o9p0VarQ3.n(bf51VarT7.build());
                bf51 bf51VarT8 = Section.t0();
                bf51VarT8.getClass();
                bf51VarT8.q((Comments) Comments.n().build());
                o9p0VarQ3.n(bf51VarT8.build());
                bf51 bf51VarT9 = Section.t0();
                bf51VarT9.getClass();
                bf51VarT9.n(Chapters.q().build());
                o9p0VarQ3.n(bf51VarT9.build());
                bf51 bf51VarT10 = Section.t0();
                bf51VarT10.getClass();
                bf51VarT10.B((Polls) Polls.n().build());
                o9p0VarQ3.n(bf51VarT10.build());
                o9p0VarQ3.n(ltn1.y(new hf31(contextTrack, string3, (byte) 21)));
                String strA1 = l4o1.a0(contextTrack, "album_uri");
                if (strA1 != null) {
                    o9p0VarQ3.n(ltn1.y(new ec21(strA1, string4, (byte) 3)));
                }
                bf51 bf51VarT11 = Section.t0();
                bf51VarT11.getClass();
                bf51VarT11.r((CompanionContent) CompanionContent.n().build());
                o9p0VarQ3.n(bf51VarT11.build());
                bf51 bf51VarT12 = Section.t0();
                bf51VarT12.getClass();
                bf51VarT12.E(Transcript.o().build());
                o9p0VarQ3.n(bf51VarT12.build());
                n9p0 n9p0VarP3 = NpvScrollResponse.p();
                wz21 wz21VarP3 = ResponseInfo.p();
                wz21VarP3.n();
                n9p0VarP3.n(wz21VarP3.build());
                n9p0VarP3.q(o9p0VarQ3.build());
                return n9p0VarP3.build();
        }
    }

    public void b(int i, Object obj) {
        np00 np00Var = (np00) this.b;
        l6u0 l6u0Var = (l6u0) this.c;
        if (!u890.j(Looper.myLooper(), np00Var.b.getLooper())) {
            n57.e("Position reached event must be dispatched from the handler thread!");
        }
        np00Var.a.invoke(new f0z(np00Var, l6u0Var, (byte) 20));
        w0h1.k(np00Var.c).remove(obj);
    }

    public uzr0 c() {
        return new w2z(((il60) this.b).c(), (List) this.c, (byte) 22);
    }

    public uzr0 d(fl60 fl60Var, bl60 bl60Var) {
        return new w2z(((il60) this.b).d(fl60Var, bl60Var), (List) this.c, (byte) 22);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0128 A[SYNTHETIC] */
    public Object e(cmt cmtVar, List list, onm onmVar) {
        n020 n020Var;
        Set set;
        h471 h471Var;
        h471 h471Var2;
        Object objT;
        Set set2;
        if (onmVar instanceof n020) {
            n020Var = (n020) onmVar;
            int i = n020Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n020Var.e = i - Integer.MIN_VALUE;
            } else {
                n020Var = new n020(this, onmVar);
            }
        } else {
            n020Var = new n020(this, onmVar);
        }
        Object obj = n020Var.c;
        int i2 = n020Var.e;
        Set setV0 = w7x.a;
        if (i2 == 0) {
            hm5.M(obj);
            ua91 ua91Var = (ua91) this.c;
            dn81 dn81Var = (dn81) ua91Var.b;
            sjb sjbVar = (sjb) ua91Var.c;
            g871 g871Var = (g871) ua91Var.d;
            u690 u690Var = (u690) ua91Var.e;
            laz lazVar = new laz(cmtVar, (byte) 25);
            tym0 tym0Var = new tym0(cmtVar, (byte) 21);
            ua91 ua91Var2 = new ua91(dn81Var, sjbVar, g871Var, u690Var, cmtVar);
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((bb71) it.next()).a.c.a);
            }
            if (arrayList.isEmpty()) {
                set = setV0;
            } else {
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    hhg1.h("Empty collection can't be reduced.");
                    return null;
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = o7h.v0((Set) next, (Set) it2.next());
                }
                set = (Set) next;
            }
            it8 it8Var = (it8) this.b;
            t680 t680Var = (t680) it8Var.c;
            ArrayList arrayList2 = t680Var.a;
            if (arrayList2 == null) {
                Set setP1 = o7h.p1(((Map) ((idd1) ((drj0) it8Var.b).c).getValue()).values());
                arrayList2 = new ArrayList();
                for (Object obj2 : setP1) {
                    h471Var = (g471) obj2;
                    if (h471Var instanceof h471) {
                        h471Var2 = h471Var;
                        if (h471Var2.f() || h471Var2.a.a(h471Var2) == null) {
                        }
                    } else if (!(h471Var instanceof i471)) {
                        bhn0.B(h471Var.a(), "Unhandled destination: ");
                        return null;
                    }
                    arrayList2.add(obj2);
                }
                t680Var.a = arrayList2;
            } else {
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    Set setP2 = o7h.p1(((Map) ((idd1) ((drj0) it8Var.b).c).getValue()).values());
                    arrayList2 = new ArrayList();
                    while (r12.hasNext()) {
                        h471Var = (g471) obj2;
                        if (h471Var instanceof h471) {
                            h471Var2 = h471Var;
                            if (h471Var2.f()) {
                            }
                        } else if (!(h471Var instanceof i471)) {
                            bhn0.B(h471Var.a(), "Unhandled destination: ");
                            return null;
                        }
                        arrayList2.add(obj2);
                    }
                    t680Var.a = arrayList2;
                }
            }
            n020Var.a = list;
            n020Var.b = set;
            n020Var.e = 1;
            int iC = l1d.C(cmtVar.b);
            if (iC == 0) {
                objT = qyo1.t(arrayList2, ((cmt) tym0Var.b).a);
            } else if (iC == 1) {
                cmt cmtVar2 = (cmt) lazVar.b;
                objT = o7h.a1(qyo1.t(arrayList2, cmtVar2.a), new os6(cmtVar2.a, (byte) 1));
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                objT = ua91Var2.V(arrayList2, n020Var);
            }
            obj = objT;
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            set2 = set;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set2 = n020Var.b;
            list = n020Var.a;
            hm5.M(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : (Iterable) obj) {
            if (!set2.contains(((g471) obj3).a())) {
                arrayList3.add(obj3);
            }
        }
        if (list.size() == 1) {
            setV0 = dm61.v0(((bb71) o7h.q0(list)).a.c.a, set2);
        }
        return o7h.a1(arrayList3, new xvd(setV0, (byte) 15));
    }

    public View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625478, viewGroup, false);
        int i = 2131428493;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428493);
        if (encoreButtonT != null) {
            i = 2131430559;
            ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131430559);
            if (imageView != null) {
                i = 2131430560;
                if (m5n1.t(constraintLayoutInflate, 2131430560) != null) {
                    i = 2131431047;
                    if (((ImageView) m5n1.t(constraintLayoutInflate, 2131431047)) != null) {
                        i = 2131431356;
                        if (((TextView) m5n1.t(constraintLayoutInflate, 2131431356)) != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            ezy0 ezy0Var = new ezy0(layoutInflater.getContext().getResources().getDimensionPixelSize(2131166993), (Bitmap) this.b);
                            viewGroup.setBackgroundColor(viewGroup.getContext().getColor(2131100258));
                            imageView.setImageDrawable(ezy0Var);
                            encoreButtonT.setOnClickListener(new sis(new u830((ur00) this.c, (byte) 11), (byte) 7));
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(String str, onm onmVar, boolean z) {
        rm10 rm10Var;
        zlh0 ylh0Var;
        ur20 ur20Var;
        f10 f10Var;
        f10 vzVar;
        if (onmVar instanceof rm10) {
            rm10Var = (rm10) onmVar;
            int i = rm10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rm10Var.c = i - Integer.MIN_VALUE;
            } else {
                rm10Var = new rm10(this, onmVar);
            }
        } else {
            rm10Var = new rm10(this, onmVar);
        }
        Object objA = rm10Var.a;
        int i2 = rm10Var.c;
        ur20 ur20Var2 = null;
        if (i2 == 0) {
            hm5.M(objA);
            sm10 sm10Var = z ? (sm10) this.c : (sm10) this.b;
            en40 en40VarN = GetFeatureFlowRequest.n();
            en40VarN.n(str);
            GetFeatureFlowRequest getFeatureFlowRequestBuild = en40VarN.build();
            rm10Var.c = 1;
            objA = sm10Var.a(getFeatureFlowRequestBuild, rm10Var);
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
        GetFeatureFlowResponse getFeatureFlowResponse = (GetFeatureFlowResponse) objA;
        h290<FlowStep> h290VarO = getFeatureFlowResponse.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (FlowStep flowStep : h290VarO) {
            String title = flowStep.getTitle();
            if (flowStep.hasImageUrl()) {
                ylh0Var = new zlh0(flowStep.getImageUrl());
            } else {
                if (!flowStep.u()) {
                    ur20 ur20Var3 = ur20Var2;
                    hhg1.n("Media type not supported");
                    return ur20Var3;
                }
                ylh0Var = new ylh0(flowStep.n().getUrl(), new zlh0(flowStep.n().o()));
            }
            zlh0 zlh0Var = ylh0Var;
            String description = flowStep.getDescription();
            String tag = flowStep.getTag();
            String strR = flowStep.r();
            boolean zS = flowStep.s();
            String strT = flowStep.t();
            String strO = flowStep.o();
            if (flowStep.v()) {
                String strO2 = flowStep.p().o();
                Action actionN = flowStep.p().n();
                switch (qm10.a[actionN.p().ordinal()]) {
                    case -1:
                    case 5:
                    case 6:
                        ur20Var2 = ur20Var2;
                        f10Var = wz.a;
                        ur20Var = new ur20(strO2, f10Var);
                        break;
                    case 0:
                    default:
                        eg.o();
                        return ur20Var2;
                    case 1:
                        vzVar = new vz(actionN.o());
                        f10Var = vzVar;
                        ur20Var = new ur20(strO2, f10Var);
                        break;
                    case 2:
                        ur20Var2 = ur20Var2;
                        f10Var = iz.a;
                        ur20Var = new ur20(strO2, f10Var);
                        break;
                    case 3:
                        vzVar = new fz(actionN.o());
                        f10Var = vzVar;
                        ur20Var = new ur20(strO2, f10Var);
                        break;
                    case 4:
                        f10Var = m00.a;
                        ur20Var2 = ur20Var2;
                        ur20Var = new ur20(strO2, f10Var);
                        break;
                }
            } else {
                ur20Var2 = ur20Var2;
                ur20Var = ur20Var2;
            }
            String strQ = flowStep.q();
            if (strQ == null) {
                strQ = "";
            }
            arrayList.add(new rn10(title, tag, zlh0Var, description, ur20Var, strR, zS, strT, strO, strQ));
            ur20Var2 = ur20Var2;
        }
        return new pm10(getFeatureFlowResponse.n(), getFeatureFlowResponse.p(), mqo1.A(arrayList));
    }

    public List h() {
        return (ArrayList) this.b;
    }

    public Class i() {
        return (Class) this.c;
    }

    public void j(zf30 zf30Var) {
        zia ziaVar = (zia) this.b;
        if (!(zf30Var instanceof lir0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            ziaVar.accept(new eir0(yon1.H5(), (qir0) null, 6));
        } else {
            Observable observable = ((lir0) zf30Var).c().a;
            ((Disposable) this.c).dispose();
            this.c = observable.subscribe(ziaVar, k530.c);
        }
    }

    public void k(String str) {
        ((ohv0) this.c).a(new jhv0(((gp41) this.b).a, "facebook_generic", (String) null, str));
    }

    public void l(int i, w4c0 w4c0Var) {
        Iterator it = (Iterator) this.b;
        while (true) {
            Map.Entry entry = (Map.Entry) this.c;
            if (entry == null || ((ff40) entry.getKey()).a >= i) {
                return;
            }
            ff40 ff40Var = (ff40) ((Map.Entry) this.c).getKey();
            Object value = ((Map.Entry) this.c).getValue();
            m220 m220Var = m220.c;
            lul1 lul1Var = ff40Var.b;
            short s = ff40Var.a;
            if (ff40Var.c) {
                for (Object obj : (List) value) {
                    if (lul1Var == lul1.e) {
                        w4c0Var.a0(s, 3);
                        ((t8) obj).d(w4c0Var);
                        w4c0Var.a0(s, 4);
                    } else {
                        w4c0Var.a0(s, lul1Var.b);
                        m220.k(w4c0Var, lul1Var, obj);
                    }
                }
            } else if (lul1Var == lul1.e) {
                w4c0Var.a0(s, 3);
                ((t8) value).d(w4c0Var);
                w4c0Var.a0(s, 4);
            } else {
                w4c0Var.a0(s, lul1Var.b);
                m220.k(w4c0Var, lul1Var, value);
            }
            if (it.hasNext()) {
                this.c = (Map.Entry) it.next();
            } else {
                this.c = null;
            }
        }
    }

    public /* synthetic */ kp00(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
    }

    public kp00(t3b1 t3b1Var) {
        this.a = (byte) 20;
        this.b = new zia();
        this.c = EmptyDisposable.a;
        t3b1Var.k(new xm(this, t3b1Var, (byte) 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp00(r2p1 r2p1Var) {
        this(r2p1Var, la10.X0, (byte) 7);
        this.a = (byte) 7;
    }

    public /* synthetic */ kp00(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
