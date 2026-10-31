package p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.Window;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin;
import com.spotify.lockstate.lockedscreen.data.LockStateResolutionException;
import com.spotify.lockstate.v1.proto.Action;
import com.spotify.lockstate.v1.proto.ActionableButton;
import com.spotify.lockstate.v1.proto.Callback;
import com.spotify.lockstate.v1.proto.ColumnLayout;
import com.spotify.lockstate.v1.proto.Lock;
import com.spotify.lockstate.v1.proto.LockLayout;
import com.spotify.lockstate.v1.proto.LockSection;
import com.spotify.lockstate.v1.proto.NavigateTo;
import com.spotify.lockstate.v1.proto.SectionedLayout;
import com.spotify.lockstate.v1.proto.ShowBottomSheet;
import com.spotify.lockstate.v1.proto.ShowDialog;
import com.spotify.player.model.ContextTrack;
import j$.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class sap1 {
    public static b180 a;
    public static b180 b;

    public static ayh a() {
        return new ayh((faa0) null);
    }

    public static final void b(hy81 hy81Var, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1105123815);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hy81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(oi7.a.a(gw70Var), apo.r(-2130612569, new q081(hy81Var, iu30Var, (byte) 9), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, hy81Var, gw70Var, iu30Var, qim0Var2, (byte) 17);
        }
    }

    public static final OfflinePlugin.PluginResponse c() {
        lup0 lup0VarO = OfflinePlugin.PluginResponse.o();
        lup0VarO.q();
        return lup0VarO.build();
    }

    public static final void d(zxh zxhVar, Object obj) {
        Throwable thA = e331.a(obj);
        ayh ayhVar = (ayh) zxhVar;
        if (thA == null) {
            ayhVar.m0(obj);
        } else {
            ayhVar.y0(thA);
        }
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static final ti f(ContextTrack contextTrack, x6d1 x6d1Var) {
        String strT = l4o1.t(contextTrack);
        if (strT == null) {
            strT = "";
        }
        String str = (String) contextTrack.metadata().get("ad.companion.type");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -891050150) {
                if (iHashCode != 2068455348) {
                    if (iHashCode == 2080344788 && str.equals("canvas_video")) {
                        String str2 = (String) contextTrack.metadata().get("ad.canvas.file_id");
                        String strN = str2 != null ? wqn1.n(str2) : (String) contextTrack.metadata().get("ad.canvas.url");
                        return new jsn(strT, strN != null ? strN : "");
                    }
                } else if (str.equals("canvas_image")) {
                    String str3 = (String) contextTrack.metadata().get("ad.canvas.file_id");
                    String strN2 = str3 != null ? wqn1.n(str3) : (String) contextTrack.metadata().get("ad.canvas.url");
                    return new isn(strT, strN2 != null ? strN2 : "");
                }
            } else if (str.equals("survey")) {
                return new lsn(strT, x6d1Var);
            }
        }
        return new ksn(strT);
    }

    public static long g(View view) {
        long j = g7a0.k;
        if (j >= 0) {
            return j;
        }
        Window window = (view != null ? view.getContext() : null) instanceof Activity ? ((Activity) view.getContext()).getWindow() : null;
        float f = 60.0f;
        float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
        if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
            f = refreshRate;
        }
        long j2 = (long) ((1000.0f / f) * 1000000.0f);
        g7a0.k = j2;
        return j2;
    }

    public static final n860 h(ContextTrack contextTrack) {
        Object next;
        if (y3o1.e0(contextTrack)) {
            return new l860(true);
        }
        String str = (String) contextTrack.metadata().get("ad.video_orientation");
        Iterator it = a6k1.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((a6k1) next).a.equals(str));
        a6k1 a6k1Var = (a6k1) next;
        if (a6k1Var == null) {
            a6k1Var = a6k1.UNKNOWN;
        }
        if (a6k1Var == a6k1.LANDSCAPE) {
            return new l860(false);
        }
        if (y3o1.c0(contextTrack)) {
            return new m860();
        }
        return u890.j(contextTrack.metadata().get("ad.companion.type"), "survey") ? new l860(false) : k860.a;
    }

    public static final auw i(op80 op80Var) {
        eq80 eq80VarA = op80Var.a(o810.g);
        if (eq80VarA != null) {
            return eq80VarA.b;
        }
        return null;
    }

    public static ksk0 j(int i) {
        return new ksk0(i);
    }

    public static final int k(b380 b380Var) {
        Object next;
        ContextTrack contextTrack;
        Iterator it = b380Var.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            contextTrack = (ContextTrack) next;
            if (nhc1.Y(contextTrack.uri(), "spotify:track:", false)) {
                break;
            }
        } while (!l4o1.P(contextTrack));
        ContextTrack contextTrack2 = (ContextTrack) next;
        return (contextTrack2 != null && l4o1.P(contextTrack2)) ? 2 : 1;
    }

    public static boolean l(vt4 vt4Var) {
        return vt4Var.a();
    }

    public static final void m(zf30 zf30Var, String str, Bundle bundle) {
        zf30Var.j0().i0(bundle, str);
    }

    public static final void n(zf30 zf30Var, String str, q1 q1Var) {
        zf30Var.j0().j0(str, zf30Var, new nay(q1Var, (byte) 18));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.lockstate.lockedscreen.data.LockStateResolutionException */
    public static final moe0 o(Action action) throws LockStateResolutionException {
        bzn1 gyn0Var;
        if (action.u()) {
            return goe0.a;
        }
        if (action.v()) {
            NavigateTo navigateToP = action.p();
            if (navigateToP.p().q()) {
                gyn0Var = new fyn0(navigateToP.p().o());
            } else {
                if (!navigateToP.p().r()) {
                    throw new LockStateResolutionException(2);
                }
                gyn0Var = new gyn0(navigateToP.p().p());
            }
            return new joe0(gyn0Var, navigateToP.n());
        }
        if (action.s()) {
            Callback callbackN = action.n();
            return new eoe0(callbackN.getPath(), callbackN.s() ? o(callbackN.q()) : null, callbackN.r() ? o(callbackN.p()) : null, callbackN.n());
        }
        if (action.x()) {
            ShowDialog showDialogR = action.r();
            return new loe0(showDialogR.getTitle(), showDialogR.getMessage(), showDialogR.q() ? p(showDialogR.n()) : new woe0(), showDialogR.r() ? p(showDialogR.p()) : new woe0());
        }
        if (!action.w()) {
            return action.t() ? foe0.a : ioe0.a;
        }
        ShowBottomSheet showBottomSheetQ = action.q();
        String strN = showBottomSheetQ.r() ? showBottomSheetQ.n() : null;
        String strQ = showBottomSheetQ.s() ? showBottomSheetQ.q() : null;
        String title = showBottomSheetQ.u() ? showBottomSheetQ.getTitle() : null;
        moe0 subtitle = showBottomSheetQ.t() ? showBottomSheetQ.getSubtitle() : null;
        h290<ActionableButton> h290VarO = showBottomSheetQ.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (ActionableButton actionableButton : h290VarO) {
            actionableButton.getClass();
            arrayList.add(p(actionableButton));
        }
        return new koe0(strN, strQ, title, subtitle, arrayList);
    }

    public static final woe0 p(ActionableButton actionableButton) {
        return new woe0(actionableButton.r(), actionableButton.s() ? o(actionableButton.n()) : ioe0.a, actionableButton.t() ? actionableButton.p() : null, actionableButton.u() ? actionableButton.q() : null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.lockstate.lockedscreen.data.LockStateResolutionException */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    public static final xoe0 q(Lock lock) throws LockStateResolutionException {
        cpe0 tj51Var;
        if (!lock.s()) {
            throw new LockStateResolutionException(2);
        }
        String strQ = lock.q();
        LockLayout lockLayoutP = lock.p();
        if (lockLayoutP.q()) {
            ColumnLayout columnLayoutN = lockLayoutP.n();
            tj51Var = new kbh(columnLayoutN.u() ? columnLayoutN.n() : null, columnLayoutN.w() ? columnLayoutN.q() : null, columnLayoutN.getTitle(), columnLayoutN.getSubtitle(), p(columnLayoutN.r()), columnLayoutN.x() ? p(columnLayoutN.s()) : null, columnLayoutN.y() ? p(columnLayoutN.t()) : null, columnLayoutN.v() ? p(columnLayoutN.p()) : null);
        } else {
            if (!lockLayoutP.r()) {
                throw new LockStateResolutionException(2);
            }
            SectionedLayout sectionedLayoutP = lockLayoutP.p();
            String strN = sectionedLayoutP.r() ? sectionedLayoutP.n() : null;
            String title = sectionedLayoutP.getTitle();
            String strQ2 = sectionedLayoutP.s() ? sectionedLayoutP.q() : null;
            h290<LockSection> h290VarP = sectionedLayoutP.p();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
            for (LockSection lockSection : h290VarP) {
                lockSection.getClass();
                String strR = lockSection.r();
                String strN2 = lockSection.n();
                h290<ActionableButton> h290VarO = lockSection.o();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                for (ActionableButton actionableButton : h290VarO) {
                    actionableButton.getClass();
                    arrayList2.add(p(actionableButton));
                }
                String strQ3 = lockSection.q();
                if (lockSection.t()) {
                    strQ3.getClass();
                    if (strQ3.length() <= 0) {
                        strQ3 = null;
                    }
                } else {
                    strQ3 = null;
                }
                ActionableButton actionableButtonP = lockSection.p();
                if (!lockSection.s() || actionableButtonP.r().length() <= 0) {
                    actionableButtonP = null;
                }
                woe0 woe0VarP = actionableButtonP != null ? p(actionableButtonP) : null;
                arrayList.add(new wqe0(strR, strN2, arrayList2, strQ3 == null ? zqe0.c : woe0VarP == null ? new yqe0(strQ3) : new xqe0(strQ3, woe0VarP)));
            }
            tj51Var = new tj51(strN, title, strQ2, arrayList);
        }
        return new xoe0(strQ, tj51Var, lock.r() ? o(lock.n()) : ioe0.a);
    }

    public static final String r(long j) {
        if (j <= 0) {
            return "00:00";
        }
        ArrayList arrayList = new ArrayList();
        long j2 = j / 1000;
        long j3 = j2 / 60;
        if (j3 >= 60) {
            arrayList.add(String.valueOf(j3 / 60));
            arrayList.add(ihc1.F0(2, String.valueOf(j3 % 60)));
        } else {
            arrayList.add(ihc1.F0(2, String.valueOf(j3)));
        }
        arrayList.add(ihc1.F0(2, String.valueOf(j2 % 60)));
        return o7h.y0(arrayList, ":", (String) null, (String) null, (iu30) null, 62);
    }

    public static final String s(String str, lik1 lik1Var) {
        return xcg1.i(lik1Var.a, "?displayReason=", URLEncoder.encode(str, StandardCharsets.UTF_8.name()));
    }

    public static void t(String str, Parcel parcel) {
        parcel.writeString(str);
    }
}
