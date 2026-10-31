package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xoo1 implements wi01 {
    public final eto1 a;
    public final String b;
    public final swo1 c;
    public final xgn0 d = ygn0.a();
    public final qeh1 e;

    public xoo1(eto1 eto1Var, String str, swo1 swo1Var, qeh1 qeh1Var) {
        this.a = eto1Var;
        this.b = str;
        this.c = swo1Var;
        this.e = qeh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(vi01 vi01Var, long j, onm onmVar) {
        yno1 yno1Var;
        if (onmVar instanceof yno1) {
            yno1Var = (yno1) onmVar;
            int i = yno1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yno1Var.c = i - Integer.MIN_VALUE;
            } else {
                yno1Var = new yno1(this, onmVar);
            }
        } else {
            yno1Var = new yno1(this, onmVar);
        }
        Object obj = yno1Var.a;
        int i2 = yno1Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        yno1Var.c = 1;
        Object objC = c(vi01Var, j, yno1Var);
        Object obj2 = d9n.a;
        return objC == obj2 ? obj2 : objC;
    }

    public final String b() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(vi01 vi01Var, long j, onm onmVar) {
        eoo1 eoo1Var;
        if (onmVar instanceof eoo1) {
            eoo1Var = (eoo1) onmVar;
            int i = eoo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eoo1Var.c = i - Integer.MIN_VALUE;
            } else {
                eoo1Var = new eoo1(this, onmVar);
            }
        } else {
            eoo1Var = new eoo1(this, onmVar);
        }
        Object objY = eoo1Var.a;
        int i2 = eoo1Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            o8n o8nVar = this.e.a().a;
            ooo1 ooo1Var = new ooo1(this, j, vi01Var, null);
            eoo1Var.c = 1;
            objY = fn31.Y(o8nVar, ooo1Var, eoo1Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return ((e331) objY).a;
    }
}
