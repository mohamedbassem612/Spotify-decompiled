package p;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lc70 extends n470 {
    public ixg g;
    public String h;
    public final gw70 i;
    public final kcg t;

    public lc70(ViewGroup viewGroup, l670 l670Var, gw70 gw70Var, kcg kcgVar, boolean z) {
        super(viewGroup, l670Var, z);
        this.i = gw70Var;
        this.t = kcgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p.n470
    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        String str;
        super.a(y570Var, l670Var, yfuVar);
        ld70 ld70Var = ((dd70) y570Var.k()).a.d;
        if (ld70Var != null) {
            str = ld70Var.a.c;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
        } else {
            str = null;
        }
        if (Objects.equals(this.h, str)) {
            return;
        }
        ixg ixgVar = this.g;
        if (ixgVar != null) {
            ixgVar.c();
            this.g = null;
        }
        final byte b = 0;
        if (str != null) {
            final ixg ixgVarF = this.i.f(str);
            ixgVarF.s(this.t);
            ixgVarF.g = false;
            this.g = ixgVarF;
            final byte b2 = 1;
            ixgVarF.g(new iu30(this) { // from class: p.kc70
                public final /* synthetic */ lc70 b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj) {
                    byte b3 = b;
                    rih1 rih1Var = rih1.a;
                    ixg ixgVar2 = ixgVarF;
                    lc70 lc70Var = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            if (lc70Var.g == ixgVar2) {
                                RecyclerView recyclerView = ((l570) lc70Var).a;
                                GradientDrawable gradientDrawableG = rno1.g(recyclerView.getContext(), num.intValue());
                                WeakHashMap weakHashMap = b8k1.a;
                                recyclerView.setBackground(gradientDrawableG);
                                lc70Var.g = null;
                            }
                            break;
                        default:
                            if (lc70Var.g == ixgVar2) {
                                View view = ((l570) lc70Var).a;
                                WeakHashMap weakHashMap2 = b8k1.a;
                                view.setBackground(null);
                                lc70Var.g = null;
                            }
                            break;
                    }
                    return rih1Var;
                }
            }, new iu30(this) { // from class: p.kc70
                public final /* synthetic */ lc70 b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    rih1 rih1Var = rih1.a;
                    ixg ixgVar2 = ixgVarF;
                    lc70 lc70Var = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            if (lc70Var.g == ixgVar2) {
                                RecyclerView recyclerView = ((l570) lc70Var).a;
                                GradientDrawable gradientDrawableG = rno1.g(recyclerView.getContext(), num.intValue());
                                WeakHashMap weakHashMap = b8k1.a;
                                recyclerView.setBackground(gradientDrawableG);
                                lc70Var.g = null;
                            }
                            break;
                        default:
                            if (lc70Var.g == ixgVar2) {
                                View view = ((l570) lc70Var).a;
                                WeakHashMap weakHashMap2 = b8k1.a;
                                view.setBackground(null);
                                lc70Var.g = null;
                            }
                            break;
                    }
                    return rih1Var;
                }
            });
        } else {
            ((l570) this).a.setBackgroundResource(0);
        }
        this.h = str;
    }
}
