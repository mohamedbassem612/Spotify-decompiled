package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jtg {
    public final bpb1 a;
    public final LinkedHashMap b;
    public long c;
    public final xe01 d;

    public jtg() {
        bpb1 bpb1VarB = gio1.b(new gtg());
        this.a = bpb1VarB;
        this.b = new LinkedHashMap();
        this.d = d5p1.h(bpb1VarB);
    }

    public final void a(String str) {
        gtg gtgVar;
        ktg ktgVar;
        Object next;
        itg itgVar = str != null ? (itg) this.b.get(str) : null;
        if (str == null || itgVar == null) {
            gtgVar = new gtg();
        } else {
            List list = itgVar.a;
            htg htgVar = itgVar.b;
            if (htgVar != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ktg ktgVar2 = (ktg) next;
                    if (u890.j(ktgVar2.a, htgVar.a) && ktgVar2.b == htgVar.b) {
                        break;
                    }
                }
                ktgVar = (ktg) next;
            } else {
                ktgVar = null;
            }
            gtgVar = new gtg(str, list, ktgVar);
        }
        this.a.m((Object) null, gtgVar);
    }
}
