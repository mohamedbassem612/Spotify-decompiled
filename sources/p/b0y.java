package p;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b0y extends t2u {
    public final thn V1;
    public twa W1;
    public n3u X1;
    public m4c0 Y1;
    public m4c0 Z1;

    public b0y(thn thnVar) {
        this.V1 = thnVar;
    }

    public final void I0(View view, Bundle bundle) {
        g0y g0yVar;
        n3u n3uVar = this.X1;
        if (n3uVar != null) {
            if (this.W1 == null) {
                u890.C("messageProvider");
                throw null;
            }
            if (n3uVar.equals(n3u.d)) {
                g0yVar = e0y.e;
            } else if (n3uVar.equals(n3u.b)) {
                g0yVar = c0y.e;
            } else if (n3uVar.equals(n3u.c)) {
                g0yVar = d0y.e;
            } else {
                if (!n3uVar.equals(n3u.e)) {
                    eg.o();
                    return;
                }
                g0yVar = f0y.e;
            }
            ((TextView) view.findViewById(2131428657)).setText(l0(g0yVar.a));
            ((TextView) view.findViewById(2131428654)).setText(l0(g0yVar.b));
            Button button = (Button) view.findViewById(2131428655);
            button.setText(l0(g0yVar.c));
            button.setOnClickListener(new a0y(this, (byte) 0));
            Integer num = (Integer) g0yVar.d;
            if (num != null) {
                int iIntValue = num.intValue();
                Button button2 = (Button) view.findViewById(2131428656);
                button2.getClass();
                button2.setVisibility(0);
                button2.setText(l0(iIntValue));
                button2.setOnClickListener(new a0y(this, (byte) 1));
            }
        }
    }

    public final void i1(Function0 function0) {
        this.Y1 = (m4c0) function0;
    }

    public final void j1(m4c0 m4c0Var) {
        this.Z1 = m4c0Var;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m4c0 m4c0Var = this.Y1;
        if (m4c0Var != null) {
            m4c0Var.invoke();
        }
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        Serializable serializable = O0().getSerializable("EndlessErrorDialogFragment.DialogType");
        this.X1 = serializable instanceof n3u ? (n3u) serializable : null;
        e1(0, 2132017601);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624544, viewGroup, false);
    }
}
