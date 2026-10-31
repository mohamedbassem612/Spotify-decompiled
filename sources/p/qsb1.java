package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qsb1 implements xpw, cvl1 {
    public final lzn0 a;
    public final gw70 b;
    public final xb0 c;
    public final fg60 d;
    public final js20 e;
    public final hy00 f;
    public final psw g;

    public qsb1(lzn0 lzn0Var, gw70 gw70Var, xb0 xb0Var, fg60 fg60Var) {
        this.a = lzn0Var;
        this.b = gw70Var;
        this.c = xb0Var;
        this.d = fg60Var;
        xe01 xe01Var = fg60Var.a;
        Flowable flowableH = yoi1.h(xb0Var.d, b3s.c);
        vbm[] vbmVarArr = q601.a;
        this.e = x3p1.m(new x010(xe01Var, new kge(flowableH), new ap51(3, (lnm) null, (byte) 7), (byte) 1), new msb1(this, (byte) 0), new t491(this, (byte) 18), (o8n) null, new msb1(this, (byte) 1), 8);
        this.f = n3o1.r(this).c(new nsb1(this, (byte) 0), new zbb1(this, (byte) 2));
        j2i j2iVar = new j2i(-1128269698, new u491(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public static String e(int i, pks0 pks0Var) {
        return nik1.A4.b("spotify:listeningstatsdetails:" + i + ":" + pks0Var.b()).a;
    }

    public static ksb1 f(ksb1 ksb1Var, boolean z) {
        int iOrdinal;
        xsb1 xsb1Var = ksb1Var.b;
        if (!z && ((iOrdinal = xsb1Var.ordinal()) == 4 || iOrdinal == 5 || iOrdinal == 6)) {
            btb1 btb1Var = ksb1Var.a;
            if (btb1Var instanceof atb1) {
                atb1 atb1VarA = (atb1) btb1Var;
                String str = atb1VarA.g;
                int iOrdinal2 = atb1VarA.a.ordinal();
                if (iOrdinal2 == 4) {
                    atb1VarA = atb1.a(atb1VarA, null, str, 3935);
                } else if (iOrdinal2 == 5 || iOrdinal2 == 6) {
                    atb1VarA = atb1.a(atb1VarA, Collections.singletonList(atb1VarA.j), str, 3651);
                }
                return new ksb1(atb1VarA, xsb1Var, ksb1Var.c, ksb1Var.d, ksb1Var.e, ksb1Var.f, ksb1Var.g);
            }
            if (!(btb1Var instanceof zsb1)) {
                eg.o();
                return null;
            }
        }
        return ksb1Var;
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final lsb1 g(ksb1 ksb1Var, Integer num) {
        boolean zB = this.d.b();
        Integer num2 = null;
        if (zB && ksb1Var.g && ksb1Var.b == xsb1.i) {
            int iIntValue = num != null ? num.intValue() : this.c.b;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue > 0) {
                num2 = numValueOf;
            }
        }
        return new lsb1(f(ksb1Var, zB), num2);
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
