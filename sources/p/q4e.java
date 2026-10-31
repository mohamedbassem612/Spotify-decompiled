package p;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q4e extends z511 {
    public final /* synthetic */ byte d;
    public List e;
    public Object f;
    public Object g;
    public Object h;

    public q4e(Activity activity, y5e y5eVar, oto0 oto0Var) {
        this.d = (byte) 0;
        this.f = activity;
        this.g = y5eVar;
        this.h = oto0Var;
        this.e = z6x.a;
    }

    public final int e() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.e.size();
    }

    public final void n(int i, w611 w611Var) {
        kdy0 kdy0Var;
        switch (this.d) {
            case 0:
                ((z8e) this.e.get(i)).a((Activity) this.f, ((ox40) w611Var).U0);
                break;
            case 1:
                nui0 nui0Var = (nui0) w611Var;
                gui0 gui0Var = (gui0) this.e.get(i);
                iu30 iu30Var = (iu30) this.h;
                nui0Var.V0 = gui0Var;
                f2z f2zVar = nui0Var.U0;
                f2zVar.d.setText(gui0Var.b);
                TextView textView = f2zVar.c;
                String str = gui0Var.e;
                textView.setText(str == null ? "" : str);
                textView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
                f2zVar.b.h(new k07(new g07(gui0Var.d), false));
                ((w611) nui0Var).a.setOnClickListener(new nfs(iu30Var, i, (byte) 1));
                break;
            case 2:
                ofs ofsVar = (ofs) w611Var;
                vgu0 vgu0Var = (vgu0) this.e.get(i);
                iu30 iu30Var2 = (iu30) this.h;
                ArtworkView artworkView = (ArtworkView) ofsVar.U0.c;
                artworkView.h(new y07(new g07(vgu0Var.b), false));
                artworkView.setContentDescription(vgu0Var.a);
                ((w611) ofsVar).a.setOnClickListener(new nfs(iu30Var2, i, (byte) 0));
                break;
            default:
                String str2 = (String) this.e.get(i);
                TextView textView2 = ((hdy0) w611Var).U0;
                textView2.setText(str2);
                textView2.setOnClickListener(new rn(this, str2, i, (byte) 4));
                ptb ptbVar = (ptb) this.h;
                if (ptbVar != null && (kdy0Var = (kdy0) this.g) != null) {
                    kdy0Var.q(textView2);
                    if (((n7h1) kdy0Var.d) != null) {
                        ien0 ien0Var = xhk1.a;
                        op80 op80VarA = xhk1.a(textView2);
                        vik1 vik1Var = new vik1();
                        ((LinkedHashMap) kdy0Var.b).put(textView2, new jdy0(vik1Var, i));
                        vik1Var.e(textView2, ptbVar, qon1.x(op80VarA), new j3y0(kdy0Var, textView2, (byte) 1), (r1t) null);
                        break;
                    }
                }
                break;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        int i2 = 2131429612;
        switch (this.d) {
            case 0:
                return new ox40(new a9e((Activity) this.f, viewGroup));
            case 1:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from((Context) this.f).inflate(2131625220, viewGroup, false);
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131429612);
                if (artworkViewT != null) {
                    i2 = 2131431115;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                    if (textView != null) {
                        i2 = 2131431356;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                        if (textView2 != null) {
                            f2z f2zVar = new f2z(constraintLayout, constraintLayout, artworkViewT, textView, textView2);
                            artworkViewT.setViewContext((f47) this.g);
                            return new nui0(f2zVar);
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
                return null;
            case 2:
                int i3 = ofs.V0;
                Context context = (Context) this.f;
                gw70 gw70Var = (gw70) this.g;
                View viewInflate = LayoutInflater.from(context).inflate(2131625406, (ViewGroup) null, false);
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                ArtworkView artworkViewT2 = m5n1.t(viewInflate, 2131429612);
                if (artworkViewT2 == null) {
                    bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131429612)));
                    return null;
                }
                sjq0 sjq0Var = new sjq0(frameLayout, artworkViewT2, (byte) 27);
                artworkViewT2.setViewContext(new f47(gw70Var));
                return new ofs(sjq0Var);
            default:
                return new hdy0((TextView) eqq.l(viewGroup, 2131625468, viewGroup, false));
        }
    }

    public void r(RecyclerView recyclerView) {
        switch (this.d) {
            case 3:
                kdy0 kdy0Var = (kdy0) this.g;
                if (kdy0Var != null) {
                    for (View view : new ArrayList(((LinkedHashMap) kdy0Var.b).keySet())) {
                        view.getClass();
                        kdy0Var.q(view);
                    }
                }
                break;
        }
    }

    public void v(w611 w611Var) {
        switch (this.d) {
            case 3:
                hdy0 hdy0Var = (hdy0) w611Var;
                kdy0 kdy0Var = (kdy0) this.g;
                if (kdy0Var != null) {
                    kdy0Var.q(hdy0Var.U0);
                }
                break;
        }
    }

    public q4e(Context context, f47 f47Var) {
        this.d = (byte) 1;
        this.f = context;
        this.g = f47Var;
        this.e = z6x.a;
    }

    public q4e(Context context, gw70 gw70Var) {
        this.d = (byte) 2;
        this.f = context;
        this.g = gw70Var;
        this.e = z6x.a;
    }
}
