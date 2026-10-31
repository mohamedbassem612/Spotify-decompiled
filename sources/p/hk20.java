package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hk20 implements xgn, vgn {
    public final List a() {
        int i;
        ik20 ik20Var = (ik20) kk20.a.get();
        String strE = "pending";
        xen xenVar = new xen(ik20Var != null ? ik20Var.b : "pending");
        if (ik20Var != null && (i = ik20Var.a) != 0) {
            strE = bb00.e(i);
        }
        return p7h.M(new ugn[]{xenVar, new yen(strE)});
    }

    public final mr20 b() {
        bpb1 bpb1Var = kk20.c;
        return hu20.d(new mr20[]{new fk20(bpb1Var, this, (byte) 0), new fk20(bpb1Var, this, (byte) 1)});
    }
}
