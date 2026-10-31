package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d6y0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f6y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6y0(f6y0 f6y0Var, byte b) {
        super(1);
        this.a = b;
        this.b = f6y0Var;
    }

    public final Object invoke(Object obj) {
        String string;
        Boolean boolD1;
        byte b = this.a;
        f6y0 f6y0Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(f6y0Var.a);
            default:
                cxc0 cxc0Var = (cxc0) obj;
                kby kbyVar = cxc0Var.f;
                Map map = kbyVar.q;
                Set set = h4d0.a;
                String str = (String) map.get("generation_status");
                if (str == null || (string = ihc1.e1(str).toString()) == null) {
                    string = "";
                }
                h4d0 h4d0VarU = qyo1.u(string);
                if (h4d0VarU.a() && f6y0Var.d.a(f6y0Var.a)) {
                    h4d0VarU = h4d0.d;
                }
                h4d0 h4d0Var = h4d0VarU;
                String str2 = kbyVar.a;
                nfa0 nfa0Var = f6y0Var.e;
                String str3 = (String) map.get("error_list");
                List listB = str3 != null ? uiz.b(str3, nfa0Var) : z6x.a;
                boolean zA = cxc0Var.a();
                String str4 = (String) map.get("location_sensitive");
                return new v5y0(str2, h4d0Var, listB, zA, (str4 == null || (boolD1 = ihc1.d1(str4)) == null) ? false : boolD1.booleanValue());
        }
    }
}
