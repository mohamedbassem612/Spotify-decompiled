package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cds implements qzh {
    public iu30 N0;
    public final ContentRestrictionBadgeView X;
    public m031 Y;
    public final vku Z;
    public final Context a;
    public final gw70 b;
    public final ssf1 c;
    public final lik1 d;
    public final vi11 e;
    public final a6z f;
    public final i4q g;
    public vnp0 h = new vnp0("", "", "", "", "", 0, 29000, false, 3);
    public final p1f0 i;
    public final ImageView t;

    /* JADX WARN: Code duplicated, block: B:25:0x0157 A[PHI: r6
      0x0157: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:5:0x005b, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public cds(Context context, gw70 gw70Var, ssf1 ssf1Var, lik1 lik1Var, vi11 vi11Var, a6z a6zVar, i4q i4qVar, zr00 zr00Var, yh2 yh2Var) {
        this.a = context;
        this.b = gw70Var;
        this.c = ssf1Var;
        this.d = lik1Var;
        this.e = vi11Var;
        this.f = a6zVar;
        this.g = i4qVar;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625338, (ViewGroup) null, false);
        int i = 2131427622;
        View view = (AppCompatImageView) m5n1.t(constraintLayoutInflate, 2131427622);
        if (view != null) {
            int i2 = 2131427854;
            ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131427854);
            if (contextMenuButtonT != null) {
                i2 = 2131428222;
                if (m5n1.t(constraintLayoutInflate, 2131428222) != null) {
                    int i3 = 2131429948;
                    if (m5n1.t(constraintLayoutInflate, 2131429948) != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i3 = 2131430403;
                        PlayButtonView playButtonViewT = m5n1.t(constraintLayoutInflate, 2131430403);
                        if (playButtonViewT != null) {
                            i3 = 2131431115;
                            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                            if (textView != null) {
                                i3 = 2131431125;
                                if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131431125)) != null) {
                                    i3 = 2131431356;
                                    TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                    if (textView2 != null) {
                                        i3 = 2131431373;
                                        if (m5n1.t(constraintLayoutInflate, 2131431373) != null) {
                                            i3 = 2131431581;
                                            View view2 = (VideoSurfaceView) m5n1.t(constraintLayoutInflate, 2131431581);
                                            if (view2 != null) {
                                                this.i = new p1f0(constraintLayout, view, contextMenuButtonT, constraintLayout, playButtonViewT, textView, textView2, view2);
                                                this.Y = new m031(false, false);
                                                vku vkuVar = new vku();
                                                this.Z = vkuVar;
                                                v9w0 v9w0VarP = b2u.p(constraintLayout);
                                                Collections.addAll(v9w0VarP.c, textView2, textView);
                                                Collections.addAll(v9w0VarP.d, view2, view);
                                                v9w0VarP.a();
                                                constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                                                view2.setScaleType(b3k1.c);
                                                playButtonViewT.B(new cet0(false, new vft0(false), (String) null, 4));
                                                this.t = (ImageView) constraintLayout.findViewById(2131427622);
                                                this.X = constraintLayout.findViewById(2131428222);
                                                vi11Var.f = new cv7(this, (byte) 11);
                                                vkuVar.a(Observable.combineLatest(yoi1.i(zr00Var.a, o6x.a).distinctUntilChanged(), yh2Var.a().distinctUntilChanged(), fmv.X0).subscribe(new yrh(this, (byte) 29)));
                                                this.N0 = c6s.Y0;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i = i3;
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Drawable a() {
        Context context = this.a;
        Drawable drawable = context.getDrawable(2131232857);
        if (drawable == null) {
            return new ShapeDrawable();
        }
        drawable.mutate().setTint(context.getColor(2131101504));
        return new ads(drawable, this, (byte) 0);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void f(xnp0 xnp0Var) {
        boolean z;
        vnp0 vnp0Var;
        int i;
        boolean z2;
        boolean z3 = xnp0Var instanceof vnp0;
        p1f0 p1f0Var = this.i;
        if (z3) {
            vnp0 vnp0Var2 = (vnp0) xnp0Var;
            int i2 = vnp0Var2.i;
            String str = vnp0Var2.c;
            long j = vnp0Var2.g - vnp0Var2.f;
            if (j > 29000 || j <= 0) {
                i = i2;
                vnp0Var = new vnp0(vnp0Var2.a, vnp0Var2.b, str, vnp0Var2.d, vnp0Var2.e, 0L, 29000L, vnp0Var2.h, i);
            } else {
                vnp0Var = vnp0Var2;
                i = i2;
            }
            this.h = vnp0Var;
            m031 m031Var = this.Y;
            m031Var.getClass();
            int iC = l1d.C(i);
            if (iC != 0) {
                z2 = iC != 1 ? false : m031Var.a;
            } else {
                z2 = m031Var.b;
            }
            ImageView imageView = this.t;
            if (z2) {
                e(vnp0Var2);
                ((ConstraintLayout) p1f0Var.d).setAlpha(0.4f);
                imageView.setImageDrawable(a());
                ((PlayButtonView) p1f0Var.e).setVisibility(8);
                return;
            }
            e(vnp0Var2);
            ((ConstraintLayout) p1f0Var.d).setAlpha(1.0f);
            ixg ixgVarF = this.b.f(str);
            ixgVarF.f(a());
            ixgVarF.k(imageView, (ird1) null);
            ((PlayButtonView) p1f0Var.e).setVisibility(0);
            return;
        }
        boolean zEquals = xnp0Var.equals(wnp0.a);
        vi11 vi11Var = this.e;
        if (!zEquals) {
            if (!xnp0Var.equals(wnp0.b)) {
                eg.o();
                return;
            }
            uoa uoaVar = (uoa) vi11Var.e;
            if (uoaVar != null) {
                uoaVar.u();
            }
            uoa uoaVar2 = (uoa) vi11Var.e;
            if (uoaVar2 != null) {
                ((woa) vi11Var.b).c(uoaVar2);
                vi11Var.e = null;
            }
            this.Z.c();
            return;
        }
        m031 m031Var2 = this.Y;
        int i3 = this.h.i;
        m031Var2.getClass();
        int iC2 = l1d.C(i3);
        if (iC2 != 0) {
            z = iC2 != 1 ? false : m031Var2.a;
        } else {
            z = m031Var2.b;
        }
        if (z) {
            return;
        }
        vnp0 vnp0Var3 = this.h;
        if (!vnp0Var3.h || vnp0Var3.d.length() <= 0) {
            return;
        }
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) p1f0Var.h;
        videoSurfaceView.setBufferingThrobberEnabled(false);
        vnp0 vnp0Var4 = this.h;
        String str2 = vnp0Var4.d;
        long j2 = vnp0Var4.f;
        long j3 = vnp0Var4.g;
        String str3 = this.d.a;
        o2u0 o2u0Var = new o2u0(wqn1.n(str2), 12, (Map) null);
        oot0 oot0Var = new oot0(j2, j3, false, false, (hu7) null, (tne1) null, false, 240);
        yqg yqgVar = ((fpa) vi11Var.d).a;
        y2g1 y2g1Var = new y2g1(yqgVar);
        y2g1Var.a = yqgVar.b();
        woa woaVar = (woa) vi11Var.b;
        cv7 cv7Var = (cv7) vi11Var.f;
        uoa uoaVarA = woa.a(woaVar, str3, o2u0Var, (w2k1) null, (kma) vi11Var.c, cv7Var != null ? Collections.singletonList(cv7Var) : z6x.a, false, (bas) null, new sn10(true), 708);
        uoaVarA.p(2);
        uoaVarA.t(false);
        uoaVarA.q(true);
        uoaVarA.d(videoSurfaceView);
        uoaVarA.s(y2g1Var);
        vi11Var.e = uoaVarA;
        uoaVarA.h(o2u0Var, oot0Var);
        uoa uoaVar3 = (uoa) vi11Var.e;
        if (uoaVar3 != null) {
            uoaVar3.l();
        }
    }

    public final void e(vnp0 vnp0Var) {
        k4m k4mVar;
        p1f0 p1f0Var = this.i;
        ((TextView) p1f0Var.g).setText(vnp0Var.a);
        ((TextView) p1f0Var.f).setText(vnp0Var.b);
        int iC = l1d.C(vnp0Var.i);
        if (iC == 0) {
            k4mVar = k4m.a;
        } else if (iC == 1) {
            k4mVar = k4m.b;
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            k4mVar = k4m.d;
        }
        this.X.c(k4mVar);
        ((ContextMenuButton) p1f0Var.c).setOnClickListener(new cvr(vnp0Var, this, (byte) 5));
        ((ConstraintLayout) p1f0Var.a).setOnClickListener(new bds(this, (byte) 0));
        ((VideoSurfaceView) p1f0Var.h).setOnClickListener(new bds(this, (byte) 1));
        ((PlayButtonView) p1f0Var.e).setOnClickListener(new bds(this, (byte) 2));
    }

    public final View getView() {
        return (ConstraintLayout) this.i.a;
    }

    public final void k() {
        p1f0 p1f0Var = this.i;
        ((AppCompatImageView) p1f0Var.b).animate().alpha(1.0f).setDuration(300L).setListener(null);
        ((VideoSurfaceView) p1f0Var.h).animate().setDuration(300L).alpha(0.0f).setListener(null);
    }

    public final void n(iu30 iu30Var) {
        this.N0 = iu30Var;
    }
}
