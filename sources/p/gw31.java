package p;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Banner;
import androidx.car.app.model.Row;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gw31 {
    public static final gw31 d;
    public static final gw31 e;
    public final byte a;
    public final ot31 b;
    public final boolean c;

    static {
        d1s d1sVar = new d1s();
        d1sVar.c = ot31.g;
        d1sVar.b = (byte) 0;
        d1sVar.c = ot31.h;
        d1sVar.a = false;
        gw31 gw31Var = new gw31(d1sVar);
        d1s d1sVar2 = new d1s(gw31Var);
        d1sVar2.b = (byte) 2;
        d1sVar2.c = ot31.i;
        d1sVar2.a = false;
        d = new gw31(d1sVar2);
        d1s d1sVar3 = new d1s(gw31Var);
        d1sVar3.c = ot31.j;
        e = new gw31(d1sVar3);
        ot31 ot31Var = ot31.g;
        ot31 ot31Var2 = ot31.g;
        ot31 ot31Var3 = ot31.g;
        ot31 ot31Var4 = ot31.g;
    }

    public gw31(d1s d1sVar) {
        this.a = d1sVar.b;
        this.b = (ot31) d1sVar.c;
        this.c = d1sVar.a;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qi90 qi90Var = (qi90) it.next();
            if (qi90Var instanceof Row) {
                this.b.a((Row) qi90Var);
            } else if (!(qi90Var instanceof ConversationItem) && !(qi90Var instanceof Banner)) {
                hhg1.n("Unsupported item type: ".concat(qi90Var.getClass().getSimpleName()));
                return;
            }
        }
    }
}
