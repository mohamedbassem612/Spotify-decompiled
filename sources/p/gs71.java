package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gs71 implements xpw {
    public final lzn0 a;
    public final gw70 b;
    public final u7h1 c = new u7h1(ea71.T0, krz0.a1);
    public final e7m0 d;
    public final psw e;

    public gs71(lzn0 lzn0Var, gw70 gw70Var, fs71 fs71Var, cs71 cs71Var, r3q r3qVar, lzy lzyVar) {
        this.a = lzn0Var;
        this.b = gw70Var;
        this.d = sbl.B(new xr71(vr71.a, fr71.a), gp71.c, cs71Var, ea71.R0, new c861(fs71Var, lzyVar, (byte) 15));
        j2i j2iVar = new j2i(2068735716, new t20(this, r3qVar, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.e;
    }

    public final FrameLayout e(View view, tr71 tr71Var) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        tka0 tka0Var = dtw.C;
        View view2 = mhc.b(frameLayout.getContext(), frameLayout, f6o1.A(this, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), tr71Var, (ipb1) null, 112).w;
        nn61 nn61Var = new nn61(view2, view, false, (byte) 7);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(frameLayout, nn61Var);
        frameLayout.setClipChildren(false);
        frameLayout.addView(view);
        frameLayout.addView(view2);
        return frameLayout;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
