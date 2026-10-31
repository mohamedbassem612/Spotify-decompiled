package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iw40 extends Dialog {
    public static final hw40 f = new hw40();
    public boolean a;
    public final Button b;
    public final Button c;
    public qw40 d;
    public final lw40 e;

    public iw40(Context context, lw40 lw40Var) {
        super(context, 2132018153);
        this.d = f;
        this.e = lw40Var;
        View viewInflate = getLayoutInflater().inflate(2131625018, (ViewGroup) null);
        Button button = (Button) viewInflate.findViewById(2131427862);
        this.b = button;
        Button button2 = (Button) viewInflate.findViewById(2131427858);
        this.c = button2;
        i69.b(button);
        i69.b(button2);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(2131428203);
        lw40Var.l(getLayoutInflater(), scrollView);
        int i = -lw40Var.o();
        if (scrollView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) scrollView.getLayoutParams()).bottomMargin = i;
        }
        setContentView(viewInflate);
    }

    public final void a(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        Button button = this.b;
        if (z) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131166085);
            if (button.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).bottomMargin = dimensionPixelSize;
                return;
            }
            return;
        }
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(2131167003);
        if (button.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).bottomMargin = dimensionPixelSize2;
        }
    }

    public final void b(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a) {
            return;
        }
        this.d.b();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.a();
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        this.a = true;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        this.e.getClass();
    }
}
