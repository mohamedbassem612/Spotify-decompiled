package p;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ymu0 {
    public final Context a;
    public final i8h1 b;
    public final m980 c;
    public final kt91 d;
    public final wmu0 e;
    public final tbn f;

    public ymu0(Context context, i8h1 i8h1Var, m980 m980Var, kt91 kt91Var, wmu0 wmu0Var, tbn tbnVar) {
        this.a = context;
        this.b = i8h1Var;
        this.c = m980Var;
        this.d = kt91Var;
        this.e = wmu0Var;
        this.f = tbnVar;
    }

    public final boolean a(o3w o3wVar, String str, x7i1 x7i1Var, boolean z) {
        int i;
        String quantityString;
        Integer numValueOf;
        int i2 = o3wVar.a;
        boolean zA = this.e.a(x7i1Var);
        if (!zA && !z) {
            return false;
        }
        int i3 = o3wVar.c;
        int i4 = o3wVar.b;
        boolean z2 = i2 > 0;
        boolean z3 = i4 > 0;
        boolean z4 = i3 > 0;
        List listM = p7h.M(new Boolean[]{Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)});
        View.OnClickListener kw6Var = null;
        if ((listM instanceof Collection) && listM.isEmpty()) {
            i = 0;
        } else {
            Iterator it = listM.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        Context context = this.a;
        if (i > 1) {
            quantityString = context.getString(2131960023);
        } else if (z2) {
            quantityString = context.getResources().getQuantityString(2131820816, i2, Integer.valueOf(i2));
        } else if (z3) {
            quantityString = context.getResources().getQuantityString(2131820817, i4, Integer.valueOf(i4));
        } else {
            quantityString = z4 ? context.getResources().getQuantityString(2131820818, i3, Integer.valueOf(i3)) : context.getString(2131960023);
        }
        String str2 = quantityString;
        if (zA) {
            tdl0 tdl0Var = new tdl0((byte) 18);
            int i5 = this.c.b ? 2131960047 : 2131960046;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            numValueOf = Integer.valueOf(i5);
            kw6Var = new kw6(this, tdl0Var, str, (byte) 14);
        } else {
            numValueOf = null;
        }
        this.d.k(new er91((fs91) null, str2, (Integer) null, (String) null, numValueOf, kw6Var, (cvr) null, (xq91) null, false));
        return true;
    }
}
