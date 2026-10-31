package p;

import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bps0 implements uu40 {
    public static final bma1 c;
    public static final bma1 d;
    public static final bma1 e;
    public final Single a;
    public final yqg b;

    static {
        nbc nbcVar = bma1.b;
        nbcVar.u("glasses_account_linking_nudge_dismissed");
        c = nbcVar.u("glasses_education_dismissed");
        d = nbcVar.u("glasses_education_maybe_later");
        e = nbcVar.u("glasses_education_cooldown_until");
    }

    public bps0(Single single, yqg yqgVar) {
        this.a = single;
        this.b = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.uu40
    public final Object a(lnm lnmVar) {
        zos0 zos0Var;
        if (lnmVar instanceof zos0) {
            zos0Var = (zos0) lnmVar;
            int i = zos0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zos0Var.c = i - Integer.MIN_VALUE;
            } else {
                zos0Var = new zos0(this, (onm) lnmVar);
            }
        } else {
            zos0Var = new zos0(this, (onm) lnmVar);
        }
        Object objJ = zos0Var.a;
        int i2 = zos0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            zos0Var.c = 1;
            objJ = fc11.j(this.a, zos0Var);
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
        dma1 dma1Var = (dma1) objJ;
        bma1 bma1Var = d;
        long j = dma1Var.h(bma1Var, false) ? 30L : 7L;
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.a(bma1Var, true);
        hma1VarEdit.c(e, TimeUnit.DAYS.toMillis(j) + this.b.b());
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.uu40
    public final Object b(lnm lnmVar) {
        yos0 yos0Var;
        if (lnmVar instanceof yos0) {
            yos0Var = (yos0) lnmVar;
            int i = yos0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yos0Var.c = i - Integer.MIN_VALUE;
            } else {
                yos0Var = new yos0(this, (onm) lnmVar);
            }
        } else {
            yos0Var = new yos0(this, (onm) lnmVar);
        }
        Object objJ = yos0Var.a;
        int i2 = yos0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            yos0Var.c = 1;
            objJ = fc11.j(this.a, yos0Var);
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
        hma1VarEdit.a(c, true);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.uu40
    public final Object c(lnm lnmVar) {
        aps0 aps0Var;
        if (lnmVar instanceof aps0) {
            aps0Var = (aps0) lnmVar;
            int i = aps0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aps0Var.c = i - Integer.MIN_VALUE;
            } else {
                aps0Var = new aps0(this, (onm) lnmVar);
            }
        } else {
            aps0Var = new aps0(this, (onm) lnmVar);
        }
        Object objJ = aps0Var.a;
        int i2 = aps0Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objJ);
            aps0Var.c = 1;
            objJ = fc11.j(this.a, aps0Var);
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
        dma1 dma1Var = (dma1) objJ;
        if (!dma1Var.h(c, false) && this.b.b() >= dma1Var.g(e, 0L)) {
            z = false;
        }
        return yah0.m(z);
    }
}
