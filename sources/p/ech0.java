package p;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ech0<S> extends t2u {
    public final LinkedHashSet V1;
    public final LinkedHashSet W1;
    public int X1;
    public zvs0 Y1;
    public vwc Z1;
    public zbh0 a2;
    public int b2;
    public CharSequence c2;
    public boolean d2;
    public int e2;
    public CheckableImageButton f2;
    public gch0 g2;

    public ech0() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.V1 = new LinkedHashSet();
        this.W1 = new LinkedHashSet();
    }

    public static int j1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166584);
        Calendar calendarB = foi1.b();
        calendarB.set(5, 1);
        Calendar calendarA = foi1.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166590) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(2131166604)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean k1(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(xfo1.q(2130969714, context, zbh0.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final void F0(Bundle bundle) {
        super.F0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.X1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        vwc vwcVar = this.Z1;
        uwc uwcVar = new uwc();
        long j = vwcVar.a.f;
        long j2 = vwcVar.b.f;
        uwcVar.a = Long.valueOf(vwcVar.d.f);
        Parcelable parcelable = vwcVar.c;
        tjm0 tjm0Var = this.a2.I1;
        if (tjm0Var != null) {
            uwcVar.a = Long.valueOf(tjm0Var.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", parcelable);
        tjm0 tjm0VarG = tjm0.g(j);
        tjm0 tjm0VarG2 = tjm0.g(j2);
        f7r parcelable2 = bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = uwcVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new vwc(tjm0VarG, tjm0VarG2, parcelable2, l != null ? tjm0.g(l.longValue()) : null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.b2);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.c2);
    }

    public final void G0() {
        zvs0 zvs0Var;
        super.G0();
        Window window = d1().getWindow();
        if (this.d2) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.g2);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = k0().getDimensionPixelOffset(2131166592);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.g2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new mk80(d1(), rect));
        }
        P0();
        int i = this.X1;
        if (i == 0) {
            i1();
            throw null;
        }
        i1();
        vwc vwcVar = this.Z1;
        zbh0 zbh0Var = new zbh0();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", vwcVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", vwcVar.d);
        zbh0Var.T0(bundle);
        this.a2 = zbh0Var;
        if (this.f2.d) {
            zvs0Var = zbh0Var;
            i1();
            vwc vwcVar2 = this.Z1;
            hch0 hch0Var = new hch0();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", vwcVar2);
            hch0Var.T0(bundle2);
            zvs0Var = hch0Var;
        }
        zvs0Var = zbh0Var;
        this.Y1 = zvs0Var;
        i1();
        throw null;
    }

    public final void H0() {
        this.Y1.F1.clear();
        super.H0();
    }

    public final Dialog c1(Bundle bundle) {
        Context contextP0 = P0();
        P0();
        int i = this.X1;
        if (i == 0) {
            i1();
            throw null;
        }
        Dialog dialog = new Dialog(contextP0, i);
        Context context = dialog.getContext();
        this.d2 = k1(context, R.attr.windowFullscreen);
        int iQ = xfo1.q(2130969040, context, ech0.class.getCanonicalName());
        gch0 gch0Var = new gch0(context, (AttributeSet) null, 2130969714, 2132018799);
        this.g2 = gch0Var;
        gch0Var.j(context);
        this.g2.m(ColorStateList.valueOf(iQ));
        gch0 gch0Var2 = this.g2;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = b8k1.a;
        gch0Var2.l(decorView.getElevation());
        return dialog;
    }

    public final void i1() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.V1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.W1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) ((zf30) this).j1;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = ((zf30) this).f;
        }
        this.X1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.Z1 = (vwc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.b2 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.c2 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.e2 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.d2 ? 2131625276 : 2131625275, viewGroup);
        Context context = viewInflate.getContext();
        if (this.d2) {
            viewInflate.findViewById(2131430069).setLayoutParams(new LinearLayout.LayoutParams(j1(context), -2));
        } else {
            viewInflate.findViewById(2131430070).setLayoutParams(new LinearLayout.LayoutParams(j1(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(2131430081);
        WeakHashMap weakHashMap = b8k1.a;
        textView.setAccessibilityLiveRegion(1);
        this.f2 = (CheckableImageButton) viewInflate.findViewById(2131430083);
        TextView textView2 = (TextView) viewInflate.findViewById(2131430087);
        CharSequence charSequence = this.c2;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.b2);
        }
        this.f2.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, f0o1.j(context, 2131233511));
        stateListDrawable.addState(new int[0], f0o1.j(context, 2131233513));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2.setChecked(this.e2 != 0);
        b8k1.p(this.f2, (rf) null);
        ?? r7 = this.f2;
        this.f2.setContentDescription(r7.d ? r7.getContext().getString(2131958973) : r7.getContext().getString(2131958975));
        this.f2.setOnClickListener(new hid0(this, (byte) 4));
        i1();
        throw null;
    }
}
