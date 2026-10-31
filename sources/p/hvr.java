package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hvr implements vu30 {
    public final Activity a;
    public final lzn0 b;
    public final q7r0 c;
    public final iyc0 d;
    public final iir e;
    public final kt91 f;
    public final los g;
    public final r5h h;
    public final q8n i;
    public final q8n t;

    public hvr(Activity activity, lzn0 lzn0Var, q7r0 q7r0Var, iyc0 iyc0Var, iir iirVar, kt91 kt91Var, los losVar, r5h r5hVar, q8n q8nVar, q8n q8nVar2) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = q7r0Var;
        this.d = iyc0Var;
        this.e = iirVar;
        this.f = kt91Var;
        this.g = losVar;
        this.h = r5hVar;
        this.i = q8nVar;
        this.t = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(lw91 lw91Var, lnm lnmVar) {
        evr evrVar;
        if (lnmVar instanceof evr) {
            evrVar = (evr) lnmVar;
            int i = evrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                evrVar.c = i - Integer.MIN_VALUE;
            } else {
                evrVar = new evr(this, lnmVar);
            }
        } else {
            evrVar = new evr(this, lnmVar);
        }
        Object obj = evrVar.a;
        int i2 = evrVar.c;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (lw91Var.b) {
                String str = lw91Var.a;
                evrVar.c = 1;
                Object objY = fn31.Y(this.t, new gke(this, str, (lnm) null, (byte) 22), evrVar);
                d9n d9nVar = d9n.a;
                if (objY != d9nVar) {
                    objY = rih1Var;
                }
                if (objY == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.g.a(ixb.c);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        fvr fvrVar;
        if (onmVar instanceof fvr) {
            fvrVar = (fvr) onmVar;
            int i = fvrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fvrVar.c = i - Integer.MIN_VALUE;
            } else {
                fvrVar = new fvr(this, onmVar);
            }
        } else {
            fvrVar = new fvr(this, onmVar);
        }
        Object objY = fvrVar.a;
        int i2 = fvrVar.c;
        if (i2 == 0) {
            hm5.M(objY);
            zlo zloVar = new zlo(this, str, (lnm) null, (byte) 7);
            fvrVar.c = 1;
            objY = fn31.Y(this.i, zloVar, fvrVar);
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
