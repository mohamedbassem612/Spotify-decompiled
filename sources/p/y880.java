package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y880 implements lhm {
    public final /* synthetic */ byte a;
    public final ynb0 b;
    public final Object c;

    public y880(b9o b9oVar, ynb0 ynb0Var) {
        this.a = (byte) 2;
        this.c = b9oVar;
        this.b = ynb0Var;
    }

    public static a980 b(String str, List list) {
        Object next;
        Object next2;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((l0l) next).j(), str));
        l0l l0lVar = (l0l) next;
        if (l0lVar != null) {
            List listH = l0lVar.h();
            if (listH.size() > 1) {
                String strJ = l0lVar.j();
                if (strJ.length() != 0) {
                    Iterator it2 = listH.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!((t880) next2).c);
                    t880 t880Var = (t880) next2;
                    boolean zJ = u890.j(t880Var != null ? t880Var.d : null, "user_selected");
                    d980 d980Var = d980.a;
                    if (zJ) {
                        String str2 = t880Var.a;
                        if (u890.j(str2, "CAST")) {
                            d980Var = d980.c;
                        } else if (u890.j(str2, "CONNECT")) {
                            d980Var = d980.b;
                        }
                    }
                    return new a980(strJ, d980Var);
                }
            }
        }
        return null;
    }

    public static ArrayList c(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((l0l) next).j(), str));
        l0l l0lVar = (l0l) next;
        if (l0lVar != null) {
            if (l0lVar.getCapabilities().isEmpty()) {
                l0lVar = null;
            }
            if (l0lVar != null) {
                List<vld> capabilities = l0lVar.getCapabilities();
                ArrayList arrayList = new ArrayList(q7h.U(capabilities, 10));
                for (vld vldVar : capabilities) {
                    Map map = vldVar.e;
                    o711 o711Var = vldVar.d;
                    map.getClass();
                    String strS = z0o1.s(upn1.m(), map);
                    if (strS == null) {
                        strS = vldVar.b;
                        strS.getClass();
                    }
                    String strJ = l0lVar.j();
                    o711Var.getClass();
                    j65 j65Var = o711Var.a;
                    w6b1 w6b1VarA = f7b1.a(blc0.g5);
                    if (w6b1VarA == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    String str2 = (String) w6b1VarA.c.get(0);
                    j65Var.getClass();
                    Uri uriBuild = Uri.parse(j65Var.a).buildUpon().appendQueryParameter(j65Var.b, str2).appendQueryParameter(j65Var.c, strJ).build();
                    String str3 = j65Var.d;
                    str3.getClass();
                    arrayList.add(new tfe1(strS, uriBuild, Uri.parse(str3)));
                }
                return arrayList;
            }
        }
        return null;
    }

    public final mr20 a(gpt gptVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = null;
        switch (b) {
            case 0:
                return gptVar.b == 1 ? new huz(obj2, (byte) 10) : new ht20(new x880(rqt0.u(new ipr((Object) yoi1.g(((g0l) ((ynb0) obj).get()).j()), (Object) this, (Object) gptVar, (byte) 24)), this, (byte) 0), new f530(this, gptVar, (lnm) null, (byte) 22));
            case 1:
                return new ht20(new a1b1(rqt0.u(new mpy0(yoi1.g(((g0l) this.b.get()).j()), this, gptVar, (byte) 19)), this, (byte) 11), new bfb1(this, gptVar, (lnm) null, (byte) 12));
            default:
                return new ht20(new qsc0(rqt0.u(yoi1.g((ObservableSource) ((b9o) obj).invoke())), this, gptVar, (byte) 6), new pk50(2, null, (byte) 9));
        }
    }

    public final uhm getType() {
        switch (this.a) {
            case 0:
                return uhm.e;
            case 1:
                return uhm.d;
            default:
                return uhm.b;
        }
    }

    public /* synthetic */ y880(ynb0 ynb0Var, ynb0 ynb0Var2, byte b) {
        this.a = b;
        this.b = ynb0Var;
        this.c = ynb0Var2;
    }
}
