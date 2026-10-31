package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p.a8v;
import p.ago1;
import p.aqo;
import p.b8k1;
import p.bhn0;
import p.blo1;
import p.ck5;
import p.cto;
import p.dgo1;
import p.f0o1;
import p.fch0;
import p.fjg1;
import p.fmv;
import p.gch0;
import p.ghd;
import p.gvg;
import p.hhg1;
import p.i5;
import p.igg;
import p.ira;
import p.iw61;
import p.jav;
import p.je5;
import p.jgg;
import p.jhg1;
import p.jyh0;
import p.k5;
import p.kb5;
import p.la80;
import p.lvc1;
import p.mgg;
import p.mzx;
import p.o0c;
import p.odt;
import p.omz0;
import p.p96;
import p.pg10;
import p.pzg;
import p.qpp0;
import p.u7k1;
import p.u890;
import p.uah;
import p.w6s0;
import p.w8e1;
import p.x29;
import p.x74;
import p.x8e1;
import p.xwn1;
import p.y8e1;
import p.zko1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class TextInputLayout extends LinearLayout {
    public PorterDuff.Mode A1;
    public boolean B1;
    public ColorDrawable C1;
    public int D1;
    public View.OnLongClickListener E1;
    public final LinkedHashSet F1;
    public int G1;
    public final SparseArray H1;
    public final CheckableImageButton I1;
    public final LinkedHashSet J1;
    public ColorStateList K1;
    public boolean L1;
    public PorterDuff.Mode M1;
    public int N0;
    public boolean N1;
    public boolean O0;
    public ColorDrawable O1;
    public AppCompatTextView P0;
    public int P1;
    public int Q0;
    public Drawable Q1;
    public int R0;
    public View.OnLongClickListener R1;
    public CharSequence S0;
    public View.OnLongClickListener S1;
    public boolean T0;
    public final CheckableImageButton T1;
    public AppCompatTextView U0;
    public ColorStateList U1;
    public ColorStateList V0;
    public ColorStateList V1;
    public int W0;
    public ColorStateList W1;
    public pg10 X0;
    public int X1;
    public pg10 Y0;
    public int Y1;
    public ColorStateList Z0;
    public int Z1;
    public final FrameLayout a;
    public ColorStateList a1;
    public ColorStateList a2;
    public final LinearLayout b;
    public CharSequence b1;
    public int b2;
    public final LinearLayout c;
    public final AppCompatTextView c1;
    public int c2;
    public final FrameLayout d;
    public CharSequence d1;
    public int d2;
    public EditText e;
    public final AppCompatTextView e1;
    public int e2;
    public CharSequence f;
    public boolean f1;
    public int f2;
    public int g;
    public CharSequence g1;
    public boolean g2;
    public int h;
    public boolean h1;
    public final pzg h2;
    public final la80 i;
    public gch0 i1;
    public boolean i2;
    public gch0 j1;
    public boolean j2;
    public final iw61 k1;
    public ValueAnimator k2;
    public final int l1;
    public boolean l2;
    public int m1;
    public boolean m2;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public boolean t;
    public final Rect t1;
    public final Rect u1;
    public final RectF v1;
    public Typeface w1;
    public final CheckableImageButton x1;
    public ColorStateList y1;
    public boolean z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        super(u890.J(context, attributeSet, i, 2132018544), attributeSet, i);
        this.g = -1;
        this.h = -1;
        this.i = new la80(this);
        this.t1 = new Rect();
        this.u1 = new Rect();
        this.v1 = new RectF();
        this.F1 = new LinkedHashSet();
        this.G1 = 0;
        SparseArray sparseArray = new SparseArray();
        this.H1 = sparseArray;
        this.J1 = new LinkedHashSet();
        pzg pzgVar = new pzg(this);
        this.h2 = pzgVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.c = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.d = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = je5.a;
        pzgVar.O = linearInterpolator;
        pzgVar.i(false);
        pzgVar.N = linearInterpolator;
        pzgVar.i(false);
        pzgVar.l(8388659);
        blo1.m(context2, attributeSet, i, 2132018544);
        int[] iArr = omz0.N;
        blo1.n(context2, attributeSet, iArr, i, 2132018544, 20, 18, 33, 38, 42);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132018544);
        lvc1 lvc1Var = new lvc1(context2, typedArrayObtainStyledAttributes, (byte) 13);
        this.f1 = typedArrayObtainStyledAttributes.getBoolean(41, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.j2 = typedArrayObtainStyledAttributes.getBoolean(40, true);
        this.i2 = typedArrayObtainStyledAttributes.getBoolean(35, true);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        iw61 iw61VarD = iw61.b(context2, attributeSet, i, 2132018544).d();
        this.k1 = iw61VarD;
        this.l1 = context2.getResources().getDimensionPixelOffset(2131166718);
        this.n1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
        this.p1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, context2.getResources().getDimensionPixelSize(2131166719));
        this.q1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, context2.getResources().getDimensionPixelSize(2131166720));
        this.o1 = this.p1;
        float dimension = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(8, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(9, -1.0f);
        zko1 zko1Var = iw61VarD.a;
        zko1 zko1Var2 = iw61VarD.b;
        zko1 zko1Var3 = iw61VarD.c;
        zko1 zko1Var4 = iw61VarD.d;
        k5 k5Var = iw61VarD.e;
        k5 k5Var2 = iw61VarD.f;
        k5 k5Var3 = iw61VarD.g;
        k5 k5Var4 = iw61VarD.h;
        fmv fmvVar = iw61VarD.i;
        fmv fmvVar2 = iw61VarD.j;
        fmv fmvVar3 = iw61VarD.k;
        fmv fmvVar4 = iw61VarD.l;
        k5 k5Var5 = dimension >= 0.0f ? new k5(dimension) : k5Var;
        k5 k5Var6 = dimension2 >= 0.0f ? new k5(dimension2) : k5Var2;
        k5 k5Var7 = dimension3 >= 0.0f ? new k5(dimension3) : k5Var3;
        k5 k5Var8 = dimension4 >= 0.0f ? new k5(dimension4) : k5Var4;
        iw61 iw61Var = new iw61();
        iw61Var.a = zko1Var;
        iw61Var.b = zko1Var2;
        iw61Var.c = zko1Var3;
        iw61Var.d = zko1Var4;
        iw61Var.e = k5Var5;
        iw61Var.f = k5Var6;
        iw61Var.g = k5Var7;
        iw61Var.h = k5Var8;
        iw61Var.i = fmvVar;
        iw61Var.j = fmvVar2;
        iw61Var.k = fmvVar3;
        iw61Var.l = fmvVar4;
        this.k1 = iw61Var;
        ColorStateList colorStateListJ = dgo1.j(context2, lvc1Var, 5);
        if (colorStateListJ != null) {
            int defaultColor = colorStateListJ.getDefaultColor();
            this.b2 = defaultColor;
            this.s1 = defaultColor;
            if (colorStateListJ.isStateful()) {
                this.c2 = colorStateListJ.getColorForState(new int[]{-16842910}, -1);
                this.d2 = colorStateListJ.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.e2 = colorStateListJ.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.d2 = this.b2;
                ColorStateList colorStateListE = x74.E(context2, 2131102409);
                this.c2 = colorStateListE.getColorForState(new int[]{-16842910}, -1);
                this.e2 = colorStateListE.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            i3 = 1;
            i2 = 0;
        } else {
            i2 = 0;
            this.s1 = 0;
            this.b2 = 0;
            this.c2 = 0;
            this.d2 = 0;
            this.e2 = 0;
            i3 = 1;
        }
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            ColorStateList colorStateListG = lvc1Var.g(i3);
            this.W1 = colorStateListG;
            this.V1 = colorStateListG;
        }
        ColorStateList colorStateListJ2 = dgo1.j(context2, lvc1Var, 12);
        this.Z1 = typedArrayObtainStyledAttributes.getColor(12, i2);
        this.X1 = context2.getColor(2131102432);
        this.f2 = context2.getColor(2131102433);
        this.Y1 = context2.getColor(2131102436);
        if (colorStateListJ2 != null) {
            setBoxStrokeColorStateList(colorStateListJ2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setBoxStrokeErrorColor(dgo1.j(context2, lvc1Var, 13));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(42, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(42, 0));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(33, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(28);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(29, false);
        ?? r7 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131624541, (ViewGroup) linearLayout2, false);
        this.T1 = r7;
        r7.setId(2131431280);
        r7.setVisibility(8);
        if (dgo1.n(context2)) {
            ((ViewGroup.MarginLayoutParams) r7.getLayoutParams()).setMarginStart(0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            setErrorIconDrawable(lvc1Var.k(30));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            setErrorIconTintList(dgo1.j(context2, lvc1Var, 31));
        }
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            setErrorIconTintMode(o0c.I(typedArrayObtainStyledAttributes.getInt(32, -1), (PorterDuff.Mode) null));
        }
        r7.setContentDescription(getResources().getText(2131955718));
        WeakHashMap weakHashMap = b8k1.a;
        r7.setImportantForAccessibility(2);
        r7.setClickable(false);
        r7.setPressable(false);
        r7.setFocusable(false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(38, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(37, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(36);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(50, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(49);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(53, 0);
        CharSequence text4 = typedArrayObtainStyledAttributes.getText(52);
        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(63, 0);
        CharSequence text5 = typedArrayObtainStyledAttributes.getText(62);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(17, -1));
        this.R0 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        this.Q0 = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        ?? r12 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131624542, (ViewGroup) linearLayout, false);
        this.x1 = r12;
        r12.setVisibility(8);
        if (dgo1.n(context2)) {
            ((ViewGroup.MarginLayoutParams) r12.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setStartIconDrawable(lvc1Var.k(59));
            if (typedArrayObtainStyledAttributes.hasValue(58)) {
                setStartIconContentDescription(typedArrayObtainStyledAttributes.getText(58));
            }
            setStartIconCheckable(typedArrayObtainStyledAttributes.getBoolean(57, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(60)) {
            setStartIconTintList(dgo1.j(context2, lvc1Var, 60));
        }
        if (typedArrayObtainStyledAttributes.hasValue(61)) {
            setStartIconTintMode(o0c.I(typedArrayObtainStyledAttributes.getInt(61, -1), (PorterDuff.Mode) null));
        }
        byte b = 0;
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(6, 0));
        ?? r3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131624541, (ViewGroup) frameLayout2, false);
        this.I1 = r3;
        frameLayout2.addView(r3);
        r3.setVisibility(8);
        if (dgo1.n(context2)) {
            ((ViewGroup.MarginLayoutParams) r3.getLayoutParams()).setMarginStart(0);
        }
        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(24, 0);
        sparseArray.append(-1, new aqo(this, resourceId6, b));
        sparseArray.append(0, new aqo(this, 0, (byte) 1));
        sparseArray.append(1, new w6s0(this, resourceId6 == 0 ? typedArrayObtainStyledAttributes.getResourceId(45, 0) : resourceId6));
        sparseArray.append(2, new mgg(this, resourceId6));
        sparseArray.append(3, new jav(this, resourceId6));
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            setEndIconMode(typedArrayObtainStyledAttributes.getInt(25, 0));
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                setEndIconContentDescription(typedArrayObtainStyledAttributes.getText(23));
            }
            setEndIconCheckable(typedArrayObtainStyledAttributes.getBoolean(22, true));
        } else if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setEndIconMode(typedArrayObtainStyledAttributes.getBoolean(46, false) ? 1 : 0);
            setEndIconContentDescription(typedArrayObtainStyledAttributes.getText(44));
            if (typedArrayObtainStyledAttributes.hasValue(47)) {
                setEndIconTintList(dgo1.j(context2, lvc1Var, 47));
            }
            if (typedArrayObtainStyledAttributes.hasValue(48)) {
                setEndIconTintMode(o0c.I(typedArrayObtainStyledAttributes.getInt(48, -1), (PorterDuff.Mode) null));
            }
        }
        if (!typedArrayObtainStyledAttributes.hasValue(46)) {
            if (typedArrayObtainStyledAttributes.hasValue(26)) {
                setEndIconTintList(dgo1.j(context2, lvc1Var, 26));
            }
            if (typedArrayObtainStyledAttributes.hasValue(27)) {
                setEndIconTintMode(o0c.I(typedArrayObtainStyledAttributes.getInt(27, -1), (PorterDuff.Mode) null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.c1 = appCompatTextView;
        appCompatTextView.setId(2131431319);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        linearLayout.addView(r12);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.e1 = appCompatTextView2;
        appCompatTextView2.setId(2131431320);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        appCompatTextView2.setAccessibilityLiveRegion(1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(r7);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(z2);
        setHelperText(text2);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setErrorContentDescription(text);
        setCounterTextAppearance(this.R0);
        setCounterOverflowTextAppearance(this.Q0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        setPrefixText(text4);
        setPrefixTextAppearance(resourceId4);
        setSuffixText(text5);
        setSuffixTextAppearance(resourceId5);
        if (typedArrayObtainStyledAttributes.hasValue(34)) {
            setErrorTextColor(lvc1Var.g(34));
        }
        if (typedArrayObtainStyledAttributes.hasValue(39)) {
            setHelperTextColor(lvc1Var.g(39));
        }
        if (typedArrayObtainStyledAttributes.hasValue(43)) {
            setHintTextColor(lvc1Var.g(43));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterTextColor(lvc1Var.g(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setCounterOverflowTextColor(lvc1Var.g(19));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setPlaceholderTextColor(lvc1Var.g(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(54)) {
            setPrefixTextColor(lvc1Var.g(54));
        }
        if (typedArrayObtainStyledAttributes.hasValue(64)) {
            setSuffixTextColor(lvc1Var.g(64));
        }
        setCounterEnabled(z3);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        lvc1Var.I();
        setImportantForAccessibility(2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26 || i4 < 26) {
            return;
        }
        u7k1.b(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private mzx getEndIconDelegate() {
        int i = this.G1;
        SparseArray sparseArray = this.H1;
        mzx mzxVar = (mzx) sparseArray.get(i);
        return mzxVar != null ? mzxVar : (mzx) sparseArray.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        ?? r0 = this.T1;
        if (r0.getVisibility() == 0) {
            return r0;
        }
        if (this.G1 == 0 || !g()) {
            return null;
        }
        return this.I1;
    }

    public static void j(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = b8k1.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.e != null) {
            hhg1.n("We already have an EditText, can only have one");
            return;
        }
        this.e = editText;
        setMinWidth(this.g);
        setMaxWidth(this.h);
        h();
        setTextInputAccessibilityDelegate(new x8e1(this));
        Typeface typeface = this.e.getTypeface();
        pzg pzgVar = this.h2;
        ghd ghdVar = pzgVar.B;
        if (ghdVar != null) {
            ghdVar.e = true;
        }
        if (pzgVar.x != typeface) {
            pzgVar.x = typeface;
            z = true;
        } else {
            z = false;
        }
        ghd ghdVar2 = pzgVar.A;
        if (ghdVar2 != null) {
            ghdVar2.e = true;
        }
        if (pzgVar.y != typeface) {
            pzgVar.y = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            pzgVar.i(false);
        }
        float textSize = this.e.getTextSize();
        if (pzgVar.m != textSize) {
            pzgVar.m = textSize;
            pzgVar.i(false);
        }
        int gravity = this.e.getGravity();
        pzgVar.l((gravity & (-113)) | 48);
        if (pzgVar.k != gravity) {
            pzgVar.k = gravity;
            pzgVar.i(false);
        }
        this.e.addTextChangedListener(new p96(this, (byte) 14));
        if (this.V1 == null) {
            this.V1 = this.e.getHintTextColors();
        }
        if (this.f1) {
            if (TextUtils.isEmpty(this.g1)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.h1 = true;
        }
        if (this.P0 != null) {
            n(this.e.getText().length());
        }
        q();
        this.i.b();
        this.b.bringToFront();
        this.c.bringToFront();
        this.d.bringToFront();
        this.T1.bringToFront();
        Iterator it = this.F1.iterator();
        while (it.hasNext()) {
            ((igg) it.next()).a(this);
        }
        u();
        x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        s(false, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void setErrorIconVisible(boolean z) {
        this.T1.setVisibility(z ? 0 : 8);
        this.d.setVisibility(z ? 8 : 0);
        x();
        if (this.G1 != 0) {
            return;
        }
        p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.g1)) {
            return;
        }
        this.g1 = charSequence;
        pzg pzgVar = this.h2;
        if (charSequence == null || !TextUtils.equals(pzgVar.C, charSequence)) {
            pzgVar.C = charSequence;
            pzgVar.D = null;
            Bitmap bitmap = pzgVar.G;
            if (bitmap != null) {
                bitmap.recycle();
                pzgVar.G = null;
            }
            pzgVar.i(false);
        }
        if (this.g2) {
            return;
        }
        i();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.T0 == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.U0 = appCompatTextView;
            appCompatTextView.setId(2131431318);
            pg10 pg10Var = new pg10();
            ((jhg1) pg10Var).c = 87L;
            LinearInterpolator linearInterpolator = je5.a;
            ((jhg1) pg10Var).d = linearInterpolator;
            this.X0 = pg10Var;
            ((jhg1) pg10Var).b = 67L;
            pg10 pg10Var2 = new pg10();
            ((jhg1) pg10Var2).c = 87L;
            ((jhg1) pg10Var2).d = linearInterpolator;
            this.Y0 = pg10Var2;
            AppCompatTextView appCompatTextView2 = this.U0;
            WeakHashMap weakHashMap = b8k1.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.W0);
            setPlaceholderTextColor(this.V0);
            View view = this.U0;
            if (view != null) {
                this.a.addView(view);
                this.U0.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView3 = this.U0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setVisibility(8);
            }
            this.U0 = null;
        }
        this.T0 = z;
    }

    public final void a(float f) {
        pzg pzgVar = this.h2;
        if (pzgVar.c == f) {
            return;
        }
        if (this.k2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.k2 = valueAnimator;
            valueAnimator.setInterpolator(je5.b);
            this.k2.setDuration(167L);
            this.k2.addUpdateListener(new kb5(this, (byte) 20));
        }
        this.k2.setFloatValues(pzgVar.c, f);
        this.k2.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        int i3;
        gch0 gch0Var = this.i1;
        if (gch0Var == null) {
            return;
        }
        gch0Var.setShapeAppearanceModel(this.k1);
        if (this.m1 == 2 && (i2 = this.o1) > -1 && (i3 = this.r1) != 0) {
            gch0 gch0Var2 = this.i1;
            gch0Var2.a.j = i2;
            gch0Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            fch0 fch0Var = gch0Var2.a;
            if (fch0Var.d != colorStateListValueOf) {
                fch0Var.d = colorStateListValueOf;
                gch0Var2.onStateChange(gch0Var2.getState());
            }
        }
        int i4 = this.s1;
        if (this.m1 == 1) {
            i4 = uah.i(this.s1, ago1.o(getContext(), 2130969040, 0));
        }
        this.s1 = i4;
        this.i1.m(ColorStateList.valueOf(i4));
        if (this.G1 == 3) {
            this.e.getBackground().invalidateSelf();
        }
        gch0 gch0Var3 = this.j1;
        if (gch0Var3 != null) {
            if (this.o1 > -1 && (i = this.r1) != 0) {
                gch0Var3.m(ColorStateList.valueOf(i));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.I1, this.L1, this.K1, this.N1, this.M1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.h1;
            this.h1 = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.h1 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.m2 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.m2 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1) {
            this.h2.d(canvas);
        }
        gch0 gch0Var = this.j1;
        if (gch0Var != null) {
            Rect bounds = gch0Var.getBounds();
            bounds.top = bounds.bottom - this.o1;
            this.j1.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.l2) {
            return;
        }
        this.l2 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        pzg pzgVar = this.h2;
        if (pzgVar != null) {
            pzgVar.J = drawableState;
            ColorStateList colorStateList2 = pzgVar.p;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = pzgVar.o) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                pzgVar.i(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.e != null) {
            WeakHashMap weakHashMap = b8k1.a;
            s(isLaidOut() && isEnabled(), false);
        }
        q();
        z();
        if (z) {
            invalidate();
        }
        this.l2 = false;
    }

    public final int e() {
        float fE;
        if (!this.f1) {
            return 0;
        }
        int i = this.m1;
        pzg pzgVar = this.h2;
        if (i == 0 || i == 1) {
            fE = pzgVar.e();
        } else {
            if (i != 2) {
                return 0;
            }
            fE = pzgVar.e() / 2.0f;
        }
        return (int) fE;
    }

    public final boolean f() {
        return this.f1 && !TextUtils.isEmpty(this.g1) && (this.i1 instanceof cto);
    }

    public final boolean g() {
        return this.d.getVisibility() == 0 && this.I1.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public gch0 getBoxBackground() {
        int i = this.m1;
        if (i == 1 || i == 2) {
            return this.i1;
        }
        bhn0.w();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.s1;
    }

    public int getBoxBackgroundMode() {
        return this.m1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.n1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        gch0 gch0Var = this.i1;
        return gch0Var.a.a.h.a(gch0Var.g());
    }

    public float getBoxCornerRadiusBottomStart() {
        gch0 gch0Var = this.i1;
        return gch0Var.a.a.g.a(gch0Var.g());
    }

    public float getBoxCornerRadiusTopEnd() {
        gch0 gch0Var = this.i1;
        return gch0Var.a.a.f.a(gch0Var.g());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.i1.h();
    }

    public int getBoxStrokeColor() {
        return this.Z1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.a2;
    }

    public int getBoxStrokeWidth() {
        return this.p1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.q1;
    }

    public int getCounterMaxLength() {
        return this.N0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.t && this.O0 && (appCompatTextView = this.P0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.Z0;
    }

    public ColorStateList getCounterTextColor() {
        return this.Z0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.V1;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.I1.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.I1.getDrawable();
    }

    public int getEndIconMode() {
        return this.G1;
    }

    public CheckableImageButton getEndIconView() {
        return this.I1;
    }

    public CharSequence getError() {
        la80 la80Var = this.i;
        if (la80Var.k) {
            return la80Var.j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.i.m;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.i.l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.T1.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        AppCompatTextView appCompatTextView = this.i.l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        la80 la80Var = this.i;
        if (la80Var.q) {
            return la80Var.f21p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.i.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1) {
            return this.g1;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.h2.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        pzg pzgVar = this.h2;
        return pzgVar.f(pzgVar.p);
    }

    public ColorStateList getHintTextColor() {
        return this.W1;
    }

    public int getMaxWidth() {
        return this.h;
    }

    public int getMinWidth() {
        return this.g;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.I1.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.I1.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.T0) {
            return this.S0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.W0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.V0;
    }

    public CharSequence getPrefixText() {
        return this.b1;
    }

    public ColorStateList getPrefixTextColor() {
        return this.c1.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.c1;
    }

    public CharSequence getStartIconContentDescription() {
        return this.x1.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.x1.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.d1;
    }

    public ColorStateList getSuffixTextColor() {
        return this.e1.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.e1;
    }

    public Typeface getTypeface() {
        return this.w1;
    }

    public final void h() {
        int i = this.m1;
        if (i != 0) {
            iw61 iw61Var = this.k1;
            if (i == 1) {
                this.i1 = new gch0(iw61Var);
                this.j1 = new gch0();
            } else {
                if (i != 2) {
                    hhg1.n(gvg.j(new StringBuilder(), this.m1, " is illegal; only @BoxBackgroundMode constants are supported."));
                    return;
                }
                if (!this.f1 || (this.i1 instanceof cto)) {
                    this.i1 = new gch0(iw61Var);
                } else {
                    this.i1 = new cto(iw61Var);
                }
                this.j1 = null;
            }
        } else {
            this.i1 = null;
            this.j1 = null;
        }
        EditText editText = this.e;
        if (editText != null && this.i1 != null && editText.getBackground() == null && this.m1 != 0) {
            EditText editText2 = this.e;
            gch0 gch0Var = this.i1;
            WeakHashMap weakHashMap = b8k1.a;
            editText2.setBackground(gch0Var);
        }
        z();
        if (this.m1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.n1 = getResources().getDimensionPixelSize(2131166438);
            } else if (dgo1.n(getContext())) {
                this.n1 = getResources().getDimensionPixelSize(2131166437);
            }
        }
        if (this.e != null && this.m1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.e;
                WeakHashMap weakHashMap2 = b8k1.a;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(2131166436), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(2131166435));
            } else if (dgo1.n(getContext())) {
                EditText editText4 = this.e;
                WeakHashMap weakHashMap3 = b8k1.a;
                editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(2131166434), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(2131166433));
            }
        }
        if (this.m1 != 0) {
            r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    public final void i() {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        if (f()) {
            int width = this.e.getWidth();
            int gravity = this.e.getGravity();
            pzg pzgVar = this.h2;
            boolean zB = pzgVar.b(pzgVar.C);
            pzgVar.E = zB;
            Rect rect = pzgVar.i;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = pzgVar.a0;
                    }
                } else if (zB) {
                    f = rect.right;
                    f2 = pzgVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                RectF rectF = this.v1;
                rectF.left = f3;
                float f6 = rect.top;
                rectF.top = f6;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (pzgVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        f5 = pzgVar.a0;
                        f4 = f5 + f3;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (zB) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = pzgVar.a0;
                    f4 = f5 + f3;
                }
                rectF.right = f4;
                rectF.bottom = pzgVar.e() + f6;
                float f7 = rectF.left;
                float f8 = this.l1;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.o1);
                cto ctoVar = (cto) this.i1;
                ctoVar.getClass();
                ctoVar.u(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            f2 = pzgVar.a0 / 2.0f;
            f3 = f - f2;
            RectF rectF2 = this.v1;
            rectF2.left = f3;
            float f9 = rect.top;
            rectF2.top = f9;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (pzgVar.a0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (pzgVar.a0 / 2.0f);
            }
            rectF2.right = f4;
            rectF2.bottom = pzgVar.e() + f9;
            float f10 = rectF2.left;
            float f11 = this.l1;
            rectF2.left = f10 - f11;
            rectF2.right += f11;
            rectF2.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF2.height() / 2.0f)) + this.o1);
            cto ctoVar2 = (cto) this.i1;
            ctoVar2.getClass();
            ctoVar2.u(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public final void m(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(2132017895);
        appCompatTextView.setTextColor(getContext().getColor(2131101321));
    }

    public final void n(int i) {
        boolean z = this.O0;
        int i2 = this.N0;
        if (i2 == -1) {
            this.P0.setText(String.valueOf(i));
            this.P0.setContentDescription(null);
            this.O0 = false;
        } else {
            this.O0 = i > i2;
            Context context = getContext();
            this.P0.setContentDescription(context.getString(this.O0 ? 2131953541 : 2131953540, Integer.valueOf(i), Integer.valueOf(this.N0)));
            if (z != this.O0) {
                o();
            }
            this.P0.setText(ira.c().e(getContext().getString(2131953542, Integer.valueOf(i), Integer.valueOf(this.N0))));
        }
        if (this.e == null || z == this.O0) {
            return;
        }
        s(false, false);
        z();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.P0;
        if (appCompatTextView != null) {
            m(appCompatTextView, this.O0 ? this.Q0 : this.R0);
            if (!this.O0 && (colorStateList2 = this.Z0) != null) {
                this.P0.setTextColor(colorStateList2);
            }
            if (!this.O0 || (colorStateList = this.a1) == null) {
                return;
            }
            this.P0.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingRight;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.t1;
            odt.a(this, editText, rect);
            gch0 gch0Var = this.j1;
            if (gch0Var != null) {
                int i5 = rect.bottom;
                gch0Var.setBounds(rect.left, i5 - this.q1, rect.right, i5);
            }
            if (this.f1) {
                float textSize = this.e.getTextSize();
                pzg pzgVar = this.h2;
                if (pzgVar.m != textSize) {
                    pzgVar.m = textSize;
                    pzgVar.i(false);
                }
                int gravity = this.e.getGravity();
                pzgVar.l((gravity & (-113)) | 48);
                if (pzgVar.k != gravity) {
                    pzgVar.k = gravity;
                    pzgVar.i(false);
                }
                if (this.e == null) {
                    bhn0.w();
                    return;
                }
                WeakHashMap weakHashMap = b8k1.a;
                boolean z2 = getLayoutDirection() == 1;
                int i6 = rect.bottom;
                Rect rect2 = this.u1;
                rect2.bottom = i6;
                int i7 = this.m1;
                int i8 = rect.left;
                AppCompatTextView appCompatTextView = this.c1;
                if (i7 == 1) {
                    int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + i8;
                    if (this.b1 != null && !z2) {
                        compoundPaddingLeft = (compoundPaddingLeft - appCompatTextView.getMeasuredWidth()) + appCompatTextView.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.n1;
                    compoundPaddingRight = rect.right - this.e.getCompoundPaddingRight();
                    if (this.b1 != null && z2) {
                        compoundPaddingRight = (appCompatTextView.getMeasuredWidth() - appCompatTextView.getPaddingRight()) + compoundPaddingRight;
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i7 != 2) {
                    int compoundPaddingLeft2 = this.e.getCompoundPaddingLeft() + i8;
                    if (this.b1 != null && !z2) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - appCompatTextView.getMeasuredWidth()) + appCompatTextView.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    compoundPaddingRight = rect.right - this.e.getCompoundPaddingRight();
                    if (this.b1 != null && z2) {
                        compoundPaddingRight += appCompatTextView.getMeasuredWidth() - appCompatTextView.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else {
                    rect2.left = this.e.getPaddingLeft() + i8;
                    rect2.top = rect.top - e();
                    compoundPaddingRight = rect.right - this.e.getPaddingRight();
                    rect2.right = compoundPaddingRight;
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.bottom;
                Rect rect3 = pzgVar.i;
                if (rect3.left != i9 || rect3.top != i10 || rect3.right != compoundPaddingRight || rect3.bottom != i11) {
                    rect3.set(i9, i10, compoundPaddingRight, i11);
                    pzgVar.K = true;
                    pzgVar.h();
                }
                if (this.e == null) {
                    bhn0.w();
                    return;
                }
                TextPaint textPaint = pzgVar.M;
                textPaint.setTextSize(pzgVar.m);
                textPaint.setTypeface(pzgVar.y);
                textPaint.setLetterSpacing(pzgVar.Y);
                float f = -textPaint.ascent();
                rect2.left = this.e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.m1 != 1 || this.e.getMinLines() > 1) ? rect.top + this.e.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.m1 != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                Rect rect4 = pzgVar.h;
                if (rect4.left != i12 || rect4.top != i13 || rect4.right != i14 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i12, i13, i14, compoundPaddingBottom);
                    pzgVar.K = true;
                    pzgVar.h();
                }
                pzgVar.i(false);
                if (!f() || this.g2) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.e != null && this.e.getMeasuredHeight() < (iMax = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zP = p();
        if (z || zP) {
            this.e.post(new w8e1(this, (byte) 1));
        }
        if (this.U0 != null && (editText = this.e) != null) {
            this.U0.setGravity(editText.getGravity());
            this.U0.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y8e1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y8e1 y8e1Var = (y8e1) parcelable;
        super.onRestoreInstanceState(((i5) y8e1Var).a);
        setError(y8e1Var.c);
        if (y8e1Var.d) {
            this.I1.post(new w8e1(this, (byte) 0));
        }
        setHint(y8e1Var.e);
        setHelperText(y8e1Var.f);
        setPlaceholderText(y8e1Var.g);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, p.i5, p.y8e1] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? y8e1Var = new y8e1(super.onSaveInstanceState());
        if (this.i.e()) {
            y8e1Var.c = getError();
        }
        y8e1Var.d = this.G1 != 0 && this.I1.d;
        y8e1Var.e = getHint();
        y8e1Var.f = getHelperText();
        y8e1Var.g = getPlaceholderText();
        return y8e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    public final boolean p() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        boolean z2 = true;
        if (getStartIconDrawable() != null || this.b1 != null) {
            LinearLayout linearLayout = this.b;
            if (linearLayout.getMeasuredWidth() > 0) {
                int measuredWidth = linearLayout.getMeasuredWidth() - this.e.getPaddingLeft();
                if (this.C1 == null || this.D1 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.C1 = colorDrawable;
                    this.D1 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.C1;
                if (drawable != colorDrawable2) {
                    this.e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.C1 != null) {
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.C1 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.C1 != null) {
            Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.C1 = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.T1.getVisibility() == 0 || ((this.G1 != 0 && g()) || this.d1 != null)) && this.c.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.e1.getMeasuredWidth() - this.e.getPaddingRight();
            AppCompatImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.O1;
            if (colorDrawable3 != null && this.P1 != measuredWidth2) {
                this.P1 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.O1, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.O1 = colorDrawable4;
                this.P1 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.O1;
            if (drawable2 != colorDrawable5) {
                this.Q1 = drawable2;
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.O1 != null) {
            Drawable[] compoundDrawablesRelative5 = this.e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.O1) {
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.Q1, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.O1 = null;
            return z2;
        }
        return z;
    }

    public final void q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.m1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = a8v.a;
        Drawable drawableMutate = background.mutate();
        la80 la80Var = this.i;
        if (la80Var.e()) {
            AppCompatTextView appCompatTextView2 = la80Var.l;
            drawableMutate.setColorFilter(ck5.c(appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.O0 && (appCompatTextView = this.P0) != null) {
            drawableMutate.setColorFilter(ck5.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void r() {
        if (this.m1 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        la80 la80Var = this.i;
        boolean zE = la80Var.e();
        ColorStateList colorStateList2 = this.V1;
        pzg pzgVar = this.h2;
        if (colorStateList2 != null) {
            pzgVar.k(colorStateList2);
            ColorStateList colorStateList3 = this.V1;
            if (pzgVar.o != colorStateList3) {
                pzgVar.o = colorStateList3;
                pzgVar.i(false);
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.V1;
            int colorForState = this.f2;
            if (colorStateList4 != null) {
                colorForState = colorStateList4.getColorForState(new int[]{-16842910}, colorForState);
            }
            pzgVar.k(ColorStateList.valueOf(colorForState));
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (pzgVar.o != colorStateListValueOf) {
                pzgVar.o = colorStateListValueOf;
                pzgVar.i(false);
            }
        } else if (zE) {
            AppCompatTextView appCompatTextView2 = la80Var.l;
            pzgVar.k(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.O0 && (appCompatTextView = this.P0) != null) {
            pzgVar.k(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.W1) != null) {
            pzgVar.k(colorStateList);
        }
        if (z3 || !this.i2 || (isEnabled() && z4)) {
            if (z2 || this.g2) {
                ValueAnimator valueAnimator = this.k2;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.k2.cancel();
                }
                if (z && this.j2) {
                    a(1.0f);
                } else {
                    pzgVar.n(1.0f);
                }
                this.g2 = false;
                if (f()) {
                    i();
                }
                EditText editText3 = this.e;
                t(editText3 != null ? editText3.getText().length() : 0);
                v();
                y();
                return;
            }
            return;
        }
        if (z2 || !this.g2) {
            ValueAnimator valueAnimator2 = this.k2;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.k2.cancel();
            }
            if (z && this.j2) {
                a(0.0f);
            } else {
                pzgVar.n(0.0f);
            }
            if (f() && !((cto) this.i1).Y0.isEmpty() && f()) {
                ((cto) this.i1).u(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.g2 = true;
            AppCompatTextView appCompatTextView3 = this.U0;
            if (appCompatTextView3 != null && this.T0) {
                appCompatTextView3.setText(null);
                fjg1.a(this.a, this.Y0);
                this.U0.setVisibility(4);
            }
            v();
            y();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.s1 != i) {
            this.s1 = i;
            this.b2 = i;
            this.d2 = i;
            this.e2 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.b2 = defaultColor;
        this.s1 = defaultColor;
        this.c2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.d2 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.e2 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.m1) {
            return;
        }
        this.m1 = i;
        if (this.e != null) {
            h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.n1 = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.Z1 != i) {
            this.Z1 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.X1 = colorStateList.getDefaultColor();
            this.f2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.Y1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.Z1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.Z1 != colorStateList.getDefaultColor()) {
            this.Z1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.a2 != colorStateList) {
            this.a2 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.p1 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.q1 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.t != z) {
            la80 la80Var = this.i;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.P0 = appCompatTextView;
                appCompatTextView.setId(2131431315);
                Typeface typeface = this.w1;
                if (typeface != null) {
                    this.P0.setTypeface(typeface);
                }
                this.P0.setMaxLines(1);
                la80Var.a(this.P0, 2);
                ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131166721));
                o();
                if (this.P0 != null) {
                    EditText editText = this.e;
                    n(editText == null ? 0 : editText.getText().length());
                }
            } else {
                la80Var.h(this.P0, 2);
                this.P0 = null;
            }
            this.t = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.N0 != i) {
            if (i > 0) {
                this.N0 = i;
            } else {
                this.N0 = -1;
            }
            if (!this.t || this.P0 == null) {
                return;
            }
            EditText editText = this.e;
            n(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.Q0 != i) {
            this.Q0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.a1 != colorStateList) {
            this.a1 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.R0 != i) {
            this.R0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.Z0 != colorStateList) {
            this.Z0 = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.V1 = colorStateList;
        this.W1 = colorStateList;
        if (this.e != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        j(this, z);
        super.setEnabled(z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setEndIconActivated(boolean z) {
        this.I1.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.I1.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? f0o1.j(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.G1;
        this.G1 = i;
        Iterator it = this.J1.iterator();
        while (true) {
            if (!it.hasNext()) {
                setEndIconVisible(i != 0);
                if (!getEndIconDelegate().b(this.m1)) {
                    qpp0.l(this.m1, i, " is not supported by the end icon mode ", "The current box background mode ");
                    return;
                } else {
                    getEndIconDelegate().a();
                    c();
                    return;
                }
            }
            jgg jggVar = (jgg) it.next();
            switch (jggVar.a) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    mgg mggVar = (mgg) jggVar.b;
                    AppCompatImageButton appCompatImageButton = mggVar.c;
                    x29 x29Var = mggVar.f;
                    EditText editText = getEditText();
                    if (editText != null && i2 == 2) {
                        editText.post(new xwn1(jggVar, editText, false, (byte) 9));
                        if (editText.getOnFocusChangeListener() == x29Var) {
                            editText.setOnFocusChangeListener(null);
                        }
                        if (appCompatImageButton.getOnFocusChangeListener() == x29Var) {
                            appCompatImageButton.setOnFocusChangeListener(null);
                        }
                    }
                    break;
                case 1:
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                    if (autoCompleteTextView != null && i2 == 3) {
                        autoCompleteTextView.post(new xwn1(jggVar, autoCompleteTextView, false, (byte) 17));
                        if (autoCompleteTextView.getOnFocusChangeListener() == ((jav) jggVar.b).f) {
                            autoCompleteTextView.setOnFocusChangeListener(null);
                        }
                        autoCompleteTextView.setOnTouchListener(null);
                        autoCompleteTextView.setOnDismissListener(null);
                    }
                    break;
                default:
                    EditText editText2 = getEditText();
                    if (editText2 != null && i2 == 1) {
                        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        editText2.post(new jyh0(jggVar, editText2));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.R1;
        ?? r1 = this.I1;
        r1.setOnClickListener(onClickListener);
        l(r1, onLongClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.R1 = onLongClickListener;
        ?? r0 = this.I1;
        r0.setOnLongClickListener(onLongClickListener);
        l(r0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.K1 != colorStateList) {
            this.K1 = colorStateList;
            this.L1 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.M1 != mode) {
            this.M1 = mode;
            this.N1 = true;
            c();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setEndIconVisible(boolean z) {
        if (g() != z) {
            this.I1.setVisibility(z ? 0 : 8);
            x();
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        la80 la80Var = this.i;
        if (!la80Var.k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            la80Var.g();
            return;
        }
        la80Var.c();
        la80Var.j = charSequence;
        la80Var.l.setText(charSequence);
        byte b = la80Var.h;
        if (b != 1) {
            la80Var.i = (byte) 1;
        }
        la80Var.j(b, la80Var.i, la80Var.i(la80Var.l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        la80 la80Var = this.i;
        la80Var.m = charSequence;
        AppCompatTextView appCompatTextView = la80Var.l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        la80 la80Var = this.i;
        TextInputLayout textInputLayout = la80Var.b;
        if (la80Var.k == z) {
            return;
        }
        la80Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(la80Var.a);
            la80Var.l = appCompatTextView;
            appCompatTextView.setId(2131431316);
            la80Var.l.setTextAlignment(5);
            Typeface typeface = la80Var.u;
            if (typeface != null) {
                la80Var.l.setTypeface(typeface);
            }
            int i = la80Var.n;
            la80Var.n = i;
            AppCompatTextView appCompatTextView2 = la80Var.l;
            if (appCompatTextView2 != null) {
                la80Var.b.m(appCompatTextView2, i);
            }
            ColorStateList colorStateList = la80Var.o;
            la80Var.o = colorStateList;
            AppCompatTextView appCompatTextView3 = la80Var.l;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = la80Var.m;
            la80Var.m = charSequence;
            AppCompatTextView appCompatTextView4 = la80Var.l;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            la80Var.l.setVisibility(4);
            AppCompatTextView appCompatTextView5 = la80Var.l;
            WeakHashMap weakHashMap = b8k1.a;
            appCompatTextView5.setAccessibilityLiveRegion(1);
            la80Var.a(la80Var.l, 0);
        } else {
            la80Var.g();
            la80Var.h(la80Var.l, 0);
            la80Var.l = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        la80Var.k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? f0o1.j(getContext(), i) : null);
        k(this.T1, this.U1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.S1;
        ?? r1 = this.T1;
        r1.setOnClickListener(onClickListener);
        l(r1, onLongClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.S1 = onLongClickListener;
        ?? r0 = this.T1;
        r0.setOnLongClickListener(onLongClickListener);
        l(r0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.U1 = colorStateList;
        AppCompatImageButton appCompatImageButton = this.T1;
        Drawable drawable = appCompatImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (appCompatImageButton.getDrawable() != drawable) {
            appCompatImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        AppCompatImageButton appCompatImageButton = this.T1;
        Drawable drawable = appCompatImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (appCompatImageButton.getDrawable() != drawable) {
            appCompatImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        la80 la80Var = this.i;
        la80Var.n = i;
        AppCompatTextView appCompatTextView = la80Var.l;
        if (appCompatTextView != null) {
            la80Var.b.m(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        la80 la80Var = this.i;
        la80Var.o = colorStateList;
        AppCompatTextView appCompatTextView = la80Var.l;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.i2 != z) {
            this.i2 = z;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        la80 la80Var = this.i;
        if (zIsEmpty) {
            if (la80Var.q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!la80Var.q) {
            setHelperTextEnabled(true);
        }
        la80Var.c();
        la80Var.f21p = charSequence;
        la80Var.r.setText(charSequence);
        byte b = la80Var.h;
        if (b != 2) {
            la80Var.i = (byte) 2;
        }
        la80Var.j(b, la80Var.i, la80Var.i(la80Var.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        la80 la80Var = this.i;
        la80Var.t = colorStateList;
        AppCompatTextView appCompatTextView = la80Var.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        la80 la80Var = this.i;
        TextInputLayout textInputLayout = la80Var.b;
        if (la80Var.q == z) {
            return;
        }
        la80Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(la80Var.a);
            la80Var.r = appCompatTextView;
            appCompatTextView.setId(2131431317);
            la80Var.r.setTextAlignment(5);
            Typeface typeface = la80Var.u;
            if (typeface != null) {
                la80Var.r.setTypeface(typeface);
            }
            la80Var.r.setVisibility(4);
            AppCompatTextView appCompatTextView2 = la80Var.r;
            WeakHashMap weakHashMap = b8k1.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i = la80Var.s;
            la80Var.s = i;
            AppCompatTextView appCompatTextView3 = la80Var.r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = la80Var.t;
            la80Var.t = colorStateList;
            AppCompatTextView appCompatTextView4 = la80Var.r;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            la80Var.a(la80Var.r, 1);
        } else {
            la80Var.c();
            byte b = la80Var.h;
            if (b == 2) {
                la80Var.i = (byte) 0;
            }
            la80Var.j(b, la80Var.i, la80Var.i(la80Var.r, null));
            la80Var.h(la80Var.r, 1);
            la80Var.r = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        la80Var.q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        la80 la80Var = this.i;
        la80Var.s = i;
        AppCompatTextView appCompatTextView = la80Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.j2 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f1) {
            this.f1 = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.g1)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.h1 = true;
            } else {
                this.h1 = false;
                if (!TextUtils.isEmpty(this.g1) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.g1);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        pzg pzgVar = this.h2;
        pzgVar.j(i);
        this.W1 = pzgVar.p;
        if (this.e != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.W1 != colorStateList) {
            if (this.V1 == null) {
                this.h2.k(colorStateList);
            }
            this.W1 = colorStateList;
            if (this.e != null) {
                s(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? f0o1.j(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.G1 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.K1 = colorStateList;
        this.L1 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.M1 = mode;
        this.N1 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.T0 && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.T0) {
                setPlaceholderTextEnabled(true);
            }
            this.S0 = charSequence;
        }
        EditText editText = this.e;
        t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.W0 = i;
        AppCompatTextView appCompatTextView = this.U0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.V0 != colorStateList) {
            this.V0 = colorStateList;
            AppCompatTextView appCompatTextView = this.U0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b1 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.c1.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i) {
        this.c1.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.c1.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.x1.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.x1;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            d(checkableImageButton, this.z1, this.y1, this.B1, this.A1);
            setStartIconVisible(true);
            k(checkableImageButton, this.y1);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.E1;
        ?? r1 = this.x1;
        r1.setOnClickListener(onClickListener);
        l(r1, onLongClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.E1 = onLongClickListener;
        ?? r0 = this.x1;
        r0.setOnLongClickListener(onLongClickListener);
        l(r0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.y1 != colorStateList) {
            this.y1 = colorStateList;
            this.z1 = true;
            d(this.x1, true, colorStateList, this.B1, this.A1);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.A1 != mode) {
            this.A1 = mode;
            this.B1 = true;
            d(this.x1, this.z1, this.y1, true, mode);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setStartIconVisible(boolean z) {
        AppCompatImageButton appCompatImageButton = this.x1;
        if ((appCompatImageButton.getVisibility() == 0) != z) {
            appCompatImageButton.setVisibility(z ? 0 : 8);
            u();
            p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.d1 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.e1.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i) {
        this.e1.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.e1.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(x8e1 x8e1Var) {
        EditText editText = this.e;
        if (editText != null) {
            b8k1.p(editText, x8e1Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.w1) {
            this.w1 = typeface;
            pzg pzgVar = this.h2;
            ghd ghdVar = pzgVar.B;
            boolean z2 = true;
            if (ghdVar != null) {
                ghdVar.e = true;
            }
            if (pzgVar.x != typeface) {
                pzgVar.x = typeface;
                z = true;
            } else {
                z = false;
            }
            ghd ghdVar2 = pzgVar.A;
            if (ghdVar2 != null) {
                ghdVar2.e = true;
            }
            if (pzgVar.y != typeface) {
                pzgVar.y = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                pzgVar.i(false);
            }
            la80 la80Var = this.i;
            if (typeface != la80Var.u) {
                la80Var.u = typeface;
                AppCompatTextView appCompatTextView = la80Var.l;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = la80Var.r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.P0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i) {
        FrameLayout frameLayout = this.a;
        if (i != 0 || this.g2) {
            AppCompatTextView appCompatTextView = this.U0;
            if (appCompatTextView == null || !this.T0) {
                return;
            }
            appCompatTextView.setText(null);
            fjg1.a(frameLayout, this.Y0);
            this.U0.setVisibility(4);
            return;
        }
        AppCompatTextView appCompatTextView2 = this.U0;
        if (appCompatTextView2 == null || !this.T0) {
            return;
        }
        appCompatTextView2.setText(this.S0);
        fjg1.a(frameLayout, this.X0);
        this.U0.setVisibility(0);
        this.U0.bringToFront();
    }

    public final void u() {
        int paddingStart;
        if (this.e == null) {
            return;
        }
        if (this.x1.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.e;
            WeakHashMap weakHashMap = b8k1.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = this.e.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131166442);
        int compoundPaddingBottom = this.e.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = b8k1.a;
        this.c1.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void v() {
        this.c1.setVisibility((this.b1 == null || this.g2) ? 8 : 0);
        p();
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.a2.getDefaultColor();
        int colorForState = this.a2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.a2.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.r1 = colorForState2;
        } else if (z2) {
            this.r1 = colorForState;
        } else {
            this.r1 = defaultColor;
        }
    }

    public final void x() {
        int paddingEnd;
        if (this.e == null) {
            return;
        }
        if (g() || this.T1.getVisibility() == 0) {
            paddingEnd = 0;
        } else {
            EditText editText = this.e;
            WeakHashMap weakHashMap = b8k1.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131166442);
        int paddingTop = this.e.getPaddingTop();
        int paddingBottom = this.e.getPaddingBottom();
        WeakHashMap weakHashMap2 = b8k1.a;
        this.e1.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void y() {
        AppCompatTextView appCompatTextView = this.e1;
        int visibility = appCompatTextView.getVisibility();
        boolean z = (this.d1 == null || this.g2) ? false : true;
        appCompatTextView.setVisibility(z ? 0 : 8);
        if (visibility != appCompatTextView.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        p();
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.i1 == null || this.m1 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.e) != null && editText.isHovered());
        boolean zIsEnabled = isEnabled();
        la80 la80Var = this.i;
        if (!zIsEnabled) {
            this.r1 = this.f2;
        } else if (la80Var.e()) {
            if (this.a2 != null) {
                w(z2, z3);
            } else {
                AppCompatTextView appCompatTextView2 = la80Var.l;
                this.r1 = appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1;
            }
        } else if (!this.O0 || (appCompatTextView = this.P0) == null) {
            if (z2) {
                this.r1 = this.Z1;
            } else if (z3) {
                this.r1 = this.Y1;
            } else {
                this.r1 = this.X1;
            }
        } else if (this.a2 != null) {
            w(z2, z3);
        } else {
            this.r1 = appCompatTextView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && la80Var.k && la80Var.e()) {
            z = true;
        }
        setErrorIconVisible(z);
        k(this.T1, this.U1);
        k(this.x1, this.y1);
        ColorStateList colorStateList = this.K1;
        CheckableImageButton checkableImageButton = this.I1;
        k(checkableImageButton, colorStateList);
        mzx endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof jav) {
            if (!la80Var.e() || getEndIconDrawable() == null) {
                c();
            } else {
                Drawable drawableMutate = getEndIconDrawable().mutate();
                AppCompatTextView appCompatTextView3 = la80Var.l;
                drawableMutate.setTint(appCompatTextView3 != null ? appCompatTextView3.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        int i2 = this.o1;
        if (z2 && isEnabled()) {
            i = this.q1;
            this.o1 = i;
        } else {
            i = this.p1;
            this.o1 = i;
        }
        if (i != i2 && this.m1 == 2 && f() && !this.g2) {
            if (f()) {
                ((cto) this.i1).u(0.0f, 0.0f, 0.0f, 0.0f);
            }
            i();
        }
        if (this.m1 == 1) {
            if (!isEnabled()) {
                this.s1 = this.c2;
            } else if (z3 && !z2) {
                this.s1 = this.e2;
            } else if (z2) {
                this.s1 = this.d2;
            } else {
                this.s1 = this.b2;
            }
        }
        b();
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.I1.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.I1;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            c();
            k(checkableImageButton, this.K1);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.I1.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.I1.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.x1.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.T1.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.i.k);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? f0o1.j(getContext(), i) : null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970431);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
