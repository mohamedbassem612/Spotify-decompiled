package p;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.speed.SpeedBadgeIconView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.TextStyle;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n2o implements isw {
    public final /* synthetic */ byte a;
    public final Context b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public final View t;

    public n2o(Context context, iu30 iu30Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = context;
                View viewInflate = LayoutInflater.from(context).inflate(2131626277, (ViewGroup) null);
                this.c = viewInflate;
                TextView textView = (TextView) viewInflate.findViewById(2131431483);
                this.d = textView;
                TextView textView2 = (TextView) viewInflate.findViewById(2131431482);
                this.e = textView2;
                this.f = (QueuedBadgeView) viewInflate.findViewById(2131431480);
                this.g = (EnhancedBadgeView) viewInflate.findViewById(2131431477);
                this.h = (ContentRestrictionBadgeView) viewInflate.findViewById(2131431478);
                this.i = (SpeedBadgeIconView) viewInflate.findViewById(2131431481);
                this.t = viewInflate.findViewById(2131431479);
                textView.setSelected(true);
                textView2.setSelected(true);
                textView.setOnClickListener(new zl51(iu30Var, (byte) 12));
                textView2.setOnClickListener(new zl51(iu30Var, (byte) 13));
                if (viewInflate.isLaidOut() && !viewInflate.isLayoutRequested()) {
                    viewInflate.setPivotX(0.0f);
                    viewInflate.setPivotY(viewInflate.getMeasuredHeight());
                } else {
                    viewInflate.addOnLayoutChangeListener(new eg7(this, (byte) 26));
                }
                break;
            default:
                this.b = context;
                Drawable drawable = context.getDrawable(2131232966);
                drawable.getClass();
                drawable.setTintList(x74.E(context, 2131101340));
                this.c = drawable;
                this.d = context.getResources().getString(2131959270);
                this.e = context.getResources().getString(2131959269);
                this.f = context.getResources().getString(2131959271);
                Drawable drawableB = b(2131232516, false);
                this.g = drawableB;
                this.h = b(2131232516, true);
                this.i = b(2131232519, true);
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
                appCompatImageButton.setBackground(null);
                appCompatImageButton.setContentDescription(context.getResources().getString(2131959251));
                appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                appCompatImageButton.setImageDrawable(drawableB);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033);
                appCompatImageButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                appCompatImageButton.setOnClickListener(new jn90(iu30Var, (byte) 28));
                this.t = appCompatImageButton;
                break;
        }
    }

    public static final Object c(x8j1 x8j1Var, n2o n2oVar, ViewGroup viewGroup, dn60 dn60Var, a8d1 a8d1Var) {
        Object objCollect = m4c.x(x8j1Var.t, (FrameLayout) ((h72) ((yir) n2oVar.g).c).b, viewGroup, dn60Var).collect(new i6e1(n2oVar, x8j1Var, (byte) 21), a8d1Var);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    public static String f(Context context, String str) {
        if (str != null) {
            return context.getString(2131954702, str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x025c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0266  */
    /* JADX WARN: Code duplicated, block: B:98:0x0269  */
    /* JADX WARN: Code duplicated, block: B:99:0x0271  */
    public final void a(Object obj, ysw yswVar) {
        String string;
        String str;
        String string2;
        String string3;
        TextView textView;
        String str2;
        int i;
        int i2;
        int iOrdinal;
        k4m k4mVar;
        mas0 mas0Var;
        String str3;
        qhl layoutParams;
        p57 p57Var;
        byte b = this.a;
        Context context = this.b;
        Object obj2 = this.f;
        AppCompatImageButton appCompatImageButton = this.t;
        switch (b) {
            case 0:
                c2o c2oVar = (c2o) obj;
                FrameLayout frameLayout = (FrameLayout) appCompatImageButton;
                if (c2oVar.equals(u1o.a)) {
                    frameLayout.removeAllViews();
                    return;
                }
                if (!(c2oVar instanceof v1o)) {
                    eg.o();
                    return;
                }
                v1o v1oVar = (v1o) c2oVar;
                String str4 = v1oVar.c;
                String str5 = v1oVar.b;
                b2o b2oVar = v1oVar.d;
                String str6 = v1oVar.f;
                String str7 = v1oVar.g;
                if (b2oVar instanceof w1o) {
                    w1o w1oVar = (w1o) b2oVar;
                    long j = w1oVar.a;
                    String str8 = w1oVar.b;
                    String str9 = v1oVar.e;
                    if (str8 != null) {
                        ZoneOffset zoneOffset = ZoneOffset.UTC;
                        d(new gt6(str8, (String) null, (String) null, str9, str5, str4, LocalDateTime.ofEpochSecond(j, 0, zoneOffset).getDayOfMonth(), LocalDateTime.ofEpochSecond(j, 0, zoneOffset).getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), str7 == null ? f(context, str6) : str7, str7 != null, false, 6));
                        return;
                    } else {
                        ZoneOffset zoneOffset2 = ZoneOffset.UTC;
                        e(new jt6((String) null, (String) null, str9, str5, str4, LocalDateTime.ofEpochSecond(j, 0, zoneOffset2).getDayOfMonth(), LocalDateTime.ofEpochSecond(j, 0, zoneOffset2).getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), str7 == null ? f(context, str6) : str7, str7 != null, 3));
                        return;
                    }
                }
                if (!(b2oVar instanceof z1o)) {
                    if (b2oVar instanceof a2o) {
                        a2o a2oVar = (a2o) b2oVar;
                        d(new gt6(a2oVar.b, a2oVar.a, "video", v1oVar.e, str5, str4, 0, (String) null, str7 == null ? f(context, str6) : str7, str7 != null, true, 192));
                        return;
                    } else if (b2oVar instanceof x1o) {
                        x1o x1oVar = (x1o) b2oVar;
                        d(new gt6(x1oVar.c, x1oVar.b, x1oVar.a, v1oVar.e, str5, str4, 0, (String) null, str7 == null ? f(context, str6) : str7, str7 != null, false, 192));
                        return;
                    } else if (!(b2oVar instanceof y1o)) {
                        eg.o();
                        return;
                    } else {
                        y1o y1oVar = (y1o) b2oVar;
                        e(new jt6(y1oVar.b, y1oVar.a, v1oVar.e, str5, str4, 0, (String) null, str7 == null ? f(context, str6) : str7, str7 != null, 96));
                        return;
                    }
                }
                mt6 mt6Var = new mt6(new g07(((z1o) b2oVar).b), v1oVar.e, str5, str4, context.getString(2131954701), str7);
                if (((qzh) this.i) == null) {
                    ufx ufxVar = ((hjc) this.c).b;
                    fcs fcsVar = new fcs(ufxVar.a, ufxVar.b, (byte) 3);
                    this.i = fcsVar;
                    fcsVar.n(new k2o(this, (byte) 1));
                }
                qzh qzhVar = (qzh) this.i;
                if (qzhVar == null) {
                    u890.C("merchCardComponent");
                    throw null;
                }
                if (!u890.j(qzhVar.getView().getParent(), frameLayout)) {
                    frameLayout.removeAllViews();
                    qzh qzhVar2 = (qzh) this.i;
                    if (qzhVar2 == null) {
                        u890.C("merchCardComponent");
                        throw null;
                    }
                    frameLayout.addView(qzhVar2.getView());
                }
                qzh qzhVar3 = (qzh) this.i;
                if (qzhVar3 != null) {
                    qzhVar3.f(mt6Var);
                    return;
                } else {
                    u890.C("merchCardComponent");
                    throw null;
                }
            case 1:
                ue21 ue21Var = (ue21) obj;
                AppCompatImageButton appCompatImageButton2 = appCompatImageButton;
                appCompatImageButton2.setEnabled(ue21Var.b);
                int i3 = ue21Var.c;
                appCompatImageButton2.setActivated(i3 != 1);
                int iC = l1d.C(i3);
                if (iC == 0) {
                    appCompatImageButton2.setImageDrawable((Drawable) this.g);
                    b8k1.t(appCompatImageButton2, (String) this.d);
                    return;
                } else if (iC == 1) {
                    appCompatImageButton2.setImageDrawable((Drawable) this.h);
                    b8k1.t(appCompatImageButton2, (String) this.e);
                    return;
                } else if (iC != 2) {
                    eg.o();
                    return;
                } else {
                    appCompatImageButton2.setImageDrawable((Drawable) this.i);
                    b8k1.t(appCompatImageButton2, (String) obj2);
                    return;
                }
            case 2:
                mof1 mof1Var = (mof1) obj;
                boolean z = mof1Var.e;
                boolean z2 = mof1Var.d;
                l4m l4mVar = mof1Var.f;
                TextView textView2 = (TextView) this.d;
                String str10 = mof1Var.a;
                if (!str10.contentEquals(textView2.getText())) {
                    textView2.setText(str10);
                    b8k1.p(textView2, new zdc((byte) 20));
                }
                int iOrdinal2 = l4mVar.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        string = context.getString(2131955845);
                    } else {
                        if (iOrdinal2 != 2) {
                            eg.o();
                            return;
                        }
                        str = null;
                    }
                    if (z2) {
                        string2 = context.getString(2131960978);
                    } else {
                        string2 = null;
                    }
                    if (z) {
                        string3 = context.getString(2131960808);
                    } else {
                        string3 = null;
                    }
                    textView2.setContentDescription(o7h.y0(o7h.o0(p7h.M(new String[]{str10, str, string2, string3})), ", ", (String) null, (String) null, (iu30) null, 62));
                    textView = (TextView) this.e;
                    str2 = mof1Var.b;
                    if (!str2.contentEquals(textView.getText())) {
                        textView.setText(str2);
                        b8k1.p(textView, new zdc((byte) 20));
                    }
                    textView.setContentDescription(mof1Var.c);
                    AppCompatImageView appCompatImageView = (QueuedBadgeView) obj2;
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    appCompatImageView.setVisibility(i);
                    AppCompatImageView appCompatImageView2 = (EnhancedBadgeView) this.g;
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    appCompatImageView2.setVisibility(i2);
                    ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) this.h;
                    iOrdinal = l4mVar.ordinal();
                    if (iOrdinal != 0) {
                        k4mVar = k4m.a;
                    } else if (iOrdinal != 1) {
                        k4mVar = k4m.b;
                    } else {
                        if (iOrdinal == 2) {
                            eg.o();
                            return;
                        }
                        k4mVar = k4m.d;
                    }
                    contentRestrictionBadgeView.f(k4mVar);
                    ((SpeedBadgeIconView) this.i).c(mof1Var.h);
                    appCompatImageButton.setVisibility(mof1Var.i ? 0 : 8);
                    return;
                }
                string = context.getString(2131960841);
                str = string;
                if (z2) {
                    string2 = context.getString(2131960978);
                } else {
                    string2 = null;
                }
                if (z) {
                    string3 = context.getString(2131960808);
                } else {
                    string3 = null;
                }
                textView2.setContentDescription(o7h.y0(o7h.o0(p7h.M(new String[]{str10, str, string2, string3})), ", ", (String) null, (String) null, (iu30) null, 62));
                textView = (TextView) this.e;
                str2 = mof1Var.b;
                if (!str2.contentEquals(textView.getText())) {
                    textView.setText(str2);
                    b8k1.p(textView, new zdc((byte) 20));
                }
                textView.setContentDescription(mof1Var.c);
                AppCompatImageView appCompatImageView3 = (QueuedBadgeView) obj2;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                appCompatImageView3.setVisibility(i);
                AppCompatImageView appCompatImageView4 = (EnhancedBadgeView) this.g;
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                appCompatImageView4.setVisibility(i2);
                ContentRestrictionBadgeView contentRestrictionBadgeView2 = (ContentRestrictionBadgeView) this.h;
                iOrdinal = l4mVar.ordinal();
                if (iOrdinal != 0) {
                    k4mVar = k4m.a;
                } else if (iOrdinal != 1) {
                    k4mVar = k4m.b;
                } else {
                    if (iOrdinal == 2) {
                        eg.o();
                        return;
                    }
                    k4mVar = k4m.d;
                }
                contentRestrictionBadgeView2.f(k4mVar);
                ((SpeedBadgeIconView) this.i).c(mof1Var.h);
                appCompatImageButton.setVisibility(mof1Var.i ? 0 : 8);
                return;
            default:
                f8j1 f8j1Var = (f8j1) obj;
                iu30 iu30Var = (iu30) obj2;
                yir yirVar = (yir) this.g;
                a8j1 a8j1Var = f8j1Var.g;
                if (((FrameLayout) appCompatImageButton).isAttachedToWindow()) {
                    iu30Var.invoke(new w7j1((VideoSurfaceView) ((h72) yirVar.c).Y));
                }
                ji0 ji0Var = f8j1Var.e;
                if (ji0Var != null) {
                    x8j1 x8j1Var = (x8j1) this.h;
                    ViewGroup viewGroup = (ViewGroup) this.i;
                    this.c = ji0Var;
                    String str11 = ji0Var.a;
                    String str12 = ji0Var.c;
                    String str13 = ji0Var.R0;
                    if (str13 == null) {
                        str13 = "";
                    }
                    String str14 = str13;
                    boolean z3 = a8j1Var instanceof a8j1;
                    b8j1 b8j1Var = b8j1.a;
                    if (z3 || u890.j(a8j1Var, b8j1Var) || u890.j(a8j1Var, c8j1.a)) {
                        mas0Var = wst0.a;
                    } else {
                        if (!u890.j(a8j1Var, d8j1.a)) {
                            eg.o();
                            return;
                        }
                        mas0Var = mas0.a;
                    }
                    mas0 mas0Var2 = mas0Var;
                    boolean z4 = f8j1Var.a;
                    boolean zJ = u890.j(a8j1Var, b8j1Var);
                    a8j1 a8j1Var2 = z3 ? a8j1Var : null;
                    yirVar.l(new i2x(str11, str12, str14, mas0Var2, z4, zJ, a8j1Var2 != null ? a8j1Var2.a : false, f8j1Var.h, ji0Var.e.length() > 0));
                    cs10 cs10Var = new cs10(false);
                    gq70 gq70Var = (gq70) o7h.s0(ji0Var.g.a);
                    if (gq70Var == null || (p57Var = gq70Var.c) == null) {
                        str3 = null;
                    } else {
                        String str15 = p57Var instanceof p57 ? p57Var.a : null;
                        if (str15 == null) {
                            str15 = null;
                        }
                        str3 = str15;
                    }
                    kp0 kp0Var = new kp0(cs10Var, str3, ji0Var.c, ji0Var, ji0Var.i, ji0Var.b, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a, false, new ceg1(iu30Var, (byte) 24));
                    dtw dtwVar = (dtw) this.e;
                    if (dtwVar != null) {
                        dtwVar.f(kp0Var);
                        return;
                    }
                    tka0 tka0Var = dtw.C;
                    Activity activity = (Activity) context;
                    dtw dtwVarB = mhc.b(activity, viewGroup, f6o1.A(x8j1Var.Z, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), kp0Var, (ipb1) null, 112);
                    this.e = dtwVarB;
                    int iApplyDimension = (int) TypedValue.applyDimension(1, 48.0f, activity.getResources().getDisplayMetrics());
                    int iApplyDimension2 = (int) TypedValue.applyDimension(1, 32.0f, activity.getResources().getDisplayMetrics());
                    View view = new View(context);
                    view.setLayoutParams(new FrameLayout.LayoutParams(iApplyDimension2, iApplyDimension2, 17));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(Integer.MIN_VALUE);
                    view.setBackground(gradientDrawable);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension));
                    frameLayout2.addView(view);
                    frameLayout2.addView(dtwVarB.w, new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension));
                    tlv tlvVar = (ClearButtonView) ((h72) yirVar.c).d;
                    ViewGroup viewGroup2 = (ViewGroup) tlvVar.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(tlvVar);
                    int id = tlvVar.getId();
                    ViewGroup.LayoutParams layoutParams2 = tlvVar.getLayoutParams();
                    qhl qhlVar = layoutParams2 instanceof qhl ? (qhl) layoutParams2 : null;
                    viewGroup2.removeView(tlvVar);
                    FrameLayout frameLayout3 = new FrameLayout((Context) yirVar.b);
                    frameLayout3.setId(id);
                    if (qhlVar != null) {
                        ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                        int i4 = (layoutParams3 != null ? layoutParams3.width : 0) - ((ViewGroup.MarginLayoutParams) qhlVar).width;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        int i5 = i4 / 2;
                        layoutParams = new qhl(-2, -2);
                        layoutParams.i = qhlVar.i;
                        layoutParams.v = qhlVar.v;
                        int marginStart = qhlVar.getMarginStart() - i5;
                        if (marginStart < 0) {
                            marginStart = 0;
                        }
                        layoutParams.setMarginStart(marginStart);
                        int marginEnd = qhlVar.getMarginEnd() - i5;
                        if (marginEnd < 0) {
                            marginEnd = 0;
                        }
                        layoutParams.setMarginEnd(marginEnd);
                        int i6 = ((ViewGroup.MarginLayoutParams) qhlVar).topMargin - i5;
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i6 >= 0 ? i6 : 0;
                    } else {
                        layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    }
                    frameLayout3.setLayoutParams(layoutParams);
                    viewGroup2.addView(frameLayout3, iIndexOfChild);
                    frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    frameLayout3.addView(frameLayout2);
                    return;
                }
                return;
        }
    }

    public Drawable b(int i, boolean z) {
        Context context = this.b;
        Drawable drawable = context.getDrawable(i);
        drawable.getClass();
        if (!z) {
            drawable.setTintList(x74.E(context, 2131101354));
            return drawable;
        }
        drawable.setTintList(x74.E(context, 2131101340));
        Drawable drawable2 = (Drawable) this.c;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        int intrinsicWidth = (drawable.getIntrinsicWidth() - drawable2.getIntrinsicWidth()) / 2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033) + drawable.getIntrinsicHeight();
        layerDrawable.setLayerGravity(0, 16);
        layerDrawable.setLayerInset(1, intrinsicWidth, dimensionPixelSize, intrinsicWidth, 0);
        return layerDrawable;
    }

    public void d(gt6 gt6Var) {
        FrameLayout frameLayout = (FrameLayout) this.t;
        if (((qzh) this.h) == null) {
            ufx ufxVar = ((hjc) this.e).b;
            eos eosVar = new eos(ufxVar.a, ufxVar.b, (byte) 2);
            this.h = eosVar;
            eosVar.n(new k2o(this, (byte) 0));
        }
        qzh qzhVar = (qzh) this.h;
        if (qzhVar == null) {
            u890.C("cardComponent");
            throw null;
        }
        if (!u890.j(qzhVar.getView().getParent(), frameLayout)) {
            frameLayout.removeAllViews();
            qzh qzhVar2 = (qzh) this.h;
            if (qzhVar2 == null) {
                u890.C("cardComponent");
                throw null;
            }
            frameLayout.addView(qzhVar2.getView());
        }
        qzh qzhVar3 = (qzh) this.h;
        if (qzhVar3 != null) {
            qzhVar3.f(gt6Var);
        } else {
            u890.C("cardComponent");
            throw null;
        }
    }

    public void e(jt6 jt6Var) {
        FrameLayout frameLayout = (FrameLayout) this.t;
        if (((qzh) this.g) == null) {
            wfx wfxVar = ((pp) this.d).b;
            ver verVar = new ver(wfxVar.b, wfxVar.a, (byte) 3);
            this.g = verVar;
            verVar.n(new k2o(this, (byte) 2));
        }
        qzh qzhVar = (qzh) this.g;
        if (qzhVar == null) {
            u890.C("rowComponent");
            throw null;
        }
        if (!u890.j(qzhVar.getView().getParent(), frameLayout)) {
            frameLayout.removeAllViews();
            qzh qzhVar2 = (qzh) this.g;
            if (qzhVar2 == null) {
                u890.C("rowComponent");
                throw null;
            }
            frameLayout.addView(qzhVar2.getView());
        }
        qzh qzhVar3 = (qzh) this.g;
        if (qzhVar3 != null) {
            qzhVar3.f(jt6Var);
        } else {
            u890.C("rowComponent");
            throw null;
        }
    }

    public final View getView() {
        byte b = this.a;
        AppCompatImageButton appCompatImageButton = this.t;
        switch (b) {
            case 0:
                return (FrameLayout) appCompatImageButton;
            case 1:
                return appCompatImageButton;
            case 2:
                return (View) this.c;
            default:
                return (FrameLayout) appCompatImageButton;
        }
    }

    public n2o(hjc hjcVar, pp ppVar, hjc hjcVar2, Context context, iu30 iu30Var) {
        this.a = (byte) 0;
        this.c = hjcVar;
        this.d = ppVar;
        this.e = hjcVar2;
        this.b = context;
        this.f = iu30Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(2131428284);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.t = frameLayout;
    }

    public n2o(Context context, iu30 iu30Var, x8j1 x8j1Var, ViewGroup viewGroup) {
        this.a = (byte) 3;
        this.b = context;
        this.f = iu30Var;
        this.h = x8j1Var;
        this.i = viewGroup;
        yir yirVar = new yir(context, (byte) 3);
        h72 h72Var = (h72) yirVar.c;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) h72Var.Y;
        videoSurfaceView.setScaleType(b3k1.c);
        yirVar.n(new ceg1(iu30Var, (byte) 23));
        FrameLayout frameLayout = (FrameLayout) h72Var.b;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        videoSurfaceView.addOnAttachStateChangeListener(new a5f1(x8j1Var, yirVar, this, iu30Var));
        this.g = yirVar;
        this.t = frameLayout;
    }
}
