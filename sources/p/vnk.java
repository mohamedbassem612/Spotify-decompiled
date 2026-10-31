package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vnk extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vnk(iu30 iu30Var, List list, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = list;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(o7h.q0(list));
                break;
            case 1:
                iu30Var.invoke(o7h.q0(list));
                break;
            case 2:
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UnmatchedItem) it.next()).getId());
                }
                iu30Var.invoke(arrayList);
                break;
            default:
                iu30Var.invoke(new n720(list));
                break;
        }
        return rih1Var;
    }
}
