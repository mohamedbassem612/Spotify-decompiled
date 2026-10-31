package p;

import android.os.Bundle;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xrf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ asf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xrf(asf asfVar, byte b) {
        super(3);
        this.a = b;
        this.b = asfVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ou80 ou80Var;
        w7h1 w7h1Var;
        boolean z;
        byte b = this.a;
        qrf qrfVar = qrf.a;
        prf prfVar = prf.a;
        asf asfVar = this.b;
        boolean z2 = false;
        String str = null;
        switch (b) {
            case 0:
                wrf wrfVar = (wrf) obj;
                rrf rrfVar = (rrf) obj2;
                tqw tqwVar = (tqw) obj3;
                lzn0 lzn0Var = asfVar.d;
                if (rrfVar.equals(prfVar)) {
                    tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                    String str2 = asfVar.a;
                    if (wrfVar instanceof trf) {
                        z2 = ((trf) wrfVar).b;
                    } else if (wrfVar instanceof urf) {
                        z2 = ((urf) wrfVar).d;
                    }
                    if (z2) {
                        Set set = pcf.a;
                        pcf.a(lzn0Var, "spotify:chat-settings-consolidated:".concat(str2), tv80VarY, (Bundle) null);
                    } else {
                        b431 b431Var = asfVar.b;
                        hve hveVar = new hve(str2);
                        if (tv80VarY != null && (ou80Var = tv80VarY.a) != null) {
                            str = ou80Var.a;
                        }
                        b431Var.a(hveVar, str);
                    }
                } else if (!rrfVar.equals(qrfVar)) {
                    if (!(rrfVar instanceof orf)) {
                        eg.o();
                        return null;
                    }
                    orf orfVar = (orf) rrfVar;
                    pcf.a(lzn0Var, asfVar.f(wrfVar), tqwVar != null ? n3o1.y(tqwVar) : null, mno1.h(new mmr0[]{new mmr0("entityUri", orfVar.a), new mmr0("contextUri", orfVar.b), new mmr0("isPlaying", Boolean.valueOf(orfVar.c)), new mmr0("timestamp", orfVar.d), new mmr0("isOpenedFromChat", Boolean.TRUE)}));
                }
                return rih1.a;
            default:
                wrf wrfVar2 = (wrf) obj;
                rrf rrfVar2 = (rrf) obj3;
                String str3 = asfVar.a;
                nqk0 nqk0Var = asfVar.i;
                boolean zEquals = rrfVar2.equals(prfVar);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    if (wrfVar2 instanceof trf) {
                        z = ((trf) wrfVar2).b;
                    } else {
                        z = wrfVar2 instanceof urf ? ((urf) wrfVar2).d : false;
                    }
                    if (z) {
                        nqk0Var.getClass();
                        x6h1 x6h1VarC = nqk0Var.b.c();
                        x6h1VarC.i.add(new a7h1("title", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        Set set2 = pcf.a;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:chat-settings-consolidated:".concat(str3))), y6h1VarA, r6h1.c, System.currentTimeMillis());
                    } else {
                        nqk0Var.getClass();
                        x6h1 x6h1VarC2 = nqk0Var.b.c();
                        x6h1VarC2.i.add(new a7h1("title", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        Set set3 = pcf.a;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:chat-details:".concat(str3))), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (rrfVar2.equals(qrfVar)) {
                        return null;
                    }
                    if (!(rrfVar2 instanceof orf)) {
                        eg.o();
                        return null;
                    }
                    nqk0Var.getClass();
                    x6h1 x6h1VarC3 = nqk0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("title", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", asfVar.f(wrfVar2))), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
