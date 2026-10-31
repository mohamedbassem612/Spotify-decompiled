package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gzm extends hab0 implements Function0 {
    public final /* synthetic */ drr0 a;
    public final /* synthetic */ gb5 b;
    public final /* synthetic */ yym c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ c380 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ss50 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ Set i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzm(drr0 drr0Var, gb5 gb5Var, yym yymVar, Function0 function0, c380 c380Var, int i, ss50 ss50Var, vu30 vu30Var, Set set) {
        super(0);
        this.a = drr0Var;
        this.b = gb5Var;
        this.c = yymVar;
        this.d = function0;
        this.e = c380Var;
        this.f = i;
        this.g = ss50Var;
        this.h = vu30Var;
        this.i = set;
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Integer, java.util.ArrayList] */
    public final Object invoke() throws Throwable {
        float f;
        this.a.t(Float.NaN);
        gb5 gb5Var = this.b;
        o4w o4wVarA = gb5Var.a();
        Throwable th = null;
        if (o4wVarA != null) {
            List list = o4wVarA.a;
            c380 c380Var = this.e;
            boolean zIsEmpty = c380Var.isEmpty();
            yoo yooVar = yoo.b;
            vu30 vu30Var = this.h;
            if (zIsEmpty) {
                o4w o4wVarB = gb5Var.b();
                if (o4wVarB != null) {
                    vu30Var.invoke(o4wVarB, yooVar);
                }
            } else {
                int i = this.f;
                xz3 xz3Var = (xz3) list.get(i);
                smc0 smc0VarN = k4p1.n();
                List list2 = list;
                int i2 = 0;
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    xz3 xz3Var2 = (xz3) obj;
                    if (i2 != i && xz3Var2.b == c14.b) {
                        smc0VarN.add(Float.valueOf(Float.intBitsToFloat((int) (xz3Var2.a >> 32))));
                    }
                    i2 = i3;
                }
                smc0VarN.addAll(this.i);
                smc0 smc0VarK = k4p1.k(smc0VarN);
                int i4 = (int) (xz3Var.a >> 32);
                float fT = f4p1.t(Float.intBitsToFloat(i4), c380Var, smc0VarK);
                if (fT == Float.intBitsToFloat(i4)) {
                    f = fT;
                } else {
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    int i5 = 0;
                    for (Object obj2 : list2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            Throwable th2 = th;
                            p7h.T();
                            throw th2;
                        }
                        xz3 xz3VarA = (xz3) obj2;
                        if (i5 == i) {
                            xz3VarA = xz3.a(xz3VarA, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xz3VarA.a & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fT) << 32));
                        }
                        arrayList.add(xz3VarA);
                        i5 = i6;
                        o4wVarA = o4wVarA;
                        th = th;
                        fT = fT;
                    }
                    ?? r17 = th;
                    f = fT;
                    o4wVarA = o4w.a(o4wVarA, arrayList, r17, r17, 30);
                }
                gb5Var.d(o4wVarA);
                o4w o4wVarB2 = gb5Var.b();
                if (o4wVarB2 != null) {
                    vu30Var.invoke(o4wVarB2, yooVar);
                }
                if (f != Float.intBitsToFloat(i4)) {
                    this.g.a(9);
                }
            }
        }
        yym yymVar = this.c;
        yymVar.a = null;
        yymVar.b = 0L;
        l5j1 l5j1Var = yymVar.c;
        l5j1Var.a = Float.NaN;
        l5j1Var.b = false;
        this.d.invoke();
        return rih1.a;
    }
}
