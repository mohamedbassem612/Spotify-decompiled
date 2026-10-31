package p;

import android.os.Bundle;
import com.spotify.mobius.First;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c1j1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1j1(gcj1 gcj1Var, e701 e701Var) {
        super(2);
        this.a = (byte) 4;
    }

    public final Object invoke(Object obj, Object obj2) {
        mq70 mq70Var;
        up70 up70VarA;
        mq70 mq70Var2;
        pp70 pp70Var;
        f7l1 f7l1Var;
        String str;
        gzn fznVar;
        byte b = this.a;
        String u7hVar = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                czo1.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                fwg fwgVar = (fwg) obj;
                Bundle bundle = (Bundle) obj2;
                x1j1 x1j1Var = bundle != null ? (x1j1) jhc1.t(bundle, "verificationCodeVerifyBundle", x1j1.class) : null;
                if (x1j1Var != null) {
                    return x1j1Var;
                }
                if (fwgVar instanceof dwg) {
                    dwg dwgVar = (dwg) fwgVar;
                    return new v1j1(dwgVar.a, dwgVar.b);
                }
                if (fwgVar instanceof ewg) {
                    ewg ewgVar = (ewg) fwgVar;
                    return new w1j1(ewgVar.b, ewgVar.c, ewgVar.a);
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj2).intValue();
                j0p1.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                p1p1.m((b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                taj1 taj1Var = (taj1) obj;
                return First.c(new xcj1(taj1Var, true, false, false, false, 0, 124), f46.S0(new d9j1[]{new ic80(taj1Var.a), new oy(taj1Var)}));
            case 5:
                ((Number) obj2).intValue();
                qej1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                qej1.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                return new rpj1(((Boolean) obj2).booleanValue());
            case 8:
                nzj1 nzj1Var = (nzj1) obj2;
                boolean z = ((lzj1) obj).c;
                jo70 jo70Var = nzj1Var.a;
                String str2 = jo70Var.a;
                List list = jo70Var.d;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ho70) it.next()).a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((String) obj3).length() > 0) {
                        arrayList2.add(obj3);
                    }
                }
                String strY0 = o7h.y0(arrayList2, ", ", (String) null, (String) null, (iu30) null, 62);
                xkk1 xkk1Var = nzj1Var.b;
                if (xkk1Var == null || (mq70Var = xkk1Var.b) == null) {
                    mq70Var = xkk1Var != null ? xkk1Var.a : null;
                }
                if (mq70Var != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    u7hVar = up70VarA.a.a;
                }
                return new mzj1(str2, strY0, u7hVar != null ? u7hVar : "", z);
            case 9:
                ((Number) obj2).intValue();
                pok1.j((b0k) obj, czo1.p(7));
                return rih1Var;
            case 10:
                i1r i1rVar = (k1r) obj2;
                if (i1rVar instanceof i1r) {
                    s5l1 s5l1Var = (s5l1) i1rVar.a;
                    sqe sqeVar = (s5l1Var == null || (f7l1Var = s5l1Var.a) == null) ? null : f7l1Var.a;
                    y6l1 y6l1Var = sqeVar instanceof y6l1 ? (y6l1) sqeVar : null;
                    if (y6l1Var != null) {
                        xkk1 xkk1Var2 = s5l1Var.b;
                        u7h u7hVar2 = (xkk1Var2 == null || (mq70Var2 = xkk1Var2.a) == null || (pp70Var = mq70Var2.b) == null) ? null : new u7h(pp70Var.b.a.c);
                        String str3 = y6l1Var.f;
                        String str4 = y6l1Var.h.a;
                        String str5 = y6l1Var.i;
                        String str6 = y6l1Var.j;
                        boolean z2 = !u890.j(y6l1Var.g.a, "");
                        if (u7hVar2 != null) {
                            long j = u7hVar2.a;
                            u7hVar = new u7h(z4p1.h(u7h.g(j), u7h.f(j), u7h.d(j), u7h.c(j), 16));
                        }
                        return new q5l1(str3, str4, str5, str6, z2, u7hVar);
                    }
                }
                return p5l1.a;
            case 11:
                ((Number) obj2).intValue();
                pxd0.u((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                qxd0.H((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                zam1 zam1Var = (zam1) obj2;
                kby kbyVar = ((abm1) obj).a;
                x4i1 x4i1Var = kbyVar.u;
                String str7 = x4i1Var != null ? x4i1Var.c : null;
                if (str7 == null) {
                    str7 = "";
                }
                x4i1 x4i1Var2 = kbyVar.e;
                String str8 = x4i1Var2 != null ? x4i1Var2.c : null;
                String str9 = x4i1Var2 != null ? x4i1Var2.b : null;
                String str10 = str9 != null ? str9 : "";
                if (x4i1Var2 != null) {
                    str = x4i1Var2.f;
                    if (str == null || str.length() == 0) {
                        str = x4i1Var2.e;
                    }
                } else {
                    str = null;
                }
                bzn bznVar = new bzn(str7, new td10(str, str10, str8, (sd10) null), 4);
                eww0 eww0Var = zam1Var.a;
                if (eww0Var != null) {
                    String str11 = eww0Var.b;
                    String str12 = eww0Var.a;
                    String str13 = (String) o7h.s0(eww0Var.e);
                    if (str13 == null) {
                        str13 = eww0Var.f;
                    }
                    fznVar = new gzn(bznVar, new ozn(new td10(str13, str12, str11, (sd10) null)));
                } else {
                    fznVar = new fzn(bznVar);
                }
                return new bbm1(fznVar);
            default:
                ((Number) obj2).intValue();
                ixm1.a((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1j1(Object obj, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1j1(int i, byte b) {
        super(2);
        this.a = b;
    }
}
