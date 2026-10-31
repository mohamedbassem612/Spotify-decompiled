package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hcx {
    public static final hcx a;
    public static final hcx b;
    public static final hcx c;
    public static final hcx d;
    public static final hcx e;
    public static final hcx f;
    public static final hcx g;
    public static final /* synthetic */ hcx[] h;
    public static final /* synthetic */ t0z i;

    static {
        hcx hcxVar = new hcx("ExtraExtraSmall", 0);
        a = hcxVar;
        hcx hcxVar2 = new hcx("ExtraSmall", 1);
        b = hcxVar2;
        hcx hcxVar3 = new hcx("Small", 2);
        c = hcxVar3;
        hcx hcxVar4 = new hcx("Medium", 3);
        d = hcxVar4;
        hcx hcxVar5 = new hcx("Large", 4);
        e = hcxVar5;
        hcx hcxVar6 = new hcx("ExtraLarge", 5);
        f = hcxVar6;
        hcx hcxVar7 = new hcx("FacePileMini", 6);
        g = hcxVar7;
        hcx[] hcxVarArr = {hcxVar, hcxVar2, hcxVar3, hcxVar4, hcxVar5, hcxVar6, hcxVar7};
        h = hcxVarArr;
        i = new t0z(hcxVarArr);
    }

    public static hcx valueOf(String str) {
        return (hcx) Enum.valueOf(hcx.class, str);
    }

    public static hcx[] values() {
        return (hcx[]) h.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float a(b0k b0kVar) throws NoWhenBranchMatchedException {
        switch (ordinal()) {
            case 0:
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(-921270174);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                x340Var.r(false);
                return 16.0f;
            case 1:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(-921267873);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var2).g;
                x340Var2.r(false);
                return 24.0f;
            case 2:
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.i0(-921265823);
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var3 = cbx.b(x340Var3).g;
                x340Var3.r(false);
                return 32.0f;
            case 3:
                x340 x340Var4 = (x340) b0kVar;
                x340Var4.i0(-921263678);
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var4 = cbx.b(x340Var4).g;
                x340Var4.r(false);
                return 48.0f;
            case 4:
                x340 x340Var5 = (x340) b0kVar;
                x340Var5.i0(-921261545);
                uwr uwrVar5 = cbx.a;
                mta mtaVar = cbx.b(x340Var5).d;
                x340Var5.r(false);
                return 56.0f;
            case 5:
                x340 x340Var6 = (x340) b0kVar;
                x340Var6.i0(-921260493);
                x340Var6.r(false);
                return 112.0f;
            case 6:
                x340 x340Var7 = (x340) b0kVar;
                x340Var7.i0(-921259533);
                x340Var7.r(false);
                return 20.0f;
            default:
                throw p3d1.k((x340) b0kVar, -921272111, false);
        }
    }
}
