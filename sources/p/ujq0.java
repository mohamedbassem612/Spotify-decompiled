package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ujq0 {
    public final uu00 a;
    public final vr51 b;

    public ujq0(uu00 uu00Var, vr51 vr51Var) {
        this.a = uu00Var;
        this.b = vr51Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, String str2, String str3, Map map, boolean z, long j, tv80 tv80Var, onm onmVar) {
        tjq0 tjq0Var;
        String str4;
        String str5;
        tv80 tv80Var2;
        long j2;
        String str6;
        boolean z2;
        Map map2;
        mq70 mq70Var;
        long j3;
        long j4;
        if (onmVar instanceof tjq0) {
            tjq0Var = (tjq0) onmVar;
            int i = tjq0Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjq0Var.t = i - Integer.MIN_VALUE;
            } else {
                tjq0Var = new tjq0(this, onmVar);
            }
        } else {
            tjq0Var = new tjq0(this, onmVar);
        }
        Object objL = tjq0Var.h;
        int i2 = tjq0Var.t;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableFlatMap = this.a.b(new oi("transcript-selection-page", false, new atp0(str, (byte) 2))).filter(mi10.V0).flatMap(new ljp1(str, (byte) 14));
            tjq0Var.a = str;
            tjq0Var.b = str2;
            str4 = str3;
            tjq0Var.c = str4;
            tjq0Var.d = map;
            tjq0Var.e = tv80Var;
            tjq0Var.f = z;
            tjq0Var.g = j;
            tjq0Var.t = 1;
            objL = fc11.l(observableFlatMap, 2, (Object) null, tjq0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
            str5 = str2;
            tv80Var2 = tv80Var;
            j2 = j;
            str6 = str;
            z2 = z;
            map2 = map;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = tjq0Var.g;
            boolean z3 = tjq0Var.f;
            tv80Var2 = tjq0Var.e;
            Map map3 = tjq0Var.d;
            String str7 = tjq0Var.c;
            String str8 = tjq0Var.b;
            String str9 = tjq0Var.a;
            hm5.M(objL);
            z2 = z3;
            j2 = j5;
            map2 = map3;
            str4 = str7;
            str5 = str8;
            str6 = str9;
        }
        xkk1 xkk1Var = (xkk1) objL;
        if (xkk1Var == null || (mq70Var = xkk1Var.a) == null) {
            mq70Var = new mq70((List) null, 7);
        }
        up70 up70VarA = mq70Var.a(vp70.b);
        String str10 = up70VarA != null ? up70VarA.a.a : null;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = str10;
        pp70 pp70Var = mq70Var.b;
        if (pp70Var != null) {
            j3 = pp70Var.c.a.c;
        } else {
            uwr uwrVar = cbx.a;
            j3 = ((yex) zex.a.d).c;
        }
        int iG = z4p1.G(j3);
        if (pp70Var != null) {
            j4 = pp70Var.b.a.c;
        } else {
            uwr uwrVar2 = cbx.a;
            j4 = ((vex) zex.a.b).c;
        }
        this.b.o(new zx61(str5, str4, str11, str6, map2, new j9h(iG, z4p1.G(j4)), z2, j2), tv80Var2);
        return rih1.a;
    }
}
