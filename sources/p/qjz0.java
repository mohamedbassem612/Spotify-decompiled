package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qjz0 implements h0r0 {
    public final hvj a;
    public final ujz0 b;
    public final rut0 c;
    public final gmq d;
    public final cbr0 e;

    public qjz0(Resources resources, hvj hvjVar, ujz0 ujz0Var, rut0 rut0Var, gmq gmqVar, los losVar) {
        this.a = hvjVar;
        this.b = ujz0Var;
        this.c = rut0Var;
        this.d = gmqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.z4(), nik1.W.b(ujz0Var.a()), (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.5f)), ixb.a, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4060), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(f610.e(new p6e0[]{new p6e0()}, new l8t0(this, (lnm) null, (byte) 6)), apo.j(313032645, new f2z0(this, (byte) 10), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        pjz0 pjz0Var;
        Object objI;
        if (onmVar instanceof pjz0) {
            pjz0Var = (pjz0) onmVar;
            int i = pjz0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjz0Var.c = i - Integer.MIN_VALUE;
            } else {
                pjz0Var = new pjz0(this, onmVar);
            }
        } else {
            pjz0Var = new pjz0(this, onmVar);
        }
        Object obj = pjz0Var.a;
        int i2 = pjz0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            String strB = this.b.b();
            pjz0Var.c = 1;
            objI = this.c.i(strB, pjz0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objI = ((e331) obj).a;
        }
        hm5.M(objI);
        return mqo1.A((Iterable) objI);
    }
}
