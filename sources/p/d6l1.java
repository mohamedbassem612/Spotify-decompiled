package p;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d6l1 extends l570 {
    public final vx40 b;
    public final g23 c;
    public final a6l1 d;
    public final h98 e;
    public final qzh f;

    public d6l1(LinearLayout linearLayout, iac0 iac0Var, agx agxVar, yfx yfxVar, vx40 vx40Var, g23 g23Var) {
        super(linearLayout);
        this.b = vx40Var;
        this.c = g23Var;
        a6l1 a6l1Var = new a6l1(2131431663);
        a6l1Var.c = null;
        this.d = a6l1Var;
        h98 h98VarA = agxVar.a((l0i) null);
        this.e = h98VarA;
        b6s b6sVarA = yfxVar.a((l0i) null);
        this.f = b6sVarA;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        View view = b6sVarA.b;
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(2131165324);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        linearLayout.addView(view);
        pes0 pes0Var = (pes0) h98VarA.b;
        linearLayout.addView(pes0Var.a);
        RecyclerView recyclerView = pes0Var.a;
        int dimensionPixelSize2 = linearLayout.getResources().getDimensionPixelSize(2131165324);
        recyclerView.setClipToPadding(false);
        recyclerView.setPaddingRelative(dimensionPixelSize2, recyclerView.getPaddingTop(), dimensionPixelSize2, dimensionPixelSize2);
        a6l1Var.i(recyclerView);
        RecyclerView recyclerView2 = pes0Var.a;
        wus wusVar = new wus(recyclerView2, iac0Var, new b6l1(this, (byte) 0), new b6l1(this, (byte) 1), new b6l1(this, (byte) 2));
        recyclerView2.addOnAttachStateChangeListener(wusVar);
        iac0Var.getLifecycle().a(new ek2(wusVar, (byte) 24));
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        this.f.f(new kh51(y570Var.n().a.a));
        this.d.c = new c6l1(y570Var, this);
        List<y570> listS = y570Var.s();
        ArrayList arrayList = new ArrayList(q7h.U(listS, 10));
        for (y570 y570Var2 : listS) {
            k4m k4mVar = y570Var2.b().b("is19Plus", false) ? k4m.a : y570Var2.b().b("explicit", false) ? k4m.b : k4m.d;
            String str = y570Var2.n().a.a;
            String str2 = str == null ? "" : str;
            String str3 = y570Var2.n().a.b;
            String str4 = y570Var2.n().a.c;
            String strF = y570Var2.b().F("accessibilityText", "");
            ld70 ld70Var = y570Var2.k().a.c;
            String str5 = ld70Var != null ? ld70Var.a.c : null;
            h8l1 h8l1Var = new h8l1(str2, str3, str4, strF, str5 == null ? "" : str5, k4mVar, (Float) null, (String) null, 960);
            String strB = y570Var2.b().B("manifestId");
            arrayList.add(new t7l1(h8l1Var, new s7l1(strB != null ? new kjj1(strB) : null, "watch-feed-entrypoint-card-artist", y570Var2.b().b("isAnimated", false))));
        }
        h98 h98Var = this.e;
        h98Var.getClass();
        h0z h0zVar = (h0z) h98Var.c;
        pes0 pes0Var = (pes0) h98Var.b;
        if (pes0Var.b.getAdapter() == null) {
            pes0Var.b.setAdapter(h0zVar);
        }
        h0zVar.C(arrayList);
        h98Var.n(new c6l1(this, y570Var));
    }

    public final void b(int... iArr) {
    }
}
