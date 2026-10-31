package p;

import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fbx extends r570 {
    public final /* synthetic */ byte a;
    public final vx40 b;
    public final Object c;
    public final Object d;

    public /* synthetic */ fbx(Object obj, Object obj2, vx40 vx40Var, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = vx40Var;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428301;
            case 1:
                return 2131428309;
            default:
                return 2131428336;
        }
    }

    public final EnumSet c() {
        byte b = this.a;
        ix40 ix40Var = ix40.b;
        switch (b) {
            case 0:
                return EnumSet.of(ix40Var);
            case 1:
                return EnumSet.of(ix40.i);
            default:
                return EnumSet.of(ix40Var);
        }
    }

    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        byte b = this.a;
        vx40 vx40Var = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new ebx((pe) obj, ((hjc) obj2).a((l0i) null), vx40Var);
            case 1:
                return new sgx(((pp) obj).a((l0i) null), (yqg) obj2, vx40Var, (byte) 0);
            default:
                return new ebx((x7z) obj, ((egx) obj2).a(null), vx40Var);
        }
    }
}
