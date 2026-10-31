package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nwj1 {
    public static final bma1 e;
    public static final bma1 f;
    public final dma1 a;
    public final am4 b;
    public final zia c = new zia();
    public final zia d = new zia();

    static {
        nbc nbcVar = bma1.b;
        e = nbcVar.u("video_stream_quality");
        f = nbcVar.u("video_stream_non_metered_quality");
    }

    public nwj1(dma1 dma1Var, am4 am4Var) {
        this.a = dma1Var;
        this.b = am4Var;
    }

    public final svj1 a(int i) {
        am4 am4Var = this.b;
        if (i == 1) {
            return new svj1(2, am4Var.e());
        }
        if (i == 2) {
            return new svj1(3, am4Var.f());
        }
        if (i == 3) {
            return new svj1(4, am4Var.d());
        }
        return i == 4 ? new svj1(5, am4Var.g()) : new svj1(1, am4Var.g());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final svj1 b() throws NoWhenBranchMatchedException {
        svj1 svj1Var;
        am4 am4Var = this.b;
        int iOrdinal = am4Var.c().ordinal();
        if (iOrdinal == 0) {
            svj1Var = new svj1(2, am4Var.e());
        } else if (iOrdinal == 1) {
            svj1Var = new svj1(3, am4Var.f());
        } else if (iOrdinal == 2) {
            svj1Var = new svj1(4, am4Var.d());
        } else {
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            svj1Var = new svj1(5, am4Var.g());
        }
        return a(this.a.l(f, xvj1.e(svj1Var.a)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final svj1 c() throws NoWhenBranchMatchedException {
        svj1 svj1Var;
        am4 am4Var = this.b;
        int iOrdinal = am4Var.b().ordinal();
        if (iOrdinal == 0) {
            svj1Var = new svj1(2, am4Var.e());
        } else if (iOrdinal == 1) {
            svj1Var = new svj1(3, am4Var.f());
        } else if (iOrdinal == 2) {
            svj1Var = new svj1(4, am4Var.d());
        } else {
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            svj1Var = new svj1(5, am4Var.g());
        }
        return a(this.a.l(e, xvj1.e(svj1Var.a)));
    }
}
