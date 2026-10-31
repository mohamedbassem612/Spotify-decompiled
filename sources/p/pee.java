package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pee implements it80, jrn0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ pee(boolean z) {
        this.a = (byte) 1;
    }

    public final void a(ajq0 ajq0Var) {
        switch (this.a) {
            case 0:
                Iterator it = f46.S0(new blc0[]{blc0.oe, blc0.pe}).iterator();
                while (it.hasNext()) {
                    ajq0Var.K((blc0) it.next(), "Edit Pronouns of Spotify user", olj0.O0);
                }
                break;
            case 1:
                ajq0Var.K(blc0.r3, "Chat content picker page", s321.P0);
                break;
            case 2:
                ajq0Var.J(new m6d((byte) 2), "Launch Greenroom Live Room Playback", new pob(this, (byte) 12));
                break;
            case 3:
                ajq0Var.K(blc0.Xf, "Redirect to kids/family exclude settings item", c710.i);
                break;
            case 4:
                ajq0Var.K(blc0.d9, "Kids profile avatar/color picker", zz10.i);
                break;
            case 5:
                ajq0Var.K(blc0.sd, "Show podcast sponsors for an episode", this);
                ajq0Var.K(blc0.td, "Show podcast sponsors for a show", this);
                break;
            case 6:
                ajq0Var.I(blc0.O9, "Display the licenses fragment.", g8c0.class, (hg30) null);
                break;
            case 7:
                ajq0Var.L(y6c0.d, "Library Import match review", b610.N0);
                break;
            case 8:
                ajq0Var.L(kan0.e, "Redirect public music video prerelease links to the mvcdp track link", qs10.R0);
                break;
            case 9:
                ajq0Var.I(blc0.wf, "Remote Configuration feature", h021.class, (hg30) null);
                break;
            default:
                ajq0Var.L(uwd1.d, "A page informing a teen that they have graduated to a self-managed account", new a0b(this, (byte) 27));
                break;
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String strConcat;
        String dataString = intent.getDataString();
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(dataString);
        blc0 blc0Var = s4b1VarX.c;
        String strJ = s4b1VarX.j();
        if (strJ == null) {
            strJ = "";
        }
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 666) {
            strConcat = "spotify:episode:".concat(strJ);
        } else {
            if (iOrdinal != 667) {
                hhg1.o(blc0Var, "Illegal link type: ");
                return null;
            }
            strConcat = "spotify:show:".concat(strJ);
        }
        Bundle bundleG = cy30.g("entity_uri_argument_key", strConcat);
        bundleG.putSerializable("sponsor_surface_key", d3d1.h);
        bundleG.putSerializable("see_all_surface_key", d3d1.g);
        return new frn0(bundleG, wyb0.class);
    }

    public pee(mhc mhcVar) {
        this.a = (byte) 2;
    }
}
