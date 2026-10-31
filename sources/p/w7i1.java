package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w7i1 implements EventSource {
    public final r630 a;
    public final add b;
    public final ctf c;
    public final ArrayList d;
    public final q8n e;

    public w7i1(r630 r630Var, add addVar, ctf ctfVar, ArrayList arrayList, q8n q8nVar) {
        this.a = r630Var;
        this.b = addVar;
        this.c = ctfVar;
        this.d = arrayList;
        this.e = q8nVar;
    }

    public final Disposable a(final Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        atf atfVar = atf.a;
        ctf ctfVar = this.c;
        boolean zJ = u890.j(ctfVar, atfVar);
        final byte b = 0;
        add addVar = this.b;
        ArrayList arrayList = this.d;
        ezc ezcVarD = r6x.a;
        if (zJ) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                w4i1 w4i1Var = (w4i1) obj;
                if (!addVar.a() || !sqe.v(w4i1Var)) {
                    arrayList2.add(obj);
                }
            }
            int size = arrayList2.size();
            if (size != 0) {
                if (size != 1) {
                    Logger.d("Campfire - UserBlockedEventSource", new Object[]{"DM chat with != 1 other contributor"});
                } else {
                    ezcVarD = h4p1.f(new vxg1((w4i1) o7h.q0(arrayList2), this, (lnm) null, (byte) 9));
                }
            }
        } else {
            if (!(ctfVar instanceof btf)) {
                eg.o();
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                w4i1 w4i1Var2 = (w4i1) obj2;
                if (!addVar.a() || !sqe.v(w4i1Var2)) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(h4p1.f(new vxg1((w4i1) it.next(), this, (lnm) null, (byte) 9)));
                }
                mr20[] mr20VarArr = (mr20[]) arrayList4.toArray(new mr20[0]);
                ezcVarD = hu20.d((mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length));
            }
        }
        mr20[] mr20VarArr2 = {ezcVarD};
        companion.getClass();
        return new b(this.e, mr20VarArr2).a(new Consumer() { // from class: p.v7i1
            public final void accept(Object obj3) {
                byte b2 = b;
                Consumer consumer2 = consumer;
                switch (b2) {
                    case 0:
                        consumer2.accept((q3f) obj3);
                        break;
                    default:
                        consumer2.accept((i901) obj3);
                        break;
                }
            }
        });
    }
}
