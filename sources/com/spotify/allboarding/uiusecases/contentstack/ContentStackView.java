package com.spotify.allboarding.uiusecases.contentstack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a21;
import p.eg;
import p.gw70;
import p.ixg;
import p.l1d;
import p.o7h;
import p.p6m;
import p.vku;
import p.yrh;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/allboarding/uiusecases/contentstack/ContentStackView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_allboarding_uiusecases_contentstack-contentstack"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class ContentStackView extends View {
    public final Paint N0;
    public final Paint O0;
    public final Paint P0;
    public final Paint Q0;
    public final Paint R0;
    public final LinkedHashMap S0;
    public List T0;
    public final vku U0;
    public final int a;
    public final float b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;
    public final RectF i;
    public final RectF t;

    public ContentStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context.getResources().getDimensionPixelSize(2131166797);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165374);
        this.b = context.getResources().getDimensionPixelSize(2131165564);
        this.c = context.getResources().getDimensionPixelSize(2131166185);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165497);
        this.d = dimensionPixelSize2;
        float f = dimensionPixelSize * 2.0f;
        float f2 = dimensionPixelSize2 - f;
        this.e = f2;
        this.f = f2 / 2.0f;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131167054);
        this.g = dimensionPixelSize3;
        float f3 = dimensionPixelSize3;
        float f4 = f3 - f;
        this.h = f4;
        this.S0 = new LinkedHashMap();
        this.T0 = z6x.a;
        this.U0 = new vku();
        setLayerType(1, null);
        Paint paint = new Paint(7);
        this.N0 = paint;
        Paint paint2 = new Paint(1);
        this.O0 = paint2;
        paint2.setColor(context.getColor(2131100820));
        Paint paint3 = new Paint(1);
        this.P0 = paint3;
        paint3.setColor(-1);
        Paint paint4 = new Paint(1);
        this.Q0 = paint4;
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint5 = new Paint(paint);
        this.R0 = paint5;
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        RectF rectF = new RectF(0.0f, 0.0f, f3, f3);
        this.i = rectF;
        float f5 = (-dimensionPixelSize3) / 2.0f;
        rectF.offset(f5, f5);
        RectF rectF2 = new RectF(0.0f, 0.0f, f4, f4);
        this.t = rectF2;
        float f6 = (-f4) / 2.0f;
        rectF2.offset(f6, f6);
    }

    public final void a() {
        this.U0.c();
        Iterator it = this.S0.values().iterator();
        while (it.hasNext()) {
            ((Bitmap) it.next()).recycle();
        }
    }

    public final void b(Canvas canvas, p6m p6mVar, float f, float f2) {
        canvas.save();
        canvas.translate(f, f2);
        Bitmap bitmap = (Bitmap) this.S0.get(p6mVar);
        int iC = l1d.C(p6mVar.b);
        Paint paint = this.O0;
        Paint paint2 = this.N0;
        Paint paint3 = this.Q0;
        if (iC == 0) {
            canvas.drawCircle(0.0f, 0.0f, this.d / 2.0f, paint3);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint2);
            } else {
                canvas.drawCircle(0.0f, 0.0f, this.f, paint);
            }
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            canvas.rotate(10.0f);
            RectF rectF = this.i;
            float f3 = this.b;
            canvas.drawRoundRect(rectF, f3, f3, paint3);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint2);
            } else {
                RectF rectF2 = this.t;
                float f4 = this.c;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            }
        }
        canvas.restore();
    }

    public final int c(p6m p6mVar) {
        int iC = l1d.C(p6mVar.b);
        if (iC == 0) {
            return this.d;
        }
        if (iC == 1) {
            return this.g;
        }
        eg.o();
        return 0;
    }

    public final void d(gw70 gw70Var, Scheduler scheduler, List list) {
        vku vkuVar = this.U0;
        vkuVar.c();
        this.T0 = o7h.d1(list, 5);
        invalidate();
        requestLayout();
        for (p6m p6mVar : this.T0) {
            ixg ixgVarB = gw70Var.b(Uri.parse(p6mVar.a));
            ixgVarB.g = false;
            vkuVar.a(ixgVarB.i().observeOn(scheduler).subscribeOn(scheduler).subscribe(new a21(this, p6mVar, (byte) 25), new yrh(p6mVar, (byte) 4)));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.T0.isEmpty()) {
            return;
        }
        float height = getHeight() / 2.0f;
        p6m p6mVar = (p6m) o7h.q0(this.T0);
        float fC = (c(p6mVar) / 2.0f) + this.a;
        b(canvas, p6mVar, fC, height);
        List list = this.T0;
        for (p6m p6mVar2 : list.subList(1, list.size())) {
            fC += c(p6mVar2) * 0.7f;
            b(canvas, p6mVar2, fC, height);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iC;
        super.onMeasure(i, i2);
        int iMax = Math.max(this.g, this.d);
        int i3 = this.a;
        int i4 = (i3 * 2) + iMax;
        int size = this.T0.size();
        List list = this.T0;
        if (size == 1) {
            iC = c((p6m) o7h.q0(list));
        } else {
            int size2 = list.size();
            int iC2 = 0;
            if (size2 > 1) {
                List list2 = this.T0;
                Iterator it = list2.subList(1, list2.size()).iterator();
                while (it.hasNext()) {
                    iC2 += (int) (c((p6m) it.next()) * 0.7f);
                }
                iC = c((p6m) o7h.q0(this.T0)) + iC2;
            } else {
                iC = 0;
            }
        }
        setMeasuredDimension((i3 * 2) + iC, i4);
    }

    public ContentStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ContentStackView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ContentStackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
