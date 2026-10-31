package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ovj extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ cv30 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovj(int i, ven0 ven0Var, ven0 ven0Var2, z6x0 z6x0Var, Context context, iu30 iu30Var, o3x0 o3x0Var) {
        super(1);
        this.b = i;
        this.h = ven0Var;
        this.c = ven0Var2;
        this.d = z6x0Var;
        this.e = context;
        this.f = iu30Var;
        this.g = o3x0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 13;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        iu30 iu30Var = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i = this.b;
        Object obj6 = this.h;
        switch (b) {
            case 0:
                iu30 iu30Var2 = iu30Var;
                fad0 fad0Var = (fad0) obj5;
                jj40 jj40Var = (jj40) obj4;
                int i2 = ((vme0) obj3).c;
                int iOrdinal = ((hne0) obj).ordinal();
                if (iOrdinal == 0) {
                    fad0Var.j(new fu80(i, i2 == 2 ? 2 : 1, 1, jj40Var.a));
                    if (i2 == 2) {
                        ((ven0) obj6).setValue(jj40Var);
                    } else {
                        iu30Var2.invoke(new tle0(jj40Var));
                    }
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    fad0Var.j(new iu80(i, i2 == 2 ? 2 : 1));
                    iu30Var2.invoke(new bme0(((ine0) obj2).c));
                }
                return rih1Var;
            case 1:
                p5t0 p5t0Var = (p5t0) obj;
                tlc1 tlc1Var = (tlc1) obj4;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj5;
                int size = arrayList2.size();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    q5t0 q5t0Var = (q5t0) arrayList2.get(i5);
                    p5t0Var.k(q5t0Var, i4, i3, 0.0f);
                    arrayList.add(new lhd1(p5t0Var.M0(i4), p5t0Var.M0(q5t0Var.a)));
                    i4 += q5t0Var.a;
                    i5++;
                    obj6 = obj6;
                    i3 = 0;
                }
                Object obj7 = obj6;
                List listP = tlc1Var.P(thd1.b, new j2i(-1372989635, new ozw((xu30) iu30Var, arrayList, (byte) 17), true));
                n811 n811Var = (n811) obj2;
                n811 n811Var2 = (n811) obj7;
                int size2 = listP.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    afh0 afh0Var = (afh0) listP.get(i6);
                    int i7 = n811Var.a;
                    int i8 = n811Var2.a;
                    if (!((i7 >= 0) & (i8 >= 0))) {
                        sf80.a("width and height must be >= 0");
                    }
                    p5t0Var.k(afh0Var.H(jjl.h(i7, i7, i8, i8)), 0, 0, 0.0f);
                }
                dt41 dt41Var = (dt41) obj3;
                es41 es41Var = dt41Var.a;
                Integer num = dt41Var.d;
                if (num == null || num.intValue() != i) {
                    dt41Var.d = Integer.valueOf(i);
                    lhd1 lhd1Var = (lhd1) o7h.t0(i, arrayList);
                    if (lhd1Var != null) {
                        lhd1 lhd1Var2 = (lhd1) o7h.A0(arrayList);
                        int iI0 = tlc1Var.i0(lhd1Var2.a + lhd1Var2.b);
                        int iS = iI0 - es41Var.f.s();
                        int iI1 = tlc1Var.i0(lhd1Var.a) - ((iS / 2) - (tlc1Var.i0(lhd1Var.b) / 2));
                        int i9 = iI0 - iS;
                        if (i9 < 0) {
                            i9 = 0;
                        }
                        int iP = yoi1.p(iI1, 0, i9);
                        if (es41Var.a.s() != iP) {
                            fn31.T(dt41Var.b, (o8n) null, 0, new cy9(dt41Var, iP, (lnm) null, (byte) 13), 3);
                        }
                    }
                }
                return rih1Var;
            default:
                rtb0 rtb0Var = (rtb0) obj;
                for (odx0 odx0Var : (List) ((ven0) obj6).getValue()) {
                    odx0Var.getClass();
                    z511 z511VarB = odx0Var.b();
                    rtb0.b(rtb0Var, z511VarB.e(), new mwv0(odx0Var, (byte) 22), new j2i(-1696634828, new ixt0(z511VarB, b2), true), 4);
                }
                if (i == 0 && !((Boolean) ((tob1) obj5).getValue()).booleanValue()) {
                    rtb0.c(rtb0Var, "empty_state", new j2i(772779101, new c9y((z6x0) obj4, (Context) obj3, iu30Var, (o3x0) obj2, (byte) 22), true), 2);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovj(ArrayList arrayList, tlc1 tlc1Var, dt41 dt41Var, int i, xu30 xu30Var, n811 n811Var, n811 n811Var2) {
        super(1);
        this.c = arrayList;
        this.d = tlc1Var;
        this.e = dt41Var;
        this.b = i;
        this.f = xu30Var;
        this.g = n811Var;
        this.h = n811Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovj(fad0 fad0Var, jj40 jj40Var, int i, vme0 vme0Var, iu30 iu30Var, ine0 ine0Var, ven0 ven0Var) {
        super(1);
        this.c = fad0Var;
        this.d = jj40Var;
        this.b = i;
        this.e = vme0Var;
        this.f = iu30Var;
        this.g = ine0Var;
        this.h = ven0Var;
    }
}
