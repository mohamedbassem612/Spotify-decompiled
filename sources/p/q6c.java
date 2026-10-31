package p;

import com.spotify.browse.clientnative.mobius.BrowseState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q6c extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rnc0 b;
    public final /* synthetic */ BrowseState.Content c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6c(int i, rnc0 rnc0Var, BrowseState.Content content) {
        super(1);
        this.a = i;
        this.b = rnc0Var;
        this.c = content;
    }

    public final Object invoke(Object obj) {
        y6c y6cVar = (y6c) obj;
        y6cVar.getRecyclerView().setPadding(0, 0, 0, this.a);
        rnc0 rnc0Var = this.b;
        if (rnc0Var != null) {
            String dataSource = BrowseState.Loading.INSTANCE.getDataSource(this.c);
            List list = rnc0Var.b;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h8k1) it.next()).b);
            }
            boolean zEquals = arrayList.equals(y6cVar.i1);
            boolean zEquals2 = dataSource.equals(y6cVar.j1);
            if (!zEquals || !zEquals2) {
                y6cVar.b1.findViewById(2131427779).setTag(dataSource);
                if (!zEquals) {
                    p1d0 p1d0Var = y6cVar.g1;
                    if (p1d0Var == null) {
                        u890.C("listRenderer");
                        throw null;
                    }
                    p1d0Var.b(rnc0Var);
                    y6cVar.i1 = arrayList;
                }
                y6cVar.j1 = dataSource;
            }
        }
        return rih1.a;
    }
}
