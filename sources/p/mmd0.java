package p;

import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mmd0 extends URLSpan {
    public final iu30 a;

    public mmd0(String str, iu30 iu30Var) {
        super(str);
        this.a = iu30Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.invoke(getURL());
        super.onClick(view);
    }
}
