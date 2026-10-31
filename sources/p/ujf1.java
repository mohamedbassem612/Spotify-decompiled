package p;

import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/ujf1;", "Lp/hip;", "<init>", "()V", "src_main_java_com_spotify_blend_attribution-attribution"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ujf1 extends hip {
    public lzn0 G1;
    public lvc1 H1;
    public gw70 I1;
    public rh41 J1;
    public final idd1 K1 = new idd1(new j4f1(this, 6));

    public final void E0() {
        ((zf30) this).h1 = true;
        lvc1 lvc1Var = this.H1;
        if (lvc1Var == null) {
            u890.C("logger");
            throw null;
        }
        ((b2r0) lvc1Var.c).h(((dsk0) lvc1Var.d).e());
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.J1 == null) {
            u890.C("scannablesImageUri");
            throw null;
        }
        String str = ((xjf1) this.K1.getValue()).b;
        try {
            String strName = nne.a.name();
            strName.getClass();
            Uri uri = Uri.parse("https://scannables.scdn.co/uri/800/".concat(URLEncoder.encode(str, strName)));
            ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView.setContent(new j2i(1844125284, new tjf1(this, uri, (byte) 2), true));
            return composeView;
        } catch (UnsupportedEncodingException e) {
            eg.f(e);
            return null;
        }
    }
}
