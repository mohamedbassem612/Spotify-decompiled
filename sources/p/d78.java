package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d78 {
    public final kt91 a;
    public final dg30 b;
    public final dto0 c;
    public final q8n d;

    public d78(kt91 kt91Var, dg30 dg30Var, dto0 dto0Var, q8n q8nVar) {
        this.a = kt91Var;
        this.b = dg30Var;
        this.c = dto0Var;
        this.d = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        b78 b78Var;
        if (onmVar instanceof b78) {
            b78Var = (b78) onmVar;
            int i = b78Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b78Var.c = i - Integer.MIN_VALUE;
            } else {
                b78Var = new b78(this, onmVar);
            }
        } else {
            b78Var = new b78(this, onmVar);
        }
        Object objO = b78Var.a;
        int i2 = b78Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            vk6 vk6Var = new vk6(this, (lnm) null, (byte) 4);
            b78Var.c = 1;
            objO = rc2.O(2000L, vk6Var, b78Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        Boolean bool = (Boolean) objO;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
