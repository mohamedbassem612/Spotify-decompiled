package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class xzh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ffu0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xzh0(ffu0 ffu0Var, int i, byte b) {
        this.a = b;
        this.b = ffu0Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ffu0 ffu0Var = this.b;
        switch (b) {
            case 0:
                if (ffu0Var.Y(25) || ffu0Var.Y(33)) {
                    if (!ffu0Var.Y(33)) {
                        ffu0Var.Y0(i);
                    } else {
                        ffu0Var.A0(i, 1);
                    }
                }
                break;
            default:
                if (ffu0Var.Y(26) || ffu0Var.Y(34)) {
                    if (i == -100) {
                        if (!ffu0Var.Y(34)) {
                            ffu0Var.Z(true);
                        } else {
                            ffu0Var.z(1, true);
                        }
                    } else if (i == -1) {
                        if (!ffu0Var.Y(34)) {
                            ffu0Var.A();
                        } else {
                            ffu0Var.T(1);
                        }
                    } else if (i == 1) {
                        if (!ffu0Var.Y(34)) {
                            ffu0Var.f0();
                        } else {
                            ffu0Var.B(1);
                        }
                    } else if (i == 100) {
                        if (!ffu0Var.Y(34)) {
                            ffu0Var.Z(false);
                        } else {
                            ffu0Var.z(1, false);
                        }
                    } else if (i != 101) {
                        td6.p(i, "onAdjustVolume: Ignoring unknown direction: ");
                    } else if (!ffu0Var.Y(34)) {
                        ffu0Var.Z(!ffu0Var.k1());
                    } else {
                        ffu0Var.z(1, !ffu0Var.k1());
                    }
                }
                break;
        }
    }
}
