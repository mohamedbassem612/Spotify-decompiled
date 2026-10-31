package p;

import com.spotify.kidsview.v2.proto.GetParentOrGuardianViewResponse;
import com.spotify.kidsview.v2.proto.UnlinkAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class etr0 {
    public static final ctr0 a(GetParentOrGuardianViewResponse getParentOrGuardianViewResponse) {
        mdg0 mdg0Var;
        tho1 djh1Var;
        peg0 peg0VarN = getParentOrGuardianViewResponse.n();
        int iOrdinal = peg0VarN.ordinal();
        String str = null;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                mdg0Var = mdg0.a;
            } else if (iOrdinal == 2) {
                mdg0Var = mdg0.b;
            } else if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            String displayName = getParentOrGuardianViewResponse.o().getDisplayName();
            String imageUrl = getParentOrGuardianViewResponse.o().getImageUrl();
            if (!getParentOrGuardianViewResponse.o().hasImageUrl()) {
                imageUrl = null;
            }
            Integer numValueOf = Integer.valueOf(getParentOrGuardianViewResponse.o().getColor());
            if (!getParentOrGuardianViewResponse.o().hasColor()) {
                numValueOf = null;
            }
            cww0 cww0Var = new cww0(displayName, imageUrl, numValueOf);
            UnlinkAction unlinkActionP = getParentOrGuardianViewResponse.p();
            int iN = unlinkActionP.n();
            int i = iN == 0 ? -1 : dtr0.a[l1d.C(iN)];
            if (i == 1) {
                djh1Var = ejh1.c;
            } else if (i == 2) {
                String strO = unlinkActionP.o().o();
                if (unlinkActionP.o().p()) {
                    strO.getClass();
                    if (!ihc1.y0(strO)) {
                        str = strO;
                    }
                }
                djh1Var = new djh1(str);
            } else {
                if (i != 3) {
                    eg.o();
                    return null;
                }
                djh1Var = cjh1.c;
            }
            return new ctr0(mdg0Var, cww0Var, djh1Var);
        }
        hhg1.o(peg0VarN, "Unsupported managed account type: ");
        return null;
    }
}
