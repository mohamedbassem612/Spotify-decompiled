package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g2h implements iu30 {
    public static final g2h b = new g2h(0);
    public static final g2h c = new g2h(1);
    public static final g2h d = new g2h(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ g2h(byte b2) {
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        byte b2 = this.a;
        kf90 kf90Var = kf90.a;
        x9v0 x9v0Var = x9v0.a;
        switch (b2) {
            case 0:
                i2h i2hVar = (i2h) obj;
                return Boolean.valueOf((i2hVar.a instanceof q2r0) && (i2hVar.c instanceof imb1));
            case 1:
                tr3 tr3Var = (tr3) obj;
                w7c0 w7c0Var = tr3Var.c;
                qn90 qn90Var = tr3Var.b.c;
                if ((qn90Var instanceof b8e0) || (qn90Var instanceof on90) || (qn90Var instanceof pn90)) {
                    z = true;
                } else {
                    z = qn90Var instanceof qn90 ? qn90Var.a instanceof b8e0 : false;
                }
                return Boolean.valueOf((!z || w7c0Var.a(x9v0Var) == null || w7c0Var.a(kf90Var) == null) ? false : true);
            default:
                tr3 tr3Var2 = (tr3) obj;
                w7c0 w7c0Var2 = tr3Var2.c;
                qn90 qn90Var2 = tr3Var2.b.c;
                if ((qn90Var2 instanceof b8e0) || (qn90Var2 instanceof on90) || (qn90Var2 instanceof pn90)) {
                    z2 = true;
                } else {
                    z2 = qn90Var2 instanceof qn90 ? qn90Var2.a instanceof b8e0 : false;
                }
                return Boolean.valueOf((!z2 || w7c0Var2.a(x9v0Var) == null || w7c0Var2.a(kf90Var) == null || w7c0Var2.a(vg60.a) == null) ? false : true);
        }
    }
}
