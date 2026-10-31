package p;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ho60 {
    public static final /* synthetic */ mma0[] l = {new een0(ho60.class, "isPageFocused", "isPageFocused()Z", 0)};
    public final ij81 a;
    public final vz20 b;
    public final boolean c;
    public final w25 d;
    public boolean e;
    public boolean f;
    public k611 g;
    public go60 h;
    public faa0 j;
    public final LinkedHashSet i = new LinkedHashSet();
    public final ce0 k = new ce0(this);

    public ho60(ij81 ij81Var, vz20 vz20Var, dgb dgbVar, boolean z, w25 w25Var) {
        this.a = ij81Var;
        this.b = vz20Var;
        this.c = z;
        this.d = w25Var;
    }

    public final void a(RecyclerView recyclerView, List list, Set set, boolean z) {
        boolean zG = this.d.g();
        vz20 vz20Var = this.b;
        ij81 ij81Var = this.a;
        if (!zG) {
            Integer numK = ij81Var.k(recyclerView);
            if (numK != null) {
                int iIntValue = numK.intValue();
                if (this.f) {
                    iIntValue--;
                }
                String str = (String) o7h.t0(iIntValue, list);
                vz20Var.a(new x00(new k030(str != null ? str : "", 1)));
                return;
            }
            return;
        }
        Iterator it = ij81Var.q(recyclerView).iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.f) {
                iIntValue2--;
            }
            String str2 = (String) o7h.t0(iIntValue2, list);
            if (o7h.i0(set, str2)) {
                vz20Var.a(new x00(new k030(str2 != null ? str2 : "", 1)));
                return;
            }
        }
        if (z) {
            vz20Var.a(wdu0.c);
        }
    }
}
