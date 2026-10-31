package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mff implements r331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mff(byte b, Object obj, iu30 iu30Var) {
        this.a = b;
        this.c = iu30Var;
        this.b = obj;
    }

    public final void e(d331 d331Var) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                uff uffVar = (uff) obj;
                lzn0 lzn0Var = uffVar.d;
                if (d331Var instanceof y231) {
                    lve lveVar = ((mve) ((y231) d331Var).a).a;
                    if (u890.j(lveVar, ive.a)) {
                        lzn0Var.e();
                    } else if (u890.j(lveVar, jve.a)) {
                        if (!uffVar.j.a.i()) {
                            lzn0Var.e();
                        }
                    } else if (lveVar instanceof kve) {
                        ((iu30) obj2).invoke(new v2f(((kve) lveVar).a));
                    } else {
                        eg.o();
                    }
                    break;
                } else if (!d331Var.equals(l231.a)) {
                    eg.o();
                    break;
                }
                break;
            case 1:
                if (d331Var instanceof y231) {
                    ArrayList<ldl> arrayList = ((ofl) ((y231) d331Var).a).a;
                    int iS = zno1.s(q7h.U(arrayList, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (ldl ldlVar : arrayList) {
                        linkedHashMap.put(ldlVar.a, Boolean.valueOf(ldlVar.b));
                    }
                    if (!linkedHashMap.isEmpty()) {
                        ((iu30) ((ven0) obj2).getValue()).invoke(new nfl(linkedHashMap));
                    }
                }
                ((p1l) obj).e();
                break;
            case 2:
                ((kgu) obj).b.invoke(new f2t((r331) obj2, d331Var, (byte) 12));
                break;
            case 3:
                if (d331Var instanceof y231) {
                    ((iu30) obj2).invoke(new a0y0(((c0y0) obj).a(), (String) null));
                }
                break;
            default:
                if (d331Var instanceof y231) {
                    ((iu30) obj2).invoke(new rcy0(((ncy0) obj).a, (String) null));
                }
                break;
        }
    }

    public /* synthetic */ mff(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
