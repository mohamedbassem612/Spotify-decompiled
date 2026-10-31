package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g1e0 {
    public final bfd a;

    public g1e0(bfd bfdVar) {
        this.a = bfdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        f1e0 f1e0Var;
        if (onmVar instanceof f1e0) {
            f1e0Var = (f1e0) onmVar;
            int i = f1e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1e0Var.c = i - Integer.MIN_VALUE;
            } else {
                f1e0Var = new f1e0(this, onmVar);
            }
        } else {
            f1e0Var = new f1e0(this, onmVar);
        }
        Object objD = f1e0Var.a;
        int i2 = f1e0Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            f1e0Var.c = 1;
            objD = this.a.d(str, f1e0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        goe goeVar = (goe) objD;
        btf btfVar = goeVar.b;
        if (btfVar instanceof btf) {
            return new xaf(goeVar.c, mqo1.A(goeVar.e), mqo1.A(btfVar.b));
        }
        eg.m("ChatMembersPage is only supported for group chats.");
        return null;
    }
}
