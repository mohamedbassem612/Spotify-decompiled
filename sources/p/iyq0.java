package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iyq0 implements Function, l3j0 {
    public final /* synthetic */ byte a;
    public final Set b;

    /* JADX WARN: Multi-variable type inference failed */
    public iyq0(x610 x610Var, op8 op8Var, abt abtVar, jz11 jz11Var, gjq gjqVar, hjq hjqVar) {
        g131 g131Var;
        fc0 fc0Var;
        this.a = (byte) 0;
        switch (gjqVar.a) {
            case 0:
                obq obqVar = gjqVar.b;
                g131Var = new g131(((ojq) obqVar.d).a(), (r8l) obqVar.b.ff.get(), x610Var);
                break;
            default:
                obq obqVar2 = gjqVar.b;
                g131Var = new g131(((ojq) obqVar2.d).a(), (r8l) obqVar2.b.ff.get(), x610Var);
                break;
        }
        switch (hjqVar.a) {
            case 0:
                obq obqVar3 = hjqVar.b;
                zx4 zx4VarA = ((ojq) obqVar3.d).a();
                daq daqVar = obqVar3.b;
                fc0Var = new fc0(zx4VarA, (r8l) daqVar.ff.get(), (Flowable) daqVar.D5.get(), x610Var);
                break;
            default:
                obq obqVar4 = hjqVar.b;
                zx4 zx4VarA2 = ((ojq) obqVar4.d).a();
                daq daqVar2 = obqVar4.b;
                fc0Var = new fc0(zx4VarA2, (r8l) daqVar2.ff.get(), (Flowable) daqVar2.D5.get(), x610Var);
                break;
        }
        this.b = f46.S0(new vdh[]{op8Var, abtVar, jz11Var, g131Var, fc0Var});
    }

    public boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.b.contains(((n3j0) it.next()).a)) {
                return false;
            }
        }
        return true;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Set set = this.b;
        switch (b) {
            case 1:
                bx01 bx01Var = (bx01) obj;
                Set set2 = set;
                int iS = zno1.s(q7h.U(set2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj2 : set2) {
                    linkedHashMap.put(obj2, bx01Var.a.containsKey((String) obj2) ? vw01.b : vw01.a);
                }
                return linkedHashMap;
            default:
                Set set3 = set;
                int iS2 = zno1.s(q7h.U(set3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj3 : set3) {
                    linkedHashMap2.put(obj3, new hix0(false, 0L));
                }
                return linkedHashMap2;
        }
    }

    public /* synthetic */ iyq0(Set set, byte b) {
        this.a = b;
        this.b = set;
    }
}
