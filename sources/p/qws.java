package p;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.nowplaying.uiusecases.seekbar.SuppressLayoutTextView;
import com.spotify.nowplaying.uiusecases.seekbar.TrackSeekbarNowPlaying;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qws implements TrackSeekbarNowPlaying {
    public boolean X;
    public agv Y;
    public final Context a;
    public final View b;
    public final CancellableSeekBar c;
    public final SuppressLayoutTextView d;
    public final SuppressLayoutTextView e;
    public final g931 f;
    public final r4u g;
    public final idd1 h;
    public final idd1 i;
    public yzf1 t;

    public qws(Context context, int i) {
        this.a = context;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = viewInflate;
        this.c = viewInflate.findViewById(2131430907);
        SuppressLayoutTextView suppressLayoutTextViewFindViewById = viewInflate.findViewById(2131430458);
        this.d = suppressLayoutTextViewFindViewById;
        SuppressLayoutTextView suppressLayoutTextViewFindViewById2 = viewInflate.findViewById(2131428543);
        this.e = suppressLayoutTextViewFindViewById2;
        this.f = new g931(suppressLayoutTextViewFindViewById, suppressLayoutTextViewFindViewById2);
        this.g = r4u.c(new r4u[]{r4u.d(new mo(mws.b, (byte) 2), r4u.a(new xap((Object) this, (byte) 18))), r4u.d(new mo(nws.b, (byte) 2), r4u.a(new h9n(this, (byte) 19))), r4u.d(new mo(ows.b, (byte) 2), r4u.a(new sun(this, (byte) 21))), r4u.d(new mo(pws.b, (byte) 2), r4u.a(new her(this, (byte) 17))), r4u.d(xbp1.X0, r4u.a(new a0m(this, (byte) 24))), r4u.d(new mo(lws.b, (byte) 2), r4u.a(new wcr(this, (byte) 16)))});
        this.h = new idd1(new jws(this, (byte) 1));
        this.i = new idd1(new jws(this, (byte) 0));
        this.Y = agv.a;
    }

    public final void a() {
        int iOrdinal = this.Y.ordinal();
        g931 g931Var = this.f;
        CancellableSeekBar cancellableSeekBar = this.c;
        if (iOrdinal == 0) {
            ((SuppressLayoutTextView) g931Var.c).setTextAdjustingWidth(g931Var.i(cancellableSeekBar.getMax()));
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            int progress = cancellableSeekBar.getProgress();
            int max = cancellableSeekBar.getMax();
            g931Var.getClass();
            int i = max - progress;
            if (i < 0) {
                i = 0;
            }
            ((SuppressLayoutTextView) g931Var.c).setTextAdjustingWidth("-".concat(g931Var.i(i)));
        }
    }

    public final void f(Object obj) {
        int i;
        int i2;
        f0g1 f0g1Var = (f0g1) obj;
        boolean z = f0g1Var.e;
        this.g.e(f0g1Var);
        yzf1 yzf1Var = this.t;
        yzf1 yzf1Var2 = f0g1Var.g;
        if (!u890.j(yzf1Var, yzf1Var2)) {
            this.t = yzf1Var2;
            if (yzf1Var2 != null) {
                i = yzf1Var2.a;
                i2 = yzf1Var2.b;
            } else {
                i = 2131101292;
                i2 = 2131233879;
            }
            Context context = this.a;
            Drawable drawable = context.getDrawable(i2);
            CancellableSeekBar cancellableSeekBar = this.c;
            cancellableSeekBar.setThumb(drawable);
            cancellableSeekBar.getProgressDrawable().setColorFilter(context.getColor(i), PorterDuff.Mode.SRC_IN);
        }
        this.d.setVisibility(z ? 0 : 8);
        this.e.setVisibility(z ? 0 : 8);
    }

    public final View getView() {
        return this.b;
    }

    public final void n(iu30 iu30Var) {
        this.c.setOnSeekBarChangeListener(new thd(new wrs(this, iu30Var, (byte) 4), (byte) 1));
        this.e.setOnClickListener(new aqs(iu30Var, (byte) 13));
    }
}
