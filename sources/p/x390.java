package p;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.carmobile.jumpstart.events.proto.JumpstartError;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.endless.sessionstarter.EndlessActivity;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x390 implements xe90, xi7, Function, Function5 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public x390(ViewGroup viewGroup) {
        this.a = (byte) 18;
        while (!u890.j(viewGroup.getTag(), 2131430188)) {
            ViewParent parent = viewGroup.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                viewGroup = null;
                break;
            }
        }
        if (viewGroup == null) {
            eg.m("Failed to find parent");
            throw null;
        }
        View viewFindViewById = viewGroup.findViewById(2131427918);
        if (viewFindViewById != null) {
            this.b = viewFindViewById;
        } else {
            eg.m("Failed to find carousel_item_safe_barrier_bottom");
            throw null;
        }
    }

    public static /* bridge */ /* synthetic */ hx40 a(x390 x390Var) {
        return (hx40) x390Var.c;
    }

    public void A(gfh0 gfh0Var) {
        ((hrr0) this.c).setValue(gfh0Var);
    }

    public void B(float f, wat watVar, c9n c9nVar) {
        if (f <= watVar.X0(1.0f)) {
            return;
        }
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            float fFloatValue = ((Number) ((ie5) this.c).b.getValue()).floatValue();
            xab1 xab1Var = (xab1) this.b;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            ie5 ie5Var = (ie5) this.c;
            if (ie5Var.f) {
                this.c = prn1.l(ie5Var, fFloatValue - f, 0.0f, 30);
            } else {
                this.c = new ie5(rno1.a, Float.valueOf(-f), (oe5) null, 60);
            }
            this.b = fn31.T(c9nVar, (o8n) null, 0, new no70(this, (lnm) null, (byte) 22), 3);
        } finally {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
        }
    }

    public Object apply(Object obj) {
        EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsP;
        String str;
        Single map;
        Matcher matcher;
        zzg1 zzg1Var;
        byte b = 28;
        boolean z = false;
        switch (this.a) {
            case 6:
                PlayerState playerState = (PlayerState) obj;
                aet0 aet0Var = (aet0) this.b;
                String str2 = aet0Var.a;
                String str3 = aet0Var.b;
                yz90 yz90Var = (yz90) this.c;
                if (str3 == null ? u890.j(playerState.contextUri(), str2) && playerState.isPlaying() && !playerState.isPaused() : u890.j(playerState.contextUri(), str2) && playerState.isPlaying() && !playerState.isPaused() && u890.j(((ContextTrack) playerState.track().b()).uri(), str3)) {
                    return CompletableEmpty.a;
                }
                g2z g2zVar = yz90Var.e;
                i8h1 i8h1Var = (i8h1) g2zVar.a;
                x6h1 x6h1VarC = ((pdl0) g2zVar.f).b.c();
                x6h1VarC.i.add(new a7h1("deeplinking", (String) null, (Integer) null, str2, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                String str4 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                ou80 ou80Var = aet0Var.d;
                if (ou80Var != null && (str = ou80Var.a) != null) {
                    str4 = str;
                }
                String str5 = aet0Var.c.a;
                Set set = s4b1.f;
                if (!uic.i(str2, s4b1.g) && !uic.g(str2, blc0.Yc)) {
                    if (uic.h(str2, blc0.g1, blc0.h1, blc0.j1, blc0.R3) || uic.h(str2, blc0.u1, blc0.A1, blc0.M1)) {
                        muz muzVarB = yz90Var.b();
                        return muzVarB == null ? Completable.j(new IllegalStateException("No resumed activity available for player creation")) : muzVarB.a(yz90Var.a(str4, str3, str5, Context.fromUri(str2))).ignoreElement();
                    }
                    if (str3 != null && uic.h(str3, blc0.ti, blc0.ui)) {
                        muz muzVarB2 = yz90Var.b();
                        return muzVarB2 == null ? Completable.j(new IllegalStateException("No resumed activity available for player creation")) : muzVarB2.a(yz90Var.a(str4, str3, str5, Context.fromTrackUris(str2, b380.t(str3)))).ignoreElement();
                    }
                    CompletableEmpty completableEmpty = CompletableEmpty.a;
                    completableEmpty.getClass();
                    return completableEmpty;
                }
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.s(str5);
                EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                if (str3 != null) {
                    lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
                    wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                    wrzVarP.t(str3);
                    lqzVarS.C(wrzVarP.build());
                    preparePlayOptionsP = (EsPreparePlayOptions.PreparePlayOptions) lqzVarS.build();
                } else {
                    preparePlayOptionsP = EsPreparePlayOptions.PreparePlayOptions.p();
                }
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                cozVarR.n(str4);
                y6r0 y6r0Var = yz90Var.g.get();
                String str6 = y6r0Var != null ? y6r0Var.a : null;
                if (str6 == null) {
                    str6 = "";
                }
                cozVarR.q(str6);
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(yz90Var.a.b());
                cozVarR.t(qpzVarP);
                return j2h1.D(yz90Var.h, new ary(yz90Var, playOriginBuild, cozVarR.build(), preparePlayOptionsP, str2, (lnm) null));
            case 7:
                String str7 = (String) this.c;
                Throwable th = (Throwable) obj;
                boolean z2 = th instanceof TimeoutException;
                g2z g2zVar2 = (g2z) ((g2z) this.b).f;
                if (z2) {
                    g2z.F(g2zVar2, str7, (String) null, 28);
                    return Single.just(Boolean.FALSE);
                }
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                g2z.F(g2zVar2, str7, message, 14);
                return Single.error(th);
            case 12:
                zza0 zza0Var = (zza0) obj;
                if (zza0Var instanceof xza0) {
                    ((xza0) zza0Var).a.a(((p0b0) this.b).a, true);
                    return ((wza0) this.c).f.x(d710.i).Y(5L, new FlowableError(Functions.h(new TimeoutException()))).J(e710.i).y(Boolean.FALSE);
                }
                if (zza0Var instanceof yza0) {
                    return Single.just(Boolean.FALSE);
                }
                eg.o();
                return null;
            case 13:
                p941 p941Var = (p941) obj;
                wza0 wza0Var = (wza0) this.b;
                if (!(p941Var instanceof l941)) {
                    Single singleJust = Single.just(p941Var);
                    singleJust.getClass();
                    return singleJust;
                }
                String str8 = ((mi8) this.c).a.a;
                SharedPreferences sharedPreferences = (SharedPreferences) wza0Var.n.getValue();
                p0b0 p0b0VarB = wza0Var.b(str8, sharedPreferences != null ? sharedPreferences.getString(str8, null) : null);
                return (p0b0VarB == null || (map = wza0Var.e(p0b0VarB).map(new jpa0(p0b0VarB, wza0Var, (byte) 1))) == null) ? Single.just(p941Var) : map;
            case 16:
                Map map2 = (Map) obj;
                boolean zG = ((t75) ((sh40) this.b).f).g();
                String str9 = (String) this.c;
                if (zG) {
                    f7h f7hVar = (f7h) map2.get(str9);
                    if (f7hVar != null) {
                        z = f7hVar.a;
                    }
                } else {
                    f7h f7hVar2 = (f7h) map2.get(str9);
                    if (f7hVar2 != null) {
                        z = f7hVar2.c;
                    }
                }
                return Boolean.valueOf(z);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(((t0c0) this.b).c().h((bma1) this.c, false));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ejr0 ejr0Var = (ejr0) this.b;
                ejr0 ejr0VarH = ejr0.h(ejr0Var, ejr0Var.a.j((List) obj), 0, 2);
                return ejr0.h(ejr0VarH, (ivd) null, ejr0VarH.b + ((icc0) this.c).g.c, 1);
            default:
                mmr0 mmr0Var = (mmr0) obj;
                tal talVar = (tal) mmr0Var.a;
                nq6 nq6Var = (nq6) mmr0Var.b;
                if (talVar.equals(sal.a)) {
                    return Observable.just(new scc0(true, nq6Var, 0));
                }
                egr egrVar = ((zcc0) this.b).e;
                String str10 = ((tcc0) this.c).a;
                egr egrVar2 = egrVar;
                zzg1[] zzg1VarArrValues = zzg1.values();
                int iS = zno1.s(zzg1VarArrValues.length);
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (zzg1 zzg1Var2 : zzg1VarArrValues) {
                    linkedHashMap.put(zzg1Var2, Pattern.compile("(spotify:artist:([a-zA-Z0-9]+))".concat(zzg1Var2.a)));
                }
                zzg1[] zzg1VarArrValues2 = zzg1.values();
                int length = zzg1VarArrValues2.length;
                int i = 0;
                Matcher matcher2 = null;
                while (true) {
                    if (i < length) {
                        zzg1Var = zzg1VarArrValues2[i];
                        Object obj2 = linkedHashMap.get(zzg1Var);
                        obj2.getClass();
                        matcher = ((Pattern) obj2).matcher(str10);
                        if (!matcher.find()) {
                            i++;
                            matcher2 = matcher;
                        }
                    } else {
                        matcher = matcher2;
                        zzg1Var = null;
                    }
                }
                if (zzg1Var == null) {
                    hhg1.n("Specified artistUri doesn't match any type");
                    return null;
                }
                if (matcher == null) {
                    u890.C("matcher");
                    throw null;
                }
                String strGroup = matcher.group(2);
                strGroup.getClass();
                return yoi1.i(new i0h(new dkm(egrVar2.b.k("spotify:list:liked-songs-artist:".concat(strGroup), egr.c), (byte) 21), (byte) 14), o6x.a).map(new bm00(nq6Var, b)).startWithItem(new scc0(false, nq6Var, nq6Var.c));
        }
    }

    public Observable b(n72 n72Var) {
        Set set = s4b1.f;
        String str = n72Var.a;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        boolean zJ = u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e);
        blc0 blc0Var = s4b1VarX.c;
        if (!p7h.M(new blc0[]{blc0.Pg, blc0.fh, blc0.ti}).contains(blc0Var) && !zJ) {
            n9v.f(blc0Var, " is not supported");
            return null;
        }
        if (!(n72Var instanceof k72) && !(n72Var instanceof m72) && !(n72Var instanceof l72)) {
            eg.o();
            return null;
        }
        ye90 ye90Var = (ye90) this.b;
        izb0 izb0Var = new izb0(n72Var.b.a.toUpperCase(Locale.ROOT), str, n72Var.c, n72Var.d);
        boolean zB = ((co4) ye90Var.c).b();
        kh5 kh5Var = (kh5) ye90Var.b;
        return (zB ? kh5Var.a(izb0Var) : kh5Var.b(izb0Var)).map(new hr8(n72Var, this, blc0Var, zJ, (byte) 3)).onErrorReturn(cj20.i).toObservable().map(bj20.i);
    }

    public void c(Rect rect, int i, int i2, c681 c681Var, a1g1 a1g1Var) {
        int iC;
        rect.set(0, 0, 0, 0);
        hx40 hx40Var = (hx40) this.c;
        int i3 = i - 1;
        Set setI = (i3 >= 0 && i3 < i2) ? i(i3, a1g1Var) : Collections.EMPTY_SET;
        Set setI2 = (i >= 0 && i < i2) ? i(i, a1g1Var) : Collections.EMPTY_SET;
        int i4 = i + 1;
        Set setI3 = (i4 >= 0 && i4 < i2) ? i(i4, a1g1Var) : Collections.EMPTY_SET;
        int i5 = hx40Var.i;
        zf50 zf50Var = hx40Var.a;
        boolean z = zf50Var.b;
        int i6 = hx40Var.d;
        ix40 ix40Var = ix40.b;
        boolean zContains = setI2.contains(ix40Var);
        ix40 ix40Var2 = ix40.c;
        if (zContains) {
            if (z) {
                iC = zf50Var.a((((GridLayoutManager) ((TraitsLayoutManager) c681Var.b)).m1.e(i) + zf50Var.b(i, c681Var)) - 1, c681Var);
            } else {
                iC = zf50Var.c(zf50Var.b(i, c681Var), c681Var);
            }
            SparseIntArray sparseIntArray = hx40Var.b;
            int iC2 = sparseIntArray.get(i, -1);
            if (iC2 < 0) {
                TraitsLayoutManager traitsLayoutManager = (TraitsLayoutManager) c681Var.b;
                iC2 = ((GridLayoutManager) traitsLayoutManager).m1.c(i, ((GridLayoutManager) traitsLayoutManager).h1);
                sparseIntArray.put(i, iC2);
            }
            rect.set(iC, iC2 == 0 ? i6 : 0, z ? zf50Var.c(zf50Var.b(i, c681Var), c681Var) : zf50Var.a((((GridLayoutManager) ((TraitsLayoutManager) c681Var.b)).m1.e(i) + zf50Var.b(i, c681Var)) - 1, c681Var), i6);
        } else {
            if (!setI2.contains(ix40.e) && hx40Var.j) {
                SparseIntArray sparseIntArray2 = hx40Var.c;
                int iD = sparseIntArray2.get(i, -1);
                if (iD < 0) {
                    TraitsLayoutManager traitsLayoutManager2 = (TraitsLayoutManager) c681Var.b;
                    iD = ((GridLayoutManager) traitsLayoutManager2).m1.d(i, ((GridLayoutManager) traitsLayoutManager2).h1);
                    sparseIntArray2.put(i, iD);
                }
                TraitsLayoutManager traitsLayoutManager3 = (TraitsLayoutManager) c681Var.b;
                int i7 = ((GridLayoutManager) traitsLayoutManager3).h1;
                if (iD == 0) {
                    rect.left += i5;
                    if (((GridLayoutManager) traitsLayoutManager3).m1.e(i) == i7) {
                        rect.right += i5;
                    }
                } else if (iD == i7 - 1) {
                    rect.right += i5;
                }
            }
            if (setI3.contains(ix40Var)) {
                if (setI2.contains(ix40Var2)) {
                    rect.bottom = hx40Var.g;
                    if (i5 > 0) {
                        rect.left -= i6;
                    }
                } else {
                    rect.bottom = i6;
                }
            }
        }
        boolean zContains2 = setI2.contains(ix40.f);
        ix40 ix40Var3 = ix40.h;
        if (zContains2) {
            if (!setI.contains(ix40Var2)) {
                rect.top += i6;
            }
            if (!setI3.contains(ix40Var3) && !setI3.contains(ix40Var2)) {
                rect.bottom += i6;
            }
        }
        if (setI2.contains(ix40.g)) {
            int i8 = hx40Var.h;
            rect.top = i8;
            rect.bottom = i8;
        }
        if (setI2.contains(ix40.a)) {
            rect.top = hx40Var.e;
            if (!setI3.contains(ix40Var3)) {
                rect.bottom = hx40Var.f;
            }
        }
        if (setI2.contains(ix40.t) && setI.isEmpty()) {
            rect.top += i6;
        }
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        return new dna0((PlayerState) obj, y7y0.L((Map) obj2), ((waz0) ((rwj) this.b).g).b((bbz0) obj5, ((sna0) this.c).a), zBooleanValue, zBooleanValue2);
    }

    public gfh0 e() {
        return (gfh0) ((hrr0) this.c).getValue();
    }

    public float f() {
        return ((Number) ((ie5) this.c).b.getValue()).floatValue();
    }

    public void g() {
        i8h1 i8h1Var = (i8h1) this.b;
        bbl0 bbl0Var = (bbl0) ((bm00) this.c).b;
        bbl0Var.getClass();
        x6h1 x6h1VarC = bbl0Var.b.c();
        x6h1VarC.i.add(new a7h1("phone_speaker_broadcasting_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = bbl0Var.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public Set i(int i, a1g1 a1g1Var) {
        q570 q570VarA = ((c670) ((nay) this.b).b).a(((z511) a1g1Var.b).g(i));
        Set setC = q570VarA instanceof q570 ? q570VarA.c() : Collections.EMPTY_SET;
        if (setC.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return setC instanceof EnumSet ? setC : t380.p(setC);
    }

    public boolean j() {
        return !(((Number) ((ie5) this.c).b.getValue()).floatValue() == 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object k(String str, onm onmVar) {
        gmc0 gmc0Var;
        String str2;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        List list2;
        cf4 cf4Var = (cf4) this.c;
        if (onmVar instanceof gmc0) {
            gmc0Var = (gmc0) onmVar;
            int i = gmc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmc0Var.c = i - Integer.MIN_VALUE;
            } else {
                gmc0Var = new gmc0(this, onmVar);
            }
        } else {
            gmc0Var = new gmc0(this, onmVar);
        }
        Object objF = gmc0Var.a;
        int i2 = gmc0Var.c;
        String str3 = null;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.b;
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.N();
            sku0VarP.R();
            sku0VarP.Z();
            sku0VarP.E();
            sku0VarP.T();
            sku0VarP.f0();
            sku0VarP.b0();
            sku0VarP.q(hz00.W3);
            if (cf4Var.a()) {
                sku0VarP.q(hz00.X3);
            }
            hru0VarS.w(sku0VarP.build());
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
            gmc0Var.c = 1;
            objF = rsc0Var.f(str, trc0Var, gmc0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        kby kbyVar = ((wsc0) ((py21) objF).d()).f;
        jo70 jo70VarA = kbyVar.x.a(jo70.class);
        ho70 ho70Var = (jo70VarA == null || (list2 = jo70VarA.d) == null) ? null : (ho70) o7h.s0(list2);
        String str4 = ho70Var != null ? ho70Var.b : null;
        String strA = "";
        String str5 = str4 == null ? "" : str4;
        String str6 = ho70Var != null ? ho70Var.a : null;
        String str7 = str6 == null ? "" : str6;
        boolean z = kbyVar.g;
        if (cf4Var.a()) {
            xkk1 xkk1VarA = kbyVar.x.a(xkk1.class);
            if (xkk1VarA != null && (mq70Var = xkk1VarA.a) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                str3 = up70Var.a.a;
            }
            if (str3 != null) {
                str2 = str3;
            }
            return new y73(kbyVar, str5, str7, z, str2);
        }
        strA = kbyVar.d.a(1);
        str2 = strA;
        return new y73(kbyVar, str5, str7, z, str2);
    }

    public Single l(Intent intent, th61 th61Var) {
        String strV;
        String str;
        ou80 serializableExtra = intent.getSerializableExtra("extra_interaction_id");
        ou80 ou80Var = serializableExtra instanceof ou80 ? serializableExtra : null;
        int iOrdinal = ((blc0) this.b).ordinal();
        if (iOrdinal == 400) {
            strV = tgp1.v(intent);
        } else if (iOrdinal == 413) {
            strV = tgp1.x(intent);
        } else {
            if (iOrdinal != 402) {
                if (iOrdinal != 403) {
                    str = null;
                } else {
                    strV = "spotify:playlist:37i9dQZF1EVJSvZp5AOML2";
                }
                b72 b72Var = (b72) this.c;
                return rqt0.F((q8n) b72Var.b, new f530(b72Var, ou80Var, str, (lnm) null, (byte) 28)).onErrorReturn(ud20.g);
            }
            strV = tgp1.w(intent);
        }
        str = strV;
        b72 b72Var2 = (b72) this.c;
        return rqt0.F((q8n) b72Var2.b, new f530(b72Var2, ou80Var, str, (lnm) null, (byte) 28)).onErrorReturn(ud20.g);
    }

    public void m(int i, String str, Set set) {
        String str2;
        t2j0 t2j0Var = (t2j0) this.c;
        xha0 xha0VarO = JumpstartError.o();
        xha0VarO.s();
        xha0VarO.t();
        if (i == 1) {
            str2 = "abort";
        } else if (i == 2) {
            str2 = "error";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "recently_played_item_skip";
        }
        xha0VarO.r(str2);
        xha0VarO.n(set);
        xha0VarO.q(str);
        t2j0Var.a(xha0VarO.build());
    }

    public String p() {
        i8h1 i8h1Var = (i8h1) this.b;
        bbl0 bbl0Var = (bbl0) ((bm00) this.c).b;
        bbl0Var.getClass();
        x6h1 x6h1VarC = bbl0Var.b.c();
        x6h1VarC.i.add(new a7h1("phone_speaker_broadcasting_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:connect-device-picker")), x6h1VarC.a(), bbl0Var.a, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public void q(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        r5l0 r5l0Var = (r5l0) this.c;
        x6h1 x6h1VarC = r5l0Var.b.c();
        x6h1VarC.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r5l0Var.a, System.currentTimeMillis()), (xj61) null);
    }

    public void r(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        r5l0 r5l0Var = (r5l0) this.c;
        x6h1 x6h1VarC = r5l0Var.b.c();
        x6h1VarC.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r5l0Var.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public void s() {
        ((i8h1) this.b).f(((r5l0) this.c).e(), (Set) null);
    }

    public ou80 t(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-driving-jumpstart";
        x6h1VarI.f = "2.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = "driving-jumpstart";
        x6h1VarI.d = str;
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
        x6h1VarR.i.add(new a7h1("jumpstart_trigger", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), x6h1VarR.a(), r6h1Var, System.currentTimeMillis()), (xj61) null).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object u(onm onmVar) {
        nzc0 nzc0Var;
        kby kbyVar;
        List list;
        gby gbyVar;
        if (onmVar instanceof nzc0) {
            nzc0Var = (nzc0) onmVar;
            int i = nzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                nzc0Var = new nzc0(this, onmVar);
            }
        } else {
            nzc0Var = new nzc0(this, onmVar);
        }
        Object objF = nzc0Var.a;
        int i2 = nzc0Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.c;
            String str = (String) this.b;
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.e0();
            hru0VarS.x(sku0VarP);
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
            nzc0Var.c = 1;
            objF = rsc0Var.f(str, trc0Var, nzc0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).c();
        if (wsc0Var == null || (kbyVar = wsc0Var.f) == null || (list = kbyVar.r) == null || (gbyVar = (gby) o7h.X0(list)) == null) {
            return null;
        }
        return new cga1(gbyVar.b, gbyVar.a, gbyVar.c);
    }

    public int v(int i) {
        gfh0 gfh0VarE = e();
        hmb0 hmb0Var = (hmb0) this.b;
        return gfh0VarE.maxIntrinsicHeight((ndo0) hmb0Var.e1.e, hmb0Var.n(), i);
    }

    public int w(int i) {
        gfh0 gfh0VarE = e();
        hmb0 hmb0Var = (hmb0) this.b;
        return gfh0VarE.maxIntrinsicWidth((ndo0) hmb0Var.e1.e, hmb0Var.n(), i);
    }

    public int x(int i) {
        gfh0 gfh0VarE = e();
        hmb0 hmb0Var = (hmb0) this.b;
        return gfh0VarE.minIntrinsicHeight((ndo0) hmb0Var.e1.e, hmb0Var.n(), i);
    }

    public int y(int i) {
        gfh0 gfh0VarE = e();
        hmb0 hmb0Var = (hmb0) this.b;
        return gfh0VarE.minIntrinsicWidth((ndo0) hmb0Var.e1.e, hmb0Var.n(), i);
    }

    public void z() {
        xab1 xab1Var = (xab1) this.b;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = new ie5(rno1.a, Float.valueOf(0.0f), (oe5) null, 60);
    }

    public void h() {
    }

    public void o() {
    }

    public x390(dir0 dir0Var, i8h1 i8h1Var) {
        this.a = (byte) 24;
        this.b = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        String str = yon1.G1("ENDLESS_FEED", "endless-feed", 512, "endless-feed").c;
        String stringExtra = ((EndlessActivity) dir0Var).getIntent().getStringExtra("com.spotify.endless.sessionstarter.KEY_EXTRA_DEEPLINK");
        this.c = new r5l0(str, stringExtra == null ? "" : stringExtra);
    }

    public /* synthetic */ x390(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public x390(hmb0 hmb0Var, gfh0 gfh0Var) {
        this.a = (byte) 1;
        this.b = hmb0Var;
        this.c = v8r.q(gfh0Var);
    }

    public x390(ConstraintLayout constraintLayout, Button button, EncoreButton encoreButton) {
        this.a = (byte) 27;
        this.b = button;
        this.c = encoreButton;
    }

    public x390() {
        this.a = (byte) 21;
        Float fValueOf = Float.valueOf(0.0f);
        tzg1 tzg1Var = rno1.a;
        this.c = new ie5(tzg1Var, fValueOf, (oe5) tzg1Var.a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
