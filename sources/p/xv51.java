package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xv51 {
    public static final bma1 b = bma1.b.u("offline_backup_selected_filter_concept_uri");
    public final Single a;

    public xv51(Single single) {
        this.a = single;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        uv51 uv51Var;
        if (onmVar instanceof uv51) {
            uv51Var = (uv51) onmVar;
            int i = uv51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uv51Var.c = i - Integer.MIN_VALUE;
            } else {
                uv51Var = new uv51(this, onmVar);
            }
        } else {
            uv51Var = new uv51(this, onmVar);
        }
        Object objJ = uv51Var.a;
        int i2 = uv51Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            uv51Var.c = 1;
            objJ = fc11.j(this.a, uv51Var);
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
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.f(b);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        vv51 vv51Var;
        if (onmVar instanceof vv51) {
            vv51Var = (vv51) onmVar;
            int i = vv51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vv51Var.c = i - Integer.MIN_VALUE;
            } else {
                vv51Var = new vv51(this, onmVar);
            }
        } else {
            vv51Var = new vv51(this, onmVar);
        }
        Object objJ = vv51Var.a;
        int i2 = vv51Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            vv51Var.c = 1;
            objJ = fc11.j(this.a, vv51Var);
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
        return ((dma1) objJ).e(b, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        wv51 wv51Var;
        if (onmVar instanceof wv51) {
            wv51Var = (wv51) onmVar;
            int i = wv51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wv51Var.d = i - Integer.MIN_VALUE;
            } else {
                wv51Var = new wv51(this, onmVar);
            }
        } else {
            wv51Var = new wv51(this, onmVar);
        }
        Object objJ = wv51Var.b;
        int i2 = wv51Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            wv51Var.a = str;
            wv51Var.d = 1;
            objJ = fc11.j(this.a, wv51Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = wv51Var.a;
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.d(b, str);
        hma1VarEdit.g();
        return rih1.a;
    }
}
