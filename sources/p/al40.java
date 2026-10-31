package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class al40 {
    public static final trc0 b;
    public final xrc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.S();
        hru0VarS.x(sku0VarP);
        b = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, new rrc0(Collections.singleton(dlc0.b)), jqz0.a, (prc0) null, 0, (List) null, 462);
    }

    public al40(xrc0 xrc0Var) {
        this.a = xrc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s021 s021Var, onm onmVar) {
        zk40 zk40Var;
        boolean zBooleanValue;
        v6b1 v6b1Var;
        Boolean boolValueOf;
        if (onmVar instanceof zk40) {
            zk40Var = (zk40) onmVar;
            int i = zk40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zk40Var.c = i - Integer.MIN_VALUE;
            } else {
                zk40Var = new zk40(this, onmVar);
            }
        } else {
            zk40Var = new zk40(this, onmVar);
        }
        Object objF = zk40Var.a;
        int i2 = zk40Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            zBooleanValue = false;
            try {
                v6b1Var = new y6b1(s021Var.a, false).c;
            } catch (Exception unused) {
                v6b1Var = v6b1.E1;
            }
            v6b1Var.getClass();
            if (v6b1Var == v6b1.O0) {
                String str = s021Var.a;
                zk40Var.c = 1;
                objF = this.a.f(str, b, zk40Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            }
            return new h121(zBooleanValue);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objF);
        oy21 oy21Var = (py21) objF;
        oy21Var.getClass();
        if (oy21Var instanceof ly21) {
            boolValueOf = Boolean.FALSE;
        } else {
            if (!(oy21Var instanceof oy21)) {
                eg.o();
                return null;
            }
            boolValueOf = Boolean.valueOf(eqr0.r((wsc0) oy21Var.a, new dlc0[]{dlc0.b}));
        }
        zBooleanValue = boolValueOf.booleanValue();
        return new h121(zBooleanValue);
    }
}
