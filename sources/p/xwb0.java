package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp/xwb0;", "Lp/ijl1;", "Lp/ug30;", "Lp/o6r0;", "<init>", "()V", "src_main_java_com_spotify_marquee_marquee-marquee"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class xwb0 extends ijl1 implements ug30, o6r0 {
    public static final /* synthetic */ int W1 = 0;
    public final gn10 V1 = mno1.I;

    public final String A(Context context) {
        return "";
    }

    public final void I0(View view, Bundle bundle) {
        ImageView imageView = (ImageView) b8k1.n(view, 2131429737);
        imageView.setOnClickListener(new zfs(this, (byte) 26));
        int color = view.getContext().getColor(2131101506);
        Drawable drawable = view.getContext().getDrawable(2131232946);
        if (drawable != null) {
            drawable.setTint(color);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        Button button = (Button) view.findViewById(2131427864);
        if (button != null) {
            button.setText(l0(2131958200));
        }
        TextView textView = (TextView) view.findViewById(2131428732);
        if (textView != null) {
            textView.setText(l0(2131958202));
        }
        TextView textView2 = (TextView) view.findViewById(2131428728);
        if (textView2 != null) {
            textView2.setText(l0(2131958201));
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getV1() {
        return this.V1;
    }

    public final int Z0() {
        return 2131624672;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.M2(), (qir0) null, 4));
    }

    public final void c1() {
        if (((ijl1) this).H1 != null) {
            l1("https://sponsored-recommendations.spotify.com/");
        }
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.M2();
    }

    public final void m1() {
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 != null) {
            dg30VarF0.finish();
            if (Build.VERSION.SDK_INT < 34) {
                dg30VarF0.overridePendingTransition(0, 2130772030);
            } else {
                dg30VarF0.overrideActivityTransition(1, 0, 2130772030);
            }
        }
    }

    public final String s() {
        return nik1.i2.a;
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        W0();
        N0().J().a(this, new ydb(this, (byte) 12));
    }
}
