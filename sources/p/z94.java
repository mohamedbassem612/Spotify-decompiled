package p;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class z94 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z94(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                v5f0 v5f0Var = (v5f0) obj;
                ha4 ha4Var = ((ba4) obj2).P0;
                if (ha4Var.getInsetsListener().g.s() > 0) {
                    fdn0 fdn0Var = zsl1.a;
                    v5f0Var.a = true;
                    x5f0 x5f0Var = v5f0Var.d;
                    elb0 elb0VarX0 = x5f0Var.x0();
                    if (qr80.b(v5f0Var.b, 9223372034707292159L)) {
                        v5f0Var.b = dm5.c0(nho1.D(elb0VarX0));
                        v5f0Var.c = elb0VarX0.b();
                    }
                    x5f0Var.z0().f1.b();
                    long jB = elb0VarX0.b();
                    nen0 nen0Var = ha4Var.getInsetsListener().f;
                    int i2 = (int) (jB >> 32);
                    int i3 = (int) (jB & 4294967295L);
                    for (xsl1 xsl1Var : zsl1.b) {
                        Object objG = nen0Var.g(xsl1Var);
                        objG.getClass();
                        mtl1 mtl1Var = (mtl1) objG;
                        zsl1.a(v5f0Var, ((ysl1) xsl1Var).c, mtl1Var.h, i2, i3);
                        if (((Boolean) mtl1Var.b.getValue()).booleanValue()) {
                            zsl1.a(v5f0Var, mtl1Var.f, mtl1Var.j, i2, i3);
                            zsl1.a(v5f0Var, mtl1Var.g, mtl1Var.k, i2, i3);
                        }
                        zsl1.a(v5f0Var, ((ysl1) xsl1Var).d, mtl1Var.i, i2, i3);
                    }
                    wdn0 wdn0Var = ha4Var.getInsetsListener().h;
                    if (wdn0Var.j()) {
                        bw91 bw91Var = ha4Var.getInsetsListener().i;
                        Object[] objArr = wdn0Var.a;
                        int i4 = wdn0Var.b;
                        while (i < i4) {
                            ven0 ven0Var = (ven0) objArr[i];
                            r511 r511Var = (r511) bw91Var.get(i);
                            Rect rect = (Rect) ven0Var.getValue();
                            v5f0Var.a(r511Var.a(), rect.left);
                            v5f0Var.a(r511Var.b(), rect.top);
                            v5f0Var.a(r511Var.d(), rect.right);
                            v5f0Var.a(r511Var.c(), rect.bottom);
                            i++;
                        }
                    }
                }
                return rih1.a;
            case 1:
                return new e0i((dgu) obj2, (iu30) obj, (byte) 20);
            case 2:
                p311 p311Var = (p311) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionB = lgo1.b("Recomposer effect job completed", th);
                synchronized (p311Var.d) {
                    try {
                        faa0 faa0Var = p311Var.e;
                        if (faa0Var != null) {
                            bpb1 bpb1Var = p311Var.v;
                            l311 l311Var = l311.b;
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, l311Var);
                            faa0Var.d(cancellationExceptionB);
                            p311Var.s = null;
                            faa0Var.L(new gub0(p311Var, th, (byte) 16));
                        } else {
                            p311Var.f = cancellationExceptionB;
                            bpb1 bpb1Var2 = p311Var.v;
                            l311 l311Var2 = l311.a;
                            bpb1Var2.getClass();
                            bpb1Var2.m((Object) null, l311Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return rih1.a;
            case 3:
                return ((Function0) obj2).invoke();
            case 4:
                ArrayList arrayList = (ArrayList) obj2;
                p5t0 p5t0Var = (p5t0) obj;
                int size = arrayList.size();
                while (i < size) {
                    p5t0.n(p5t0Var, (q5t0) arrayList.get(i), 0, 0, null, 12);
                    i++;
                }
                return rih1.a;
            default:
                gw91 gw91Var = (gw91) obj2;
                synchronized (gw91Var.g) {
                    fw91 fw91Var = gw91Var.i;
                    fw91Var.getClass();
                    Object obj3 = fw91Var.b;
                    obj3.getClass();
                    int i5 = fw91Var.d;
                    sdn0 sdn0Var = fw91Var.c;
                    if (sdn0Var == null) {
                        sdn0Var = new sdn0();
                        fw91Var.c = sdn0Var;
                        fw91Var.f.m(obj3, sdn0Var);
                    }
                    fw91Var.b(obj, i5, obj3, sdn0Var);
                }
                return rih1.a;
        }
    }
}
