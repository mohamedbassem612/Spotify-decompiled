package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@kzn0("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/fon0;", "Lp/mzn0;", "Lp/don0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class fon0 extends mzn0 {
    public final rzn0 c;

    public fon0(rzn0 rzn0Var) {
        this.c = rzn0Var;
    }

    @Override // p.mzn0
    public final void d(List list, qon0 qon0Var) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hnn0 hnn0Var = (hnn0) it.next();
            don0 don0Var = (don0) hnn0Var.b;
            p811 p811Var = new p811();
            p811Var.a = hnn0Var.a();
            int i = don0Var.Z;
            String str = don0Var.O0;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = don0Var.h;
                if (i2 != 0) {
                    strValueOf = don0Var.c;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i2);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            vnn0 vnn0VarO = str != null ? don0Var.o(str, false) : (vnn0) dio1.r(don0Var.Y, i);
            if (vnn0VarO == null) {
                String strValueOf2 = don0Var.N0;
                if (strValueOf2 == null) {
                    strValueOf2 = don0Var.O0;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(don0Var.Z);
                    }
                    don0Var.N0 = strValueOf2;
                }
                strValueOf2.getClass();
                hhg1.n(f4i1.f("navigation destination ", strValueOf2, " is not a direct child of this NavGraph"));
                return;
            }
            LinkedHashMap linkedHashMap = vnn0VarO.g;
            if (str != null) {
                if (!str.equals(vnn0VarO.i)) {
                    tnn0 tnn0VarI = vnn0VarO.i(str);
                    Bundle bundle = tnn0VarI != null ? tnn0VarI.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) p811Var.a;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        p811Var.a = bundle2;
                    }
                }
                if (sqg0.U(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListN = m5n1.N(sqg0.U(linkedHashMap), new xy50(p811Var, (byte) 17));
                    if (!arrayListN.isEmpty()) {
                        k220.l("Cannot navigate to startDestination ", vnn0VarO, ". Missing required arguments [", arrayListN, 93);
                        return;
                    }
                }
            }
            this.c.b(vnn0VarO.a).d(Collections.singletonList(b().b(vnn0VarO, vnn0VarO.c((Bundle) p811Var.a))), qon0Var);
        }
    }

    @Override // p.mzn0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public don0 a() {
        return new don0(this);
    }
}
