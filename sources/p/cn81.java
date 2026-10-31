package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cn81 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public mmr0 c = new mmr0("V", (Object) null);

    public cn81(nn61 nn61Var, String str, String str2) {
        this.a = str2;
    }

    public final void a(String str, q8a0... q8a0VarArr) {
        n0h1 n0h1Var;
        if (q8a0VarArr.length == 0) {
            n0h1Var = null;
        } else {
            ba80 ba80VarV0 = f46.V0(q8a0VarArr);
            int iS = zno1.s(q7h.U(ba80VarV0, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            ca80 it = ba80VarV0.iterator();
            while (true) {
                ca80 ca80Var = it;
                if (!((Iterator) ca80Var.c).hasNext()) {
                    break;
                }
                aa80 aa80Var = (aa80) ca80Var.next();
                linkedHashMap.put(Integer.valueOf(aa80Var.a), (q8a0) aa80Var.b);
            }
            n0h1Var = new n0h1(linkedHashMap);
        }
        this.b.add(new mmr0(str, n0h1Var));
    }

    public final void b(String str, q8a0... q8a0VarArr) {
        ba80 ba80VarV0 = f46.V0(q8a0VarArr);
        int iS = zno1.s(q7h.U(ba80VarV0, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        ca80 it = ba80VarV0.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                this.c = new mmr0(str, new n0h1(linkedHashMap));
                return;
            } else {
                aa80 aa80Var = (aa80) ca80Var.next();
                linkedHashMap.put(Integer.valueOf(aa80Var.a), (q8a0) aa80Var.b);
            }
        }
    }
}
