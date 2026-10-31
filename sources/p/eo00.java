package p;

import android.media.metrics.LogSessionId;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eo00 implements rd21 {
    public final o0g a = new o0g((byte) 17);
    public final e4w b;
    public final cab c;
    public final int d;
    public final a67 e;
    public final LogSessionId f;

    public eo00(e4w e4wVar, cab cabVar, int i, a67 a67Var, LogSessionId logSessionId) {
        this.b = e4wVar;
        this.c = cabVar;
        this.d = i;
        this.e = a67Var;
        this.f = logSessionId;
    }

    @Override // p.rd21
    public final jca[] b(Handler handler, qwj1 qwj1Var, t38 t38Var, hbe1 hbe1Var, plj0 plj0Var) {
        ArrayList arrayList = new ArrayList();
        e4w e4wVar = this.b;
        boolean z = e4wVar.b;
        a67 a67Var = this.e;
        o0g o0gVar = this.a;
        cab cabVar = this.c;
        if (!z) {
            arrayList.add(new un00(cabVar, o0gVar, a67Var, this.f));
        }
        if (!e4wVar.c) {
            arrayList.add(new wn00(cabVar, this.d, o0gVar, a67Var, this.f, e4wVar.e));
        }
        return (jca[]) arrayList.toArray(new jca[0]);
    }
}
