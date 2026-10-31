package p;

import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nhx extends r570 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ nhx(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428311;
            case 1:
                return 2131428317;
            default:
                return 2131428335;
        }
    }

    public final EnumSet c() {
        switch (this.a) {
            case 0:
                return EnumSet.of(ix40.h);
            case 1:
                return EnumSet.of(ix40.c);
            default:
                return EnumSet.of(ix40.b);
        }
    }

    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return new mhx((ahr) obj4, (x7z) obj2, ((hjc) obj3).a((l0i) null), (vx40) obj, (byte) 0);
            case 1:
                return new mhx(((pfx) obj4).a((l0i) null), (lzn0) obj2, (rsn0) obj3, (lc20) obj);
            default:
                return new mhx((ahr) obj4, (x7z) obj2, ((egx) obj3).a(null), (vx40) obj, (byte) 1);
        }
    }
}
