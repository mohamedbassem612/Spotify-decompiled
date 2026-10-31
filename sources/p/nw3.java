package p;

import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nw3 implements it80 {
    public final /* synthetic */ byte a;
    public final sb40 b;

    public /* synthetic */ nw3(sb40 sb40Var, byte b) {
        this.a = b;
        this.b = sb40Var;
    }

    public final void a(ajq0 ajq0Var) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ajq0Var.L(hy3.d, "Open the track allowlisting request sheet", new yo31(this, (byte) 15));
                ajq0Var.L(gy3.e, "Open the audiobook allowlisting request sheet", new fl1(this, (byte) 13));
                break;
            case 1:
                ajq0Var.K(blc0.jb, "Page for managing the blocked content for a managed account", new xgc(this, (byte) 15));
                wmo1.q(ajq0Var, l6o1.p(new ebu(blc0.Ec, (byte) 7), new ebu(blc0.Cc, (byte) 7)), "Page for managing the blocked or approved content list for a managed account", new zz90(this, (lnm) null, (byte) 17));
                break;
            default:
                ajq0Var.K(blc0.cb, "Open allowlisting requests for a child managed account", new hod0(this, (byte) 9));
                ajq0Var.E(new m6d((byte) 5), "Open allowlisting requests for a child managed account", new d4e0(this, (byte) 7));
                break;
        }
    }

    public irn0 b(String str) {
        return !this.b.b.g() ? crn0.a : new hrn0(d9g0.class, new k9g0(str, nik1.a6.b("spotify:internal:managed-account-allowlisting-requests:child:".concat(str))), a6w0.a);
    }

    public irn0 c(Intent intent) {
        String stringExtra;
        String dataString = intent.getDataString();
        mw3 mw3Var = null;
        if (dataString != null) {
            jy3 jy3Var = jy3.a;
            idd1 idd1Var = jy3.d;
            a3i1 a3i1Var = (a3i1) idd1Var.getValue();
            Set set = x6b1.e;
            x6b1 x6b1VarL = oqn1.l(dataString);
            v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
            gy3 gy3Var = v5b1VarA instanceof gy3 ? (gy3) v5b1VarA : null;
            if (gy3Var != null) {
                mw3Var = new mw3(2, "spotify:show:".concat(gy3Var.a), dataString);
            } else {
                a3i1 a3i1Var2 = (a3i1) idd1Var.getValue();
                x6b1 x6b1VarL2 = oqn1.l(dataString);
                v5b1 v5b1VarA2 = x6b1VarL2 == null ? null : a3i1Var2.a(x6b1VarL2);
                if ((v5b1VarA2 instanceof hy3 ? (hy3) v5b1VarA2 : null) != null && (stringExtra = intent.getStringExtra("com.spotify.genalphablocking.childallowlistingrequest.bottomsheetpage.EXTRA_ITEM_URI")) != null) {
                    if (stringExtra.length() <= 0) {
                        stringExtra = null;
                    }
                    if (stringExtra != null) {
                        mw3Var = new mw3(1, stringExtra, dataString);
                    }
                }
            }
        }
        return (mw3Var != null && this.b.b.c() && mw3Var.c == 1) ? new hrn0(jw3.class, mw3Var, new b6w0(false)) : crn0.a;
    }
}
