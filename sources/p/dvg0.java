package p;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dvg0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvg0(owj0 owj0Var, iu30 iu30Var, exj0 exj0Var) {
        super(0);
        this.a = (byte) 14;
        this.b = owj0Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    public final Object invoke() {
        tv80 tv80Var;
        boolean z = false;
        tv80 tv80Var2 = null;
        switch (this.a) {
            case 0:
                ivg0 ivg0Var = (ivg0) this.b;
                ivg0Var.d.a(ivg0Var.a.X, (tv80) this.c, (Bundle) null);
                return rih1.a;
            case 1:
                fn31.T((c9n) this.b, (o8n) null, 0, new pw1((xtb0) this.c, (lnm) null, (byte) 4), 3);
                return rih1.a;
            case 2:
                ((ihg0) this.b).a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", (String) this.c, null)));
                return rih1.a;
            case 3:
                ((iu30) this.b).invoke((xoh0) this.c);
                return rih1.a;
            case 4:
                return ((tiv0) this.b).a((klv0) this.c);
            case 5:
                i091 i091Var = (i091) this.b;
                yqg yqgVar = (yqg) this.c;
                return Long.valueOf(ebp1.o(i091Var, yqgVar != null ? Long.valueOf(yqgVar.b()) : null));
            case 6:
                return Integer.valueOf((int) (yae1.a((yae1) this.b, "…", (lee1) this.c, 0, false, 1, 0L, (flb0) null, (xat) null, 1004).c >> 32));
            case 7:
                ((hs00) ((pbq) this.b).X).c((String) this.c).subscribe();
                return rih1.a;
            case 8:
                n1x n1xVar = ((mey0) this.b).g;
                if (n1xVar != null) {
                    ((gii0) this.c).b.o(new wy(gho1.r(n1xVar)));
                }
                return rih1.a;
            case 9:
                if (((Integer) this.b) != null) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 10:
                ((iu30) this.b).invoke(new goi0((l921) this.c));
                return rih1.a;
            case 11:
                ((hrr0) this.c).setValue(Boolean.FALSE);
                wmy wmyVar = (wmy) this.b;
                i8h1 i8h1Var = (i8h1) wmyVar.a;
                q1m0 q1m0Var = (q1m0) ((idd1) wmyVar.f).getValue();
                q1m0Var.getClass();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), q1m0Var.b, q1m0Var.a, System.currentTimeMillis()), (xj61) null);
                wmyVar.l();
                return rih1.a;
            case 12:
                z6x z6xVar = z6x.a;
                tv80 tv80Var3 = ((n0n0) ((kly0) this.b).get()).a;
                tv80Var2 = tv80Var3.isEmpty() ? null : tv80Var3;
                if (tv80Var2 == null) {
                    return gio1.b(z6xVar);
                }
                e4j0 e4j0Var = (e4j0) this.c;
                Iterable iterable = (Iterable) tv80Var2;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(rqt0.u(i6p1.v(((s4j0) it.next()).c(), e4j0.i, z6xVar)));
                }
                return d5p1.r(new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 25), e4j0Var.d, ey71.a, 1);
            case 13:
                ((iu30) this.b).invoke(new jcj0(((vcj0) this.c).a));
                return rih1.a;
            case 14:
                jwj0 jwj0Var = fwj0.a;
                owj0 owj0Var = (owj0) this.b;
                boolean z2 = owj0Var.m;
                boolean z3 = owj0Var.j;
                Boolean bool = owj0Var.a.a;
                if (!z2) {
                    iu30 iu30Var = (iu30) this.c;
                    Boolean bool2 = Boolean.TRUE;
                    if (u890.j(bool, bool2) && !z3) {
                        int iOrdinal = owj0Var.l.ordinal();
                        if (iOrdinal == 0) {
                            jwj0Var = jwj0.a;
                        } else if (iOrdinal != 1 && iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                    } else if (!u890.j(bool, bool2)) {
                        if (u890.j(bool, bool2) || z3) {
                            g3d0 g3d0Var = owj0Var.f;
                            jwj0Var = ((g3d0Var == null || g3d0Var.equals(u2d0.a)) && !owj0Var.d) ? iwj0.a : kwj0.a;
                        } else {
                            jwj0Var = lwj0.a;
                        }
                    }
                    iu30Var.invoke(jwj0Var);
                }
                return rih1.a;
            case 15:
                fn31.T((c9n) this.b, (o8n) null, 0, new uug0(this.c, (lnm) tv80Var2, (byte) 7), 3);
                return rih1.a;
            case 16:
                nfq nfqVar = (nfq) this.b;
                m7k0 m7k0Var = (m7k0) this.c;
                return new xzq(nfqVar.a(m7k0Var.b, null), new l7k0(m7k0Var, (byte) 1));
            case 17:
                ((iu30) this.b).invoke((uuj0) this.c);
                return rih1.a;
            case 18:
                cbk0 cbk0Var = ((wik0) this.b).c;
                ruq0 ruq0Var = ((kak0) this.c).S0.b;
                cbk0Var.c = new bt31(ruq0Var.b, ruq0Var.h, ruq0Var.S0);
                return rih1.a;
            case 19:
                ((ContentResolver) this.b).unregisterContentObserver((n4l0) this.c);
                return rih1.a;
            case 20:
                ((iu30) this.b).invoke((Window) this.c);
                return rih1.a;
            case 21:
                return ((osm0) this.b).a((esm0) this.c, (w2k1) null, 0, (un10) null, z6x.a);
            case 22:
                ((r091) this.b).b(((jtm0) this.c).c);
                return rih1.a;
            case 23:
                uwm0 uwm0Var = (uwm0) this.b;
                b291<zbm1> b291Var = uwm0Var.b;
                Integer num = (Integer) this.c;
                for (zbm1 zbm1Var : b291Var) {
                    if (zbm1Var.b) {
                        tv80Var = (tv80) zbm1Var.a.a.getAndSet(null);
                        if (num == null || num.intValue() != 1) {
                            tv80Var = null;
                        }
                    } else {
                        tv80Var = null;
                    }
                    if (tv80Var != null) {
                        tv80Var2 = tv80Var;
                        if (tv80Var2 == null) {
                            return uwm0Var.a.c;
                        }
                        return tv80Var2;
                    }
                }
                if (tv80Var2 == null) {
                    return uwm0Var.a.c;
                }
                return tv80Var2;
            case 24:
                ux uxVar = (ux) this.b;
                if (uxVar != null) {
                    ((ven0) this.c).setValue(uxVar);
                }
                return rih1.a;
            case 25:
                return zym0.d(((Application) this.c).getPackageManager(), ((zym0) this.b).a);
            case 26:
                ((t0n0) this.b).a.d((fmo) this.c);
                return rih1.a;
            case 27:
                xnn0 xnn0Var = (xnn0) this.b;
                if (xnn0Var != null) {
                    return new bon0(((p1n0) this.c).k().h, xnn0Var);
                }
                return null;
            case 28:
                p1n0 p1n0Var = (p1n0) this.b;
                return p1n0Var.g.a((qe41) this.c, p1n0Var.b, p1n0Var.e, p1n0Var.a, p1n0Var.f);
            default:
                f2n0 f2n0Var = (f2n0) this.b;
                int i = f2n0Var.b;
                int i2 = f2n0Var.c;
                int iLongValue = (int) ((Number) ((ven0) this.c).getValue()).longValue();
                if (i <= iLongValue && iLongValue <= i2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvg0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
