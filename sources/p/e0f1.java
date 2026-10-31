package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e0f1 {
    public final bpb1 a = gio1.b(oog1.a);

    public e0f1(fwo fwoVar) {
        sam0 sam0Var = (xm41) fwoVar.get();
        sam0 sam0Var2 = sam0Var;
        sam0Var2.e(new fjc1(this, (byte) 29), new qwc1(this, (byte) 27));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        d0f1 d0f1Var;
        if (onmVar instanceof d0f1) {
            d0f1Var = (d0f1) onmVar;
            int i = d0f1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0f1Var.c = i - Integer.MIN_VALUE;
            } else {
                d0f1Var = new d0f1(this, onmVar);
            }
        } else {
            d0f1Var = new d0f1(this, onmVar);
        }
        Object objJ = d0f1Var.a;
        int i2 = d0f1Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 7);
            d0f1Var.c = 1;
            objJ = b5p1.j(this.a, q1c1Var, d0f1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        mog1 mog1Var = (pog1) objJ;
        mog1 mog1Var2 = mog1Var instanceof mog1 ? mog1Var : null;
        if (mog1Var2 != null) {
            return mog1Var2.a;
        }
        return null;
    }
}
