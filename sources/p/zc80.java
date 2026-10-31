package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.spotify.liveeventslocation.v1.locationsuggest.LocationSuggestRequest;
import com.spotify.liveeventslocation.v1.locationsuggest.LocationSuggestResponse;
import com.spotify.liveeventslocation.v1.locationsuggest.LocationSuggestion;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zc80 implements Function, InstallReferrerStateListener, rbu0, Producer, SingleOnSubscribe {
    public final /* synthetic */ byte a;
    public final Object b;

    public zc80(boolean z, kbd kbdVar) {
        this.a = (byte) 25;
        this.b = !z ? new huz(Boolean.FALSE, (byte) 10) : rqt0.u(kbdVar.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(String str, onm onmVar) {
        bpd0 bpd0Var;
        if (onmVar instanceof bpd0) {
            bpd0Var = (bpd0) onmVar;
            int i = bpd0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpd0Var.d = i - Integer.MIN_VALUE;
            } else {
                bpd0Var = new bpd0(this, onmVar);
            }
        } else {
            bpd0Var = new bpd0(this, onmVar);
        }
        Object objD = bpd0Var.b;
        int i2 = bpd0Var.d;
        if (i2 == 0) {
            hm5.M(objD);
            uo5 uo5Var = (uo5) this.b;
            bpd0Var.a = this;
            bpd0Var.d = 1;
            zne0 zne0VarN = LocationSuggestRequest.n();
            zne0VarN.n(str);
            LocationSuggestRequest locationSuggestRequestBuild = zne0VarN.build();
            cpd0 cpd0Var = (cpd0) uo5Var.b;
            locationSuggestRequestBuild.getClass();
            objD = cpd0Var.d(locationSuggestRequestBuild, bpd0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = bpd0Var.a;
            hm5.M(objD);
        }
        h290<LocationSuggestion> h290VarN = ((LocationSuggestResponse) objD).n();
        this.getClass();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (LocationSuggestion locationSuggestion : h290VarN) {
            arrayList.add(new jj40(locationSuggestion.o(), locationSuggestion.n()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ec A[SYNTHETIC] */
    public Object apply(Object obj) {
        String str;
        String str2;
        u7g0 u7g0Var;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                zd1 zd1Var = (zd1) obj2;
                return ((Observable) zd1Var.d).take(1L).flatMap(new vx40(zd1Var, (kqx0) obj, (byte) 17)).onErrorReturnItem(atx0.a);
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 10:
            case 11:
            case 20:
            case 21:
            case 24:
            case 25:
            default:
                xbm xbmVar = ((bam0) obj).e;
                xbmVar.L().f = xbmVar.i();
                pam0 pam0Var = new pam0((sam0) obj2, xbmVar, (byte) 1);
                System.nanoTime();
                pam0Var.invoke();
                System.nanoTime();
                return jam0.a;
            case 5:
                return spq0.d(((p0b0) obj2).a);
            case 8:
                return new x7c0((v7c0) obj2, obj);
            case 9:
                qsn qsnVar = (qsn) obj2;
                return new qsn(qsnVar.a, ega1.a(qsnVar.b, ((kia1) obj).a, (l620) null, (cga1) null, 6), qsnVar.c);
            case 12:
                x350 x350Var = ((xqd0) obj2).g;
                String str3 = ((pp90) obj).b;
                x350Var.d(osd0.a);
                return x350Var.a(new r350(str3), new z2p1(str3.getBytes(nne.a)));
            case 13:
                return ((ruc0) obj2).h((PlayerState) obj);
            case 14:
                List list = (List) obj;
                return !list.isEmpty() ? Observable.just(new lsx0(list)) : new CompletableFromAction(new wqd0((h4e0) obj2, (byte) 2)).w();
            case 15:
                zd1 zd1Var2 = (zd1) obj2;
                return ((gae) zd1Var2.d).g((String) zd1Var2.c, (lik1) zd1Var2.b).flatMap(zi20.h).map(aj20.X).map(bj20.X).onErrorReturn(cj20.X);
            case 16:
                zfc1 zfc1Var = (zfc1) obj;
                Context context = ((u8g) ((o3e0) obj2).d).a;
                return (zfc1Var == zfc1.f || zfc1Var == zfc1.g) ? new k8f0(context.getString(2131957742, Arrays.copyOf(new Object[0], 0)), context.getString(2131957743, Arrays.copyOf(new Object[0], 0))) : new k8f0();
            case 17:
                lnf0 lnf0Var = (lnf0) obj2;
                return (!((rm4) lnf0Var.h.get()).b() ? CompletableEmpty.a : j2h1.D(o6xVar, new v4e0(lnf0Var, (Object) null, (Object) null, (lnm) null, (byte) 10))).h(new vrk1((rhf0) obj, (byte) 19)).o(Functions.h).w();
            case 18:
                npf0 npf0Var = (npf0) obj2;
                ima1 ima1Var = (dma1) npf0Var.c.getValue();
                return yoi1.i(c4p1.F(ima1Var.o(), ima1Var, vmf0.a(), h9a1.W0), o6xVar).map(c710.Z).startWithItem(Float.valueOf(((dma1) npf0Var.c.getValue()).c(vmf0.a(), 1.0f))).distinctUntilChanged().map(d710.N0).distinctUntilChanged();
            case 19:
                ArrayList<z8t0> arrayList = ((h9t0) obj).a;
                ArrayList arrayList2 = new ArrayList();
                for (z8t0 z8t0Var : arrayList) {
                    eqi0 eqi0Var = z8t0Var.d;
                    if (eqi0Var instanceof eqi0) {
                        str2 = eqi0Var.b;
                    } else {
                        if (eqi0Var instanceof dqi0) {
                            str2 = ((dqi0) eqi0Var).b;
                        } else {
                            if (!(eqi0Var instanceof fqi0) && !(eqi0Var instanceof gqi0)) {
                                eg.o();
                                return null;
                            }
                            str = null;
                        }
                        if (str != null) {
                            u7g0Var = new u7g0(str, z8t0Var.a, Integer.valueOf(z8t0Var.e), z8t0Var.c, z8t0Var.b);
                        } else {
                            u7g0Var = null;
                        }
                        if (u7g0Var != null) {
                            arrayList2.add(u7g0Var);
                        }
                    }
                    str = str2;
                    if (str != null) {
                        u7g0Var = new u7g0(str, z8t0Var.a, Integer.valueOf(z8t0Var.e), z8t0Var.c, z8t0Var.b);
                    } else {
                        u7g0Var = null;
                    }
                    if (u7g0Var != null) {
                        arrayList2.add(u7g0Var);
                    }
                }
                return new ufg0(new hhg0(arrayList2), ((ggg0) obj2).b);
            case 22:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                h89 h89Var = ((hjh0) obj2).a;
                m210 m210Var = h89Var.b;
                g510 g510Var = h89Var.a;
                return z ? g510Var.j(m210Var).ignoreElement() : g510Var.d(m210Var).ignoreElement();
            case 23:
                lki0 lki0Var = (lki0) obj;
                gj10 gj10Var = ((rki0) obj2).a;
                String str4 = lki0Var.b;
                boolean z2 = lki0Var.c;
                return gj10.k(gj10Var, str4, (String) null, (String) null, Boolean.valueOf(z2), (Boolean) null, (Boolean) null, 54).d(Observable.just(new tki0(z2))).onErrorReturn(new d4e0(lki0Var, (byte) 12));
            case 26:
                PlayerState playerState2 = (PlayerState) obj;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                long jLongValue = ((Number) playerState2.duration().e(0L)).longValue() - ((Number) playerState2.position(((yqg) ((dlp) ((vf2) obj2).d).get()).b()).e(0L)).longValue();
                return new mmr0(boolValueOf, Long.valueOf(jLongValue >= 0 ? jLongValue : 0L));
        }
    }

    public void b(int i, Object obj) {
        List list = ((r390) this.b).e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ipb) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ipb) it.next()).r((xw7) obj);
        }
    }

    public opl0 c(int i) {
        return new opl0(i, (r6h1) this.b, (byte) 6);
    }

    public void d(zo90 zo90Var) {
        ser serVar = (ser) this.b;
        String str = nik1.H5.a;
        Parcelable gt90Var = new gt90(zo90Var.a, zo90Var.b);
        Bundle bundle = new Bundle();
        bundle.putParcelable("jam.invite.sheet.args", gt90Var);
        serVar.a((String) null, str, bundle);
    }

    public ArrayList e(int i) {
        ArrayList arrayList = new ArrayList();
        upb0 upb0Var = (upb0) this.b;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            lpb0 lpb0Var = upb0Var.b ? upb0Var.c : (lpb0) upb0Var.e.getValue();
            if (lpb0Var != null) {
                n811 n811Var = new n811();
                n811Var.a = 1;
                List list = (List) lpb0Var.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mmr0 mmr0Var = (mmr0) list.get(i2);
                    tsb0 tsb0Var = upb0Var.o;
                    int iIntValue = ((Number) mmr0Var.a).intValue();
                    long j = ((hjl) mmr0Var.b).a;
                    n811Var = n811Var;
                    k95 k95Var = new k95((ArrayList) null, n811Var, list, i, lpb0Var);
                    rl1 rl1Var = tsb0Var.c;
                    arrayList.add(rl1Var != null ? rl1Var.F(iIntValue, j, tsb0Var.b, false, k95Var) : vev.a);
                }
            }
            return arrayList;
        } finally {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02f9 A[PHI: r6
      0x02f9: PHI (r6v5 android.app.Activity) = (r6v4 android.app.Activity), (r6v14 android.app.Activity) binds: [B:150:0x02da, B:158:0x02f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x030b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0317  */
    /* JADX WARN: Code duplicated, block: B:169:0x0328  */
    /* JADX WARN: Code duplicated, block: B:179:0x035a  */
    public e80 f(Context context, iac0 iac0Var, MessageTemplate messageTemplate) {
        j50 j50Var;
        SortedSet sortedSetQ1;
        String str;
        boolean z = messageTemplate instanceof BannerTemplate;
        List listN = z6x.a;
        if (z) {
            BannerTemplate.BasicBanner basicBanner = (BannerTemplate) messageTemplate;
            if (basicBanner instanceof BannerTemplate.BasicBanner) {
                BannerTemplate.BasicBanner basicBanner2 = basicBanner;
                listN = f46.i0(new Button[]{basicBanner2.getPrimaryButton(), basicBanner2.getSecondaryButton(), basicBanner2.getCloseButton()});
            } else if (basicBanner instanceof BannerTemplate.RichBanner) {
                BannerTemplate.RichBanner richBanner = (BannerTemplate.RichBanner) basicBanner;
                listN = f46.i0(new Button[]{richBanner.getPrimaryButton(), richBanner.getSecondaryButton(), richBanner.getCloseButton()});
            } else if (basicBanner instanceof BannerTemplate.SignifierBanner) {
                BannerTemplate.SignifierBanner signifierBanner = (BannerTemplate.SignifierBanner) basicBanner;
                listN = f46.i0(new Button[]{signifierBanner.getPrimaryButton(), signifierBanner.getSecondaryButton(), signifierBanner.getCloseButton()});
            } else if (basicBanner instanceof BannerTemplate.BaseBanner) {
                BannerTemplate.BaseBanner baseBanner = (BannerTemplate.BaseBanner) basicBanner;
                Button primaryButton = baseBanner.getPrimaryButton();
                Button secondaryButton = baseBanner.getSecondaryButton();
                Button dismissButton = baseBanner.getDismissButton();
                Button contentButton = baseBanner.getContentButton();
                Disclaimer disclaimer = baseBanner.getDisclaimer();
                listN = f46.i0(new Button[]{primaryButton, secondaryButton, dismissButton, contentButton, disclaimer != null ? disclaimer.getLinkButton() : null});
            } else if (basicBanner instanceof BannerTemplate.JitBanner) {
                listN = ((BannerTemplate.JitBanner) basicBanner).getButtons();
            } else if (!(basicBanner instanceof BannerTemplate.CustomBanner) && !basicBanner.equals(BannerTemplate.Undefined.INSTANCE)) {
                eg.o();
                return null;
            }
        } else if (messageTemplate instanceof BottomSheetTemplate) {
            BottomSheetTemplate.BaseBottomSheet baseBottomSheet = (BottomSheetTemplate) messageTemplate;
            if (baseBottomSheet instanceof BottomSheetTemplate.BaseBottomSheet) {
                BottomSheetTemplate.BaseBottomSheet baseBottomSheet2 = baseBottomSheet;
                Button primaryButton2 = baseBottomSheet2.getPrimaryButton();
                Button secondaryButton2 = baseBottomSheet2.getSecondaryButton();
                Disclaimer disclaimer2 = baseBottomSheet2.getDisclaimer();
                listN = f46.i0(new Button[]{primaryButton2, secondaryButton2, disclaimer2 != null ? disclaimer2.getLinkButton() : null});
            } else if (baseBottomSheet instanceof BottomSheetTemplate.BasicBottomSheet) {
                BottomSheetTemplate.BasicBottomSheet basicBottomSheet = (BottomSheetTemplate.BasicBottomSheet) baseBottomSheet;
                listN = f46.i0(new Button[]{basicBottomSheet.getPrimaryButton(), basicBottomSheet.getSecondaryButton()});
            } else if (baseBottomSheet instanceof BottomSheetTemplate.RichBottomSheet) {
                BottomSheetTemplate.RichBottomSheet richBottomSheet = (BottomSheetTemplate.RichBottomSheet) baseBottomSheet;
                listN = f46.i0(new Button[]{richBottomSheet.getPrimaryButton(), richBottomSheet.getSecondaryButton()});
            } else if (baseBottomSheet instanceof BottomSheetTemplate.FullBleedBottomSheet) {
                BottomSheetTemplate.FullBleedBottomSheet fullBleedBottomSheet = (BottomSheetTemplate.FullBleedBottomSheet) baseBottomSheet;
                listN = f46.i0(new Button[]{fullBleedBottomSheet.getPrimaryButton(), fullBleedBottomSheet.getSecondaryButton()});
            } else if (!(baseBottomSheet instanceof BottomSheetTemplate.CustomBottomSheet) && !baseBottomSheet.equals(BottomSheetTemplate.Undefined.INSTANCE)) {
                eg.o();
                return null;
            }
        } else if (messageTemplate instanceof FullscreenTemplate) {
            FullscreenTemplate.BaseFullscreen baseFullscreen = (FullscreenTemplate) messageTemplate;
            if (baseFullscreen instanceof FullscreenTemplate.BaseFullscreen) {
                FullscreenTemplate.BaseFullscreen baseFullscreen2 = baseFullscreen;
                Button primaryButton3 = baseFullscreen2.getPrimaryButton();
                Button secondaryButton3 = baseFullscreen2.getSecondaryButton();
                Disclaimer disclaimer3 = baseFullscreen2.getDisclaimer();
                listN = f46.i0(new Button[]{primaryButton3, secondaryButton3, disclaimer3 != null ? disclaimer3.getLinkButton() : null});
            } else if (baseFullscreen instanceof FullscreenTemplate.JitFullscreen) {
                listN = ((FullscreenTemplate.JitFullscreen) baseFullscreen).getButtons();
            } else if (!baseFullscreen.equals(FullscreenTemplate.Undefined.INSTANCE)) {
                eg.o();
                return null;
            }
        } else if (messageTemplate instanceof InlineCardTemplate) {
            InlineCardTemplate.StandardInlineCard standardInlineCard = (InlineCardTemplate) messageTemplate;
            if (standardInlineCard instanceof InlineCardTemplate.StandardInlineCard) {
                InlineCardTemplate.StandardInlineCard standardInlineCard2 = standardInlineCard;
                listN = f46.i0(new Button[]{standardInlineCard2.getPrimaryButton(), standardInlineCard2.getCloseButton()});
            } else if (standardInlineCard instanceof InlineCardTemplate.CompactInlineCard) {
                listN = Collections.singletonList(((InlineCardTemplate.CompactInlineCard) standardInlineCard).getCardButton());
            } else if (standardInlineCard instanceof InlineCardTemplate.MicroCompactInlineCard) {
                listN = Collections.singletonList(((InlineCardTemplate.MicroCompactInlineCard) standardInlineCard).getCardButton());
            } else if (standardInlineCard instanceof InlineCardTemplate.BaseInlineCard) {
                InlineCardTemplate.BaseInlineCard baseInlineCard = (InlineCardTemplate.BaseInlineCard) standardInlineCard;
                listN = f46.i0(new Button[]{baseInlineCard.getPrimaryButton(), baseInlineCard.getSecondaryButton(), baseInlineCard.getCardButton(), baseInlineCard.getDismissButton()});
            } else if (!standardInlineCard.equals(InlineCardTemplate.Undefined.INSTANCE)) {
                eg.o();
                return null;
            }
        } else if (messageTemplate instanceof ModalTemplate) {
            ModalTemplate.BasicModal basicModal = (ModalTemplate) messageTemplate;
            if (basicModal instanceof ModalTemplate.BasicModal) {
                listN = p7h.N(basicModal.getPrimaryButton());
            } else if (basicModal instanceof ModalTemplate.BaseModal) {
                ModalTemplate.BaseModal baseModal = (ModalTemplate.BaseModal) basicModal;
                Button primaryButton4 = baseModal.getPrimaryButton();
                Button secondaryButton4 = baseModal.getSecondaryButton();
                Disclaimer disclaimer4 = baseModal.getDisclaimer();
                listN = f46.i0(new Button[]{primaryButton4, secondaryButton4, disclaimer4 != null ? disclaimer4.getLinkButton() : null});
            } else if (basicModal instanceof ModalTemplate.JitModal) {
                listN = ((ModalTemplate.JitModal) basicModal).getButtons();
            } else if (!basicModal.equals(ModalTemplate.Undefined.INSTANCE)) {
                eg.o();
                return null;
            }
        } else if (messageTemplate instanceof SnackBarTemplate) {
            SnackBarTemplate.BaseSnackBar baseSnackBar = (SnackBarTemplate) messageTemplate;
            if (baseSnackBar instanceof SnackBarTemplate.BaseSnackBar) {
                SnackBarTemplate.BaseSnackBar baseSnackBar2 = baseSnackBar;
                listN = f46.i0(new Button[]{baseSnackBar2.getPrimaryButton(), baseSnackBar2.getDismissButton()});
            } else if (baseSnackBar instanceof SnackBarTemplate.JitSnackBar) {
                listN = ((SnackBarTemplate.JitSnackBar) baseSnackBar).getButtons();
            } else if (!(baseSnackBar instanceof SnackBarTemplate.CustomSnackbar) && !baseSnackBar.equals(SnackBarTemplate.Undefined.INSTANCE)) {
                eg.o();
                return null;
            }
        } else if (messageTemplate instanceof TooltipTemplate) {
            TooltipTemplate.BaseTooltip baseTooltip = (TooltipTemplate) messageTemplate;
            if (baseTooltip instanceof TooltipTemplate.BaseTooltip) {
                listN = p7h.N(baseTooltip.getButton());
            } else if (!(baseTooltip instanceof TooltipTemplate.CustomTooltip) && !baseTooltip.equals(TooltipTemplate.Undefined.INSTANCE)) {
                eg.o();
                return null;
            }
        }
        List list = listN;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Button) it.next()).getClickAction().getClickActionIdentifier());
        }
        List listJ0 = o7h.j0(arrayList);
        if (!listJ0.isEmpty()) {
            hvi0 hvi0Var = hvi0.e;
            n561 n561VarC0 = z561.c0(hvi0Var, context);
            zqb0 zqb0Var = zqb0.g;
            Activity activity = (Activity) z561.W(z561.T(zqb0Var, n561VarC0));
            if (activity != null) {
                WeakReference weakReference = (WeakReference) ((qic) this.b).a.get(activity.getLocalClassName());
                j50Var = weakReference != null ? (j50) weakReference.get() : null;
                if (j50Var != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listJ0) {
                        str = (String) obj;
                        if (j50Var.b.containsKey(str) && !((Map) j50Var.a.get()).containsKey(str)) {
                            arrayList2.add(obj);
                        }
                    }
                    sortedSetQ1 = o7h.q1(arrayList2);
                    if (!((TreeSet) sortedSetQ1).isEmpty()) {
                        return new d80(sortedSetQ1);
                    }
                }
            } else {
                Context context2 = iac0Var instanceof Context ? (Context) iac0Var : null;
                activity = context2 != null ? (Activity) z561.W(z561.T(zqb0Var, z561.c0(hvi0Var, context2))) : null;
                if (activity != null) {
                    WeakReference weakReference2 = (WeakReference) ((qic) this.b).a.get(activity.getLocalClassName());
                    if (weakReference2 != null) {
                    }
                    if (j50Var != null) {
                        ArrayList arrayList3 = new ArrayList();
                        while (r6.hasNext()) {
                            str = (String) obj;
                            if (j50Var.b.containsKey(str)) {
                            }
                        }
                        sortedSetQ1 = o7h.q1(arrayList3);
                        if (!((TreeSet) sortedSetQ1).isEmpty()) {
                            return new d80(sortedSetQ1);
                        }
                    }
                }
            }
            return b80.a;
        }
        return c80.a;
    }

    public Object get() {
        return new DispatcherWorker(((k2a0) this.b).b);
    }

    public void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.b;
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (i == 0) {
                try {
                    String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                    if (installReferrer != null && (ihc1.h0(installReferrer, "fb", false) || ihc1.h0(installReferrer, "facebook", false))) {
                        if (!set.contains(rm5.class)) {
                            try {
                                wf10.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer).apply();
                            } catch (Throwable th) {
                                dhn.a(rm5.class, th);
                            }
                        }
                    }
                    wf10.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i == 2) {
                wf10.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            installReferrerClient.endConnection();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                dhn.a(this, th3);
            }
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        hgd0 hgd0Var = (hgd0) this.b;
        singleEmitter.onSuccess(new egd0(((Boolean) Single.create(new yfc0(hgd0Var, (byte) 2)).blockingGet()).booleanValue(), (fgd0) Single.create(new z8c0(hgd0Var, (byte) 3)).blockingGet()));
    }

    public void onInstallReferrerServiceDisconnected() {
    }

    public /* synthetic */ zc80(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }

    public zc80() {
        this.a = (byte) 27;
        this.b = new py9((byte) 5);
    }

    public /* synthetic */ zc80(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
