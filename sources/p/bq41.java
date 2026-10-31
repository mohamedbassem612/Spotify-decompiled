package p;

import io.reactivex.rxjava3.core.Flowable;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bq41 {
    public final qfb0 a;
    public final i8h1 b;
    public final wxl0 c;
    public final Flowable d;

    public bq41(qfb0 qfb0Var, i8h1 i8h1Var, wxl0 wxl0Var, Flowable flowable) {
        this.a = qfb0Var;
        this.b = i8h1Var;
        this.c = wxl0Var;
        this.d = flowable;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f A[PHI: r15
      0x006f: PHI (r15v8 java.lang.String) = (r15v5 java.lang.String), (r15v15 java.lang.String) binds: [B:19:0x0047, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(onm onmVar) {
        zp41 zp41Var;
        String str;
        String str2;
        String str3;
        if (onmVar instanceof zp41) {
            zp41Var = (zp41) onmVar;
            int i = zp41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zp41Var.d = i - Integer.MIN_VALUE;
            } else {
                zp41Var = new zp41(this, onmVar);
            }
        } else {
            zp41Var = new zp41(this, onmVar);
        }
        Object obj = zp41Var.b;
        int i2 = zp41Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            a8r0 a8r0VarA = this.a.a(rj41.b);
            str = a8r0VarA != null ? a8r0VarA.b : null;
            if (u890.j(nik1.p1.a, str)) {
                ytw0 ytw0Var = jfv.b;
                long jL0 = fdg1.l0(300L, ngv.d);
                lc41 lc41Var = new lc41(this, str, (lnm) null, (byte) 7);
                zp41Var.a = str;
                zp41Var.d = 1;
                Object objP = rc2.P(jL0, lc41Var, zp41Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                str2 = str;
                obj = objP;
            } else {
                str3 = str;
            }
            if (str3 != null) {
                return null;
            }
            wxl0 wxl0Var = this.c;
            wxl0Var.getClass();
            x6h1 x6h1VarC = wxl0Var.a.c();
            x6h1VarC.i.add(new a7h1("shareable_entity", (String) null, (Integer) null, str3, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            b7x b7xVar = b7x.a;
            return this.b.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("take_screenshot", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = zp41Var.a;
        hm5.M(obj);
        str = (String) obj;
        if (str == null) {
            str3 = str2;
        } else {
            str3 = str;
        }
        if (str3 != null) {
            return null;
        }
        wxl0 wxl0Var2 = this.c;
        wxl0Var2.getClass();
        x6h1 x6h1VarC2 = wxl0Var2.a.c();
        x6h1VarC2.i.add(new a7h1("shareable_entity", (String) null, (Integer) null, str3, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar2 = b7x.a;
        return this.b.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("take_screenshot", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
