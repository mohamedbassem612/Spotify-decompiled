package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class heb0 implements h8l {
    public final leb0 a;
    public final o860 b;
    public Consumer d;
    public final LinearLayout f;
    public final hrr0 c = v8r.q(new eeb0(new beb0(z6x.a), new xcb0(null)));
    public final hrr0 e = v8r.q((Object) null);

    public heb0(Context context, leb0 leb0Var, o860 o860Var) {
        this.a = leb0Var;
        this.b = o860Var;
        int i = kgr0.T0;
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(new j2i(-1783769103, new geb0(this, (byte) 3), true));
        this.f = xyn1.z(composeView);
    }

    public final Connection L(Consumer consumer) {
        this.d = consumer;
        return new n1b0(this, (byte) 1);
    }

    public final Object getView() {
        return this.f;
    }

    public final Bundle serialize() {
        return mno1.g();
    }

    public final void start() {
    }

    public final void stop() {
    }
}
