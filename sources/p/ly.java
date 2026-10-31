package p;

import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ly extends r570 {
    public final /* synthetic */ byte a;
    public final hjc b;
    public final vx40 c;

    public /* synthetic */ ly(hjc hjcVar, vx40 vx40Var, byte b) {
        this.a = b;
        this.b = hjcVar;
        this.c = vx40Var;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428302;
            case 1:
                return 2131428314;
            case 2:
                return 2131428315;
            default:
                return 2131428320;
        }
    }

    public final EnumSet c() {
        byte b = this.a;
        ix40 ix40Var = ix40.d;
        ix40 ix40Var2 = ix40.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return EnumSet.of(ix40Var2, ix40Var);
    }

    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        byte b = this.a;
        vx40 vx40Var = this.c;
        hjc hjcVar = this.b;
        switch (b) {
            case 0:
                return new ky(hjcVar.a((l0i) null), vx40Var, (byte) 0);
            case 1:
                return new ky(hjcVar.a((l0i) null), vx40Var, (byte) 12);
            case 2:
                return new ky(hjcVar.a((l0i) null), vx40Var, (byte) 13);
            default:
                return new ky(hjcVar.a((l0i) null), vx40Var, (byte) 14);
        }
    }
}
