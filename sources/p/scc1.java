package p;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class scc1 implements f4h1 {
    public final iac0 a;
    public final ick1 b;
    public final ycc1 c;
    public final dsq d;
    public final String e;
    public final ComposeView f;

    public scc1(Context context, iac0 iac0Var, ick1 ick1Var, ycc1 ycc1Var, dsq dsqVar, String str) {
        this.a = iac0Var;
        this.b = ick1Var;
        this.c = ycc1Var;
        this.d = dsqVar;
        this.e = str;
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f = composeView;
        composeView.setContent(new j2i(-75693611, new rcc1(this, (byte) 2), true));
    }

    public final Object getView() {
        return this.f;
    }

    public final void start() {
        this.b.c.c.a(this.a, new es3(this.c, (byte) 8), new qpj0(this, (byte) 14));
    }

    public final void stop() {
        this.b.c.c.b();
    }
}
