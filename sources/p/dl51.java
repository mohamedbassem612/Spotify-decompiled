package p;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dl51 implements Runnable {
    public final /* synthetic */ SeeMoreTextView a;
    public final /* synthetic */ wk51 b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    public dl51(SeeMoreTextView seeMoreTextView, wk51 wk51Var, CharSequence charSequence, boolean z, Function0 function0) {
        this.a = seeMoreTextView;
        this.b = wk51Var;
        this.c = charSequence;
        this.d = z;
        this.e = function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, android.widget.TextView, com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0 = this.a;
        if (u890.j(r0.getModel(), this.b)) {
            boolean z = false;
            if (r0.getWidth() == 0) {
                ike1.a.q("TextView's width need to be set, to be able to markup ellipsis", new Object[0]);
                return;
            }
            int i = r0.S0;
            CharSequence charSequence = this.c;
            if (i > 0 && r0.z(charSequence).getLineCount() > r0.S0) {
                z = true;
            }
            if (this.d != z) {
                if (z) {
                    r0.setMovementMethod(LinkMovementMethod.getInstance());
                    r0.setText((CharSequence) this.e.invoke(), TextView.BufferType.NORMAL);
                } else {
                    r0.setMovementMethod(null);
                    r0.setText(charSequence);
                }
            }
        }
    }
}
