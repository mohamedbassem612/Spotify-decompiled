package com.spotify.messaging.messagingplatformimpl.slate;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.doz0;
import p.fmz0;
import p.gjs0;
import p.hjs0;
import p.ijs0;
import p.k1e;
import p.m891;
import p.mre0;
import p.std;
import p.ttd;
import p.v891;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/spotify/messaging/messagingplatformimpl/slate/SlateView;", "Lp/std;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/m891;", "decor", "Lp/rih1;", "setHeader", "(Lp/m891;)V", "setFooter", "Lp/v891;", "policy", "setDismissalPolicy", "(Lp/v891;)V", "interactionListener", "setInteractionListener", "(Lp/std;)V", "src_main_java_com_spotify_messaging_messagingplatformimpl-messagingplatformimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public class SlateView extends RelativeLayout implements std {
    public final mre0 a;
    public final CardView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final View e;
    public k1e f;
    public std g;
    public ttd h;
    public final int i;

    public SlateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new mre0(this, (byte) 28);
        this.i = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, doz0.a, 0, 0);
            try {
                int i2 = typedArrayObtainStyledAttributes.getBoolean(0, false) ? 2 : 1;
                typedArrayObtainStyledAttributes.recycle();
                this.i = i2;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        LayoutInflater.from(getContext()).inflate(2131626166, this);
        setBackgroundColor(Color.parseColor("#70121314"));
        this.b = findViewById(2131431002);
        this.c = (FrameLayout) findViewById(2131431005);
        this.d = (FrameLayout) findViewById(2131431004);
        this.e = findViewById(2131431003);
    }

    public final void a() {
        std stdVar = this.g;
        if (stdVar != null) {
            stdVar.a();
        }
    }

    public final void b() {
        std stdVar = this.g;
        if (stdVar != null) {
            stdVar.b();
        }
    }

    public final void c(double d, float f, int i) {
        std stdVar = this.g;
        if (stdVar != null) {
            stdVar.c(d, f, i);
        }
    }

    public final void d() {
        std stdVar = this.g;
        if (stdVar != null) {
            stdVar.d();
        }
    }

    public final void e(int i) {
        std stdVar = this.g;
        if (stdVar != null) {
            stdVar.e(i);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ijs0 generateLayoutParams(AttributeSet attributeSet) {
        gjs0 gjs0Var;
        Context context = getContext();
        ijs0 ijs0Var = new ijs0(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fmz0.a);
        float fraction = typedArrayObtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            gjs0Var = new gjs0();
            gjs0Var.a = fraction;
        } else {
            gjs0Var = null;
        }
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.b = fraction2;
        }
        float fraction3 = typedArrayObtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.c = fraction3;
            gjs0Var.d = fraction3;
            gjs0Var.e = fraction3;
            gjs0Var.f = fraction3;
        }
        float fraction4 = typedArrayObtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.c = fraction4;
        }
        float fraction5 = typedArrayObtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.d = fraction5;
        }
        float fraction6 = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.e = fraction6;
        }
        float fraction7 = typedArrayObtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.f = fraction7;
        }
        float fraction8 = typedArrayObtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.g = fraction8;
        }
        float fraction9 = typedArrayObtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.h = fraction9;
        }
        float fraction10 = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (gjs0Var == null) {
                gjs0Var = new gjs0();
            }
            gjs0Var.i = fraction10;
        }
        typedArrayObtainStyledAttributes.recycle();
        ijs0Var.a = gjs0Var;
        return ijs0Var;
    }

    public final void g(int i, int i2) {
        boolean z;
        mre0 mre0Var = this.a;
        mre0Var.getClass();
        int size = View.MeasureSpec.getSize(i);
        SlateView slateView = (SlateView) mre0Var.b;
        int paddingLeft = (size - slateView.getPaddingLeft()) - slateView.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - slateView.getPaddingTop()) - slateView.getPaddingBottom();
        int childCount = slateView.getChildCount();
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = slateView.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof ijs0) {
                ijs0 ijs0Var = (ijs0) layoutParams;
                gjs0 gjs0Var = ijs0Var.a;
                if (gjs0Var == null) {
                    gjs0Var = new gjs0();
                    ijs0Var.a = gjs0Var;
                }
                hjs0 hjs0Var = gjs0Var.j;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i4 = ((ViewGroup.LayoutParams) marginLayoutParams).width;
                ((ViewGroup.MarginLayoutParams) hjs0Var).width = i4;
                int i5 = ((ViewGroup.LayoutParams) marginLayoutParams).height;
                ((ViewGroup.MarginLayoutParams) hjs0Var).height = i5;
                boolean z3 = (hjs0Var.b || i4 == 0) && gjs0Var.a < 0.0f;
                boolean z4 = (hjs0Var.a || i5 == 0) && gjs0Var.b < 0.0f;
                float f = gjs0Var.a;
                if (f >= 0.0f) {
                    ((ViewGroup.LayoutParams) marginLayoutParams).width = Math.round(paddingLeft * f);
                }
                float f2 = gjs0Var.b;
                if (f2 >= 0.0f) {
                    ((ViewGroup.LayoutParams) marginLayoutParams).height = Math.round(size2 * f2);
                }
                float f3 = gjs0Var.i;
                if (f3 >= 0.0f) {
                    if (z3) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).width = Math.round(((ViewGroup.LayoutParams) marginLayoutParams).height * f3);
                        hjs0Var.b = true;
                    }
                    if (z4) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).height = Math.round(((ViewGroup.LayoutParams) marginLayoutParams).width / gjs0Var.i);
                        hjs0Var.a = true;
                    }
                }
                ((ViewGroup.MarginLayoutParams) hjs0Var).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) hjs0Var).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) hjs0Var).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) hjs0Var).bottomMargin = marginLayoutParams.bottomMargin;
                hjs0Var.setMarginStart(marginLayoutParams.getMarginStart());
                hjs0Var.setMarginEnd(marginLayoutParams.getMarginEnd());
                float f4 = gjs0Var.c;
                if (f4 >= 0.0f) {
                    marginLayoutParams.leftMargin = Math.round(paddingLeft * f4);
                }
                float f5 = gjs0Var.d;
                if (f5 >= 0.0f) {
                    marginLayoutParams.topMargin = Math.round(size2 * f5);
                }
                float f6 = gjs0Var.e;
                if (f6 >= 0.0f) {
                    marginLayoutParams.rightMargin = Math.round(paddingLeft * f6);
                }
                float f7 = gjs0Var.f;
                if (f7 >= 0.0f) {
                    marginLayoutParams.bottomMargin = Math.round(size2 * f7);
                }
                float f8 = gjs0Var.g;
                if (f8 >= 0.0f) {
                    marginLayoutParams.setMarginStart(Math.round(paddingLeft * f8));
                    z = true;
                } else {
                    z = false;
                }
                float f9 = gjs0Var.h;
                if (f9 >= 0.0f) {
                    marginLayoutParams.setMarginEnd(Math.round(paddingLeft * f9));
                } else {
                    z2 = z;
                }
                if (z2) {
                    WeakHashMap weakHashMap = b8k1.a;
                    marginLayoutParams.resolveLayoutDirection(childAt.getLayoutDirection());
                }
            }
            i3++;
        }
        super.onMeasure(i, i2);
        int childCount2 = slateView.getChildCount();
        boolean z5 = false;
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = slateView.getChildAt(i6);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if (layoutParams2 instanceof ijs0) {
                ijs0 ijs0Var2 = (ijs0) layoutParams2;
                gjs0 gjs0Var2 = ijs0Var2.a;
                if (gjs0Var2 == null) {
                    gjs0Var2 = new gjs0();
                    ijs0Var2.a = gjs0Var2;
                }
                hjs0 hjs0Var2 = gjs0Var2.j;
                if ((childAt2.getMeasuredWidthAndState() & (-16777216)) == 16777216 && gjs0Var2.a >= 0.0f && ((ViewGroup.MarginLayoutParams) hjs0Var2).width == -2) {
                    layoutParams2.width = -2;
                    z5 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & (-16777216)) == 16777216 && gjs0Var2.b >= 0.0f && ((ViewGroup.MarginLayoutParams) hjs0Var2).height == -2) {
                    layoutParams2.height = -2;
                    z5 = true;
                }
            }
        }
        if (z5) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ijs0(-1, -1);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        SlateView slateView = (SlateView) this.a.b;
        int childCount = slateView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = slateView.getChildAt(i5).getLayoutParams();
            if (layoutParams instanceof ijs0) {
                ijs0 ijs0Var = (ijs0) layoutParams;
                gjs0 gjs0Var = ijs0Var.a;
                if (gjs0Var == null) {
                    gjs0Var = new gjs0();
                    ijs0Var.a = gjs0Var;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                hjs0 hjs0Var = gjs0Var.j;
                if (!hjs0Var.b) {
                    ((ViewGroup.LayoutParams) marginLayoutParams).width = ((ViewGroup.MarginLayoutParams) hjs0Var).width;
                }
                if (!hjs0Var.a) {
                    ((ViewGroup.LayoutParams) marginLayoutParams).height = ((ViewGroup.MarginLayoutParams) hjs0Var).height;
                }
                hjs0Var.b = false;
                hjs0Var.a = false;
                marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) hjs0Var).leftMargin;
                marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) hjs0Var).topMargin;
                marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) hjs0Var).rightMargin;
                marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) hjs0Var).bottomMargin;
                marginLayoutParams.setMarginStart(hjs0Var.getMarginStart());
                marginLayoutParams.setMarginEnd(hjs0Var.getMarginEnd());
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        k1e k1eVar = this.f;
        if (k1eVar == null || k1eVar.e != size || k1eVar.d != size2) {
            Resources resources = getResources();
            k1e k1eVar2 = new k1e((byte) 2);
            float integer = resources.getInteger(2131492872) / 100.0f;
            float integer2 = size2 * (resources.getInteger(2131492873) / 100.0f);
            float f = size / integer;
            if (integer2 > f) {
                integer2 = f;
            }
            int i3 = (int) integer2;
            k1eVar2.b = i3;
            k1eVar2.c = (int) (i3 * integer);
            k1eVar2.d = size2;
            k1eVar2.e = size;
            this.f = k1eVar2;
            CardView cardView = this.b;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cardView.getLayoutParams();
            if (this.i == 2) {
                layoutParams.height = k1eVar2.d;
                layoutParams.width = k1eVar2.e;
                cardView.setRadius(0.0f);
            } else {
                layoutParams.height = k1eVar2.b;
                layoutParams.width = k1eVar2.c;
                cardView.setRadius(20.0f);
            }
        }
        g(i, i2);
    }

    public final void setDismissalPolicy(v891 policy) {
        ttd ttdVar = this.h;
        if (ttdVar != null) {
            ttdVar.t = policy.c(this.i);
        }
    }

    public final void setFooter(m891 decor) {
        FrameLayout frameLayout = this.d;
        frameLayout.removeAllViews();
        LayoutInflater.from(getContext());
        frameLayout.addView(decor.getView());
    }

    public final void setHeader(m891 decor) {
        FrameLayout frameLayout = this.c;
        frameLayout.removeAllViews();
        LayoutInflater.from(getContext());
        frameLayout.addView(decor.getView());
    }

    public final void setInteractionListener(std interactionListener) {
        this.g = interactionListener;
    }

    public SlateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SlateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SlateView(Context context) {
        this(context, null, 0, 6, null);
    }
}
