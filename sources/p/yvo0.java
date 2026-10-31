package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yvo0 implements l5r0 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public Object d;

    public yvo0(utf1 utf1Var, tm30 tm30Var, Observable observable) {
        this.b = utf1Var;
        this.c = tm30Var;
        this.d = observable;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                View viewInflate = layoutInflater.inflate(2131625317, viewGroup, false);
                int i = 2131427791;
                Button button = (Button) m5n1.t(viewInflate, 2131427791);
                if (button != null) {
                    i = 2131430165;
                    ImageView imageView = (ImageView) m5n1.t(viewInflate, 2131430165);
                    if (imageView != null) {
                        jvm0 jvm0Var = new jvm0((LinearLayout) viewInflate, button, imageView);
                        button.setOnClickListener(new hid0(this, (byte) 8));
                        imageView.setImageDrawable(new g4b1(context, j4b1.x4, context.getResources().getDimension(2131166735)));
                        this.d = jvm0Var;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            case 1:
                iir iirVar = (iir) obj;
                ((i8h1) iirVar.b).f(((wqk0) iirVar.c).e(), (Set) null);
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624525, (ViewGroup) null, false);
                int i2 = 2131428292;
                EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428292);
                if (encoreButtonT != null) {
                    i2 = 2131431115;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                    if (textView != null) {
                        i2 = 2131431356;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            textView2.setText(constraintLayout.getContext().getString(2131962424));
                            textView.setText(constraintLayout.getContext().getString(2131962423));
                            encoreButtonT.setText(constraintLayout.getContext().getString(2131962422));
                            encoreButtonT.setOnClickListener(new sis(new d781(this, (byte) 1), (byte) 18));
                            this.d = constraintLayout;
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
                break;
            default:
                xap1.y(((tm30) obj).b.e());
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                jvm0 jvm0Var = (jvm0) this.d;
                if (jvm0Var != null) {
                    return jvm0Var.a;
                }
                return null;
            case 1:
                return (ConstraintLayout) this.d;
            default:
                return ((tm30) this.c).b.e();
        }
    }

    public final void start() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                utf1 utf1Var = (utf1) this.b;
                Observable observable = (Observable) this.d;
                vku vkuVar = utf1Var.n;
                Maybe maybeFilter = yoi1.i(utf1Var.g.q(utf1Var.b), o6x.a).firstOrError().filter(pdx0.T0);
                dip0 dip0Var = new dip0(observable, (byte) 1);
                maybeFilter.getClass();
                vkuVar.a(new MaybeFlatten(maybeFilter, dip0Var).h().subscribe(new ttf1(utf1Var, (byte) 3)));
                vkuVar.a(observable.observeOn(utf1Var.i).subscribe(new ttf1(utf1Var, (byte) 4), new ttf1(utf1Var, (byte) 5)));
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                utf1 utf1Var = (utf1) this.b;
                utf1Var.n.c();
                utf1Var.j.getClass();
                break;
        }
    }

    public yvo0(jma jmaVar, iir iirVar, lzn0 lzn0Var) {
        this.c = iirVar;
        this.b = lzn0Var;
    }

    public yvo0(lzn0 lzn0Var, bnj0 bnj0Var) {
        this.b = lzn0Var;
        this.c = bnj0Var;
    }

    private final void b() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
