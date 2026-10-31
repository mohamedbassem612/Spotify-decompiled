package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i3o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3o(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean zContains = true;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                return ((o3m0) obj).a(str);
            case 1:
                return ((o3m0) obj).n(str);
            case 2:
                return str;
            case 3:
                ((qv00) obj).a(str, uio.class, false);
                return rih1Var;
            case 4:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 1);
                b261.n(e261Var, str);
                return rih1Var;
            case 5:
                b261.n((e261) obj, str);
                return rih1Var;
            case 6:
                ((qv00) obj).a(str, mtl.class, false);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                b261.n(e261Var2, str);
                return rih1Var;
            case 9:
                e261 e261Var3 = (e261) obj;
                b261.x(e261Var3, 0);
                b261.n(e261Var3, str);
                return rih1Var;
            case 10:
                List list = ((wsc0) obj).e;
                int size = list.size();
                if (size != 0) {
                    if (size != 1) {
                        zContains = false;
                    } else {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((zuc0) it.next()).c);
                        }
                        zContains = arrayList.contains(str);
                    }
                }
                return Boolean.valueOf(zContains);
            case 11:
                List list3 = ((wsc0) obj).e;
                int size2 = list3.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        zContains = false;
                    } else {
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((zuc0) it2.next()).c);
                        }
                        zContains = arrayList2.contains(str);
                    }
                }
                return Boolean.valueOf(zContains);
            case 12:
                return new uov0(str, (String) obj, true);
            case 13:
                return new uov0(str, (String) obj, true);
            case 14:
                jyk0 jyk0Var = (jyk0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", str)), jyk0Var.a, jyk0Var.b.a, System.currentTimeMillis());
            case 15:
                ((qv00) obj).b(mig1.class, Collections.singletonList(str), false);
                return rih1Var;
            case 16:
                e261 e261Var4 = (e261) obj;
                b261.x(e261Var4, 0);
                b261.n(e261Var4, str);
                return rih1Var;
            case 17:
                b261.A((e261) obj, str);
                return rih1Var;
            case 18:
                b261.n((e261) obj, str);
                return rih1Var;
            case 19:
                b261.n((e261) obj, str);
                return rih1Var;
            case 20:
                b261.n((e261) obj, str);
                return rih1Var;
            case 21:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                b261.B((e261) obj, str);
                return rih1Var;
            case 24:
                b261.n((e261) obj, str);
                return rih1Var;
            case 25:
                b261.n((e261) obj, str);
                return rih1Var;
            case 26:
                e261 e261Var5 = (e261) obj;
                b261.n(e261Var5, str);
                b261.t(e261Var5, 0);
                return rih1Var;
            case 27:
                b261.g((e261) obj, str, (Function0) null);
                return rih1Var;
            case 28:
                b261.n((e261) obj, str);
                return rih1Var;
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((e0l0) obj).a, r6h1.c, System.currentTimeMillis());
        }
    }
}
