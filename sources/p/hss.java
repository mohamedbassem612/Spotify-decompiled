package p;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hss implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ iss b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ hss(iss issVar, ViewGroup viewGroup, Object obj) {
        this.b = issVar;
        this.d = viewGroup;
        this.c = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ViewGroup viewGroup = this.d;
        Object obj = this.c;
        iss issVar = this.b;
        switch (b) {
            case 0:
                issVar.f.e(viewGroup, obj);
                break;
            default:
                ArrayList arrayList = issVar.c;
                ej30 ej30Var = issVar.f;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((foa1) ((jss) it.next()).b).g) {
                            th30.P(2);
                            vhd vhdVar = new vhd((byte) 0);
                            ej30Var.v(((foa1) ((jss) arrayList.get(0)).b).c, obj, vhdVar, new fss((Object) issVar, (byte) 1));
                            vhdVar.b();
                            break;
                        }
                    }
                    th30.P(2);
                    Object obj2 = issVar.f74p;
                    obj2.getClass();
                    ej30Var.d(obj2, new e0i((Object) issVar, (Object) viewGroup, (byte) 13));
                } else {
                    th30.P(2);
                    Object obj3 = issVar.f74p;
                    obj3.getClass();
                    ej30Var.d(obj3, new e0i((Object) issVar, (Object) viewGroup, (byte) 13));
                }
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ hss(iss issVar, Object obj, ViewGroup viewGroup) {
        this.b = issVar;
        this.c = obj;
        this.d = viewGroup;
    }
}
