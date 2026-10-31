package p;

import com.spotify.upsells.events.proto.UpsellMigrationParity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qy30 {
    public final t2j0 a;

    public void a(w0i1 w0i1Var) {
        String str;
        String str2;
        String str3;
        szh1 szh1VarN = UpsellMigrationParity.n();
        z740 z740Var = w0i1Var.a;
        szh1VarN.r(z740Var.a);
        szh1VarN.n(z740Var.b);
        int iC = l1d.C(z740Var.c);
        if (iC == 0) {
            str = "CAPPED";
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            str = "ENTITLEMENT_MISSING";
        }
        szh1VarN.t(str);
        szh1VarN.u(w0i1Var.b.name());
        switch (w0i1Var.c) {
            case 1:
                str2 = "SUCCESS";
                break;
            case 2:
                str2 = "MISSING_CONTENT";
                break;
            case 3:
                str2 = "INVALID_RESPONSE";
                break;
            case 4:
                str2 = "UNEXPECTED_PRESENTATION";
                break;
            case 5:
                str2 = "NO_UPSELL";
                break;
            case 6:
                str2 = "API_ERROR";
                break;
            case 7:
                str2 = "TIMEOUT";
                break;
            case 8:
                str2 = "EXCEPTION";
                break;
            default:
                throw null;
        }
        szh1VarN.v(str2);
        szh1VarN.s(jfv.h(w0i1Var.d));
        switch (w0i1Var.e) {
            case 1:
                str3 = "MATCH_OFFER";
                break;
            case 2:
                str3 = "MATCH_NO_OFFER";
                break;
            case 3:
                str3 = "MISMATCH_TEXT";
                break;
            case 4:
                str3 = "LEGACY_ONLY_OFFER";
                break;
            case 5:
                str3 = "NEW_ONLY_OFFER";
                break;
            case 6:
                str3 = "NOT_COMPARED";
                break;
            default:
                throw null;
        }
        szh1VarN.q(str3);
        szh1VarN.w();
        UpsellMigrationParity upsellMigrationParity = (UpsellMigrationParity) szh1VarN.build();
        upsellMigrationParity.getClass();
        this.a.a(upsellMigrationParity);
    }
}
