package p;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d460 implements c460 {
    public final xfx a;
    public final lzn0 b;
    public final boolean c;
    public final agc0 d;
    public final gw70 e;
    public dtw f;
    public dtw g;
    public dtw h;
    public dtw i;
    public boolean j;
    public final idd1 k = new idd1(new g050(this, (byte) 12));
    public final idd1 l = new idd1(new cc00(this, (byte) 13));

    public d460(xfx xfxVar, gw70 gw70Var, agc0 agc0Var, lzn0 lzn0Var, boolean z) {
        this.a = xfxVar;
        this.b = lzn0Var;
        this.c = z;
        this.d = agc0Var;
        this.e = gw70Var;
    }

    public final void a(x360 x360Var, FrameLayout frameLayout) {
        boolean z = x360Var instanceof jzg1;
        idd1 idd1Var = this.k;
        if (z) {
            jzg1 jzg1Var = (jzg1) x360Var;
            dtw dtwVar = this.g;
            if (dtwVar != null) {
                dtwVar.f(tho1.y(jzg1Var));
                return;
            }
            tka0 tka0Var = dtw.C;
            dtw dtwVarB = mhc.b(frameLayout.getContext(), frameLayout, (ozg1) idd1Var.getValue(), tho1.y(jzg1Var), (ipb1) null, 112);
            frameLayout.removeAllViews();
            frameLayout.addView(dtwVarB.w);
            this.g = dtwVarB;
            this.h = null;
            this.f = null;
            this.i = null;
            return;
        }
        if (x360Var instanceof mhq0) {
            mhq0 mhq0Var = (mhq0) x360Var;
            dtw dtwVar2 = this.h;
            if (dtwVar2 != null) {
                dtwVar2.f(tho1.w(mhq0Var));
                return;
            }
            tka0 tka0Var2 = dtw.C;
            dtw dtwVarB2 = mhc.b(frameLayout.getContext(), frameLayout, f6o1.A((thq0) this.l.getValue(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), tho1.w(mhq0Var), (ipb1) null, 112);
            frameLayout.removeAllViews();
            frameLayout.addView(dtwVarB2.w);
            this.h = dtwVarB2;
            this.g = null;
            this.f = null;
            this.i = null;
            return;
        }
        if (x360Var instanceof prb1) {
            prb1 prb1Var = (prb1) x360Var;
            dtw dtwVar3 = this.g;
            if (dtwVar3 != null) {
                dtwVar3.f(tho1.x(prb1Var));
                return;
            }
            tka0 tka0Var3 = dtw.C;
            dtw dtwVarB3 = mhc.b(frameLayout.getContext(), frameLayout, (ozg1) idd1Var.getValue(), tho1.x(prb1Var), (ipb1) null, 112);
            frameLayout.removeAllViews();
            frameLayout.addView(dtwVarB3.w);
            this.g = dtwVarB3;
            this.f = null;
            this.i = null;
            return;
        }
        if (x360Var instanceof hvl1) {
            hvl1 hvl1Var = (hvl1) x360Var;
            s460 s460VarV = tho1.v(hvl1Var);
            dtw dtwVar4 = this.f;
            if (dtwVar4 != null) {
                dtwVar4.f(s460VarV);
                return;
            }
            tka0 tka0Var4 = dtw.C;
            dtw dtwVarB4 = mhc.b(frameLayout.getContext(), frameLayout, f6o1.A(new w460(this.b, this.c, hvl1Var.d != null, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), s460VarV, (ipb1) null, 112);
            frameLayout.removeAllViews();
            frameLayout.addView(dtwVarB4.w);
            this.f = dtwVarB4;
            this.g = null;
            this.h = null;
            this.i = null;
            return;
        }
        boolean z2 = false;
        if (!(x360Var instanceof i460)) {
            if (x360Var == null) {
                frameLayout.removeAllViews();
                return;
            } else {
                eg.o();
                return;
            }
        }
        i460 i460Var = (i460) x360Var;
        boolean z3 = i460Var.c() != null;
        if (this.j != z3) {
            z2 = true;
        }
        dtw dtwVar5 = this.i;
        if (dtwVar5 != null && !z2) {
            dtwVar5.f(tho1.u(i460Var));
            return;
        }
        this.j = z3;
        tka0 tka0Var5 = dtw.C;
        dtw dtwVarB5 = mhc.b(frameLayout.getContext(), frameLayout, f6o1.A(new l460(k1o1.v(this.b), z3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), tho1.u(i460Var), (ipb1) null, 112);
        frameLayout.removeAllViews();
        frameLayout.addView(dtwVarB5.w);
        this.i = dtwVarB5;
        this.g = null;
        this.h = null;
        this.f = null;
    }
}
