package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomViewArea;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x37 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public x37(ArtworkView artworkView, o17 o17Var) {
        this.a = (byte) 1;
        this.b = artworkView;
        this.c = o17Var;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View, com.spotify.creativeworkplatform.encore.elements.ArtworkView] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        int iQ = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ArtworkShadow artworkShadow = (ArtworkShadow) obj;
                int i9 = ArtworkShadow.e;
                artworkShadow.b = artworkShadow.c((ArtworkView) obj2);
                artworkShadow.a.setShadowLayer(artworkShadow.getShadowBlurRadius(), 0.0f, 0.0f, artworkShadow.getContext().getColor(2131100152));
                artworkShadow.invalidate();
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                String str = ArtworkView.S0;
                ((ArtworkView) obj2).g((o17) obj);
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ?? r6 = (com.spotify.creativeworkplatform.encore.elements.ArtworkView) obj;
                if (r6.getWidth() > 0 && r6.getHeight() > 0) {
                    r6.c((p17) obj2);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                ((ven0) obj2).setValue(new mmr0(Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight())));
                break;
            case 4:
                ((avn) obj).k((vsn) obj2, view.getWidth());
                break;
            case 5:
                view.removeOnLayoutChangeListener(this);
                wdm wdmVar = (wdm) obj;
                float height = ((MotionLayout) wdmVar.b).getHeight() * 0.3f;
                TextView textView = (TextView) wdmVar.Z;
                Float fValueOf = Float.valueOf(height);
                rr80 rr80VarO = yoi1.O(ebp1.m(56, 24, -1), 1);
                rr80 rr80Var = o9m.a;
                aiq0.a(textView, new n9m(textView, textView, (String) obj2, fValueOf, rr80VarO, (byte) 0));
                break;
            case 6:
                view.removeOnLayoutChangeListener(this);
                lgo lgoVar = (lgo) ((yfo) obj).d;
                int[] iArr = (int[]) ((rm5) obj2).a;
                int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                ((w470) lgoVar.b).j(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
                break;
            case 7:
                ((wnr) obj).a((View) obj2);
                break;
            case 8:
                view.removeOnLayoutChangeListener(this);
                nwr nwrVar = (nwr) obj;
                ixg ixgVarF = ((gw70) nwrVar.d).f(((i1x) obj2).c);
                Context context = (Context) nwrVar.c;
                g4b1 g4b1Var = new g4b1(context, j4b1.L6, a8o.y(24.0f, context.getResources()));
                g4b1Var.setAlpha(153);
                ixgVarF.m(new x10(g4b1Var, 0.4f));
                ixgVarF.p(view.getWidth(), view.getHeight(), 1);
                ixgVarF.d();
                ixgVarF.s(new fr31(Integer.valueOf(((Number) ((idd1) nwrVar.f).getValue()).intValue())));
                ixgVarF.k((ImageView) ((yjq) nwrVar.e).f, new hur(nwrVar, view, (byte) 2));
                break;
            case 9:
                ((vis) obj).c.e.post((uis) obj2);
                break;
            case 10:
                ((vis) obj).c.s.post((uis) obj2);
                break;
            case 11:
                view.removeOnLayoutChangeListener(this);
                dtw dtwVar = (dtw) obj2;
                sqw sqwVar = dtwVar.l;
                sqwVar.h = null;
                sqwVar.i = false;
                t8r0 t8r0Var = dtwVar.x;
                if (t8r0Var != null) {
                    t8r0 t8r0Var2 = ((rl1) t8r0Var.b).b ? null : t8r0Var;
                    if (t8r0Var2 != null) {
                        dtwVar.l(t8r0Var2);
                    }
                }
                break;
            case 12:
                ((View) obj).setPadding(0, 0, 0, ((ViewGroup) ((kkn0) obj2).a).getHeight() - i2);
                break;
            case 13:
                int i10 = i4 - i2;
                n811 n811Var = (n811) obj;
                if (i10 != n811Var.a) {
                    n811Var.a = i10;
                    ((iu30) obj2).invoke(Integer.valueOf(i10));
                }
                break;
            case 14:
                view.removeOnLayoutChangeListener(this);
                h5t0 h5t0Var = (h5t0) obj;
                m511 m511VarW = hap1.w((View) obj2);
                Rect rect = new Rect((int) m511VarW.a, (int) m511VarW.b, (int) m511VarW.c, (int) m511VarW.d);
                h5t0Var.e = rect;
                Object objInvoke = h5t0Var.b.invoke(Boolean.valueOf(h5t0.c(rect, h5t0Var.d)));
                if (objInvoke != null) {
                    h5t0Var.c.invoke(objInvoke);
                }
                break;
            case 15:
                view.removeOnLayoutChangeListener(this);
                bjx bjxVar = ((tux0) obj).a;
                View[] viewArr = (View[]) obj2;
                mf20 mf20Var = new mf20(z561.U(xox0.t, z561.U(new v3v0(viewArr, (byte) 10), new i46((ConstraintLayout) bjxVar.b, (byte) 8))));
                while (mf20Var.hasNext()) {
                    iQ += crn1.q((View) mf20Var.next());
                }
                mf20 mf20Var2 = new mf20(z561.f0(xox0.i, z561.T(xox0.h, new i46(new z4v(new mmr0(Integer.valueOf(((ConstraintLayout) bjxVar.b).getHeight() - iQ), (Object) null), f46.I(viewArr), null), (byte) 3))));
                while (mf20Var2.hasNext()) {
                    ((View) mf20Var2.next()).setVisibility(8);
                }
                break;
            case 16:
                view.removeOnLayoutChangeListener(this);
                ImageView imageView = (ImageView) obj;
                if (imageView.isAttachedToWindow()) {
                    ((lnc1) obj2).b(imageView);
                }
                break;
            case 17:
                view.removeOnLayoutChangeListener(this);
                int[] iArr2 = (int[]) obj2;
                bs51.t((RecyclerView) obj, Arrays.copyOf(iArr2, iArr2.length));
                break;
            case 18:
                view.removeOnLayoutChangeListener(this);
                ZoomImageView zoomImageView = (ZoomImageView) obj;
                RectF rectF = zoomImageView.g;
                rectF.set((RectF) obj2);
                zoomImageView.setTranslationX(rectF.left);
                zoomImageView.setTranslationY(rectF.top);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                f180 f180Var = (f180) obj;
                ZoomImageView zoomImageViewC = f180Var.a.c(f180Var.b);
                ZoomViewArea zoomViewArea = (ZoomViewArea) obj2;
                zoomViewArea.b = zoomImageViewC;
                zoomViewArea.addView(zoomImageViewC.getView());
                break;
        }
    }

    public /* synthetic */ x37(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
