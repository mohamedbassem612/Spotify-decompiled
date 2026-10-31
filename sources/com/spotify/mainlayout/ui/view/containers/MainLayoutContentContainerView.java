package com.spotify.mainlayout.ui.view.containers;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p.apo;
import p.b0k;
import p.bbr0;
import p.bpb1;
import p.bsc0;
import p.bzf0;
import p.c7e;
import p.coz0;
import p.cp20;
import p.czf0;
import p.d0e0;
import p.d4o1;
import p.dug;
import p.dv20;
import p.dzf0;
import p.e4f0;
import p.een;
import p.eq80;
import p.er31;
import p.erl1;
import p.fe5;
import p.gfh0;
import p.gio1;
import p.gvg;
import p.gzf0;
import p.h311;
import p.hmb0;
import p.hrr0;
import p.hwb;
import p.hzf0;
import p.hzj;
import p.i1p1;
import p.idd1;
import p.iu30;
import p.izf0;
import p.j2i;
import p.jzf0;
import p.m0n0;
import p.mbf0;
import p.nbf0;
import p.nim0;
import p.nk80;
import p.nko1;
import p.nyx;
import p.o6;
import p.otw;
import p.p3d1;
import p.p3v;
import p.p5x0;
import p.pzf0;
import p.qae0;
import p.qim0;
import p.qy90;
import p.rc11;
import p.rzf0;
import p.t1c;
import p.tgp1;
import p.tob1;
import p.u7h;
import p.uyn1;
import p.v8r;
import p.vqd0;
import p.vzf0;
import p.wat;
import p.wpb1;
import p.wux;
import p.x340;
import p.xos0;
import p.xpw;
import p.y580;
import p.z4h1;
import p.z4p1;
import p.z95;
import p.zob1;
import p.zr7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010\"\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR+\u0010&\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR+\u0010-\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R/\u00104\u001a\u0004\u0018\u00010.2\b\u0010\u0010\u001a\u0004\u0018\u00010.8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0012\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00069²\u0006\u0010\u00106\u001a\u0004\u0018\u0001058\n@\nX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lcom/spotify/mainlayout/ui/view/containers/MainLayoutContentContainerView;", "Lp/o6;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lp/wat;", "N0", "Lp/znb0;", "getDensity", "()Lp/wat;", "density", "Lp/u7h;", "<set-?>", "Q0", "Lp/ven0;", "getBackgroundColor-0d7_KjU", "()J", "setBackgroundColor-8_81llA", "(J)V", "backgroundColor", "Lp/p3v;", "R0", "getCornerRadius-D9Ej5fM", "()F", "setCornerRadius-0680j_4", "(F)V", "cornerRadius", "S0", "getContentMarginTop-D9Ej5fM", "setContentMarginTop-0680j_4", "contentMarginTop", "T0", "getContentMarginBottom-D9Ej5fM", "setContentMarginBottom-0680j_4", "contentMarginBottom", "Lp/jzf0;", "U0", "getContentContext", "()Lp/jzf0;", "setContentContext", "(Lp/jzf0;)V", "contentContext", "Lp/gzf0;", "V0", "getContentDetails", "()Lp/gzf0;", "setContentDetails", "(Lp/gzf0;)V", "contentDetails", "", "isPopulated", "marginTop", "marginBottom", "src_main_java_com_spotify_mainlayout_ui_view-view"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class MainLayoutContentContainerView extends o6 {
    public static final /* synthetic */ int W0 = 0;
    public final idd1 N0;
    public final bpb1 O0;
    public final bpb1 P0;
    public final hrr0 Q0;
    public final hrr0 R0;
    public final hrr0 S0;
    public final hrr0 T0;
    public final hrr0 U0;
    public final hrr0 V0;

    public MainLayoutContentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.N0 = new idd1(new izf0(this, (byte) 0));
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.O0 = bpb1VarB;
        this.P0 = bpb1VarB;
        this.Q0 = v8r.q(new u7h(u7h.j));
        this.R0 = v8r.q(new p3v(0.0f));
        this.S0 = v8r.q(new p3v(0.0f));
        this.T0 = v8r.q(new p3v(0.0f));
        this.U0 = v8r.q(new jzf0(false));
        this.V0 = v8r.q((Object) null);
        setViewCompositionStrategy(p5x0.W0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, coz0.c, 0, 0);
        m80setBackgroundColor8_81llA(z4p1.e(typedArrayObtainStyledAttributes.getColor(0, 0)));
        m83setCornerRadius0680j_4(typedArrayObtainStyledAttributes.getDimension(1, 0.0f) / typedArrayObtainStyledAttributes.getResources().getDisplayMetrics().density);
        m82setContentMarginTop0680j_4(typedArrayObtainStyledAttributes.getDimension(3, 0.0f) / typedArrayObtainStyledAttributes.getResources().getDisplayMetrics().density);
        m81setContentMarginBottom0680j_4(typedArrayObtainStyledAttributes.getDimension(2, 0.0f) / typedArrayObtainStyledAttributes.getResources().getDisplayMetrics().density);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jzf0 getContentContext() {
        return (jzf0) this.U0.getValue();
    }

    private final gzf0 getContentDetails() {
        return (gzf0) this.V0.getValue();
    }

    private final wat getDensity() {
        return (wat) this.N0.getValue();
    }

    private final void setContentContext(jzf0 jzf0Var) {
        this.U0.setValue(jzf0Var);
    }

    private final void setContentDetails(gzf0 gzf0Var) {
        this.V0.setValue(gzf0Var);
    }

    public final void A(gzf0 gzf0Var, String str, xpw xpwVar, Object obj, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1836352544);
        int i2 = i | (x340Var.g(str) ? 32 : 16) | (x340Var.i(xpwVar) ? 256 : 128) | (x340Var.g(obj) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1169) != 1168)) {
            int i3 = i2 >> 3;
            otw.c(xpwVar, obj, (qim0) null, wpb1.C(gvg.h("MainLayout.", str, ".", rc11.a.b(xpwVar.getClass()).o()), xpwVar, obj, x340Var, (i3 & 112) | 3072 | (i3 & 896), 0), x340Var, (i2 >> 6) & 126, 4);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hzf0(this, gzf0Var, str, xpwVar, obj, i);
        }
    }

    public final void B(gzf0 gzf0Var, bzf0 bzf0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-921318491);
        int i2 = (x340Var.i(gzf0Var) ? 4 : 2) | i | (x340Var.g(bzf0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            A(gzf0Var, gzf0Var.a, bzf0Var.a, bzf0Var.b, x340Var, (i2 & 14) | ((i2 << 6) & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c7e(this, gzf0Var, bzf0Var, i, (byte) 3);
        }
    }

    public final void C(gzf0 gzf0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1281297385);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gzf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(1808172900, new qae0(gzf0Var, this, j2iVar, (byte) 20), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, gzf0Var, j2iVar, i, (byte) 10);
        }
    }

    public final void E(String str, pzf0 pzf0Var, zob1 zob1Var, bbr0 bbr0Var, eq80 eq80Var, m0n0 m0n0Var, rzf0 rzf0Var, iu30 iu30Var, qim0 qim0Var) {
        setContentDetails(new gzf0(str, bbr0Var, new bsc0(eq80Var, this, (byte) 23), m0n0Var, rzf0Var, (erl1) iu30Var.invoke(rzf0Var), qim0Var, new cp20(new e4f0(pzf0Var, (byte) 15), zob1Var)));
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(269393382);
        int i2 = (x340Var.g(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gzf0 contentDetails = getContentDetails();
            if (contentDetails == null) {
                x340Var.i0(-1795597070);
            } else {
                x340Var.i0(1189003503);
                y(contentDetails, x340Var, (i2 << 3) & 112);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mbf0(this, i, (byte) 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        gzf0 contentDetails = getContentDetails();
        if (contentDetails != null) {
            hwb hwbVar = vzf0.i;
            erl1 erl1Var = contentDetails.f;
            wat density = getDensity();
            hwbVar.getClass();
            WindowInsets windowInsetsA = hwb.A(windowInsets, nk80.c(0, erl1Var.c(density), 0, erl1Var.d(density)));
            if (windowInsetsA != null) {
                windowInsets = windowInsetsA;
            }
        }
        return super/*android.view.View*/.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m76getBackgroundColor0d7_KjU() {
        return ((u7h) this.Q0.getValue()).a;
    }

    /* JADX INFO: renamed from: getContentMarginBottom-D9Ej5fM, reason: not valid java name */
    public final float m77getContentMarginBottomD9Ej5fM() {
        return ((p3v) this.T0.getValue()).a;
    }

    /* JADX INFO: renamed from: getContentMarginTop-D9Ej5fM, reason: not valid java name */
    public final float m78getContentMarginTopD9Ej5fM() {
        return ((p3v) this.S0.getValue()).a;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m79getCornerRadiusD9Ej5fM() {
        return ((p3v) this.R0.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
        boolean zIsShown = isShown();
        if (getContentContext().a != zIsShown) {
            getContentContext().getClass();
            setContentContext(new jzf0(zIsShown));
        }
    }

    /* JADX INFO: renamed from: setBackgroundColor-8_81llA, reason: not valid java name */
    public final void m80setBackgroundColor8_81llA(long j) {
        this.Q0.setValue(new u7h(j));
    }

    /* JADX INFO: renamed from: setContentMarginBottom-0680j_4, reason: not valid java name */
    public final void m81setContentMarginBottom0680j_4(float f) {
        this.T0.setValue(new p3v(f));
    }

    /* JADX INFO: renamed from: setContentMarginTop-0680j_4, reason: not valid java name */
    public final void m82setContentMarginTop0680j_4(float f) {
        this.S0.setValue(new p3v(f));
    }

    /* JADX INFO: renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m83setCornerRadius0680j_4(float f) {
        this.R0.setValue(new p3v(f));
    }

    public final void y(gzf0 gzf0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(145784573);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gzf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            C(gzf0Var, apo.r(-1755239842, new d0e0(gzf0Var, this, (byte) 27), x340Var), x340Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, gzf0Var, i, (byte) 4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void z(gzf0 gzf0Var, dzf0 dzf0Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1563590377);
        int i2 = i | (x340Var.i(gzf0Var) ? 4 : 2) | (x340Var.g(dzf0Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            tob1 tob1VarA = z95.a(z ? m78getContentMarginTopD9Ej5fM() : 0.0f, (fe5) null, "contentMarginTop", x340Var, 384, 10);
            tob1 tob1VarA2 = z95.a(z ? m77getContentMarginBottomD9Ej5fM() : 0.0f, (fe5) null, "contentMarginBottom", x340Var, 384, 10);
            float f = ((p3v) tob1VarA.getValue()).a;
            float f2 = ((p3v) tob1VarA2.getValue()).a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, f, 0.0f, f2, 5);
            if (p3v.b(m79getCornerRadiusD9Ej5fM(), 0.0f) > 0) {
                qim0VarB = qim0VarB.then(i1p1.q(nim0Var, er31.b(m79getCornerRadiusD9Ej5fM())));
            }
            if (!z4h1.b(m76getBackgroundColor0d7_KjU(), u7h.j)) {
                qim0VarB = qim0VarB.then(dug.f(nim0Var, m76getBackgroundColor0d7_KjU(), d4o1.a));
            }
            qim0 qim0VarThen = qim0VarB.then(gzf0Var.g);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (dzf0Var instanceof bzf0) {
                x340Var.i0(-50411535);
                B(gzf0Var, (bzf0) dzf0Var, x340Var, ((i2 >> 3) & 896) | (i2 & 126));
                x340Var.r(false);
            } else {
                if (!(dzf0Var instanceof czf0)) {
                    throw p3d1.k(x340Var, -50413331, false);
                }
                x340Var.i0(-50409433);
                dv20.l(0, ((czf0) dzf0Var).b, x340Var, false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(this, gzf0Var, dzf0Var, z, i, (byte) 10);
        }
    }

    public MainLayoutContentContainerView(Context context) {
        this(context, null);
    }
}
