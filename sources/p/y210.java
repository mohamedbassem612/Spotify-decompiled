package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y210 {
    public static final m210 c = new m210(1494, "npv_recommendations_widget", (String) null, (String) null, "app_to_app", "widget", (String) null, (String) null, (String) null, "media_session", (String) null);
    public final g510 a;
    public final q8n b;

    public y210(g510 g510Var, q8n q8nVar) {
        this.a = g510Var;
        this.b = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, tv80 tv80Var, onm onmVar) {
        w210 w210Var;
        if (onmVar instanceof w210) {
            w210Var = (w210) onmVar;
            int i = w210Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w210Var.c = i - Integer.MIN_VALUE;
            } else {
                w210Var = new w210(this, onmVar);
            }
        } else {
            w210Var = new w210(this, onmVar);
        }
        Object objH = w210Var.a;
        int i2 = w210Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            l2w l2wVar = new l2w(this, str, tv80Var, (lnm) null, (byte) 18);
            w210Var.c = 1;
            objH = c921.H(this.b, l2wVar, w210Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        x210 x210Var;
        if (onmVar instanceof x210) {
            x210Var = (x210) onmVar;
            int i = x210Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x210Var.c = i - Integer.MIN_VALUE;
            } else {
                x210Var = new x210(this, onmVar);
            }
        } else {
            x210Var = new x210(this, onmVar);
        }
        Object objH = x210Var.a;
        int i2 = x210Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            ett ettVar = new ett(this, (lnm) null, (byte) 27);
            x210Var.c = 1;
            objH = c921.H(this.b, ettVar, x210Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        return objH;
    }
}
