package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.notifications.permissions.uiusecases.permissionscard.PermissionsCard$Events;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y3o0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3o0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new x3o0((o3o0) obj2, b2));
                return rih1Var;
            case 1:
                rwq0.z((qtr) obj, new r5o0((sbk) obj2, (byte) 0));
                return rih1Var;
            case 2:
                return ((m9o0) obj2).c;
            case 3:
                Intent intent = new Intent((Activity) obj, (Class<?>) NoAnimLauncherActivity.class);
                intent.setData(Uri.parse(((kjt) obj2).a));
                return intent;
            case 4:
                hdo0 hdo0Var = (hdo0) obj2;
                hdo0Var.S0 = ((Boolean) obj).booleanValue();
                tif1.b(hdo0Var.X, "LoggedInUi");
                return rih1Var;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                qoj0 qoj0Var = (qoj0) obj2;
                nwj1 nwj1Var = qoj0Var.a;
                svj1 svj1VarA = nwj1Var.a(iIntValue);
                qoj0Var.b.k(svj1VarA, iIntValue, 1);
                bma1 bma1Var = nwj1.f;
                hma1 hma1VarEdit = nwj1Var.a.edit();
                hma1VarEdit.b(bma1Var, xvj1.e(svj1VarA.a));
                hma1VarEdit.g();
                nwj1Var.d.accept(svj1VarA);
                return rih1Var;
            case 6:
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    return new vm61(2131959835, 2131962071, 2131959834, new pfo0((rfo0) obj2, bundle.getInt("oldValue"), bundle.getInt("newValue"), (lnm) null), new um61(new sl11(13, (byte) 7), new n601(qfo0.b, (byte) 28), fft0.Z0));
                }
                hhg1.n("Required value was null.");
                return null;
            case 7:
                ((qtr) obj).b(new js((loo0) obj2, (lnm) null, (byte) 16));
                return rih1Var;
            case 8:
                ((qtr) obj).b(new w3a((res) obj2, (lnm) null, (byte) 4));
                return rih1Var;
            case 9:
                iqo0 iqo0Var = (iqo0) obj2;
                return new pro0(iqo0Var.d.a, (hpo0) iqo0Var.f.getValue(), false, false);
            case 10:
                ((Boolean) obj).getClass();
                ((NotificationPermissionFragment) obj2).Y0();
                return rih1Var;
            case 11:
                return ((awo0) obj2).c;
            case 12:
                if (zvo0.a[((PermissionsCard$Events) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                bwo0 bwo0Var = (bwo0) obj2;
                i8h1 i8h1Var = bwo0Var.h;
                x6h1 x6h1VarC = bwo0Var.i.b.c();
                x6h1VarC.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 13:
                NowPlayingActivity nowPlayingActivity = (NowPlayingActivity) obj2;
                mwn0 mwn0Var = nowPlayingActivity.l1;
                if (mwn0Var == null) {
                    u890.C("navigationLogger");
                    throw null;
                }
                mwn0Var.e(new yrn0((ou80) null));
                mwn0 mwn0Var2 = nowPlayingActivity.l1;
                if (mwn0Var2 == null) {
                    u890.C("navigationLogger");
                    throw null;
                }
                mwn0Var2.f(new yrn0((ou80) null));
                nowPlayingActivity.finish();
                return rih1Var;
            case 14:
                rwq0.z((qtr) obj, new nzo0((qzo0) obj2, b2));
                return rih1Var;
            case 15:
                m1p0 m1p0Var = (m1p0) obj2;
                m1p0Var.e.c(m1p0.f[0], m1p0Var, Integer.valueOf(((Number) obj).intValue()));
                return rih1Var;
            case 16:
                ((l2p0) obj2).N0.invoke((kdn) obj);
                return rih1Var;
            case 17:
                return ((t3p0) obj2).b;
            case 18:
                return (awj) ((cc1) obj2).d;
            case 19:
                ((jen0) obj).a((NowPlayingScrollView) ((rok0) obj2).b);
                return rih1Var;
            case 20:
                ((Number) obj).intValue();
                return ((ihl0) obj2).b();
            case 21:
                return new twm0((Context) obj, ((z4p0) obj2).b.j);
            case 22:
                MobiusLoop mobiusLoop = ((e6p0) obj2).P0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 23:
                return new r6p0((s6p0) obj2, (byte) 0);
            case 24:
                ((knn0) obj2).a((car0) obj);
                return rih1Var;
            case 25:
                return Boolean.valueOf(u890.j(((k7p0) obj).a, ((k7p0) obj2).a));
            case 26:
                ((qtr) obj).b(new js((z72) obj2, (lnm) null, (byte) 17));
                return rih1Var;
            case 27:
                hur hurVar = (hur) ((hgo) obj2).e;
                String str = ((tv80) obj).a.a;
                l0l l0lVar = (l0l) hqq0.L(((g0l) hurVar.c).i()).h();
                if (l0lVar != null) {
                    hurVar.x(-1, l0lVar.j(), str);
                }
                return rih1Var;
            case 28:
                return new xwm0((akk1) obj2, (byte) 3);
            default:
                zlp0 zlp0Var = (zlp0) obj2;
                cas casVar = (a7m0) obj;
                casVar.d = new xlp0(zlp0Var, (byte) 0);
                casVar.e = new xlp0(zlp0Var, (byte) 1);
                bmp0 bmp0Var = zlp0Var.d;
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = bmp0Var.b;
                mr20[] mr20VarArr = {new ek(bmp0Var.a.c, (byte) 3)};
                companion.getClass();
                casVar.b = new b(q8nVar, mr20VarArr);
                return rih1Var;
        }
    }
}
