package p;

import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.browse.clientnative.mobius.Model;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z7c implements Function {
    public final /* synthetic */ a8c a;

    public z7c(a8c a8cVar) {
        this.a = a8cVar;
    }

    public final Object apply(Object obj) {
        BrowseState.Content content = (BrowseState.Content) obj;
        content.getClass();
        this.a.getClass();
        Model model = content.getModel();
        List<s7c> displayableSections = model.getDisplayableSections();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : displayableSections) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            String requestId = model.getRequestId();
            String pageId = model.getPageId();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-browse-evo";
            x6h1VarI.f = "2.1.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.e = requestId;
            x6h1VarI.d = pageId;
            y6h1 y6h1VarA = x6h1VarI.a();
            p7h.M(new String[]{"find", "browse/genres"});
            r6h1 r6h1Var = r6h1.c;
            new ArrayList().add(y6h1VarA);
            List<l9c> listD = ((s7c) obj2).d(i, content.getColumnCount());
            ArrayList arrayList2 = new ArrayList(q7h.U(listD, 10));
            for (l9c l9cVar : listD) {
                arrayList2.add(new h8k1(l9cVar, l9cVar.getId()));
            }
            r7h.W(arrayList2, arrayList);
            i = i2;
        }
        return new hj50(arrayList, (ioj0) null);
    }
}
