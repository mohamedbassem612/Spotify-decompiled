package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class how implements m01 {
    public final jut a;

    public how(jut jutVar) {
        this.a = jutVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) {
        fow fowVar;
        if (lnmVar instanceof fow) {
            fowVar = (fow) lnmVar;
            int i = fowVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fowVar.c = i - Integer.MIN_VALUE;
            } else {
                fowVar = new fow(this, lnmVar);
            }
        } else {
            fowVar = new fow(this, lnmVar);
        }
        Object objB = fowVar.a;
        int i2 = fowVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            fowVar.c = 1;
            jut jutVar = this.a;
            objB = ((c610) jutVar.c).b(jutVar.e(), fowVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return new g6y(((z310) objB).a);
    }
}
