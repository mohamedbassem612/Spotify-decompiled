package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lud implements Connectable {
    public final /* synthetic */ byte a;
    public final Object b;

    public lud(oud oudVar, q8n q8nVar, vu30 vu30Var) {
        this.a = (byte) 0;
        this.b = new qn(new ztb(oudVar, vu30Var, (byte) 16), q8nVar, (byte) 7);
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((qn) obj).L(consumer);
            case 1:
                return ((Connectable) obj).L(new xu2(consumer, (byte) 12));
            default:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Connectable) it.next()).L(consumer));
                }
                return dug.j(new jb60(arrayList2, (byte) 1), new k011(arrayList2, (byte) 4));
        }
    }

    public /* synthetic */ lud(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
