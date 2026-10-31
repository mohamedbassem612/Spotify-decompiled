package p;

import android.content.Context;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lwv {
    public final Context a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final cnc0 e;

    public lwv(Context context, svv svvVar, hvp0 hvp0Var, lbp lbpVar, lbp lbpVar2, lbp lbpVar3) {
        this.a = context;
        this.b = lbpVar;
        this.c = lbpVar2;
        this.d = lbpVar3;
        dnc0 dnc0VarB = hvp0.b(hvp0Var);
        two1.v(dnc0VarB, new huz(Collections.singletonList(new h8k1(kt51.a, "select_all")), (byte) 10), false, new iwv(this, (byte) 0));
        ve01 ve01Var = svvVar.a;
        two1.v(dnc0VarB, new pzs(ve01Var, this, (byte) 16), false, new iwv(this, (byte) 1));
        two1.v(dnc0VarB, new dwv(ve01Var, (byte) 1), true, new iwv(this, (byte) 2));
        this.e = dnc0VarB.a();
    }
}
