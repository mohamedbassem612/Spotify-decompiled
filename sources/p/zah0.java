package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zah0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ mah0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zah0(iu30 iu30Var, mah0 mah0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = mah0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mah0 mah0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayListI = mah0Var.i(mah0Var.b());
                ArrayList arrayList = new ArrayList(q7h.U(arrayListI, 10));
                Iterator it = arrayListI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UnmatchedItem) it.next()).getId());
                }
                iu30Var.invoke(new s9h0(arrayList));
                break;
            default:
                ArrayList arrayListE = mah0Var.e(mah0Var.b());
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayListE, 10));
                Iterator it2 = arrayListE.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((UnmatchedItem) it2.next()).getId());
                }
                iu30Var.invoke(new w9h0(arrayList2));
                break;
        }
        return rih1Var;
    }
}
