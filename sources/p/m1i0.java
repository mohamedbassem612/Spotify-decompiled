package p;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class m1i0 implements e2i0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IBinder b;

    public /* synthetic */ m1i0(IBinder iBinder, byte b) {
        this.a = b;
        this.b = iBinder;
    }

    public final Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        byte b = this.a;
        int i2 = 0;
        IBinder iBinder = this.b;
        switch (b) {
            case 0:
                try {
                    b380 b380VarA = occ.a(iBinder);
                    v280 v280VarM = b380.m();
                    while (i2 < b380VarA.size()) {
                        Bundle bundle = (Bundle) b380VarA.get(i2);
                        bundle.getClass();
                        v280VarM.c(yoh0.b(ixh0Var.c, bundle));
                        i2++;
                    }
                    return fzh0Var.r(ixh0Var, v280VarM.g());
                } catch (RuntimeException e) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e);
                    return new c280(e);
                }
            case 1:
                try {
                    b380 b380VarA2 = occ.a(iBinder);
                    v280 v280VarM2 = b380.m();
                    while (i2 < b380VarA2.size()) {
                        Bundle bundle2 = (Bundle) b380VarA2.get(i2);
                        bundle2.getClass();
                        v280VarM2.c(yoh0.b(ixh0Var.c, bundle2));
                        i2++;
                    }
                    return fzh0Var.r(ixh0Var, v280VarM2.g());
                } catch (RuntimeException e2) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e2);
                    return new c280(e2);
                }
            default:
                try {
                    b380 b380VarA3 = occ.a(iBinder);
                    v280 v280VarM3 = b380.m();
                    while (i2 < b380VarA3.size()) {
                        Bundle bundle3 = (Bundle) b380VarA3.get(i2);
                        bundle3.getClass();
                        v280VarM3.c(yoh0.b(ixh0Var.c, bundle3));
                        i2++;
                    }
                    return fzh0Var.r(ixh0Var, v280VarM3.g());
                } catch (RuntimeException e3) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e3);
                    return new c280(e3);
                }
        }
    }
}
