package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sip0 implements vu30 {
    public static final trc0 b;
    public final xrc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.w(sku0VarP.build());
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.A();
        hru0VarS.v(iou0VarV);
        b = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, new iqz0(0, 30), (prc0) null, 0, (List) null, 478);
    }

    public sip0(xrc0 xrc0Var) {
        this.a = xrc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(vzg0 vzg0Var, lnm lnmVar) {
        qip0 qip0Var;
        if (lnmVar instanceof qip0) {
            qip0Var = (qip0) lnmVar;
            int i = qip0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qip0Var.d = i - Integer.MIN_VALUE;
            } else {
                qip0Var = new qip0(this, lnmVar);
            }
        } else {
            qip0Var = new qip0(this, lnmVar);
        }
        Object objO = qip0Var.b;
        int i2 = qip0Var.d;
        lnm lnmVar2 = null;
        if (i2 == 0) {
            hm5.M(objO);
            cto0 cto0Var = new cto0(this, vzg0Var, lnmVar2, (byte) 7);
            qip0Var.a = vzg0Var;
            qip0Var.d = 1;
            objO = rc2.O(90000L, cto0Var, qip0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vzg0Var = qip0Var.a;
            hm5.M(objO);
        }
        pip0 pip0Var = (pip0) objO;
        if (pip0Var == null) {
            return new z2h0(vzg0Var.a);
        }
        return new y2h0(vzg0Var.a, pip0Var.b, mqo1.A(pip0Var.a));
    }
}
