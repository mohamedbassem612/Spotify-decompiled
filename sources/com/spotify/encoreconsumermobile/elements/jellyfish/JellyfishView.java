package com.spotify.encoreconsumermobile.elements.jellyfish;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.beo;
import p.idd1;
import p.l9a0;
import p.mo2;
import p.o7h;
import p.tlv;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/jellyfish/JellyfishView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "d", "Lp/znb0;", "getDefaultTopSplineColor", "()I", "defaultTopSplineColor", "e", "getDefaultMidSplineColor", "defaultMidSplineColor", "f", "getDefaultBottomSplineColor", "defaultBottomSplineColor", "src_main_java_com_spotify_encoreconsumermobile_elements_jellyfish-jellyfish"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JellyfishView extends View implements tlv {
    public List N0;
    public List O0;
    public List P0;
    public float a;
    public float b;
    public float c;
    public final idd1 d;
    public final idd1 e;
    public final idd1 f;
    public final Path g;
    public final Paint h;
    public final Paint i;
    public final Paint t;

    public JellyfishView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new idd1(new mo2(context, (byte) 29));
        this.e = new idd1(new mo2(context, (byte) 28));
        this.f = new idd1(new mo2(context, (byte) 27));
        this.g = new Path();
        Paint paint = new Paint();
        paint.setFlags(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.a);
        paint.setColor(getDefaultTopSplineColor());
        this.h = paint;
        Paint paint2 = new Paint();
        paint2.setFlags(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.a);
        paint2.setColor(getDefaultMidSplineColor());
        this.i = paint2;
        Paint paint3 = new Paint();
        paint3.setFlags(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(this.a);
        paint3.setColor(getDefaultBottomSplineColor());
        this.t = paint3;
        z6x z6xVar = z6x.a;
        this.N0 = z6xVar;
        this.O0 = z6xVar;
        this.P0 = z6xVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166195);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    private final int getDefaultBottomSplineColor() {
        return ((Number) this.f.getValue()).intValue();
    }

    private final int getDefaultMidSplineColor() {
        return ((Number) this.e.getValue()).intValue();
    }

    private final int getDefaultTopSplineColor() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final PointF a(PointF pointF) {
        float f = pointF.x;
        float f2 = this.c;
        float f3 = this.b;
        return new PointF((f * f2) + f3, (pointF.y * f2) + f3);
    }

    public final void b(Canvas canvas, Paint paint, List list) {
        Path path = this.g;
        path.reset();
        if (!list.isEmpty()) {
            PointF pointFA = a(((beo) o7h.q0(list)).a);
            path.moveTo(pointFA.x, pointFA.y);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            beo beoVar = (beo) it.next();
            PointF pointFA2 = a(beoVar.b);
            PointF pointFA3 = a(beoVar.c);
            PointF pointFA4 = a(beoVar.d);
            path.cubicTo(pointFA2.x, pointFA2.y, pointFA3.x, pointFA3.y, pointFA4.x, pointFA4.y);
        }
        canvas.drawPath(path, paint);
    }

    public final void f(Object obj) {
        l9a0 l9a0Var = (l9a0) obj;
        this.P0 = l9a0Var.c.a;
        this.O0 = l9a0Var.b.a;
        this.N0 = l9a0Var.a.a;
        invalidate();
        this.t.setColor(getDefaultBottomSplineColor());
        this.i.setColor(getDefaultMidSplineColor());
        this.h.setColor(getDefaultTopSplineColor());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas, this.t, this.P0);
        b(canvas, this.i, this.O0);
        b(canvas, this.h, this.N0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = Math.min(getWidth(), getHeight()) / 2.0f;
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        this.c = fMin;
        float f = fMin * 0.13017751f;
        this.a = f;
        this.t.setStrokeWidth(f);
        this.i.setStrokeWidth(this.a);
        this.h.setStrokeWidth(this.a);
    }

    public JellyfishView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public JellyfishView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ JellyfishView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
