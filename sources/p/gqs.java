package p;

import java.util.LinkedList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gqs implements b691 {
    public final cm30 a;
    public final yqg b;
    public final LinkedList c = new LinkedList();

    public gqs(cm30 cm30Var, yqg yqgVar) {
        this.a = cm30Var;
        this.b = yqgVar;
    }

    public final int a() {
        dma1 dma1Var = this.a.a;
        long jE = this.b.e();
        Long lValueOf = Long.valueOf(jE);
        LinkedList linkedList = this.c;
        linkedList.add(lValueOf);
        if (linkedList.size() > 3) {
            linkedList.remove();
        }
        bma1 bma1Var = cm30.b;
        if (!dma1Var.h(bma1Var, false)) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.a(bma1Var, true);
            hma1VarEdit.g();
            return 2;
        }
        if (linkedList.size() != 3 || jE - ((Number) linkedList.peek()).longValue() >= 10000) {
            return 1;
        }
        linkedList.clear();
        return 3;
    }
}
