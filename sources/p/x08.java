package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x08 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x08(j47 j47Var, boolean z, float f, ksl kslVar) {
        super(3);
        this.d = j47Var;
        this.b = z;
        this.c = f;
        this.e = kslVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri m231Var;
        Uri uri;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    q08 q08Var = (q08) obj5;
                    ((y08) obj4).f(q08Var.b, this.b, q08Var.e, this.c, null, b0kVar2, 0);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            default:
                ksl kslVar = (ksl) obj5;
                g2c g2cVar = (g2c) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                j47 j47Var = (j47) obj4;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var.g(g2cVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String str = j47Var.a.a().a;
                    if (str != null) {
                        try {
                            m231Var = Uri.parse(str);
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        uri = m231Var;
                        if (uri == null) {
                            uri = Uri.EMPTY;
                        }
                    } else {
                        uri = Uri.EMPTY;
                    }
                    Uri uri2 = uri;
                    boolean z = this.b;
                    float f = this.c;
                    if (z) {
                        x340Var2.i0(-1333196017);
                        qim0 qim0VarQ = i1p1.q(u291.r(nim0.a, f), er31.a);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
                        hzj.A.getClass();
                        if (x340Var2.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(hmb0.t1);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC, x340Var2, y580.O0);
                        nko1.H(xos0VarM, x340Var2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                        nko1.F(x340Var2);
                        nko1.H(qim0VarE, x340Var2, y580.Y);
                        uri2.getClass();
                        p3v p3vVar = new p3v(f);
                        cbx.a.getClass();
                        eso1.e(uri2, kslVar, (qim0) null, p3vVar, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 24576, 0, 4036);
                        x340Var2.r(true);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1332869556);
                        uri2.getClass();
                        p3v p3vVar2 = new p3v(f);
                        uwr uwrVar = cbx.a;
                        cua cuaVar = cbx.b(x340Var2).f;
                        cua cuaVar2 = cbx.b(x340Var2).f;
                        zvx zvxVar = new zvx();
                        cbx.a.getClass();
                        eso1.e(uri2, kslVar, (qim0) null, p3vVar2, zvxVar, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 0, 0, 4036);
                        x340Var2.r(false);
                    }
                    break;
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x08(y08 y08Var, q08 q08Var, boolean z, float f) {
        super(3);
        this.d = y08Var;
        this.e = q08Var;
        this.b = z;
        this.c = f;
    }
}
