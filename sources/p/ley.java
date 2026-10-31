package p;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ley implements Connectable {
    public final Activity a;
    public final zwm1 b;
    public final boolean c;
    public final evm1 d;
    public final xgy e;
    public Set f;
    public Set g;

    public ley(Activity activity, zwm1 zwm1Var, boolean z, evm1 evm1Var, xgy xgyVar) {
        this.a = activity;
        this.b = zwm1Var;
        this.c = z;
        this.d = evm1Var;
        this.e = xgyVar;
        w7x w7xVar = w7x.a;
        this.f = w7xVar;
        this.g = w7xVar;
        ago1.o(activity, 2130969278, -1);
        new ads(e(2131232312), e(2131232310));
        activity.getColor(2131104800);
        new ads(e(2131232310), e(2131232312));
    }

    public static n6r c(ttm1 ttm1Var) {
        aey aeyVar = ttm1Var.e;
        ha00 ha00Var = null;
        if (aeyVar != aey.d) {
            return null;
        }
        if (u890.j(ttm1.i.get(aeyVar), ha00.class)) {
            nb10 nb10Var = ttm1Var.g;
            if (nb10Var == null) {
                bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.EventExtraInfo");
                return null;
            }
            ha00Var = (ha00) nb10Var;
        }
        return new n6r(ha00Var != null ? ha00Var.a : 0L);
    }

    public final Connection L(Consumer consumer) {
        return new rp(this, (byte) 24);
    }

    public final boolean a() {
        return this.f.contains("artists") || this.f.contains("downloaded_artists");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    public final Set b(ttm1 ttm1Var, boolean z) {
        o1v o1vVar;
        boolean z2 = ttm1Var.c;
        nb10 nb10Var = ttm1Var.g;
        aey aeyVar = ttm1Var.e;
        c1a c1aVar = c1a.a;
        if (z) {
            return z2 ? Collections.singleton(c1aVar) : w7x.a;
        }
        xj61 xj61Var = new xj61();
        int iC = l1d.C(ttm1Var.h);
        if (iC == 0) {
            o1vVar = o1v.a;
        } else if (iC == 1) {
            o1vVar = o1v.b;
        } else if (iC == 2) {
            o1vVar = o1v.c;
        } else if (iC == 3) {
            o1vVar = o1v.d;
        } else {
            if (iC != 4) {
                eg.o();
                return null;
            }
            o1vVar = o1v.e;
        }
        xj61Var.add(new x0a(o1vVar));
        aey aeyVar2 = aey.t;
        if (aeyVar == aeyVar2 && this.g.contains(ttm1Var.a)) {
            xj61Var.add(f1a.a);
        }
        if (z2) {
            xj61Var.add(c1aVar);
        }
        if (aeyVar == aeyVar2) {
            xlu0 xlu0Var = nb10Var instanceof xlu0 ? (xlu0) nb10Var : null;
            if (xlu0Var != null && xlu0Var.f && this.c) {
                xj61Var.add(a1a.a);
            }
            if ((xlu0Var != null ? xlu0Var.g : 0) == 3) {
                xj61Var.add(y0a.a);
            } else {
                if ((xlu0Var != null ? xlu0Var.g : 0) == 4) {
                    xj61Var.add(y0a.a);
                }
            }
        }
        if (aeyVar == aey.X) {
            xj61Var.add(d1a.a);
        }
        aey aeyVar3 = aey.a;
        z0a z0aVar = z0a.a;
        if (aeyVar == aeyVar3) {
            tlb tlbVar = nb10Var instanceof tlb ? (tlb) nb10Var : null;
            if ((tlbVar != null ? tlbVar.c : 0) == 2) {
                xj61Var.add(z0aVar);
            }
        } else if (aeyVar == aey.c) {
            j93 j93Var = nb10Var instanceof j93 ? (j93) nb10Var : null;
            if (j93Var != null && j93Var.d) {
                xj61Var.add(z0aVar);
            }
            if (j93Var != null && j93Var.c && this.d.a()) {
                xj61Var.add(b1a.a);
            }
        }
        if (aeyVar == aey.Z) {
            xj61Var.add(e1a.a);
        }
        return cwl1.j(xj61Var);
    }

    public final String d(ttm1 ttm1Var, boolean z) {
        String str;
        String str2 = ttm1Var.b;
        if (z) {
            return "";
        }
        nb10 nb10Var = ttm1Var.g;
        xlu0 xlu0Var = nb10Var instanceof xlu0 ? (xlu0) nb10Var : null;
        if (xlu0Var == null || (str = xlu0Var.e) == null || str.length() == 0) {
            return str2;
        }
        String string = this.b.b.getString(2131956884, str, str2);
        string.getClass();
        return string;
    }

    public final Drawable e(int i) {
        Drawable drawable = this.a.getDrawable(i);
        drawable.getClass();
        drawable.setTint(-1);
        return drawable;
    }
}
