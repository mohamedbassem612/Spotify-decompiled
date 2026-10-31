package p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zl60 extends o5 {
    public zl60() {
        super(vl60.class, new ypa0[]{new xl60(iuf0.class)});
    }

    public static void Q(am60 am60Var) throws GeneralSecurityException {
        if (am60Var.o() < 10) {
            k220.r("tag size too small");
            return;
        }
        int iOrdinal = am60Var.n().ordinal();
        if (iOrdinal == 1) {
            if (am60Var.o() <= 20) {
                return;
            }
            k220.r("tag size too big");
        } else if (iOrdinal == 3) {
            if (am60Var.o() <= 32) {
                return;
            }
            k220.r("tag size too big");
        } else if (iOrdinal != 4) {
            k220.r("unknown hash type");
        } else {
            if (am60Var.o() <= 64) {
                return;
            }
            k220.r("tag size too big");
        }
    }

    public final k9 w() {
        return new yl60(wl60.class, (byte) 8);
    }
}
