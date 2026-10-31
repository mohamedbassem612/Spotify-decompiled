package p;

import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v8x extends r570 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ v8x(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428310;
            case 1:
                return 2131428306;
            case 2:
                return 2131428308;
            case 3:
                return 2131428312;
            case 4:
                return 2131428316;
            case 5:
                return 2131428318;
            case 6:
                return 2131428319;
            case 7:
                return 2131428321;
            case 8:
                return 2131428322;
            case 9:
                return 2131428324;
            case 10:
                return 2131428325;
            case 11:
                return 2131428326;
            default:
                return 2131428964;
        }
    }

    public final EnumSet c() {
        byte b = this.a;
        ix40 ix40Var = ix40.i;
        ix40 ix40Var2 = ix40.d;
        ix40 ix40Var3 = ix40.c;
        ix40 ix40Var4 = ix40.b;
        switch (b) {
            case 0:
                return EnumSet.of(ix40Var, ix40.t);
            case 1:
                return EnumSet.of(ix40Var4);
            case 2:
                return EnumSet.of(ix40Var4);
            case 3:
                return EnumSet.of(ix40Var4);
            case 4:
                return EnumSet.of(ix40Var4);
            case 5:
                return EnumSet.of(ix40Var3);
            case 6:
                return EnumSet.of(ix40Var);
            case 7:
                return EnumSet.of(ix40Var4);
            case 8:
                return EnumSet.of(ix40Var4);
            case 9:
                return EnumSet.of(ix40Var4, ix40Var2);
            case 10:
                return EnumSet.of(ix40Var4);
            case 11:
                return EnumSet.of(ix40Var4, ix40Var2);
            default:
                return EnumSet.of(ix40Var3, ix40.e);
        }
    }

    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 1);
            case 1:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 2);
            case 2:
                return new uex(((egx) obj2).a(null), (vx40) obj);
            case 3:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 3);
            case 4:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 4);
            case 5:
                return new ky(((sfx) obj2).a(null), (vx40) obj, (byte) 5);
            case 6:
                return new ky(((zfx) obj2).a(null), (vx40) obj, (byte) 6);
            case 7:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 7);
            case 8:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 8);
            case 9:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 9);
            case 10:
                return new ky(((yfx) obj2).a(pgu0.a), (vx40) obj, (byte) 10);
            case 11:
                return new ky(((hjc) obj2).a((l0i) null), (vx40) obj, (byte) 11);
            default:
                return new em30(viewGroup, (gw70) obj2, (ynb0) obj);
        }
    }

    public /* synthetic */ v8x(vx40 vx40Var, u0i u0iVar, byte b) {
        this.a = b;
        this.b = vx40Var;
        this.c = u0iVar;
    }
}
