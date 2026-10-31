package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ogv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Resources b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogv(Resources resources, byte b) {
        super(1);
        this.a = b;
        this.b = resources;
    }

    public final Object invoke(Object obj) {
        rle1 rle1Var;
        rle1 rle1Var2;
        byte b = this.a;
        ngv ngvVar = ngv.g;
        Resources resources = this.b;
        switch (b) {
            case 0:
                long j = ((jfv) obj).a;
                long jD = j9k1.D(j);
                long jU = jfv.u(jD, ngvVar);
                int iJ = jfv.j(jD);
                jfv.l(jD);
                if (jU > 0 && iJ == 0) {
                    return new rle1(resources.getString(2131963203, Long.valueOf(jU)), resources.getQuantityString(2131820938, (int) jU, Long.valueOf(jU)));
                }
                if (jU > 0) {
                    rle1Var = new rle1(resources.getString(2131963204, Long.valueOf(jU), Integer.valueOf(iJ)), resources.getQuantityString(2131820939, iJ, Integer.valueOf((int) jU), Integer.valueOf(iJ)));
                } else {
                    if (jfv.c(j, fdg1.k0(1, ngv.f)) < 0) {
                        return new rle1(resources.getString(2131963205), resources.getString(2131963206));
                    }
                    rle1Var = new rle1(resources.getString(2131963207, Integer.valueOf(iJ)), resources.getString(2131963207, Integer.valueOf(iJ)));
                }
                return rle1Var;
            case 1:
                long jD2 = j9k1.D(((jfv) obj).a);
                long jU2 = jfv.u(jD2, ngvVar);
                int iJ2 = jfv.j(jD2);
                int iL = jfv.l(jD2);
                if (jU2 > 0 && iJ2 == 0) {
                    return new rle1(resources.getString(2131963196, Long.valueOf(jU2)), resources.getQuantityString(2131820935, (int) jU2, Long.valueOf(jU2)));
                }
                if (jU2 > 0) {
                    rle1Var2 = new rle1(resources.getString(2131963197, Long.valueOf(jU2), Integer.valueOf(iJ2)), resources.getQuantityString(2131820936, iJ2, Integer.valueOf((int) jU2), Integer.valueOf(iJ2)));
                } else {
                    if (iJ2 < 1) {
                        return new rle1(resources.getString(2131963199, Integer.valueOf(iL)), resources.getQuantityString(2131820937, iL, Integer.valueOf(iL)));
                    }
                    rle1Var2 = new rle1(resources.getString(2131963198, Integer.valueOf(iJ2)), resources.getString(2131963198, Integer.valueOf(iJ2)));
                }
                return rle1Var2;
            default:
                ad50 ad50Var = (ad50) obj;
                int iU = jch0.U(ad50Var.c * 100.0f);
                int i = ad50Var.a;
                return resources.getQuantityString(2131820693, i, Integer.valueOf(i), Integer.valueOf(iU));
        }
    }
}
