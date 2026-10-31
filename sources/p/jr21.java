package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jr21 extends hab0 implements vu30 {
    public final /* synthetic */ xpw a;
    public final /* synthetic */ rr21 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ cr21 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ yqg g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr21(xpw xpwVar, rr21 rr21Var, String str, String str2, cr21 cr21Var, long j, yqg yqgVar, long j2, long j3) {
        super(2);
        this.a = xpwVar;
        this.b = rr21Var;
        this.c = str;
        this.d = str2;
        this.e = cr21Var;
        this.f = j;
        this.g = yqgVar;
        this.h = j2;
        this.i = j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            String str = this.b.a;
            String strO0 = cwl1.o0(x340Var2, 2131961280);
            cr21 cr21Var = this.e;
            List listM = p7h.M(new String[]{strO0, qtg.i(cr21Var != null ? cr21Var.b : null)});
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listM) {
                if (!ihc1.y0((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
            String strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
            String strO1 = cwl1.o0(x340Var2, 2131961279);
            String strO2 = cwl1.o0(x340Var2, 2131961281);
            String strO = hno1.o(Long.valueOf(this.f), this.g, x340Var2, 0);
            if (strO == null) {
                strO = "";
            }
            otw.c(this.a, new ur21(str, this.c, this.d, strY0, strO1, strO2, strO, cwl1.o0(x340Var2, 2131961296), z4p1.G(this.h), z4p1.G(this.i)), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
