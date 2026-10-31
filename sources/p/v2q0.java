package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v2q0 implements ioc0 {
    public static final Set e;
    public static final Set f;
    public static final Set g;
    public final jo91 a;
    public final xrc0 b;
    public final me30 c;
    public final trc0 d;

    static {
        le30 le30Var = le30.d;
        le30 le30Var2 = le30.g;
        le30 le30Var3 = le30.h;
        le30 le30Var4 = le30.X;
        le30 le30Var5 = le30.Y;
        le30 le30Var6 = le30.O0;
        le30 le30Var7 = le30.P0;
        le30 le30Var8 = le30.Q0;
        le30 le30Var9 = le30.S0;
        le30 le30Var10 = le30.Z0;
        le30 le30Var11 = le30.d1;
        le30 le30Var12 = le30.f1;
        le30 le30Var13 = le30.g1;
        le30 le30Var14 = le30.i1;
        le30 le30Var15 = le30.j1;
        le30 le30Var16 = le30.k1;
        le30 le30Var17 = le30.l1;
        le30 le30Var18 = le30.m1;
        le30 le30Var19 = le30.Y0;
        le30 le30Var20 = le30.o1;
        le30 le30Var21 = le30.p1;
        e = f46.S0(new le30[]{le30Var, le30Var2, le30Var3, le30Var4, le30Var5, le30Var6, le30Var7, le30Var8, le30Var9, le30Var10, le30Var11, le30Var12, le30Var13, le30Var14, le30Var15, le30Var16, le30Var17, le30Var18, le30Var19, le30Var20, le30Var21});
        f = f46.S0(new le30[]{le30Var10, le30Var13, le30Var20, le30Var21});
        g = f46.S0(new le30[]{le30Var, le30Var4, le30Var18});
    }

    public v2q0(jo91 jo91Var, xrc0 xrc0Var, me30 me30Var) {
        this.a = jo91Var;
        this.b = xrc0Var;
        this.c = me30Var;
        hru0 builder = PlaylistRequestDecorationPolicy.n().toBuilder();
        sku0 builder2 = PlaylistDecorationPolicy.o().toBuilder();
        builder2.S();
        builder2.W();
        builder2.G();
        builder2.H();
        builder.w(builder2.build());
        this.d = new trc0(builder.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public final Observable a(String str, String str2) {
        return yoi1.i(this.b.k(str2, this.d), o6x.a).map(new rzo0(str, str2, this, (byte) 11)).onErrorReturnItem(j5.a);
    }
}
