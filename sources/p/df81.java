package p;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/df81;", "Lp/v4n;", "<init>", "()V", "src_main_java_com_spotify_entitypages_shuffleonfreeimpl-shuffleonfreeimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class df81 extends v4n {
    public static final /* synthetic */ int f2 = 0;
    public ao6 b2;
    public iic0 c2;
    public lzn0 d2;
    public gg11 e2;

    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
        t4nVar.g().E = true;
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        iic0 iic0Var;
        zwv0 zwv0Var = (zwv0) O0().getSerializable("premium_upsell_variant");
        gg11 gg11Var = this.e2;
        if (gg11Var == null) {
            u890.C("contentViewBinders");
            throw null;
        }
        kly0 kly0Var = (kly0) gg11Var.get(zwv0Var);
        if (kly0Var == null || (iic0Var = (iic0) kly0Var.get()) == null) {
            hhg1.o(zwv0Var, "Provide a contentBinder for ");
            return null;
        }
        this.c2 = iic0Var;
        View viewInflate = layoutInflater.inflate(2131626135, viewGroup, false);
        if (viewInflate == null) {
            bhn0.i("rootView");
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        this.b2 = new ao6(frameLayout, frameLayout);
        iic0 iic0Var2 = this.c2;
        if (iic0Var2 == null) {
            u890.C("contentViewBinder");
            throw null;
        }
        n381 n381Var = iic0Var2.a;
        ((i8h1) n381Var.b).f(((ezl0) n381Var.c).e(), (Set) null);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(frameLayout.getContext()).inflate(2131625138, (ViewGroup) frameLayout, false);
        int i = 2131428103;
        Button button = (Button) m5n1.t(constraintLayoutInflate, 2131428103);
        if (button != null) {
            i = 2131428438;
            if (((TextView) m5n1.t(constraintLayoutInflate, 2131428438)) != null) {
                i = 2131428801;
                EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428801);
                if (encoreButtonT != null) {
                    i = 2131431356;
                    if (((TextView) m5n1.t(constraintLayoutInflate, 2131431356)) != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        iic0Var2.b = new x390(constraintLayout, button, encoreButtonT);
                        frameLayout.addView(constraintLayout);
                        iic0 iic0Var3 = this.c2;
                        if (iic0Var3 == null) {
                            u890.C("contentViewBinder");
                            throw null;
                        }
                        d781 d781Var = new d781(this, (byte) 8);
                        x390 x390Var = iic0Var3.b;
                        if (x390Var == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((EncoreButton) x390Var.c).setOnClickListener(new hic0(iic0Var3, d781Var, (byte) 0));
                        x390 x390Var2 = iic0Var3.b;
                        if (x390Var2 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((Button) x390Var2.b).setOnClickListener(new hic0(iic0Var3, d781Var, (byte) 1));
                        ao6 ao6Var = this.b2;
                        if (ao6Var != null) {
                            return ao6Var.a;
                        }
                        u890.C("binding");
                        throw null;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        iic0 iic0Var = this.c2;
        if (iic0Var != null) {
            if (iic0Var != null) {
                iic0Var.a();
            } else {
                u890.C("contentViewBinder");
                throw null;
            }
        }
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
    }
}
