package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.icu.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hg10 extends Drawable {
    public static final /* synthetic */ mma0[] i = {new een0(hg10.class, "isCircular", "isCircular()Z", 0)};
    public final Context a;
    public final int b;
    public final gg10 c;
    public final Paint d;
    public final Paint e;
    public Drawable f;
    public final Rect g;
    public final ce0 h;

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    /* JADX WARN: Code duplicated, block: B:15:0x001b A[PHI: r1
      0x001b: PHI (r1v6 java.lang.String) = (r1v2 java.lang.String), (r1v11 java.lang.String) binds: [B:13:0x0017, B:8:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public hg10(Context context, String str, String str2, Integer num) {
        String str3;
        String upperCase;
        int color;
        if (str2 == null) {
            if (ihc1.y0(str)) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (str3 == null) {
                upperCase = null;
            } else {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str3);
                upperCase = str3.substring(0, characterInstance.next()).toUpperCase(Locale.ROOT);
            }
        } else {
            str3 = !ihc1.y0(str2) ? str2 : null;
            if (str3 == null) {
                if (ihc1.y0(str)) {
                    str3 = str;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    upperCase = null;
                } else {
                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                    characterInstance2.setText(str3);
                    upperCase = str3.substring(0, characterInstance2.next()).toUpperCase(Locale.ROOT);
                }
            } else {
                BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                characterInstance3.setText(str3);
                upperCase = str3.substring(0, characterInstance3.next()).toUpperCase(Locale.ROOT);
            }
        }
        if (num != null) {
            color = num.intValue();
        } else {
            if (str2 != null) {
                str2 = ihc1.y0(str2) ? null : str2;
                if (str2 != null) {
                    str = str2;
                }
            }
            color = context.getColor(!ihc1.y0(str) ? nln.b[Math.abs(str.hashCode()) % 6] : 2131101363);
        }
        this(color, context, upperCase);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iHeight = bounds.height();
        mma0 mma0Var = i[0];
        boolean zBooleanValue = ((Boolean) ((sgp0) this.h).a).booleanValue();
        Paint paint = this.e;
        if (zBooleanValue) {
            float f = iHeight / 2.0f;
            canvas.drawCircle(bounds.width() / 2.0f, f, f, paint);
        } else {
            canvas.drawPaint(paint);
        }
        String str = this.c.b;
        if (str == null) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Paint paint2 = this.d;
        paint2.setTextSize(iHeight * 0.55f);
        int length = str.length();
        Rect rect = this.g;
        paint2.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, bounds.exactCenterX(), bounds.exactCenterY() - rect.exactCenterY(), paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        int changingConfigurations = getChangingConfigurations();
        gg10 gg10Var = this.c;
        gg10Var.e = changingConfigurations;
        return gg10Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        gg10 gg10Var = this.c;
        gg10Var.getClass();
        return new hg10(gg10Var.a, gg10Var.b, gg10Var.c, gg10Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.c.b == null) {
            int iWidth = rect.width();
            int i2 = (int) (iWidth * 0.5f);
            int i3 = (iWidth - i2) / 2;
            Context context = this.a;
            Drawable drawable = context.getResources().getDrawable(azo1.u(i2, context.getResources()) ? 2131232840 : 2131232841, null);
            drawable.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
            Rect rect2 = new Rect(rect);
            rect2.inset(i3, i3);
            drawable.setBounds(rect2);
            this.f = drawable;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.d.setAlpha(i2);
        this.e.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    public hg10(Context context, String str, int i2, int i3) {
        this.a = context;
        this.b = i3;
        str = (str == null || ihc1.y0(str)) ? null : str;
        gg10 gg10Var = new gg10();
        gg10Var.a = context;
        gg10Var.b = str;
        gg10Var.c = i2;
        gg10Var.d = i3;
        this.c = gg10Var;
        Paint paint = new Paint();
        paint.setColor(i3);
        paint.setTypeface(qx21.b(context, 2131296262));
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(i2);
        paint2.setAntiAlias(true);
        this.e = paint2;
        this.g = new Rect();
        this.h = new ce0(this);
    }

    public /* synthetic */ hg10(Context context, String str, String str2) {
        this(context, str, str2, (Integer) null);
    }

    public hg10(int i2, Context context, String str) {
        this(context, str, i2, context.getColor((((Color.red(i2) * 299) + (Color.green(i2) * 587)) + (Color.blue(i2) * 114)) / 1000 >= 128 ? 2131100252 : 2131104462));
    }
}
