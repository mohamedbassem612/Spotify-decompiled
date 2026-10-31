package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dnc0 {
    public final d0r a;
    public final boolean b;
    public final boolean c;
    public final Function0 d;
    public final Function0 e;
    public final cc9 f;
    public final guh0 g;
    public final ArrayList h;

    public dnc0(d0r d0rVar, Function0 function0, Function0 function1, cc9 cc9Var, guh0 guh0Var, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        function0 = (i & 8) != 0 ? df.X0 : function0;
        function1 = (i & 16) != 0 ? lx70.d1 : function1;
        cc9Var = (i & 32) != 0 ? new cc9(0, 0, 7) : cc9Var;
        guh0Var = (i & 64) != 0 ? null : guh0Var;
        this.a = d0rVar;
        this.b = z;
        this.c = z2;
        this.d = function0;
        this.e = function1;
        this.f = cc9Var;
        this.g = guh0Var;
        this.h = new ArrayList();
    }

    public final cnc0 a() {
        v30 v30Var = v30.d1;
        List listL1 = o7h.l1(this.h);
        dt90 dt90Var = new dt90(v30Var, this, listL1, (byte) 6);
        return new m021(new cnc0(dt90Var, two1.D(listL1), two1.w(listL1)), dt90Var, (byte) 12).c();
    }

    public final void b(gj50 gj50Var, iu30 iu30Var) {
        d0r d0rVar = this.a;
        ji50 ji50Var = new ji50(d0rVar, gj50Var);
        szq.b(d0rVar, new x680(iu30Var, ji50Var, (byte) 29));
        LinkedHashMap linkedHashMap = ji50Var.b;
        if (linkedHashMap.isEmpty()) {
            hhg1.n("View factories cannot be empty. Please register factories for your view data types.");
        } else {
            this.h.add(new tg50(gj50Var, linkedHashMap));
        }
    }
}
