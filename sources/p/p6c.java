package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p6c extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BrowseState.Content b;
    public final /* synthetic */ p1d0 c;
    public final /* synthetic */ xpw d;
    public final /* synthetic */ g9c e;
    public final /* synthetic */ iac0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6c(int i, BrowseState.Content content, p1d0 p1d0Var, xpw xpwVar, g9c g9cVar, iac0 iac0Var, int i2) {
        super(1);
        this.a = i;
        this.b = content;
        this.c = p1d0Var;
        this.d = xpwVar;
        this.e = g9cVar;
        this.f = iac0Var;
        this.g = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, java.lang.Object, p.y6c] */
    public final Object invoke(Object obj) {
        ?? y6cVar = new y6c((Context) obj);
        y6cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        y6cVar.getRecyclerView().setPadding(0, 0, 0, this.a);
        p1d0 p1d0Var = this.c;
        y6cVar.g1 = p1d0Var;
        RecyclerView recyclerView = y6cVar.c1;
        recyclerView.getContext();
        p1d0Var.a(recyclerView, this.f, new LinearLayoutManager(1), true);
        tka0 tka0Var = dtw.C;
        Context context = y6cVar.getContext();
        qtw qtwVarA = f6o1.A(this.d, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        BrowseState.Content content = this.b;
        y6cVar.e1.addView(mhc.b(context, y6cVar.e1, qtwVarA, t6c.a(content.getProfile(), y6cVar.getContext().getString(2131953008)), (ipb1) null, 112).w);
        y6cVar.f1.setContent(new j2i(1069342649, new cka(this.e, (byte) 11), true));
        rwq0.s(recyclerView, new w6c(y6cVar));
        op80 h3h1Var = new h3h1(new v6c(content));
        op80 jp80Var = new jp80(new x6c(y6cVar));
        op80 wchVar = q6x.b;
        if (h3h1Var.equals(wchVar) && jp80Var.equals(wchVar)) {
            h3h1Var = wchVar;
        } else if (h3h1Var.equals(wchVar)) {
            h3h1Var = jp80Var;
        } else if (!jp80Var.equals(wchVar)) {
            wchVar = new wch(h3h1Var, jp80Var);
            h3h1Var = wchVar;
        }
        xhk1.c(recyclerView, h3h1Var);
        recyclerView.j(new vma1(recyclerView.getResources().getDimensionPixelSize(2131165386), recyclerView.getResources().getDimensionPixelSize(2131165387), this.g));
        return y6cVar;
    }
}
