package p;

import android.app.ActivityManager;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class p350 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p350(Object obj, byte b) {
        super(0, obj, yrd0.class, "dismissedHostTopBar", "dismissedHostTopBar()V", 0);
        this.a = b;
        switch (b) {
            case 2:
                super(0, obj, yrd0.class, "clickedParticipantTopBar", "clickedParticipantTopBar()V", 0);
                break;
            case 3:
                super(0, obj, yrd0.class, "dismissedParticipantTopBar", "dismissedParticipantTopBar()V", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke() {
        Object value;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                yrd0 yrd0Var = (yrd0) ((lyc) this).receiver;
                i8h1 i8h1Var = yrd0Var.a;
                py9 py9Var = yrd0Var.c;
                x6h1 x6h1VarC = py9Var.c.c();
                x6h1VarC.i.add(new a7h1("host_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 1:
                yrd0 yrd0Var2 = (yrd0) ((lyc) this).receiver;
                i8h1 i8h1Var2 = yrd0Var2.a;
                py9 py9Var2 = yrd0Var2.c;
                x6h1 x6h1VarC2 = py9Var2.c.c();
                x6h1VarC2.i.add(new a7h1("participant_end_session_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_social_listening_session", 1, b7xVar), x6h1VarC2.a(), py9Var2.b, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 2:
                yrd0 yrd0Var3 = (yrd0) ((lyc) this).receiver;
                i8h1 i8h1Var3 = yrd0Var3.a;
                py9 py9Var3 = yrd0Var3.c;
                x6h1 x6h1VarC3 = py9Var3.c.c();
                x6h1VarC3.i.add(new a7h1("participant_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC3.a(), py9Var3.b, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 3:
                yrd0 yrd0Var4 = (yrd0) ((lyc) this).receiver;
                i8h1 i8h1Var4 = yrd0Var4.a;
                py9 py9Var4 = yrd0Var4.c;
                x6h1 x6h1VarC4 = py9Var4.c.c();
                x6h1VarC4.i.add(new a7h1("participant_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), py9Var4.b, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 4:
                return (ze50) ((kly0) ((lyc) this).receiver).get();
            case 5:
                return (n1n0) ((kly0) ((lyc) this).receiver).get();
            case 6:
                return ((d490) ((lyc) this).receiver).a();
            case 7:
                ((h490) ((lyc) this).receiver).a();
                return rih1Var;
            case 8:
                ee90 ee90Var = (ee90) ((lyc) this).receiver;
                ee90Var.getClass();
                i8h1 i8h1Var5 = (i8h1) ee90Var.b.get();
                x6h1 x6h1VarC5 = ee90Var.c.b.c();
                x6h1VarC5.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                ee90Var.a.a("spotify:managed-account-linking:invite-options", i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:managed-account-linking:invite-options")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return rih1Var;
            case 9:
                ee90 ee90Var2 = (ee90) ((lyc) this).receiver;
                ee90Var2.getClass();
                i8h1 i8h1Var6 = (i8h1) ee90Var2.b.get();
                x6h1 x6h1VarC6 = ee90Var2.c.b.c();
                x6h1VarC6.i.add(new a7h1("learn_more_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                ee90Var2.a.a("spotify:managed-account-linking:learn-more", i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:managed-account-linking:learn-more")), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return rih1Var;
            case 10:
                ((lzn0) ((lyc) this).receiver).e();
                return rih1Var;
            case 11:
                ((lzn0) ((lyc) this).receiver).e();
                return rih1Var;
            case 12:
                mrd0 mrd0Var = (mrd0) ((lyc) this).receiver;
                mrd0Var.Q0 = true;
                mrd0Var.h().b();
                return rih1Var;
            case 13:
                ((lzn0) ((lyc) this).receiver).e();
                return rih1Var;
            case 14:
                ((a5e0) ((lyc) this).receiver).getClass();
                try {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    Integer numValueOf = Integer.valueOf(i);
                    if (i != 0) {
                        return numValueOf;
                    }
                    return null;
                } catch (RuntimeException e) {
                    Logger.l(e, "Failed to read process importance", new Object[0]);
                    return null;
                }
            case 15:
                boe0 boe0Var = (boe0) ((lyc) this).receiver;
                i8h1 i8h1Var7 = (i8h1) boe0Var.a.get();
                x6h1 x6h1VarC7 = boe0Var.b.b.c();
                x6h1VarC7.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 16:
                oie0 oie0Var = (oie0) ((lyc) this).receiver;
                boe0 boe0Var2 = oie0Var.g;
                i8h1 i8h1Var8 = (i8h1) boe0Var2.a.get();
                x6h1 x6h1VarC8 = boe0Var2.b.b.c();
                x6h1VarC8.i.add(new a7h1("location_preview", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("remove_manual_location_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                xab1 xab1Var = oie0Var.X;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                oie0Var.X = null;
                bpb1 bpb1Var = oie0Var.i;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, sie0.a((sie0) value, (rne0) null, (String) null, 3, (uwc1) null, (List) null, 26)));
                return rih1Var;
            case 17:
                nwk0 nwk0Var = (nwk0) ((lyc) this).receiver;
                nwk0Var.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), nwk0Var.a, nwk0Var.b.b, System.currentTimeMillis());
            case 18:
                nwk0 nwk0Var2 = (nwk0) ((lyc) this).receiver;
                nwk0Var2.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), nwk0Var2.a, nwk0Var2.b.b, System.currentTimeMillis());
            case 19:
                owk0 owk0Var = (owk0) ((lyc) this).receiver;
                owk0Var.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), owk0Var.a, owk0Var.b.b, System.currentTimeMillis());
            case 20:
                owk0 owk0Var2 = (owk0) ((lyc) this).receiver;
                owk0Var2.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), owk0Var2.a, owk0Var2.b.b, System.currentTimeMillis());
            case 21:
                pwk0 pwk0Var = (pwk0) ((lyc) this).receiver;
                pwk0Var.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), pwk0Var.a, pwk0Var.b.b, System.currentTimeMillis());
            case 22:
                pwk0 pwk0Var2 = (pwk0) ((lyc) this).receiver;
                pwk0Var2.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), pwk0Var2.a, pwk0Var2.b.b, System.currentTimeMillis());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                uwk0 uwk0Var = (uwk0) ((lyc) this).receiver;
                uwk0Var.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), uwk0Var.a, uwk0Var.b.c.b, System.currentTimeMillis());
            case 24:
                uwk0 uwk0Var2 = (uwk0) ((lyc) this).receiver;
                uwk0Var2.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), uwk0Var2.a, uwk0Var2.b.c.b, System.currentTimeMillis());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                swk0 swk0Var = (swk0) ((lyc) this).receiver;
                swk0Var.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), swk0Var.a, r6h1.c, System.currentTimeMillis());
            case 26:
                twk0 twk0Var = (twk0) ((lyc) this).receiver;
                twk0Var.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), twk0Var.a, r6h1.c, System.currentTimeMillis());
            case 27:
                qwk0 qwk0Var = (qwk0) ((lyc) this).receiver;
                qwk0Var.getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), qwk0Var.a, r6h1.c, System.currentTimeMillis());
            case 28:
                qse0 qse0Var = (qse0) ((lyc) this).receiver;
                ((oq) qse0Var.a.get()).l();
                ((t3f0) qse0Var.b.get()).a(yg8.d);
                return rih1Var;
            default:
                ((scx) ((lyc) this).receiver).a();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p350(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p350(mrd0 mrd0Var) {
        super(0, mrd0Var, mrd0.class, "handleBannerDismiss", "handleBannerDismiss()V", 0);
        this.a = (byte) 12;
    }
}
