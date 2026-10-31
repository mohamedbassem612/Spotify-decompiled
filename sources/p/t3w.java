package p;

import android.content.res.Resources;
import android.os.ResultReceiver;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t3w implements h0r0 {
    public final b4w a;
    public final xrc0 b;
    public final hvj c;
    public final ffe1 d;
    public final zb91 e;
    public final ezb1 f;
    public final nu g;
    public final los h;
    public final cbr0 i;

    public t3w(Resources resources, b4w b4wVar, xrc0 xrc0Var, hvj hvjVar, ffe1 ffe1Var, zb91 zb91Var, ezb1 ezb1Var, mos mosVar, nu nuVar) {
        this.a = b4wVar;
        this.b = xrc0Var;
        this.c = hvjVar;
        this.d = ffe1Var;
        this.e = zb91Var;
        this.f = ezb1Var;
        this.g = nuVar;
        los losVarA = mos.a();
        this.h = losVarA;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.i = new cbr0(new dbr0[]{new bn70(yon1.L2(), nik1.j6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.b, (Integer) null, 0, (mxb) null, losVarA, false, false, false, (nsm0) null, 2908)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.c.a(f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 20)), apo.j(-302662459, new oat(this, (byte) 20), true), new xvj((xu30) null, dli.a, (j2i) null, false, 61));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        r3w r3wVar;
        if (onmVar instanceof r3w) {
            r3wVar = (r3w) onmVar;
            int i = r3wVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r3wVar.c = i - Integer.MIN_VALUE;
            } else {
                r3wVar = new r3w(this, onmVar);
            }
        } else {
            r3wVar = new r3w(this, onmVar);
        }
        Object objJ = r3wVar.a;
        int i2 = r3wVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            rxc0 rxc0Var = new rxc0(this.a.a());
            r3wVar.c = 1;
            objJ = ((rsc0) this.b).j(rxc0Var, r3wVar);
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
        py21 py21Var = (py21) objJ;
        nit nitVar = new nit(this, (byte) 28);
        py21Var.getClass();
        if (py21Var instanceof ly21) {
            eg.m("Failed to load list metadata");
            return null;
        }
        if (py21Var instanceof oy21) {
            return nitVar.invoke(((oy21) py21Var).a);
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(String str, boolean z, p3w p3wVar, onm onmVar) {
        s3w s3wVar;
        boolean z2;
        nm81 nm81Var;
        ResultReceiver resultReceiverB;
        if (onmVar instanceof s3w) {
            s3wVar = (s3w) onmVar;
            int i = s3wVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3wVar.d = i - Integer.MIN_VALUE;
            } else {
                s3wVar = new s3w(this, onmVar);
            }
        } else {
            s3wVar = new s3w(this, onmVar);
        }
        s3w s3wVar2 = s3wVar;
        Object objA = s3wVar2.b;
        int i2 = s3wVar2.d;
        b4w b4wVar = this.a;
        if (i2 == 0) {
            hm5.M(objA);
            if (!p3wVar.a() || p3wVar.c()) {
                return new im81();
            }
            String strB = p3wVar.b();
            d9n d9nVar = d9n.a;
            ffe1 ffe1Var = this.d;
            if (strB != null) {
                String strA = b4wVar.a();
                s3wVar2.a = z;
                s3wVar2.d = 1;
                objA = ffe1Var.u(strA, strB, str, z, s3wVar2);
                if (objA != d9nVar) {
                    z2 = z;
                    nm81Var = (nm81) objA;
                }
            } else {
                String strA2 = b4wVar.a();
                s3wVar2.a = z;
                s3wVar2.d = 2;
                objA = ffe1Var.a(strA2, str, z, s3wVar2);
                if (objA != d9nVar) {
                    z2 = z;
                    nm81Var = (nm81) objA;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z2 = s3wVar2.a;
            hm5.M(objA);
            nm81Var = (nm81) objA;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = s3wVar2.a;
            hm5.M(objA);
            nm81Var = (nm81) objA;
        }
        if (z2 && u890.j(nm81Var, mm81.a) && (resultReceiverB = b4wVar.b()) != null) {
            resultReceiverB.send(-1, null);
        }
        return nm81Var;
    }
}
