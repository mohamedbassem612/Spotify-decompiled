package p;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g6t0 implements r6t0 {
    public final j2i a;
    public final kdn0 b = new kdn0();
    public final ComposeView c;

    public g6t0(Context context, j2i j2iVar) {
        this.a = j2iVar;
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setId(2131430350);
        composeView.setViewCompositionStrategy(f4x0.V0);
        composeView.setContent(new j2i(1795016569, new t1t0(this, (byte) 1), true));
        this.c = composeView;
    }

    public final void a(boolean z) {
        this.b.m(Boolean.valueOf(z));
    }

    public final Object getView() {
        return this.c;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
