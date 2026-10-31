package com.spotify.encoreconsumermobile.elements.bellbutton;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cg1;
import p.cja;
import p.dja;
import p.eg;
import p.eja;
import p.g4b1;
import p.idd1;
import p.iu30;
import p.mo2;
import p.tlv;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/bellbutton/BellButtonView;", "", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "e", "Lp/znb0;", "getDrawableSize", "()F", "drawableSize", "Lp/dja;", "getState", "()Lp/dja;", "state", "src_main_java_com_spotify_encoreconsumermobile_elements_bellbutton-bellbutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BellButtonView extends StateListAnimatorImageButton implements tlv {
    public cja d;
    public final idd1 e;

    /* JADX WARN: Multi-variable type inference failed */
    public BellButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new cja();
        this.e = new idd1(new mo2(context, (byte) 3));
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackgroundResource(0);
        a();
    }

    private final float getDrawableSize() {
        return ((Number) this.e.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        BitmapDrawable g4b1Var;
        BitmapDrawable bitmapDrawable;
        Context context = getContext();
        dja djaVar = this.d.a;
        float drawableSize = getDrawableSize();
        int iOrdinal = djaVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                g4b1Var = new g4b1(context, eja.b, drawableSize);
                g4b1Var.c(x74.E(context, 2131101354));
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                g4b1 g4b1Var2 = new g4b1(context, eja.a, drawableSize);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(g4b1Var2.n.l(), g4b1Var2.n.j(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                g4b1Var2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                g4b1Var2.n.c(canvas);
                float f = drawableSize / 24.0f;
                Paint paint = new Paint(1);
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                float f2 = 5.0f * f;
                float f3 = 3.5f * f;
                canvas.drawCircle(f2, f3, f2, paint);
                Paint paint2 = new Paint(1);
                paint2.setStyle(style);
                paint2.setColor(context.getColor(2131100287));
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                canvas.drawCircle(f2, f3, 3.0f * f, paint2);
                bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
            }
            setImageDrawable(bitmapDrawable);
        }
        g4b1Var = new g4b1(context, eja.a, drawableSize);
        g4b1Var.c(x74.E(context, 2131101354));
        bitmapDrawable = g4b1Var;
        setImageDrawable(bitmapDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        this.d = (cja) obj;
        setContentDescription(getContext().getString(2131952714));
        a();
    }

    public dja getState() {
        return this.d.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new cg1(this, iu30Var, (byte) 14));
    }

    public BellButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BellButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BellButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
