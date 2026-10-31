package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/qc9;", "Lp/uim0;", "Lp/pc9;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class qc9 extends uim0 {
    public pc9 a;
    public ayh b;

    @Override // p.uim0
    public final pim0 a() {
        return new pc9(this);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
    }

    public final Object c(onm onmVar) {
        ayh ayhVarA = this.b;
        if (ayhVarA == null) {
            ayhVarA = sap1.a();
            this.b = ayhVarA;
            pc9 pc9Var = this.a;
            if (pc9Var != null && pc9Var.N0) {
                pc9Var.O0 = grn1.t(pc9Var, 0L, 0L, new b6(pc9Var, pc9Var.P0, (byte) 6));
            }
        }
        Object objQ = ayhVarA.Q(onmVar);
        return objQ == d9n.a ? objQ : rih1.a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }
}
