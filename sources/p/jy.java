package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l670 b;
    public final /* synthetic */ y570 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(y570 y570Var, l670 l670Var) {
        super(1);
        this.a = (byte) 7;
        this.c = y570Var;
        this.b = l670Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gg11 gg11Var = gg11.g;
        rih1 rih1Var = rih1.a;
        y570 y570Var = this.c;
        l670 l670Var = this.b;
        switch (b) {
            case 0:
                if (iy.a[((xzg) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                if (u8x.a[((r6j0) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                if (dbx.a[((ay) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                int iOrdinal = ((fka) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    if (y570Var.j().containsKey("accessoryItemClick")) {
                        l670Var.c.d(new u570("accessoryItemClick", y570Var, gg11Var));
                    }
                } else if (y570Var.j().containsKey("click")) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                }
                return rih1Var;
            case 4:
                if (tex.a[((nlg) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                if (((epg) obj) == epg.a) {
                    ifl1 ifl1Var = l670Var.c;
                    if (((j570) y570Var.j().get("click")) != null) {
                        ifl1Var.d(new u570("click", y570Var, gg11Var));
                    }
                }
                return rih1Var;
            case 6:
                int iOrdinal2 = ((ij10) obj).ordinal();
                if (iOrdinal2 == 0) {
                    sgx.e("click", l670Var, y570Var);
                } else if (iOrdinal2 == 1) {
                    sgx.e("accessoryItemClick", l670Var, y570Var);
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    sgx.e("lockedClick", l670Var, y570Var);
                }
                return rih1Var;
            case 7:
                int iOrdinal3 = ((es40) obj).ordinal();
                if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                if (y570Var.j().containsKey("click")) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                }
                return rih1Var;
            case 8:
                if (ejx.a[((rfo) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                ifl1 ifl1Var2 = l670Var.c;
                if (((j570) y570Var.j().get("click")) != null) {
                    ifl1Var2.d(new u570("click", y570Var, gg11Var));
                }
                return rih1Var;
            case 9:
                int iOrdinal4 = ((bkd0) obj).ordinal();
                if (iOrdinal4 == 0) {
                    ky.u("click", l670Var, y570Var);
                } else if (iOrdinal4 == 1) {
                    ky.u("accessoryItemClick", l670Var, y570Var);
                } else {
                    if (iOrdinal4 != 2) {
                        eg.o();
                        return null;
                    }
                    ky.u("lockedClick", l670Var, y570Var);
                }
                return rih1Var;
            case 10:
                if (xvx.a[((wld0) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (y570Var.j().containsKey("click")) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                }
                return rih1Var;
            case 11:
                int iOrdinal5 = ((b2z) obj).ordinal();
                if (iOrdinal5 == 0) {
                    ifl1 ifl1Var3 = l670Var.c;
                    if (((j570) y570Var.j().get("click")) != null) {
                        ifl1Var3.d(new u570("click", y570Var, gg11Var));
                    }
                } else if (iOrdinal5 != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 12:
                if (((qgu0) obj) == qgu0.a) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                }
                return rih1Var;
            case 13:
                if (gwx.a[((zfo) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                ifl1 ifl1Var4 = l670Var.c;
                if (((j570) y570Var.j().get("click")) != null) {
                    ifl1Var4.d(new u570("click", y570Var, gg11Var));
                }
                return rih1Var;
            case 14:
                if (al10.a[((xzg) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                if (kl30.a[((xzg) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                if (wjd0.a[((xzg) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                if (fjh1.a[((q740) obj).ordinal()] == 1) {
                    l670Var.c.d(new u570("click", y570Var, gg11Var));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy(l570 l570Var, l670 l670Var, y570 y570Var, byte b) {
        super(1);
        this.a = b;
        this.b = l670Var;
        this.c = y570Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy(l570 l570Var, y570 y570Var, l670 l670Var, byte b) {
        super(1);
        this.a = b;
        this.c = y570Var;
        this.b = l670Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy(l670 l670Var, y570 y570Var, byte b) {
        super(1);
        this.a = b;
        this.b = l670Var;
        this.c = y570Var;
    }
}
