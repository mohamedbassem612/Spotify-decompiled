package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import spotify.your_library.proto.SetFilterOrder$SetFilterOrderRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class euz {
    public final f6s a;
    public final vwm1 b;
    public final bpb1 c = gio1.b(z6x.a);

    public euz(f6s f6sVar, vwm1 vwm1Var) {
        this.a = f6sVar;
        this.b = vwm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, onm onmVar) {
        duz duzVar;
        if (onmVar instanceof duz) {
            duzVar = (duz) onmVar;
            int i = duzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                duzVar.c = i - Integer.MIN_VALUE;
            } else {
                duzVar = new duz(this, onmVar);
            }
        } else {
            duzVar = new duz(this, onmVar);
        }
        Object obj = duzVar.a;
        int i2 = duzVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                vwm1 vwm1Var = this.b;
                ok61 ok61VarO = SetFilterOrder$SetFilterOrderRequest.o();
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ee21) it.next()).c);
                }
                ok61VarO.n(arrayList);
                SetFilterOrder$SetFilterOrderRequest setFilterOrder$SetFilterOrderRequest = (SetFilterOrder$SetFilterOrderRequest) ok61VarO.build();
                duzVar.c = 1;
                Object objC = vwm1Var.c(setFilterOrder$SetFilterOrderRequest, duzVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }
}
