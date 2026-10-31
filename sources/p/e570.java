package p;

import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e570 extends p570 {
    public final /* synthetic */ byte a;
    public final boolean b;

    public /* synthetic */ e570(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public final EnumSet c() {
        byte b = this.a;
        ix40 ix40Var = ix40.e;
        ix40 ix40Var2 = ix40.f;
        ix40 ix40Var3 = ix40.h;
        switch (b) {
            case 0:
                break;
        }
        return EnumSet.of(ix40Var3, ix40Var2, ix40Var);
    }

    @Override // p.m570
    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        switch (this.a) {
            case 0:
                return new d570(viewGroup, l670Var, this.b, (byte) 0);
            default:
                return new d570(viewGroup, l670Var, this.b, (byte) 1);
        }
    }
}
