package p;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qbf implements owy0 {
    public final d520 a;
    public final wmy b;
    public final dc31 c;
    public final Context d;
    public final nbc e;
    public final dfd f;
    public final hvp0 g;
    public final tka0 h = rc11.a.b(qto0.class);

    public qbf(d520 d520Var, wmy wmyVar, dc31 dc31Var, Context context, nbc nbcVar, dfd dfdVar, hvp0 hvp0Var) {
        this.a = d520Var;
        this.b = wmyVar;
        this.c = dc31Var;
        this.d = context;
        this.e = nbcVar;
        this.f = dfdVar;
        this.g = hvp0Var;
    }

    @Override // p.owy0
    public final tka0 a() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p.owy0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object b(qto0 qto0Var, onm onmVar) {
        nbf nbfVar;
        boolean z;
        Object objS;
        vxi0 vxi0Var;
        ujo0 ujo0Var;
        qto0 qto0Var2;
        boolean z2;
        Object objS2;
        qto0 qto0Var3 = qto0Var;
        if (onmVar instanceof nbf) {
            nbfVar = (nbf) onmVar;
            int i = nbfVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbfVar.g = i - Integer.MIN_VALUE;
            } else {
                nbfVar = new nbf(this, onmVar);
            }
        } else {
            nbfVar = new nbf(this, onmVar);
        }
        Object obj = nbfVar.e;
        int i2 = nbfVar.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            ujo0 ujo0Var2 = qto0Var3.c;
            b561 b561Var = qto0Var3.d;
            String str = ujo0Var2.c;
            String str2 = this.f.a;
            Set set = s4b1.f;
            String strB = pcf.b(uic.x(str));
            z = (strB == null || str2 == null || !str2.equals(strB)) ? false : true;
            if (z) {
                return new fs50(new bho0(3), qto0Var3.j, qto0Var3.c.c);
            }
            String str3 = b561Var.b;
            if (str3 == null || str3.length() == 0) {
                str3 = b561Var.a;
            }
            obf obfVar = new obf(qto0Var3, str3, this, null);
            nbfVar.a = qto0Var3;
            nbfVar.d = z;
            nbfVar.g = 1;
            objS = smo1.s(obfVar, nbfVar);
            if (objS != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            boolean z3 = nbfVar.d;
            qto0 qto0Var4 = nbfVar.a;
            hm5.M(obj);
            z = z3;
            qto0Var3 = qto0Var4;
            objS = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = nbfVar.d;
            vxi0Var = nbfVar.c;
            ujo0 ujo0Var3 = nbfVar.b;
            qto0Var2 = nbfVar.a;
            hm5.M(obj);
            ujo0Var = ujo0Var3;
        }
        vxi0 vxi0Var2 = vxi0Var;
        String str4 = qto0Var2.f;
        khh0 khh0Var = qto0Var2.e;
        cvy0 cvy0Var = qto0Var2.j;
        List list = qto0Var2.h;
        Bundle bundle = new Bundle();
        bundle.putString("uri", qto0Var2.c.c);
        tbf tbfVar = new tbf(ujo0Var, vxi0Var2, str4, khh0Var, new pbf(this, qto0Var2, (byte) 0), new pbf(this, qto0Var2, (byte) 1), bundle, cvy0Var, list);
        nbfVar.a = null;
        nbfVar.b = null;
        nbfVar.c = null;
        nbfVar.d = z2;
        nbfVar.g = 3;
        objS2 = this.a.s(tbfVar, nbfVar);
        if (objS2 != d9nVar) {
            return d9nVar;
        }
        return objS2;
        mmr0 mmr0Var = (mmr0) objS;
        ujo0 ujo0Var4 = (ujo0) mmr0Var.a;
        vxi0Var = (vxi0) mmr0Var.b;
        nbfVar.a = qto0Var3;
        nbfVar.b = ujo0Var4;
        nbfVar.c = vxi0Var;
        nbfVar.d = z;
        nbfVar.g = 2;
        if (qgo1.i("presenter_type", "chat_message", nbfVar) != d9nVar) {
            ujo0Var = ujo0Var4;
            qto0Var2 = qto0Var3;
            z2 = z;
            vxi0 vxi0Var3 = vxi0Var;
            String str5 = qto0Var2.f;
            khh0 khh0Var2 = qto0Var2.e;
            cvy0 cvy0Var2 = qto0Var2.j;
            List list2 = qto0Var2.h;
            Bundle bundle2 = new Bundle();
            bundle2.putString("uri", qto0Var2.c.c);
            tbf tbfVar2 = new tbf(ujo0Var, vxi0Var3, str5, khh0Var2, new pbf(this, qto0Var2, (byte) 0), new pbf(this, qto0Var2, (byte) 1), bundle2, cvy0Var2, list2);
            nbfVar.a = null;
            nbfVar.b = null;
            nbfVar.c = null;
            nbfVar.d = z2;
            nbfVar.g = 3;
            objS2 = this.a.s(tbfVar2, nbfVar);
            if (objS2 != d9nVar) {
                return objS2;
            }
        }
        return d9nVar;
    }
}
