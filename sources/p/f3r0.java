package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f3r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ f3r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public static final List b(String str, y6h1 y6h1Var, zl5 zl5Var, List list) {
        List listD1 = o7h.d1(list, 5);
        boolean zIsEmpty = listD1.isEmpty();
        List listSingletonList = z6x.a;
        if (zIsEmpty) {
            return listSingletonList;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listD1) {
            int i2 = i + 1;
            qer0 qer0Var = null;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            String str2 = (String) obj;
            if (i > 0) {
                qer0Var = qer0.a;
            }
            r7h.W(f46.i0(new qfr0[]{qer0Var, new her0(str2, new tfr0(Integer.valueOf(i), y6h1Var))}), arrayList);
            i = i2;
        }
        if (list.size() > 5) {
            listSingletonList = Collections.singletonList(new jer0((String) list.get(5), f4i1.e(str, ":releases"), new tfr0(Integer.valueOf(listD1.size()), y6h1Var)));
        }
        return o7h.N0(listSingletonList, o7h.N0(arrayList, Collections.singletonList(new gfr0(((Context) zl5Var.b).getString(2131952638), f4i1.e(str, ":releases"), new tfr0(0, y6h1Var)))));
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        byte b = this.a;
        sua suaVar = ey71.a;
        switch (b) {
            case 0:
                zl5 zl5Var = this.b;
                return new rfr0(d5p1.t(new x010(((v8n0) zl5Var.k).a(), zob1Var, new e3r0(zl5Var, str, i, (lnm) null, (byte) 0), (byte) 1), (u9c0) zl5Var.o, suaVar, z6x.a), false);
            case 1:
                zl5 zl5Var2 = this.b;
                return new rfr0(d5p1.t(new d3r0(zob1Var, zl5Var2, str, i, (byte) 10), (u9c0) zl5Var2.o, suaVar, zl5Var2.O(i, str, (ioj0) zob1Var.getValue())), false);
            default:
                String strConcat = "spotify:list:popular-releases:author_".concat(ihc1.V0(str, ':', str));
                Integer numValueOf = Integer.valueOf(i);
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-popular-releases-section";
                x6h1VarI.f = "2.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = numValueOf;
                y6h1 y6h1VarA = x6h1VarI.a();
                zl5 zl5Var3 = this.b;
                ay8 ay8VarH = d3p1.H((d0r) ((ynb0) zl5Var3.f21p).get(), (o3r) zl5Var3.x, strConcat);
                return new rfr0(d5p1.t(new sr0(ay8VarH, str, y6h1VarA, zl5Var3, (byte) 15), (u9c0) zl5Var3.o, suaVar, b(str, y6h1VarA, zl5Var3, (List) ay8VarH.a.getValue())), false);
        }
    }
}
