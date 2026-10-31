package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ro11 implements qzh {
    public final Context a;
    public final kdn0 b = new kdn0("");
    public final zat c = new zat();
    public final ComposeView d;
    public boolean e;

    public ro11(Context context) {
        this.a = context;
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(-1236142968, new ziz0(this, (byte) 27), true));
        this.d = composeView;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(qo11 qo11Var) {
        String string;
        long j = qo11Var.a;
        zat zatVar = this.c;
        zatVar.getClass();
        ytw0 ytw0Var = jfv.b;
        long jL0 = fdg1.l0(zatVar.a.b(), ngv.d);
        ngv ngvVar = ngv.e;
        long jL1 = fdg1.l0(jfv.u(jL0, ngvVar) - j, ngvVar);
        ngv ngvVar2 = ngv.h;
        double dU = jfv.u(jL1, ngvVar2) / 30.0d;
        long jU = jfv.u(jL1, ngvVar2);
        Context context = this.a;
        if (jU < 7) {
            string = context.getString(2131959114);
        } else {
            string = dU < 6.0d ? context.getString(2131957183) : "";
        }
        this.e = string.length() > 0;
        this.b.m(string);
    }

    public final View getView() {
        return this.d;
    }
}
