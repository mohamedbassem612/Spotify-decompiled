package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class kr90 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(10, ngv.SECONDS);
    }

    public static final int a(int i) {
        int iC = l1d.C(i);
        if (iC == 4) {
            return 4;
        }
        if (iC != 5) {
            return iC != 13 ? 0 : 2;
        }
        return 3;
    }

    public static final f0u b(int i) {
        switch (l1d.C(i)) {
            case 0:
            case 5:
                return f0u.a;
            case 1:
                return f0u.b;
            case 2:
                return f0u.c;
            case 3:
                return f0u.d;
            case 4:
                return f0u.e;
            case 6:
                return f0u.f;
            case 7:
                return f0u.g;
            case 8:
                return f0u.h;
            case 9:
                return f0u.i;
            case 10:
                return f0u.t;
            case 11:
                return f0u.X;
            case 12:
                return f0u.Y;
            case 13:
                return f0u.Z;
            case 14:
                return f0u.N0;
            case 15:
                return f0u.O0;
            case 16:
                return f0u.P0;
            case 17:
                return f0u.Q0;
            default:
                eg.o();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(hq90 hq90Var, lnm lnmVar) {
        jr90 jr90Var;
        if (lnmVar instanceof jr90) {
            jr90Var = (jr90) lnmVar;
            int i = jr90Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jr90Var.b = i - Integer.MIN_VALUE;
            } else {
                jr90Var = new jr90(lnmVar);
            }
        } else {
            jr90Var = new jr90(lnmVar);
        }
        Object objP = jr90Var.a;
        int i2 = jr90Var.b;
        if (i2 == 0) {
            hm5.M(objP);
            no70 no70Var = new no70(hq90Var, (lnm) null, (byte) 10);
            jr90Var.b = 1;
            objP = rc2.P(a, no70Var, jr90Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        return yah0.m(objP != null);
    }
}
