package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hxf0 implements Connectable, hac0 {
    public final TextView N0;
    public final Button O0;
    public final EditText P0;
    public final ProgressBar Q0;
    public final SpotifyIconView R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public final Button X;
    public final TextView Y;
    public final TextView Z;
    public final twf0 a;
    public final nxf0 b;
    public final lde0 c;
    public final t8h1 d;
    public final qhe0 e;
    public final ydl0 f;
    public final udl0 g;
    public final mwn0 h;
    public final View i;
    public final ViewAnimator t;

    public hxf0(twf0 twf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup, nxf0 nxf0Var, lde0 lde0Var, t8h1 t8h1Var, qhe0 qhe0Var, ydl0 ydl0Var, udl0 udl0Var, mwn0 mwn0Var) {
        this.a = twf0Var;
        this.b = nxf0Var;
        this.c = lde0Var;
        this.d = t8h1Var;
        this.e = qhe0Var;
        this.f = ydl0Var;
        this.g = udl0Var;
        this.h = mwn0Var;
        View viewInflate = layoutInflater.inflate(2131625170, viewGroup, false);
        this.i = viewInflate;
        ViewAnimator viewAnimator = (ViewAnimator) viewInflate.findViewById(2131431610);
        this.t = viewAnimator;
        Button button = (Button) viewInflate.findViewById(2131429855);
        this.X = button;
        this.Y = (TextView) viewInflate.findViewById(2131430662);
        TextView textView = (TextView) viewInflate.findViewById(2131429853);
        this.Z = textView;
        this.N0 = (TextView) viewInflate.findViewById(2131430668);
        this.O0 = (Button) viewInflate.findViewById(2131430233);
        this.P0 = (EditText) viewInflate.findViewById(2131429856);
        this.Q0 = (ProgressBar) viewInflate.findViewById(2131430530);
        TextView textView2 = (TextView) viewInflate.findViewById(2131430663);
        this.R0 = viewInflate.findViewById(2131427670);
        viewAnimator.setAnimateFirstView(true);
        button.setText(viewInflate.getContext().getString(2131958001));
        textView2.setText(viewInflate.getContext().getString(2131958026));
        textView.setText(viewInflate.getContext().getString(2131958027));
    }

    public final Connection L(Consumer consumer) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        EditText editText = this.P0;
        ryn1.z(editText);
        editText.setOnFocusChangeListener(new x29(this, (byte) 9));
        byte b = 1;
        editText.addTextChangedListener(new zyw(this, consumer, b));
        editText.setOnEditorActionListener(new jis(this, consumer, b));
        this.X.setOnClickListener(new gxf0(this, consumer, (byte) 0));
        this.O0.setOnClickListener(new gxf0(this, consumer, b));
        this.R0.setOnClickListener(new gxf0(this, consumer, (byte) 2));
        return new pee0(this, compositeDisposable, (byte) 1);
    }

    public final View a() {
        return this.i;
    }

    public final void b(boolean z) {
        nxf0 nxf0Var = this.b;
        if (z) {
            nxf0Var.a(new wp80(2, 2, null));
        } else {
            nxf0Var.a(new wp80(2, 3, null));
        }
        EditText editText = this.P0;
        ryn1.v(editText);
        WeakHashMap weakHashMap = b8k1.a;
        View view = this.i;
        boolean z2 = view.getLayoutDirection() == 1;
        ViewAnimator viewAnimator = this.t;
        viewAnimator.setInAnimation(viewAnimator.getContext(), z2 ? 2130772050 : 2130772051);
        viewAnimator.setOutAnimation(viewAnimator.getContext(), z2 ? 2130772053 : 2130772052);
        viewAnimator.showNext();
        nxf0Var.a(new yp80(3, ((uba) this.e).Y.c.a));
        this.Y.setText(2131958017);
        String string = editText.getText().toString();
        this.c.getClass();
        int iA = lde0.a(string);
        TextView textView = this.N0;
        if (iA == 1) {
            textView.setText(view.getContext().getString(2131958018, editText.getText()));
        } else {
            textView.setText(view.getContext().getString(2131958019));
        }
        int displayedChild = viewAnimator.getDisplayedChild();
        t8h1 t8h1Var = this.d;
        if (displayedChild == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            t8h1.n(t8h1Var, yon1.G1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAIL", "login/accountrecovery/requestemail", 940, "login"));
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            t8h1.n(t8h1Var, yon1.G1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION", "login/accountrecovery/requestemailconfirmation", 941, "login"));
        }
    }
}
