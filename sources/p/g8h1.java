package p;

import android.net.Uri;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import spotify.ubi.UbiContext;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g8h1 {
    public final z6r0 a;
    public final mwn0 b;
    public final yqg c;

    public g8h1(z6r0 z6r0Var, mwn0 mwn0Var, yqg yqgVar) {
        this.a = z6r0Var;
        this.b = mwn0Var;
        this.c = yqgVar;
    }

    public static dfa0 c(Uri uri) {
        int iV0;
        String queryParameter;
        y6r0 y6r0Var;
        if (uri.isHierarchical()) {
            queryParameter = uri.getQueryParameter("ubi");
        } else {
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            queryParameter = (schemeSpecificPart != null && (iV0 = ihc1.v0(schemeSpecificPart, '?', 0, 6)) >= 0) ? Uri.parse("_://_?".concat(schemeSpecificPart.substring(iV0 + 1))).getQueryParameter("ubi") : null;
        }
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = null;
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            UbiContext.UbiContextProto ubiContextProtoV = UbiContext.UbiContextProto.v(Base64.decode(queryParameter, 11));
            String strR = ubiContextProtoV.r();
            strR.getClass();
            if (strR.length() <= 0) {
                strR = null;
            }
            if (strR != null) {
                y6r0.Companion.getClass();
                y6r0Var = new y6r0(strR);
            } else {
                y6r0Var = null;
            }
            long jS = ubiContextProtoV.s();
            String strO = ubiContextProtoV.o();
            strO.getClass();
            String str = strO.length() > 0 ? strO : null;
            String strQ = ubiContextProtoV.q();
            strQ.getClass();
            String str2 = strQ.length() > 0 ? strQ : null;
            String strP = ubiContextProtoV.t() ? ubiContextProtoV.p() : null;
            String strN = ubiContextProtoV.n();
            strN.getClass();
            return new dfa0(y6r0Var, jS, str, str2, strP, strN.length() > 0 ? strN : null);
        } catch (Exception e) {
            Logger.e(e, "Failed to decode UBI journey token: ".concat(ihc1.c1(300, queryParameter)), new Object[0]);
            return null;
        }
    }

    public final boolean a(Uri uri) {
        dfa0 dfa0VarC = c(uri);
        boolean z = false;
        if (dfa0VarC != null && this.c.b() <= dfa0VarC.e()) {
            boolean zJ = u890.j(dfa0VarC.c(), "cross_user_handoff");
            mwn0 mwn0Var = this.b;
            if (!zJ) {
                String strA = dfa0VarC.a();
                if (strA != null) {
                    mwn0Var.e(mqn1.L((String) null, new ou80(strA)));
                    z = true;
                }
                y6r0 y6r0VarD = dfa0VarC.d();
                if (y6r0VarD != null) {
                    this.a.e(y6r0VarD);
                }
                return z;
            }
            String strB = dfa0VarC.b();
            if (strB != null) {
                y6r0.Companion.getClass();
                mwn0Var.e(mqn1.l(new y6r0(strB)));
                return true;
            }
        }
        return false;
    }

    public final Uri b(Uri uri, cwn0 cwn0Var) {
        try {
            Uri uriBuild = uri.buildUpon().appendQueryParameter("ubi", d(cwn0Var)).build();
            uriBuild.getClass();
            return uriBuild;
        } catch (Exception e) {
            Logger.e(e, h4b1.d(uri, "Failed to encode UBI journey token for URI: "), new Object[0]);
            return uri;
        }
    }

    public final String d(cwn0 cwn0Var) {
        y6r0 y6r0VarB;
        Integer num;
        d6h1 d6h1VarU = UbiContext.UbiContextProto.u();
        d6h1VarU.w();
        d6h1VarU.v(this.c.b() + 300000);
        boolean z = cwn0Var instanceof bwn0;
        bwn0 bwn0Var = z ? (bwn0) cwn0Var : null;
        tv80 tv80VarA = bwn0Var != null ? bwn0Var.a() : null;
        if (tv80VarA == null || (y6r0VarB = tv80VarA.b) == null) {
            y6r0VarB = this.a.b();
        }
        if (y6r0VarB != null) {
            String str = y6r0VarB.a;
            d6h1VarU.t(str);
            d6h1VarU.n(str);
        }
        if (tv80VarA != null && (num = tv80VarA.f) != null) {
            d6h1VarU.u(num.intValue());
        }
        if (cwn0Var instanceof awn0) {
            String str2 = ((awn0) cwn0Var).a().a;
            d6h1VarU.q(str2);
            d6h1VarU.r(str2);
            d6h1VarU.s("user_interaction");
        } else if (z) {
            String str3 = ((bwn0) cwn0Var).a().a.a;
            d6h1VarU.q(str3);
            d6h1VarU.r(str3);
            d6h1VarU.s("user_interaction");
        } else if (cwn0Var instanceof xvn0) {
            d6h1VarU.r(((xvn0) cwn0Var).a().a);
            d6h1VarU.s("cross_user_handoff");
        }
        return Base64.encodeToString(d6h1VarU.build().toByteArray(), 11);
    }
}
