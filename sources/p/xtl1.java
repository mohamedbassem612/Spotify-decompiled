package p;

import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xtl1 {
    public static final PlaylistRequestDecorationPolicy e;
    public final String a;
    public final xrc0 b;
    public final boolean c;
    public final qzq d = new qzq(1000, 0.75f, true, (byte) 5);

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.A();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        e = hru0VarS.build();
    }

    public xtl1(String str, xrc0 xrc0Var, boolean z, zo4 zo4Var) {
        this.a = str;
        this.b = xrc0Var;
        this.c = z;
    }

    public final mr20 a(trc0 trc0Var) {
        return this.b.k(this.a, trc0.a(trc0Var, e, (g3d0) null, (Set) null, (mqz0) null, 510));
    }

    public final otl1 b(wsc0 wsc0Var, wsc0 wsc0Var2) {
        Iterator it = wsc0Var2.e.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            qzq qzqVar = this.d;
            if (!zHasNext) {
                return new otl1(wsc0Var2.n, new rqz0(wsc0Var.e, sqg0.U(qzqVar)));
            }
            zuc0 zuc0Var = (zuc0) it.next();
            qzqVar.put(zuc0Var.a, zuc0Var);
        }
    }

    public final py21 c(aek1 aek1Var, py21 py21Var, py21 py21Var2) {
        if ((py21Var instanceof oy21) && (py21Var2 instanceof oy21)) {
            wsc0 wsc0Var = (wsc0) ((oy21) py21Var).a;
            aek1Var.c = Integer.valueOf(wsc0Var.e.size());
            return new oy21(b(wsc0Var, (wsc0) ((oy21) py21Var2).a));
        }
        if (py21Var instanceof ly21) {
            return ((ly21) py21Var).a(lcl1.O0);
        }
        return py21Var2 instanceof ly21 ? ((ly21) py21Var2).a(lcl1.P0) : new ly21(new iy21("This should never happen. Check your code."));
    }

    public final jge d(aek1 aek1Var, any anyVar, trc0 trc0Var) {
        return hu20.e(new vlj1(rqt0.u(new ht20(anyVar, new egv0(2, (lnm) null, (byte) 29))), aek1Var, (byte) 9), new m53(aek1Var, trc0Var, this, (lnm) null, (byte) 16));
    }
}
