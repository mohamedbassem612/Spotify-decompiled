package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lbx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y570 b;
    public final /* synthetic */ l670 c;
    public final /* synthetic */ p811 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbx(l570 l570Var, y570 y570Var, l670 l670Var, p811 p811Var, byte b) {
        super(1);
        this.a = b;
        this.b = y570Var;
        this.c = l670Var;
        this.d = p811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y570 y570Var = this.b;
        l670 l670Var = this.c;
        p811 p811Var = this.d;
        gg11 gg11Var = gg11.g;
        switch (b) {
            case 0:
                int iOrdinal = ((z53) obj).ordinal();
                if (iOrdinal == 0) {
                    l670Var.c.d(new u570("toggleLikeStateClick", y570Var, Collections.singletonMap("shouldAddToLibrary", Boolean.valueOf(!((a63) p811Var.a).f))));
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal == 2) {
                    return rih1Var;
                }
                if (iOrdinal == 3) {
                    l670Var.c.d(new u570("showMoreClick", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
                l670Var.c.d(new u570("togglePlayStateClick", y570Var, Collections.singletonMap("shouldPlay", Boolean.valueOf(!((a63) p811Var.a).g))));
                return rih1Var;
            case 1:
                int iOrdinal2 = ((de3) obj).ordinal();
                if (iOrdinal2 == 0) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal2 == 1) {
                    l670Var.c.d(new u570("accessoryItemClick", y570Var, Collections.singletonMap("isCurrentlySaved", Boolean.valueOf(((ee3) p811Var.a).h))));
                    return rih1Var;
                }
                if (iOrdinal2 == 2) {
                    l670Var.c.d(new u570("togglePlayStateClick", y570Var, Collections.singletonMap("shouldPlay", Boolean.valueOf(!((ee3) p811Var.a).g))));
                    return rih1Var;
                }
                if (iOrdinal2 == 3) {
                    l670Var.c.d(new u570("shareClick", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                int iOrdinal3 = ((d2z) obj).ordinal();
                if (iOrdinal3 == 0) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal3 == 1) {
                    return rih1Var;
                }
                if (iOrdinal3 == 2) {
                    l670Var.c.d(new u570("showMoreClick", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal3 == 3) {
                    l670Var.c.d(new u570("toggleLikeStateClick", y570Var, Collections.singletonMap("shouldAddToLibrary", Boolean.valueOf(!((e2z) p811Var.a).i))));
                    return rih1Var;
                }
                if (iOrdinal3 != 4) {
                    eg.o();
                    return null;
                }
                l670Var.c.d(new u570("togglePlayStateClick", y570Var, Collections.singletonMap("shouldPlay", Boolean.valueOf(!((e2z) p811Var.a).j))));
                return rih1Var;
            case 3:
                int iOrdinal4 = ((tgu0) obj).ordinal();
                if (iOrdinal4 == 0) {
                    l670Var.c.d(new u570("toggleLikeStateClick", y570Var, Collections.singletonMap("shouldAddToLibrary", Boolean.valueOf(!((ugu0) p811Var.a).g))));
                    return rih1Var;
                }
                if (iOrdinal4 == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal4 == 2) {
                    return rih1Var;
                }
                if (iOrdinal4 == 3) {
                    l670Var.c.d(new u570("showMoreClick", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal4 == 4) {
                    l670Var.c.d(new u570("toggleLikeStateClick", y570Var, Collections.singletonMap("shouldAddToLibrary", Boolean.valueOf(!((ugu0) p811Var.a).g))));
                    return rih1Var;
                }
                if (iOrdinal4 != 5) {
                    eg.o();
                    return null;
                }
                l670Var.c.d(new u570("togglePlayStateClick", y570Var, Collections.singletonMap("shouldPlay", Boolean.valueOf(!((ugu0) p811Var.a).h))));
                return rih1Var;
            case 4:
                int iOrdinal5 = ((upg1) obj).ordinal();
                if (iOrdinal5 == 0) {
                    l670Var.c.d(new u570("click", y570Var, sqg0.J(new mmr0[]{new mmr0("shouldPlay", Boolean.valueOf(!((vpg1) p811Var.a).a)), new mmr0("navigateToNpv", Boolean.TRUE)})));
                    return rih1Var;
                }
                if (iOrdinal5 == 1) {
                    l670Var.c.d(new u570("accessoryItemClick", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal5 == 2) {
                    l670Var.c.d(new u570("togglePlayStateClick", y570Var, sqg0.J(new mmr0[]{new mmr0("shouldPlay", Boolean.valueOf(!((vpg1) p811Var.a).a)), new mmr0("navigateToNpv", Boolean.TRUE)})));
                    return rih1Var;
                }
                if (iOrdinal5 == 3) {
                    l670Var.c.d(new u570("showMoreClick", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal5 == 4) {
                    l670Var.c.d(new u570("lockedClick", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                int iOrdinal6 = ((wdj1) obj).ordinal();
                if (iOrdinal6 == 0) {
                    l670Var.c.d(new u570("accessoryItemClick", y570Var, gg11Var));
                    return rih1Var;
                }
                if (iOrdinal6 == 1) {
                    l670Var.c.d(new u570("click", y570Var, sqg0.J(new mmr0[]{new mmr0("shouldPlay", Boolean.valueOf(!((zdj1) p811Var.a).c)), new mmr0("navigateToNpv", Boolean.TRUE)})));
                    return rih1Var;
                }
                if (iOrdinal6 == 2) {
                    l670Var.c.d(new u570("togglePlayStateClick", y570Var, sqg0.J(new mmr0[]{new mmr0("shouldPlay", Boolean.valueOf(!((zdj1) p811Var.a).c)), new mmr0("navigateToNpv", Boolean.TRUE)})));
                    return rih1Var;
                }
                if (iOrdinal6 == 3) {
                    l670Var.c.d(new u570("lockedClick", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
