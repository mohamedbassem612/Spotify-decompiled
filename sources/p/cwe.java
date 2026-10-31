package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cwe {
    public final th30 a;
    public final h21 b;
    public final r241 c;
    public final ov20 d;
    public final q8n e;

    public cwe(th30 th30Var, h21 h21Var, r241 r241Var, ov20 ov20Var, q8n q8nVar) {
        this.a = th30Var;
        this.b = h21Var;
        this.c = r241Var;
        this.d = ov20Var;
        this.e = q8nVar;
    }

    public final Object a(onm onmVar) {
        Object objY = fn31.Y(this.e, new awe(this, null, (byte) 0), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(gob gobVar, onm onmVar) {
        bwe bweVar;
        if (onmVar instanceof bwe) {
            bweVar = (bwe) onmVar;
            int i = bweVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bweVar.d = i - Integer.MIN_VALUE;
            } else {
                bweVar = new bwe(this, onmVar);
            }
        } else {
            bweVar = new bwe(this, onmVar);
        }
        Object obj = bweVar.b;
        int i2 = bweVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            bweVar.a = gobVar;
            bweVar.d = 1;
            Object objA = a(bweVar);
            Object obj2 = d9n.a;
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gobVar = bweVar.a;
            hm5.M(obj);
        }
        gobVar.invoke();
        return rih1.a;
    }
}
