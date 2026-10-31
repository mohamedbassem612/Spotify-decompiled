package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qv3 implements it80 {
    public final /* synthetic */ byte a;

    public /* synthetic */ qv3(byte b) {
        this.a = b;
    }

    public static hrn0 b(Intent intent, th61 th61Var, lik1 lik1Var) {
        Object next;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strN = s4b1VarX.n("session");
        String strN2 = s4b1VarX.n("member");
        d7 d7Var = new d7(vur0.g, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (!((vur0) next).a().equals(s4b1VarX.n("source")));
        vur0 vur0Var = (vur0) next;
        if (vur0Var == null) {
            vur0Var = vur0.e;
        }
        return c(th61Var.a, strN, vur0Var, strN2, lik1Var);
    }

    public static hrn0 c(String str, String str2, vur0 vur0Var, String str3, lik1 lik1Var) {
        return lfb.l(our0.class, new pur0(str, vur0Var, str2, str3, ajo1.q(vur0Var, str3), lik1Var), new c6w0(1, true, (hd5) null, 12));
    }

    public static irn0 d(String str, Intent intent) {
        ArrayList arrayListU;
        Set set = s4b1.f;
        String strK = zjy.k(intent);
        if (strK == null) {
            return crn0.a;
        }
        Bundle extras = intent.getExtras();
        Set setP1 = null;
        g3d0 g3d0Var = extras != null ? (g3d0) jhc1.t(extras, "extra_sort_order", g3d0.class) : null;
        if (extras != null && (arrayListU = jhc1.u(extras, "extra_filters", orc0.class)) != null) {
            setP1 = o7h.p1(arrayListU);
        }
        return new hrn0(tqy.class, new vqy(strK, str, intent.getStringExtra("extra_playback_context_uri"), g3d0Var, setP1), a6w0.a);
    }

    @Override // p.it80
    public final void a(ajq0 ajq0Var) {
        switch (this.a) {
            case 0:
                ajq0Var.K(blc0.PREMIUM_ACCOUNT_MANAGEMENT_SUB_ACCOUNT_ALLOCATION_REQUEST_WITHOUT_DIALOG, "Sub account allocation request without showing dialog first", y580.d);
                ajq0Var.K(blc0.PREMIUM_ACCOUNT_MANAGEMENT_SUB_ACCOUNT_REQUEST_FEATURE_WITH_OFFER_WITHOUT_DIALOG, "Sub account offer-based feature request without showing dialog first", zp8.g);
                break;
            case 1:
                ajq0Var.I(blc0.BLEND_INVITATION, "Blend Invitation page", a1b.class, een.U0);
                break;
            case 2:
                v560 v560Var = v560.Z;
                ajq0Var.K(blc0.BROWSE_RELEASES, "Deprecated. This will redirect spotify:browse instead. Use spotify:genre:new-releases.", v560Var);
                ajq0Var.K(blc0.BROWSE_NEW_RELEASES, "Deprecated. This will redirect spotify:browse instead. Use spotify:genre:new-releases.", v560Var);
                ajq0Var.K(blc0.BROWSE_LINK, "Deprecated. This will redirect spotify:browse instead.", v560Var);
                ajq0Var.K(blc0.BROWSE_HUBS, "Deprecated. This will redirect spotify:browse instead.", v560Var);
                ajq0Var.K(blc0.BROWSE_IMAGESET, "Deprecated. This will redirect spotify:browse instead.", v560Var);
                ajq0Var.K(blc0.BROWSE_TOPPODCAST, "Deprecated. This will redirect spotify:browse instead.", v560Var);
                break;
            case 3:
                vf61 vf61Var = vf61.i;
                ajq0Var.K(blc0.CHARTS_ROOT, "Charts overview page", vf61Var);
                ajq0Var.K(blc0.CHARTS_ALBUM_SPECIFIC, "Individual Album Chart page", vf61Var);
                ajq0Var.K(blc0.CHARTS_SUBPAGE, "Charts grid view page", vf61Var);
                break;
            case 4:
                Iterator it = dm61.z0(blc0.PROFILE_EDIT, blc0.PROFILE_EDIT_LEGACY).iterator();
                while (it.hasNext()) {
                    ajq0Var.K((blc0) it.next(), "Edit Profile of Spotify user", mif1.a1);
                }
                break;
            case 5:
                wmo1.q(ajq0Var, cpn1.w(blc0.PODCAST_CHAPTER), "Handle podcast chapter links", new ms4(this, (lnm) null, (byte) 5));
                wmo1.q(ajq0Var, cpn1.w(blc0.CLIP), "Handle clip links", new uls(this, (lnm) null, (byte) 11));
                break;
            case 6:
                ajq0Var.K(blc0.CHAT_INTERCEPTOR, "Campfire Interceptor", wdu0.T0);
                break;
            case 7:
                wmo1.q(ajq0Var, l6o1.o(new jbh0[]{cpn1.w(blc0.KID_ACCOUNT_CREATION_SUBMIT)}), "The final step of managed account creation which triggers the creation of the account", new xx0());
                break;
            case 8:
                ajq0Var.K(blc0.LANGUAGESETTINGSMUSIC, "Music language selection", vf61.W0);
                break;
            case 9:
                wmo1.q(ajq0Var, l6o1.o(new jbh0[]{cpn1.w(blc0.PARENTAL_CONTROL_LOGIN_CHOICE)}), "A page for the plan manager to decide where to log in a managed account", new qye0(3, null));
                break;
            case 10:
                wmo1.p(ajq0Var, new cwf0((byte) 0), "Handle account magic link when user is already authenticated", new dwf0(this, (lnm) null, (byte) 0));
                break;
            case 11:
                ajq0Var.E(new cwf0((byte) 2), "Handle www.spotify.com parental consent create managed account URL", new eoc(this, (byte) 18));
                ajq0Var.K(blc0.PARENTAL_CONSENT_CREATE_MANAGED_ACCOUNT, "Entry page that initializes the parental consent creation flow", new lqc(this, (byte) 18));
                ajq0Var.K(blc0.PARENTAL_CONSENT_TRANSITION_MANAGED_ACCOUNT, "Entry page that initializes the parental consent transition flow", new pvc(this, (byte) 18));
                break;
            case 12:
                ajq0Var.K(blc0.CHAT_TRUSTED_CIRCLE, "Trusted circle invite flow", bjx0.U0);
                break;
            case 13:
                ajq0Var.K(blc0.VTEC_CLOSE_MODAL_BROWSER, "Navigates to specified redirect URI set as query param", new hwb(this, (byte) 29));
                break;
            default:
                ajq0Var.K(lqm1.a, "Your Episodes Settings: Configure the Episode collection experience", rtw0.t);
                break;
        }
    }
}
