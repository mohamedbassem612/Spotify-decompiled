package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class thu0 {
    public static final PlaylistRequestDecorationPolicy b;
    public final xrc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.j0();
        sku0VarP.S();
        hru0VarS.x(sku0VarP);
        b = hru0VarS.build();
    }

    public thu0(xrc0 xrc0Var) {
        this.a = xrc0Var;
    }

    public static boolean b(wsc0 wsc0Var, boolean z) {
        int i = wsc0Var.a;
        dlc0 dlc0Var = dlc0.b;
        if (z) {
            return i == 0 || eqr0.s(wsc0Var, new dlc0[]{dlc0Var});
        }
        return i == 0 || !eqr0.s(wsc0Var, new dlc0[]{dlc0Var});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable a(String str, onm onmVar, boolean z) {
        shu0 shu0Var;
        Boolean m231Var;
        boolean z2;
        Object objInvoke;
        thu0 thu0Var = this;
        if (onmVar instanceof shu0) {
            shu0Var = (shu0) onmVar;
            int i = shu0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                shu0Var.e = i - Integer.MIN_VALUE;
            } else {
                shu0Var = new shu0(thu0Var, onmVar);
            }
        } else {
            shu0Var = new shu0(thu0Var, onmVar);
        }
        Object objF = shu0Var.c;
        int i2 = shu0Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                rsc0 rsc0Var = thu0Var.a;
                trc0 trc0Var = new trc0(b, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                shu0Var.a = thu0Var;
                z2 = z;
                shu0Var.b = z2;
                shu0Var.e = 1;
                objF = rsc0Var.f(str, trc0Var, shu0Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = shu0Var.b;
                thu0 thu0Var2 = shu0Var.a;
                hm5.M(objF);
                z2 = z3;
                thu0Var = thu0Var2;
            }
            oy21 oy21Var = (py21) objF;
            cb8 cb8Var = new cb8((Object) thu0Var, z2, (byte) 16);
            oy21Var.getClass();
            if (oy21Var instanceof ly21) {
                objInvoke = Boolean.TRUE;
            } else {
                if (!(oy21Var instanceof oy21)) {
                    throw new NoWhenBranchMatchedException();
                }
                objInvoke = cb8Var.invoke(oy21Var.a);
            }
            m231Var = (Boolean) objInvoke;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? Boolean.TRUE : m231Var;
    }
}
