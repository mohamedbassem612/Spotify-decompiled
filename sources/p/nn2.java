package p;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nn2 implements m5 {
    public final View a;
    public final t8h1 b;
    public final Button c;
    public final DatePicker d;
    public final TextView e;
    public final ProgressBar f;
    public final PublishSubject g;

    public nn2(View view, t8h1 t8h1Var) {
        this.a = view;
        this.b = t8h1Var;
        View viewFindViewById = view.findViewById(2131427548);
        ((Button) viewFindViewById).setOnClickListener(new c20(this, (byte) 2));
        this.c = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131428392);
        ((DatePicker) viewFindViewById2).setMaxDate(new Date().getTime());
        this.d = (DatePicker) viewFindViewById2;
        this.e = (TextView) view.findViewById(2131427547);
        this.f = (ProgressBar) view.findViewById(2131427550);
        this.g = new PublishSubject();
    }

    public static final void d(nn2 nn2Var, th2 th2Var) {
        String string;
        Button button = nn2Var.c;
        ProgressBar progressBar = nn2Var.f;
        TextView textView = nn2Var.e;
        yj2 yj2Var = th2Var.d;
        if ((yj2Var instanceof wj2) || (yj2Var instanceof vj2)) {
            textView.setVisibility(4);
            progressBar.setVisibility(8);
            button.setEnabled(true);
            return;
        }
        if (yj2Var instanceof xj2) {
            textView.setVisibility(4);
            progressBar.setVisibility(0);
            button.setEnabled(false);
            return;
        }
        if (!(yj2Var instanceof uj2)) {
            eg.o();
            return;
        }
        zb90 zb90Var = ((uj2) yj2Var).a;
        View view = nn2Var.a;
        boolean z = zb90Var instanceof ub90;
        if (z) {
            string = ((ub90) zb90Var).a;
            if (string == null) {
                string = view.getContext().getString(2131962490);
            }
        } else if (zb90Var instanceof vb90) {
            string = ((vb90) zb90Var).a;
        } else if (u890.j(zb90Var, wb90.a)) {
            string = view.getContext().getString(2131962519);
        } else if (zb90Var instanceof xb90) {
            string = ((xb90) zb90Var).a;
            if (string == null) {
                string = view.getContext().getString(2131962491);
            }
        } else {
            if (!u890.j(zb90Var, yb90.a)) {
                eg.o();
                return;
            }
            string = view.getContext().getString(2131962509);
        }
        textView.setText(string);
        if (!th2Var.e && !th2Var.f) {
            textView.setVisibility(0);
            progressBar.setVisibility(8);
            button.setEnabled(false);
        } else if ((zb90Var instanceof vb90) || z || (zb90Var instanceof yb90) || (zb90Var instanceof wb90)) {
            textView.setVisibility(0);
            progressBar.setVisibility(8);
            button.setEnabled(false);
        } else {
            textView.setVisibility(8);
            progressBar.setVisibility(8);
            button.setEnabled(true);
        }
    }

    public final Connection L(Consumer consumer) {
        return new ln2(this, this.g.subscribe(new dn(consumer, (byte) 4)));
    }

    @Override // p.m5
    public final void R(int i, int i2, int i3) {
        this.d.init(i, i2, i3, new mn2(this));
    }

    @Override // p.c7k1
    public final String b() {
        return this.a.getContext().getString(2131962528);
    }

    @Override // p.c7k1
    public final void c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        t8h1.n(this.b, yon1.G1("SIGNUP_BIRTHDAY", "signup/birthday", 1886, "signup"));
    }

    @Override // p.c7k1
    public final void a() {
    }
}
