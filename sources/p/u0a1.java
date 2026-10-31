package p;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/u0a1;", "Lp/v4n;", "<init>", "()V", "src_main_java_com_spotify_jam_internal_bottomsheet-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0a1 extends v4n {
    public static final String j2 = rc11.a.b(u0a1.class).r();
    public Scheduler b2;
    public dn81 c2;
    public mi90 d2;
    public iv81 e2;
    public dr91 f2;
    public iu30 g2 = fe91.e1;
    public final rku h2 = new rku();
    public Object i2;

    public final void A0() {
        this.h2.a();
        super/*p.t2u*/.A0();
    }

    public final void k1(t4n t4nVar) {
        t4nVar.setOnKeyListener(new qfm(this, (byte) 2));
        t4nVar.setOnDismissListener(new whr(this, (byte) 4));
        t4nVar.g().L(3);
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Class cls = (Class) O0().getSerializable("factory_key");
        dn81 dn81Var = this.c2;
        if (dn81Var == null) {
            u890.C("contentResolver");
            throw null;
        }
        Object obj = ((gg11) dn81Var.b).get(cls);
        obj.getClass();
        x0a1 x0a1Var = (x0a1) obj;
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.e2 = new iv81(x0a1Var, composeView, (byte) 11);
        this.f2 = new dr91(x0a1Var, (byte) 5);
        return composeView;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.g2.invoke(s0a1.b);
    }

    public final mi90 p1() {
        Object obj = this.i2;
        mi90 mi90Var = this.d2;
        if (mi90Var != null || obj == null) {
            if (mi90Var != null) {
                return mi90Var;
            }
            u890.C("component");
            throw null;
        }
        iv81 iv81Var = this.e2;
        if (iv81Var == null) {
            u890.C("componentFactory");
            throw null;
        }
        mi90 mi90Var2 = (mi90) iv81Var.invoke(obj);
        this.d2 = mi90Var2;
        return mi90Var2;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
    }
}
