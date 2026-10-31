package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ujm0 extends BaseAdapter {
    public static final int d = foi1.c(null).getMaximum(4);
    public final tjm0 a;
    public cab b;
    public final vwc c;

    public ujm0(tjm0 tjm0Var, vwc vwcVar) {
        this.a = tjm0Var;
        this.c = vwcVar;
        throw null;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        tjm0 tjm0Var = this.a;
        if (i < tjm0Var.h() || i > b()) {
            return null;
        }
        int iH = (i - tjm0Var.h()) + 1;
        Calendar calendarA = foi1.a(tjm0Var.a);
        calendarA.set(5, iH);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int b() {
        tjm0 tjm0Var = this.a;
        return (tjm0Var.h() + tjm0Var.e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        tjm0 tjm0Var = this.a;
        return tjm0Var.h() + tjm0Var.e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new cab(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) eqq.l(viewGroup, 2131625261, viewGroup, false);
        }
        tjm0 tjm0Var = this.a;
        int iH = i - tjm0Var.h();
        if (iH < 0 || iH >= tjm0Var.e) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = iH + 1;
            textView.setTag(tjm0Var);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
            Calendar calendarA = foi1.a(tjm0Var.a);
            calendarA.set(5, i2);
            long timeInMillis = calendarA.getTimeInMillis();
            int i3 = tjm0Var.c;
            Calendar calendarB = foi1.b();
            calendarB.set(5, 1);
            Calendar calendarA2 = foi1.a(calendarB);
            calendarA2.get(2);
            int i4 = calendarA2.get(1);
            calendarA2.getMaximum(7);
            calendarA2.getActualMaximum(5);
            calendarA2.getTimeInMillis();
            if (i3 == i4) {
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton.format(new Date(timeInMillis)));
            } else {
                DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
                instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton2.format(new Date(timeInMillis)));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        long jLongValue = item.longValue();
        if (textView != null) {
            if (jLongValue >= this.c.c.a) {
                textView.setEnabled(true);
                throw null;
            }
            textView.setEnabled(false);
            t01 t01Var = (t01) this.b.d;
            gch0 gch0Var = new gch0();
            gch0 gch0Var2 = new gch0();
            iw61 iw61Var = (iw61) t01Var.f;
            gch0Var.setShapeAppearanceModel(iw61Var);
            gch0Var2.setShapeAppearanceModel(iw61Var);
            gch0Var.m((ColorStateList) t01Var.d);
            float f = t01Var.a;
            ColorStateList colorStateList = (ColorStateList) t01Var.e;
            gch0Var.a.j = f;
            gch0Var.invalidateSelf();
            fch0 fch0Var = gch0Var.a;
            if (fch0Var.d != colorStateList) {
                fch0Var.d = colorStateList;
                gch0Var.onStateChange(gch0Var.getState());
            }
            ColorStateList colorStateList2 = (ColorStateList) t01Var.c;
            textView.setTextColor(colorStateList2);
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2.withAlpha(30), gch0Var, gch0Var2);
            Rect rect = (Rect) t01Var.b;
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
            WeakHashMap weakHashMap = b8k1.a;
            textView.setBackground(insetDrawable);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
