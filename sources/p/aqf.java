package p;

import com.spotify.mobius.First;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class aqf extends tv30 implements vu30 {
    public static final aqf a = new aqf(2, upf.class, "initPaginated", "initPaginated(Lcom/spotify/campfire/chatdetailspage/elements/shares/ChatSharesPaginatedContainerElement$Props;Lcom/spotify/campfire/chatdetailspage/elements/shares/domain/ChatSharesModel;)Lcom/spotify/mobius/First;", 1);

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ypf ypfVar = (ypf) obj;
        wpf wpfVar = (wpf) obj2;
        c380 c380Var = ypfVar.d;
        String str = ypfVar.a;
        vzq0 vzq0Var = ypfVar.c;
        List list = wpfVar.d;
        List listL = list.isEmpty() ? upf.l(c380Var) : list;
        boolean zA = ypfVar.b.a();
        if (list.isEmpty()) {
            z = c380Var.size() < 20;
        } else {
            z = wpfVar.f;
        }
        return First.b(new wpf(str, 20, vzq0Var, listL, z, zA, 16));
    }
}
