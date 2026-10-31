package p;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vn11 extends emc0 {
    public final yh2 N0;
    public int O0;
    public RecyclerView P0;
    public zl7 Q0;
    public k9s R0;
    public ijs S0;
    public ijs T0;
    public final a6z X;
    public final i4q Y;
    public final zr00 Z;
    public final lik1 e;
    public final xfx f;
    public final ssf1 g;
    public final woa h;
    public final kma i;
    public final fpa t;

    public vn11(lik1 lik1Var, xfx xfxVar, ssf1 ssf1Var, woa woaVar, kma kmaVar, fpa fpaVar, a6z a6zVar, i4q i4qVar, zr00 zr00Var, yh2 yh2Var) {
        super(new kn5((byte) 23));
        this.e = lik1Var;
        this.f = xfxVar;
        this.g = ssf1Var;
        this.h = woaVar;
        this.i = kmaVar;
        this.t = fpaVar;
        this.X = a6zVar;
        this.Y = i4qVar;
        this.Z = zr00Var;
        this.N0 = yh2Var;
    }

    public final void D(int i) {
        w611 w611VarN;
        RecyclerView recyclerView = this.P0;
        if (recyclerView == null || (w611VarN = recyclerView.N(i)) == null) {
            return;
        }
        ((un11) w611VarN).U0.f(wnp0.a);
        ijs ijsVar = this.T0;
        if (ijsVar != null) {
            ijsVar.invoke(Integer.valueOf(i), ((qn11) ((emc0) this).d.f.get(i)).e);
        } else {
            u890.C("onMusicVideoCardVisible");
            throw null;
        }
    }

    public final void m(RecyclerView recyclerView) {
        this.P0 = recyclerView;
        zl7 zl7Var = new zl7(this, (byte) 16);
        this.Q0 = zl7Var;
        recyclerView.m(zl7Var);
    }

    public final void n(int i, w611 w611Var) {
        qn11 qn11Var = (qn11) A(i);
        cds cdsVar = ((un11) w611Var).U0;
        String str = qn11Var.c;
        String str2 = qn11Var.d;
        String str3 = qn11Var.h;
        String str4 = qn11Var.b;
        String str5 = qn11Var.e;
        long j = qn11Var.f;
        long j2 = qn11Var.g;
        boolean z = qn11Var.a;
        int iOrdinal = qn11Var.j.ordinal();
        int i2 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 = 2;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                i2 = 3;
            }
        }
        cdsVar.f(new vnp0(str, str2, str3, str4, str5, j, j2, z, i2));
        qn11 qn11Var2 = (qn11) A(i);
        k9s k9sVar = this.R0;
        if (k9sVar == null) {
            u890.C("onCardClicked");
            throw null;
        }
        ijs ijsVar = this.S0;
        if (ijsVar != null) {
            cdsVar.N0 = new fu(k9sVar, i, qn11Var2, ijsVar, (byte) 15);
        } else {
            u890.C("onContextMenuClicked");
            throw null;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        ufx ufxVar = this.f.b;
        cds cdsVar = new cds(ufxVar.a, ufxVar.b, this.g, this.e, new vi11(this.h, this.i, this.t, (byte) 23), this.X, this.Y, this.Z, this.N0);
        int measuredWidth = ((emc0) this).d.f.size() == 1 ? viewGroup.getMeasuredWidth() - (viewGroup.getResources().getDimensionPixelSize(2131167226) * 2) : (int) (((double) (viewGroup.getMeasuredWidth() - viewGroup.getResources().getDimensionPixelSize(2131167226))) * 0.8d);
        p1f0 p1f0Var = cdsVar.i;
        ConstraintLayout constraintLayout = (ConstraintLayout) p1f0Var.a;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) p1f0Var.h;
        constraintLayout.getLayoutParams().width = measuredWidth;
        videoSurfaceView.getLayoutParams().width = measuredWidth;
        ImageView imageView = cdsVar.t;
        imageView.getLayoutParams().height = videoSurfaceView.getLayoutParams().height;
        imageView.getLayoutParams().width = measuredWidth;
        return new un11(cdsVar);
    }

    public final void r(RecyclerView recyclerView) {
        zl7 zl7Var = this.Q0;
        if (zl7Var == null) {
            u890.C("onScrollListener");
            throw null;
        }
        recyclerView.p0(zl7Var);
        this.P0 = null;
    }
}
