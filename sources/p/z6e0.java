package p;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z6e0 implements f4h1 {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public z6e0(LinearLayout linearLayout, t2b t2bVar, dni0 dni0Var, vnd1 vnd1Var) {
        this.b = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(2131431356);
        TextView textView2 = (TextView) linearLayout.findViewById(2131431115);
        EncoreButton encoreButtonFindViewById = linearLayout.findViewById(2131429664);
        rwq0.s((LinearLayout) linearLayout.findViewById(2131428198), gce0.X);
        textView.setText(dni0Var.a);
        textView2.setText(dni0Var.b);
        encoreButtonFindViewById.setText(dni0Var.c);
        encoreButtonFindViewById.setOnClickListener(new kw6(this, dni0Var, vnd1Var, (byte) 13));
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((l5r0) obj).getView();
            default:
                return (LinearLayout) obj;
        }
    }

    public final Bundle serialize() {
        switch (this.a) {
            case 0:
                lqb1 lqb1Var = (l5r0) this.b;
                lqb1 lqb1Var2 = lqb1Var instanceof lqb1 ? lqb1Var : null;
                if (lqb1Var2 != null) {
                    return lqb1Var2.f();
                }
                return null;
            default:
                return mno1.g();
        }
    }

    public final void start() {
        switch (this.a) {
            case 0:
                ((l5r0) this.b).start();
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                ((l5r0) this.b).stop();
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    public z6e0(l5r0 l5r0Var) {
        this.b = l5r0Var;
    }
}
