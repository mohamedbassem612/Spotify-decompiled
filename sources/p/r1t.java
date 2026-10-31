package p;

import android.content.res.Resources;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class r1t extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1t(Object obj, byte b) {
        super(1, obj, jtv.class, "serialize", "serialize(Lcom/spotify/playlistediting/itemspage/domain/model/EditPlaylistItemsModel;)Landroid/os/Bundle;", 0);
        this.a = b;
        switch (b) {
            case 9:
                super(1, obj, swv.class, "serialize", "serialize(Lcom/spotify/playlistediting/privacypage/domain/model/EditPlaylistsPrivacyModel;)Landroid/os/Bundle;", 0);
                break;
            case 10:
                super(1, obj, gyv.class, "serialize", "serialize(Lcom/spotify/playlistediting/profilevisibilitypage/domain/model/EditPlaylistsProfileVisibilityModel;)Landroid/os/Bundle;", 0);
                break;
            case 27:
                super(1, obj, m01.class, "loadAdapterRecentlyPlayed", "loadAdapterRecentlyPlayed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                break;
            case 28:
                super(1, obj, l01.class, "loadAdapterHome", "loadAdapterHome(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke(Object obj) {
        String string;
        Object value;
        vvw vvwVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((s1t) ((lyc) this).receiver).h.invoke((hr3) obj);
                return rih1Var;
            case 1:
                ((Consumer) ((lyc) this).receiver).accept((hr3) obj);
                return rih1Var;
            case 2:
                return ((cht) ((lyc) this).receiver).n((String) obj);
            case 3:
                return ((wht) ((lyc) this).receiver).v0((ajn0) obj);
            case 4:
                return new uht((wht) ((lyc) this).receiver, (g8b0) obj);
            case 5:
                ((uiu) ((lyc) this).receiver).getClass();
                return new aju((jiu) obj);
            case 6:
                ((i01) ((lyc) this).receiver).b(((Number) obj).intValue());
                return rih1Var;
            case 7:
                l2v l2vVar = (l2v) obj;
                Resources resources = ((m2v) ((lyc) this).receiver).a.getResources();
                resources.getClass();
                n2v n2vVar = l2vVar.c;
                String str = l2vVar.b;
                if (n2vVar == n2v.c) {
                    string = resources.getString(2131955113);
                    string.getClass();
                } else if (str == null || str.length() == 0) {
                    string = resources.getString(2131955109);
                    string.getClass();
                } else {
                    string = resources.getString(2131955111, str);
                    string.getClass();
                }
                String str2 = string;
                String string2 = resources.getString(2131955114);
                String string3 = resources.getString(2131955112);
                String string4 = resources.getString(2131955110);
                String str3 = l2vVar.a;
                return new nhb1(str2, string2, string3, string4, true, str3 != null ? new gzh1(str3) : fzh1.a, 64);
            case 8:
                jtv jtvVar = (jtv) ((lyc) this).receiver;
                jtvVar.getClass();
                etv etvVar = ((htv) obj).j;
                return mno1.h(new mmr0[]{new mmr0("edit_playlist_items_model_state", new itv(etvVar.a, etvVar.b, (Set) jtvVar.a.b.a.getValue()))});
            case 9:
                ((swv) ((lyc) this).receiver).getClass();
                return mno1.h(new mmr0[]{new mmr0("restorable_state", new rwv(((qwv) obj).b))});
            case 10:
                ((gyv) ((lyc) this).receiver).getClass();
                return mno1.h(new mmr0[]{new mmr0("restorable_state", new fyv(((eyv) obj).a))});
            case 11:
                ((y451) ((lyc) this).receiver).a((String) obj);
                return rih1Var;
            case 12:
                ((y451) ((lyc) this).receiver).a((String) obj);
                return rih1Var;
            case 13:
                ((y451) ((lyc) this).receiver).a((String) obj);
                return rih1Var;
            case 14:
                ((y451) ((lyc) this).receiver).a((String) obj);
                return rih1Var;
            case 15:
                ((y451) ((lyc) this).receiver).a((String) obj);
                return rih1Var;
            case 16:
                m511 m511Var = (m511) obj;
                xcn0 xcn0Var = ((dtw) ((lyc) this).receiver).h;
                tka0 tka0Var = dtw.C;
                if (xcn0Var.c.containsKey(tka0Var)) {
                    xcn0Var.c(tka0Var, new tsw(m511Var));
                }
                return rih1Var;
            case 17:
                Throwable th = (Throwable) obj;
                dtw dtwVar = (dtw) ((lyc) this).receiver;
                iu30 iu30Var = dtwVar.g;
                Object obj2 = dtwVar.f;
                obj2.getClass();
                Object objInvoke = iu30Var.invoke(obj2);
                t8r0 t8r0Var = dtwVar.x;
                loo1.p(th, objInvoke, t8r0Var != null ? ((rl1) t8r0Var.b).x() : null, dtwVar.a.b());
                throw null;
            case 18:
                int iIntValue = ((Number) obj).intValue();
                px20 px20Var = (px20) ((lyc) this).receiver;
                if (!px20Var.c || px20Var.d != iIntValue) {
                    px20Var.d = iIntValue;
                    px20Var.c = true;
                    px20Var.a();
                }
                return rih1Var;
            case 19:
                Throwable th2 = (Throwable) obj;
                dtw dtwVar2 = (dtw) ((lyc) this).receiver;
                iu30 iu30Var2 = dtwVar2.g;
                Object obj3 = dtwVar2.f;
                obj3.getClass();
                Object objInvoke2 = iu30Var2.invoke(obj3);
                t8r0 t8r0Var2 = dtwVar2.x;
                loo1.p(th2, objInvoke2, t8r0Var2 != null ? ((rl1) t8r0Var2.b).x() : null, dtwVar2.a.b());
                throw null;
            case 20:
                int iIntValue2 = ((Number) obj).intValue();
                dtw dtwVar3 = (dtw) ((lyc) this).receiver;
                xcn0 xcn0Var2 = dtwVar3.h;
                sqw sqwVar = dtwVar3.l;
                t8r0 t8r0Var3 = dtwVar3.x;
                if (t8r0Var3 != null) {
                    rl1 rl1Var = (rl1) t8r0Var3.b;
                    if (sqwVar.j && !rl1Var.b) {
                        Object obj4 = dtwVar3.f;
                        obj4.getClass();
                        Object state = ((h141) rl1Var.d).getState();
                        if (sqwVar.j) {
                            sqwVar.a(iIntValue2);
                            ztw ztwVarC = sqwVar.c();
                            if (ztwVarC != null) {
                                ztwVarC.c(iIntValue2, sqwVar.b(), new ssm((Object) sqwVar, obj4, state, (byte) 27));
                            }
                            sqwVar.a(iIntValue2);
                        }
                    }
                }
                tka0 tka0Var2 = dtw.D;
                if (xcn0Var2.c.containsKey(tka0Var2)) {
                    xcn0Var2.c(tka0Var2, new usw(iIntValue2));
                }
                return rih1Var;
            case 21:
                return Boolean.valueOf(((nd41) ((lyc) this).receiver).d(obj));
            case 22:
                m511 m511Var2 = (m511) obj;
                ptw ptwVar = (ptw) ((lyc) this).receiver;
                ptwVar.b = true;
                ptwVar.c = m511Var2;
                xcn0 xcn0Var3 = ptwVar.a;
                tka0 tka0Var3 = otw.a;
                if (xcn0Var3.c.containsKey(tka0Var3)) {
                    xcn0Var3.c(tka0Var3, new tsw(m511Var2));
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                int iIntValue3 = ((Number) obj).intValue();
                px20 px20Var2 = (px20) ((lyc) this).receiver;
                if (!px20Var2.c || px20Var2.d != iIntValue3) {
                    px20Var2.d = iIntValue3;
                    px20Var2.c = true;
                    px20Var2.a();
                }
                return rih1Var;
            case 24:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bpb1 bpb1Var = ((wvw) ((lyc) this).receiver).g;
                do {
                    value = bpb1Var.getValue();
                    vvwVar = (vvw) value;
                } while (!bpb1Var.k(value, vvw.a(vvwVar, !(vvwVar.c instanceof ovw), zBooleanValue, (uvw) null, (nvw) null, 12)));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Function0) ((lyc) this).receiver).invoke();
                return rih1Var;
            case 26:
                ((Consumer) ((lyc) this).receiver).accept((g3y) obj);
                return rih1Var;
            case 27:
                return ((how) ((m01) ((lyc) this).receiver)).a((lnm) obj);
            case 28:
                return ((eow) ((l01) ((lyc) this).receiver)).a((lnm) obj);
            default:
                mcy.a((EntityActionView) ((mcy) ((lyc) this).receiver).a.c, (zby) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1t(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1t(dtw dtwVar, byte b) {
        super(1, dtwVar, dtw.class, "notifyExtensionsBoundsChanged", "notifyExtensionsBoundsChanged(Lcom/spotify/element/core/instrumentation/Rect;)V", 0);
        this.a = b;
        switch (b) {
            case 17:
                super(1, dtwVar, dtw.class, "addCrashContextAndRethrow", "addCrashContextAndRethrow(Ljava/lang/Throwable;)Ljava/lang/Void;", 0);
                break;
            case 18:
            default:
                break;
            case 19:
                super(1, dtwVar, dtw.class, "addCrashContextAndRethrow", "addCrashContextAndRethrow(Ljava/lang/Throwable;)Ljava/lang/Void;", 0);
                break;
            case 20:
                super(1, dtwVar, dtw.class, "notifyFocusAdjustedVisibilityChanged", "notifyFocusAdjustedVisibilityChanged(I)V", 0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1t(px20 px20Var) {
        super(1, px20Var, px20.class, "onIntersectionPercentageChanged", "onIntersectionPercentageChanged(I)V", 0);
        this.a = (byte) 18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1t(nd41 nd41Var) {
        super(1, nd41Var, nd41.class, "canBeSaved", "canBeSaved(Ljava/lang/Object;)Z", 0);
        this.a = (byte) 21;
    }
}
