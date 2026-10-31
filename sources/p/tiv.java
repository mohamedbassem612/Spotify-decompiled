package p;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tiv extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ teb b;
    public final /* synthetic */ fai0 c;
    public final /* synthetic */ lvc1 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiv(fai0 fai0Var, teb tebVar, lvc1 lvc1Var, String str) {
        super(1);
        this.c = fai0Var;
        this.b = tebVar;
        this.d = lvc1Var;
        this.e = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
        lvc1 lvc1Var = this.d;
        Integer numValueOf = null;
        fai0 fai0Var = this.c;
        teb tebVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                List list = (List) fai0Var.e();
                numValueOf = list != null ? (ito) o7h.t0(iIntValue, list) : null;
                if (tebVar.g() == null && numValueOf != null) {
                    String str2 = ((ito) numValueOf).b;
                    tebVar.i(lvc1Var, iIntValue, str2, str);
                    tebVar.f = str2;
                }
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (bundle.containsKey("selectedTabId")) {
                    String string = bundle.getString("selectedTabId");
                    tebVar.g = string;
                    List list2 = (List) fai0Var.e();
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (!u890.j(((ito) it.next()).b, string)) {
                                i++;
                            }
                        }
                        numValueOf = Integer.valueOf(i);
                    }
                    if (string != null && numValueOf != null && numValueOf.intValue() >= 0) {
                        tebVar.i(lvc1Var, numValueOf.intValue(), string, str);
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiv(teb tebVar, fai0 fai0Var, lvc1 lvc1Var, String str) {
        super(1);
        this.b = tebVar;
        this.c = fai0Var;
        this.d = lvc1Var;
        this.e = str;
    }
}
