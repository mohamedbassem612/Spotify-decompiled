package p;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.liveroom.commonimpl.ListPlaybackException;
import com.spotify.login.loginflowimpl.QuickLoginActivity;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.remoteconfig.internal.AccountAttribute;
import com.spotify.remoteconfig.internal.ProductStateProto;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sks0 implements Function, qiw, BiFunction, ya, oi30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public sks0(ov20 ov20Var) {
        this.a = (byte) 7;
        this.b = new php0(((bw20) ov20Var).c("campfire", "DISABLED_CANNOT_ENABLE"), (byte) 25);
    }

    public byte[] a() {
        return ((ProductStateProto) this.b).toByteArray();
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 22:
                return ((uh4) obj2).d();
            default:
                le30 le30Var = ((ksk) obj).c;
                return (le30Var == le30.b1 || le30Var == le30.c1) && ((i5y0) obj2).f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x029f  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x0286  */
    /* JADX WARN: Code duplicated, block: B:96:0x028b  */
    public Object apply(Object obj) {
        qqd0 qqd0Var;
        int i;
        ContextTrack contextTrack;
        boolean zI;
        boolean z;
        boolean z2;
        byte b = this.a;
        int i2 = 3;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new CompletableFromRunnable(((tks0) obj3).b).o(Functions.h);
            case 1:
            case 7:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 20:
            case 21:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 24:
            default:
                beh behVar = (feh) obj;
                return behVar instanceof beh ? new p8z0(behVar.a) : (z8z0) ((ia9) obj3).invoke();
            case 2:
                sx41 sx41Var = (sx41) obj;
                boolean zY = nhc1.Y(sx41Var.b, "spotify:podcast-chapter:", false);
                phi0 phi0Var = (phi0) obj3;
                q8n q8nVar = (q8n) phi0Var.c;
                o751 o751Var = (o751) phi0Var.b;
                return zY ? anm1.L(q8nVar, new ikt0(o751Var, sx41Var, (lnm) null, (byte) 0)) : anm1.L(q8nVar, new ikt0(o751Var, sx41Var, (lnm) null, (byte) 1));
            case 3:
                vut0 vut0Var = (vut0) obj;
                String str = vut0Var.a;
                boolean z3 = vut0Var.c;
                boolean z4 = vut0Var.b;
                idd1 idd1Var = ((xut0) obj3).i;
                if (str.equals((String) idd1Var.getValue()) && z4 && !z3) {
                    return wrt0.a;
                }
                return (str.equals((String) idd1Var.getValue()) && z4 && z3) ? wrt0.b : wrt0.c;
            case 4:
                w9u0 w9u0Var = ((t1u0) obj3).t;
                w9u0Var.getClass();
                return w9u0Var.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
            case 5:
                Throwable th = (Throwable) obj;
                if (!(th instanceof ListPlaybackException)) {
                    return Completable.j(th);
                }
                uny unyVar = ((lbu0) obj3).d;
                jy21 jy21Var = ((ListPlaybackException) th).a;
                if (jy21Var instanceof dy21) {
                    qqd0Var = qqd0.f;
                } else if (jy21Var instanceof gy21) {
                    qqd0Var = qqd0.h;
                } else if (jy21Var instanceof cy21) {
                    qqd0Var = qqd0.a;
                } else {
                    qqd0Var = jy21Var instanceof hy21 ? qqd0.g : qqd0.d;
                }
                return unyVar.x(new pqd0(qqd0Var));
            case 6:
                meu0 meu0Var = (meu0) obj;
                tzr0 tzr0Var = (tzr0) obj3;
                PlayerState playerState = meu0Var.a;
                boolean zE = l4o1.E((ContextTrack) playerState.track().b());
                boolean z5 = playerState.isPlaying() && !playerState.isPaused();
                String str2 = (String) playerState.contextMetadata().get("context_description");
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                String str4 = ((bnj0) tzr0Var.d).v(playerState).b;
                Restrictions restrictions = playerState.restrictions();
                if (meu0Var.d) {
                    i = 2;
                } else {
                    ktl ktlVar = meu0Var.c;
                    if (ktlVar == ktl.b) {
                        i = 1;
                    } else if (ktlVar == ktl.c) {
                        i = 2;
                    } else {
                        ContextTrack contextTrack2 = (ContextTrack) playerState.track().b();
                        contextTrack2.getClass();
                        if (h4o1.o(contextTrack2)) {
                            i2 = 1;
                        } else if (l4o1.P(contextTrack2) || l4o1.G(contextTrack2)) {
                            i2 = 2;
                        }
                        i = i2;
                    }
                }
                gn10 gn10Var = new gn10(playerState.playOrigin().featureIdentifier());
                ContextTrack contextTrack3 = (ContextTrack) playerState.track().h();
                boolean zO = contextTrack3 != null ? h4o1.o(contextTrack3) : false;
                ContextTrack contextTrack4 = (ContextTrack) playerState.track().h();
                boolean zS = contextTrack4 != null ? l4o1.S(contextTrack4) : false;
                ContextTrack contextTrack5 = (ContextTrack) playerState.track().h();
                boolean zI2 = contextTrack5 != null ? l4o1.I(contextTrack5) : false;
                for (Object obj4 : playerState.nextTracks()) {
                    ContextTrack contextTrack6 = (ContextTrack) obj4;
                    contextTrack6.getClass();
                    if (!l4o1.S(contextTrack6)) {
                        obj2 = obj4;
                        contextTrack = (ContextTrack) obj2;
                        if (contextTrack != null) {
                            zI = l4o1.I(contextTrack);
                        } else {
                            zI = false;
                        }
                        if (zO || !(puw.a.contains(gn10Var) || zI2 || (zS && zI))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (playerState.signals().contains("reshuffle") || meu0Var.b != rp91.b) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        return new z7z0(z5, zE, str3, str4, restrictions, z2, i, z);
                    }
                }
                contextTrack = (ContextTrack) obj2;
                if (contextTrack != null) {
                    zI = l4o1.I(contextTrack);
                } else {
                    zI = false;
                }
                if (zO) {
                    z = false;
                } else {
                    z = false;
                }
                if (playerState.signals().contains("reshuffle")) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                return new z7z0(z5, zE, str3, str4, restrictions, z2, i, z);
            case 8:
                String str5 = (String) obj;
                bru0 bru0Var = (bru0) obj3;
                hn91 hn91Var = bru0Var.a;
                str5.getClass();
                return hn91Var.a(str5).flatMapObservable(new yqu0(bru0Var, str5, (byte) 0));
            case 9:
                List listL1 = o7h.l1(((d9v0) obj).a);
                return new ObservableFromPublisher(((f9v0) obj3).a.b(new oi("PodcastSubscriptionDownloadGateEffectHandler", true, new nec0(listL1, (byte) 9))).filter(xj20.c1).toFlowable(BackpressureStrategy.d).J(new z8c(listL1, (byte) 2)).M(new qy40(listL1, (byte) 3))).map(wdu0.d1).onErrorComplete();
            case 12:
                return ((huh0) ((o4e0) obj3).b).a("watch-feed", new gx30((li90[]) ((o8u) obj).a.toArray(new li90[0])));
            case 14:
                Map map = (Map) obj;
                isv0 isv0Var = (isv0) obj3;
                String str6 = (String) map.get("type");
                String str7 = (String) map.get("payment-state");
                String str8 = "employee";
                String str9 = (String) map.get("employee");
                String str10 = (String) map.get("tablet-free");
                if (str10 != null && str10.equals("1") && !isv0Var.c()) {
                    str8 = "premium";
                } else if (!u890.j(str6, "premium")) {
                    str8 = "free";
                } else if (str7 != null && nhc1.Y(str7, "opt-in-trial", false)) {
                    str8 = "opt-in-trial";
                } else if (!u890.j(str9, "1")) {
                    str8 = "premium";
                }
                return new suv0(str8);
            case 17:
                return ((v5n) obj3).b(((o1x0) obj).g).map(ak20.b1).map(bk20.d1).onErrorReturn(w1x0.b);
            case 18:
                return new tax0(((w8x0) obj3).c);
            case 19:
                obx0 obx0Var = (v9x0) obj;
                tzr0 tzr0Var2 = (tzr0) obj3;
                if (obx0Var instanceof zbx0) {
                    return Single.just(obx0Var);
                }
                if (!(obx0Var instanceof obx0)) {
                    eg.o();
                    return null;
                }
                Set set = s4b1.f;
                String strS = uic.x(obx0Var.b).s();
                strS.getClass();
                Single singleOnErrorReturn = ((v5n) tzr0Var2.d).b(strS).firstOrError().map(new yeu0(tzr0Var2, obx0Var, (byte) 28)).onErrorReturn(new xmu0(obx0Var, strS, (byte) 22));
                singleOnErrorReturn.getClass();
                return singleOnErrorReturn;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ObservableFromPublisher(new FlowableTake(((t6z0) obj3).c.c));
        }
    }

    public LinkedHashMap b() {
        ovw0 mvw0Var;
        String strValueOf;
        Map mapO = ((ProductStateProto) this.b).o();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapO.size()));
        Iterator it = mapO.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mvw0Var = pvw0.a;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AccountAttribute accountAttribute = (AccountAttribute) entry.getValue();
            int iP = accountAttribute.p();
            int i = iP == 0 ? -1 : guw0.a[l1d.C(iP)];
            if (i == 1) {
                mvw0Var = new mvw0(accountAttribute.getBoolValue());
            } else if (i == 2) {
                mvw0Var = new nvw0(accountAttribute.o());
            } else if (i == 3) {
                mvw0Var = new ovw0(accountAttribute.getStringValue());
            }
            linkedHashMap.put(key, mvw0Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!u890.j(entry2.getValue(), mvw0Var)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key2 = entry3.getKey();
            mvw0 mvw0Var2 = (qvw0) entry3.getValue();
            if (mvw0Var2 instanceof mvw0) {
                strValueOf = mvw0Var2.a ? "1" : "0";
            } else if (!(mvw0Var2 instanceof nvw0)) {
                if (!(mvw0Var2 instanceof ovw0)) {
                    linkedHashMap3 = null;
                    if (!u890.j(mvw0Var2, mvw0Var)) {
                        eg.o();
                        break;
                    }
                    eg.m("ValueNotSet");
                    return null;
                }
                strValueOf = ((ovw0) mvw0Var2).a;
            } else {
                strValueOf = String.valueOf(((nvw0) mvw0Var2).a);
            }
            linkedHashMap3.put(key2, strValueOf);
        }
        return linkedHashMap3;
    }

    public void q(Bundle bundle, String str) {
        String string = bundle.getString("error");
        Logger.d(l1d.m("QuickLoginActivity - Login failed with error: ", string), new Object[0]);
        QuickLoginActivity quickLoginActivity = (QuickLoginActivity) this.b;
        Intent intent = new Intent();
        if (string == null) {
            string = "unknown";
        }
        quickLoginActivity.setResult(0, intent.putExtra("loginFailureReason", string));
        quickLoginActivity.finish();
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                Integer num = (Integer) obj;
                b14 b14Var = (b14) obj2;
                if (num != null) {
                    int iIntValue = num.intValue();
                    int i = 0;
                    for (Object obj3 : (List) b14Var.e) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        EditText editText = (EditText) obj3;
                        if (i != 0) {
                            editText.getLayoutParams().setMarginStart(iIntValue);
                        }
                        i = i2;
                    }
                    return;
                }
                return;
            case 11:
                Set set = (Set) obj;
                set.getClass();
                MobiusLoop mobiusLoop = ((glv0) obj2).b;
                if (mobiusLoop != null) {
                    mobiusLoop.a(new ukv0(set));
                    return;
                } else {
                    u890.C("loop");
                    throw null;
                }
            case 20:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                y441 y441Var = ((irx0) obj2).a;
                EncoreButton encoreButton = (EncoreButton) y441Var.b;
                encoreButton.setEnabled(!zBooleanValue);
                encoreButton.setAlpha(zBooleanValue ? qx21.a(2131166793, ((ConstraintLayout) y441Var.a).getResources()) : 1.0f);
                return;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                p1f0 p1f0Var = (p1f0) ((ytp0) obj2).d;
                y441 y441Var2 = (y441) p1f0Var.g;
                ((EncoreButton) y441Var2.b).setEnabled(!zBooleanValue2);
                ((EncoreButton) y441Var2.b).setAlpha(zBooleanValue2 ? qx21.a(2131166793, ((ConstraintLayout) p1f0Var.a).getResources()) : 1.0f);
                return;
        }
    }

    public sks0(rut0 rut0Var) {
        this.a = (byte) 24;
        this.b = new m7y((h0n1) rut0Var.b);
    }

    public sks0(sjb sjbVar, fjb fjbVar) {
        this.a = (byte) 13;
        this.b = sjbVar;
    }

    public /* synthetic */ sks0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public sks0() {
        this.a = (byte) 29;
        i0c1 i0c1Var = new i0c1();
        i0c1Var.a();
        this.b = i0c1Var;
    }

    public Object apply(Object obj, Object obj2) {
        return sqg0.O(sqg0.O((LinkedHashMap) this.b, (Map) obj), (Map) obj2);
    }
}
