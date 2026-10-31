package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.musicvideos.uiusecases.relatedvideocarousel.RelatedVideoCarouselView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kjs implements qzh {
    public final /* synthetic */ byte a = 1;
    public iu30 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public kjs(vn11 vn11Var, Context context, int i, lzn0 lzn0Var, Function0 function0) {
        lkb1 lkb1Var = new lkb1((byte) 1);
        this.c = vn11Var;
        this.d = lzn0Var;
        this.e = function0;
        this.b = c6s.d1;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625580, (ViewGroup) null);
        this.f = constraintLayoutInflate;
        RecyclerView recyclerView = (RelatedVideoCarouselView) constraintLayoutInflate.findViewById(2131430628);
        this.g = (TextView) constraintLayoutInflate.findViewById(2131430895);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167226);
        jjs jjsVar = new jjs(dimensionPixelSize, (byte) 0);
        this.h = jjsVar;
        constraintLayoutInflate.getRootView().setBackground(context.getDrawable(i));
        constraintLayoutInflate.getRootView().setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), dimensionPixelSize / 2);
        ijs ijsVar = new ijs(this, (byte) 0);
        k9s k9sVar = new k9s(this, (byte) 1);
        ijs ijsVar2 = new ijs(this, (byte) 1);
        vn11Var.T0 = ijsVar;
        vn11Var.R0 = k9sVar;
        vn11Var.S0 = ijsVar2;
        recyclerView.setAdapter(vn11Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        lkb1Var.b(recyclerView);
        recyclerView.j(jjsVar);
    }

    public void a(sqe sqeVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-404292498);
        int i2 = (x340Var.i(sqeVar) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            pl70.a(i3o1.n(u890.j(sqeVar, nm91.d) ? ((Number) ((idd1) this.g).getValue()).intValue() : ((Number) ((idd1) this.f).getValue()).intValue(), x340Var, 0), (qim0) null, upo1.C(!(sqeVar instanceof lm91), x340Var), x340Var, 56, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ypg1(this, sqeVar, i);
        }
    }

    public void b(sqe sqeVar, jm91 jm91Var, b0k b0kVar, int i) {
        int i2;
        String string;
        Context context = (Context) this.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2103544568);
        int i3 = i | (x340Var.i(sqeVar) ? 4 : 2) | (x340Var.i(jm91Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            ven0 ven0VarJ = f4p1.j(new nev0(((jtl1) this.d).b, (byte) 11), Boolean.FALSE, (iac0) null, x340Var, 48, 14);
            nm91 nm91Var = nm91.d;
            String string2 = sqeVar.equals(nm91Var) ? context.getString(2131963239) : context.getString(2131963236);
            string2.getClass();
            boolean z = sqeVar instanceof lm91;
            long jC = upo1.C(!z, x340Var);
            if (z) {
                i2 = 2131963236;
            } else if (sqeVar instanceof mm91) {
                i2 = 2131951713;
            } else {
                if (!(sqeVar instanceof nm91)) {
                    eg.o();
                    return;
                }
                i2 = 2131960792;
            }
            String strO0 = cwl1.o0(x340Var, i2);
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new j4f1(this, (byte) 21);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            boolean z2 = !(jm91Var instanceof gm91);
            boolean zBooleanValue = ((Boolean) ven0VarJ.getValue()).booleanValue();
            boolean z3 = jm91Var instanceof hm91;
            if (sqeVar.equals(nm91Var)) {
                string = context.getString(2131963239);
            } else {
                string = z ? context.getString(2131963237) : context.getString(2131963236);
            }
            string.getClass();
            upo1.l(string2, jC, gbxVar, z2, zBooleanValue, (qim0) null, z3, string, apo.r(-153290657, new ypg1(this, sqeVar), x340Var), x340Var, 805306368, 96);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1(this, sqeVar, jm91Var, i, (byte) 1);
        }
    }

    public final void f(Object obj) {
        w611 w611VarN;
        w611 w611VarN2;
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                tn11 tn11Var = (tn11) obj;
                wnp0 wnp0Var = wnp0.b;
                vn11 vn11Var = (vn11) this.c;
                if (tn11Var instanceof rn11) {
                    rn11 rn11Var = (rn11) tn11Var;
                    String str = rn11Var.d;
                    ArrayList arrayList = rn11Var.b;
                    if (!arrayList.isEmpty()) {
                        ((jjs) this.h).c = arrayList.size() - 1;
                        vn11Var.C(arrayList);
                        boolean z = ((Boolean) ((Function0) obj2).invoke()).booleanValue() && str.length() > 0;
                        this.b.invoke(new kn11(z));
                        TextView textView = (TextView) this.g;
                        if (z) {
                            textView.setVisibility(0);
                            textView.setTextColor(textView.getContext().getColor(2131101519));
                            textView.setOnClickListener(new cvr(this, str, (byte) 13));
                        }
                        String str2 = rn11Var.a;
                        TextView textView2 = (TextView) ((ConstraintLayout) this.f).findViewById(2131431361);
                        if (str2.length() > 0) {
                            textView2.setText(str2);
                            textView2.setVisibility(0);
                        } else {
                            textView2.setVisibility(8);
                        }
                    }
                    break;
                } else if (tn11Var.equals(sn11.c)) {
                    vn11Var.D(vn11Var.O0);
                    break;
                } else if (tn11Var.equals(sn11.b)) {
                    int size = ((emc0) vn11Var).d.f.size();
                    for (int i = 0; i < size; i++) {
                        RecyclerView recyclerView = vn11Var.P0;
                        if (recyclerView != null && (w611VarN2 = recyclerView.N(i)) != null) {
                            ((un11) w611VarN2).U0.f(wnp0Var);
                        }
                    }
                    this.b.invoke(nn11.a);
                    break;
                } else if (!tn11Var.equals(sn11.a)) {
                    eg.o();
                    break;
                } else {
                    int i2 = vn11Var.O0;
                    RecyclerView recyclerView2 = vn11Var.P0;
                    if (recyclerView2 != null && (w611VarN = recyclerView2.N(i2)) != null) {
                        ((un11) w611VarN).U0.f(wnp0Var);
                        break;
                    }
                }
                break;
            default:
                ((hrr0) obj2).setValue((em91) obj);
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (ConstraintLayout) this.f;
            default:
                return (ComposeView) this.h;
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                this.b = iu30Var;
                break;
            default:
                this.b = iu30Var;
                break;
        }
    }

    public kjs(Context context, jtl1 jtl1Var) {
        this.c = context;
        this.d = jtl1Var;
        lm91 lm91Var = new lm91(false);
        rp91 rp91Var = rp91.a;
        this.e = v8r.q(new em91("", "", (sqe) lm91Var, false, new sp91(rp91Var, rp91Var, rp91.b), 40));
        this.b = ppg1.g;
        this.f = new idd1(q9f1.X0);
        this.g = new idd1(q9f1.Y0);
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(-1323186812, new aqg1(this, (byte) 1), true));
        this.h = composeView;
    }
}
