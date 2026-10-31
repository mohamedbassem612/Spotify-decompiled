package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class n470 extends l570 {
    public final k470 b;
    public final s470 c;
    public final l470 d;
    public y570 e;
    public yfu f;

    public n470(ViewGroup viewGroup, l670 l670Var, boolean z) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        recyclerView.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentLayoutParams(viewGroup.getContext(), viewGroup));
        super(recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        Context context = recyclerView.getContext();
        k470 k470Var = new k470(new l7m0(new nay(l670Var.d, (byte) 29), new hx40(context, z)), context.getResources().getInteger(2131492896));
        this.b = k470Var;
        recyclerView.setLayoutManager(k470Var);
        s470 s470Var = new s470(l670Var, null);
        this.c = s470Var;
        recyclerView.setHasFixedSize(false);
        if (viewGroup instanceof RecyclerView) {
            RecyclerView recyclerView2 = (RecyclerView) viewGroup;
            if (recyclerView2.getAdapter() instanceof s470) {
                recyclerView.setRecycledViewPool(recyclerView2.getRecycledViewPool());
            }
        }
        recyclerView.setLayoutFrozen(false);
        recyclerView.v0(s470Var, true, false);
        recyclerView.j0(true);
        recyclerView.requestLayout();
        this.d = new l470(this);
        recyclerView.addOnAttachStateChangeListener(new y22(this, (byte) 14));
    }

    public void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        this.e = y570Var;
        this.f = yfuVar;
        List listS = y570Var.s();
        s470 s470Var = this.c;
        s470Var.B(listS);
        t470 t470Var = s470Var.f;
        m470 m470Var = (m470) yfuVar.e(y570Var);
        k470 k470Var = this.b;
        if (m470Var != null) {
            t470Var.t(m470Var.a, (WeakHashMap) ((yfu) t470Var).b);
            k470Var.w0(m470Var.b);
        } else {
            t470Var.t(null, (WeakHashMap) ((yfu) t470Var).b);
            k470Var.w1(0, 0);
        }
        s470Var.h();
    }

    public final void b(int... iArr) {
        bs51.t(((l570) this).a, iArr);
    }
}
