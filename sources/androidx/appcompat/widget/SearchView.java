package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import app.p000rive.semantics.SemanticState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p.b8k1;
import p.djm0;
import p.e9k;
import p.hj5;
import p.ic51;
import p.jc51;
import p.kc51;
import p.kzg;
import p.lc51;
import p.lvc1;
import p.mc51;
import p.moo;
import p.moz0;
import p.nc51;
import p.oc51;
import p.p96;
import p.qk5;
import p.sik1;
import p.v0d0;
import p.wwc1;
import p.x29;
import p.y29;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class SearchView extends LinearLayoutCompat implements kzg {
    public static final djm0 I1;
    public CharSequence A1;
    public boolean B1;
    public int C1;
    public SearchableInfo D1;
    public Bundle E1;
    public final ic51 F1;
    public final ic51 G1;
    public final WeakHashMap H1;
    public final SearchAutoComplete S0;
    public final View T0;
    public final View U0;
    public final View V0;
    public final ImageView W0;
    public final ImageView X0;
    public final ImageView Y0;
    public final ImageView Z0;
    public final View a1;
    public oc51 b1;
    public final Rect c1;
    public final Rect d1;
    public final int[] e1;
    public final int[] f1;
    public final ImageView g1;
    public final Drawable h1;
    public final int i1;
    public final int j1;
    public final Intent k1;
    public final Intent l1;
    public final CharSequence m1;
    public lc51 n1;
    public View.OnFocusChangeListener o1;
    public View.OnClickListener p1;
    public boolean q1;
    public boolean r1;
    public moo s1;
    public boolean t1;
    public CharSequence u1;
    public boolean v1;
    public boolean w1;
    public int x1;
    public boolean y1;
    public String z1;

    static {
        djm0 djm0Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            djm0 djm0Var2 = new djm0();
            djm0Var2.a = null;
            djm0Var2.b = null;
            djm0Var2.c = null;
            djm0.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                djm0Var2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                djm0Var2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                djm0Var2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            djm0Var = djm0Var2;
        }
        I1 = djm0Var;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c1 = new Rect();
        this.d1 = new Rect();
        this.e1 = new int[2];
        this.f1 = new int[2];
        this.F1 = new ic51(this, (byte) 0);
        byte b = 1;
        this.G1 = new ic51(this, b);
        this.H1 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        TextView.OnEditorActionListener y29Var = new y29(this, (byte) 4);
        qk5 qk5Var = new qk5(this, (byte) 3);
        v0d0 v0d0Var = new v0d0(this, b);
        TextWatcher p96Var = new p96(this, (byte) 12);
        int[] iArr = moz0.u;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, i);
        b8k1.o(this, context, iArr, attributeSet, (TypedArray) lvc1VarE.c, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        layoutInflaterFrom.inflate(typedArray.getResourceId(9, 2131623961), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(2131430846);
        this.S0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.T0 = findViewById(2131430812);
        View viewFindViewById = findViewById(2131430832);
        this.U0 = viewFindViewById;
        View viewFindViewById2 = findViewById(2131431108);
        this.V0 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(2131430804);
        this.W0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131430822);
        this.X0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(2131430806);
        this.Y0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(2131430853);
        this.Z0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(2131430827);
        this.g1 = imageView5;
        viewFindViewById.setBackground(lvc1VarE.k(10));
        viewFindViewById2.setBackground(lvc1VarE.k(14));
        imageView.setImageDrawable(lvc1VarE.k(13));
        imageView2.setImageDrawable(lvc1VarE.k(7));
        imageView3.setImageDrawable(lvc1VarE.k(4));
        imageView4.setImageDrawable(lvc1VarE.k(16));
        imageView5.setImageDrawable(lvc1VarE.k(13));
        this.h1 = lvc1VarE.k(12);
        e9k.z(imageView, getResources().getString(2131951645));
        this.i1 = typedArray.getResourceId(15, 2131623960);
        this.j1 = typedArray.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(p96Var);
        searchAutoComplete.setOnEditorActionListener(y29Var);
        searchAutoComplete.setOnItemClickListener(qk5Var);
        searchAutoComplete.setOnItemSelectedListener(v0d0Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new x29(this, (byte) 12));
        setIconifiedByDefault(typedArray.getBoolean(8, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.m1 = typedArray.getText(6);
        this.u1 = typedArray.getText(11);
        int i2 = typedArray.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(0, true));
        lvc1VarE.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.k1 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.l1 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.a1 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new jc51(this));
        }
        x(this.q1);
        u();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(2131165238);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(2131165239);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.S0;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.w1 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.S0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.w1 = false;
    }

    public int getImeOptions() {
        return this.S0.getImeOptions();
    }

    public int getInputType() {
        return this.S0.getInputType();
    }

    public int getMaxWidth() {
        return this.x1;
    }

    public CharSequence getQuery() {
        return this.S0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.u1;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.D1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.m1 : getContext().getText(this.D1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.j1;
    }

    public int getSuggestionRowLayout() {
        return this.i1;
    }

    public moo getSuggestionsAdapter() {
        return this.s1;
    }

    public final void j() {
        View view = this.a1;
        if (view.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.U0.getPaddingLeft();
            Rect rect = new Rect();
            boolean z = sik1.a;
            boolean z2 = getLayoutDirection() == 1;
            int dimensionPixelSize = this.q1 ? resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165225) : 0;
            SearchAutoComplete searchAutoComplete = this.S0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i : paddingLeft - (i + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent k(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.A1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.E1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.D1.getSearchActivity());
        return intent;
    }

    public final Intent l(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.E1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void m() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.S0;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        djm0 djm0Var = I1;
        djm0Var.getClass();
        djm0.a();
        Method method = djm0Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        djm0.a();
        Method method2 = djm0Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void n() {
        SearchAutoComplete searchAutoComplete = this.S0;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.q1) {
            clearFocus();
            x(true);
        }
    }

    public final void o(int i) {
        String strI;
        Cursor cursor = this.s1.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentK = null;
            try {
                try {
                    int i2 = wwc1.X0;
                    String strI2 = wwc1.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strI2 == null) {
                        strI2 = this.D1.getSuggestIntentAction();
                    }
                    if (strI2 == null) {
                        strI2 = "android.intent.action.SEARCH";
                    }
                    String strI3 = wwc1.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strI3 == null) {
                        strI3 = this.D1.getSuggestIntentData();
                    }
                    if (strI3 != null && (strI = wwc1.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strI3 = strI3 + "/" + Uri.encode(strI);
                    }
                    intentK = k(strI3 == null ? null : Uri.parse(strI3), strI2, wwc1.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), wwc1.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentK != null) {
                try {
                    getContext().startActivity(intentK);
                } catch (RuntimeException unused3) {
                    intentK.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.S0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // p.kzg
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.S0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.A1 = "";
        clearFocus();
        x(true);
        searchAutoComplete.setImeOptions(this.C1);
        this.B1 = false;
    }

    @Override // p.kzg
    public final void onActionViewExpanded() {
        if (this.B1) {
            return;
        }
        this.B1 = true;
        SearchAutoComplete searchAutoComplete = this.S0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.C1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.F1);
        post(this.G1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.S0;
            int[] iArr = this.e1;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.c1;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.d1;
            rect2.set(i7, 0, i8, i9);
            oc51 oc51Var = this.b1;
            if (oc51Var == null) {
                oc51 oc51Var2 = new oc51(rect2, rect, searchAutoComplete);
                this.b1 = oc51Var2;
                setTouchDelegate(oc51Var2);
            } else {
                oc51Var.b.set(rect2);
                Rect rect3 = oc51Var.d;
                rect3.set(rect2);
                int i10 = -oc51Var.e;
                rect3.inset(i10, i10);
                oc51Var.c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.r1) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.x1;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.x1;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.x1) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nc51)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nc51 nc51Var = (nc51) parcelable;
        super.onRestoreInstanceState(nc51Var.a);
        x(nc51Var.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        nc51 nc51Var = new nc51(super.onSaveInstanceState());
        nc51Var.c = this.r1;
        return nc51Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.F1);
    }

    public final void p(int i) {
        Editable text = this.S0.getText();
        Cursor cursor = this.s1.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.s1.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void r() {
        SearchAutoComplete searchAutoComplete = this.S0;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        lc51 lc51Var = this.n1;
        if (lc51Var != null) {
            text.toString();
            if (lc51Var.g()) {
                return;
            }
        }
        if (this.D1 != null) {
            getContext().startActivity(k(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.w1 || !isFocusable()) {
            return false;
        }
        if (this.r1) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.S0.requestFocus(i, rect);
        if (zRequestFocus) {
            x(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.S0.getText());
        int i = (!zIsEmpty || (this.q1 && !this.B1)) ? 0 : 8;
        ImageView imageView = this.Y0;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.E1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            n();
            return;
        }
        x(false);
        SearchAutoComplete searchAutoComplete = this.S0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.p1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.q1 == z) {
            return;
        }
        this.q1 = z;
        x(z);
        u();
    }

    public void setImeOptions(int i) {
        this.S0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.S0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.x1 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.o1 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(lc51 lc51Var) {
        this.n1 = lc51Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.p1 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.u1 = charSequence;
        u();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.v1 = z;
        moo mooVar = this.s1;
        if (mooVar instanceof wwc1) {
            ((wwc1) mooVar).P0 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.D1 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.S0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.D1.getImeOptions());
            int inputType = this.D1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.D1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            moo mooVar = this.s1;
            if (mooVar != null) {
                mooVar.b(null);
            }
            if (this.D1.getSuggestAuthority() != null) {
                wwc1 wwc1Var = new wwc1(getContext(), this, this.D1, this.H1);
                this.s1 = wwc1Var;
                searchAutoComplete.setAdapter(wwc1Var);
                ((wwc1) this.s1).P0 = this.v1 ? 2 : 1;
            }
            u();
        }
        SearchableInfo searchableInfo2 = this.D1;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.D1.getVoiceSearchLaunchWebSearch()) {
                intent = this.k1;
            } else if (this.D1.getVoiceSearchLaunchRecognizer()) {
                intent = this.l1;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.y1 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        x(this.r1);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.t1 = z;
        x(this.r1);
    }

    public void setSuggestionsAdapter(moo mooVar) {
        this.s1 = mooVar;
        this.S0.setAdapter(mooVar);
    }

    public final void t() {
        int[] iArr = this.S0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.U0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.V0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.q1;
        SearchAutoComplete searchAutoComplete = this.S0;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.h1) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void v() {
        this.V0.setVisibility(((this.t1 || this.y1) && !this.r1 && (this.X0.getVisibility() == 0 || this.Z0.getVisibility() == 0)) ? 0 : 8);
    }

    public final void w(boolean z) {
        boolean z2 = this.t1;
        this.X0.setVisibility((!z2 || !(z2 || this.y1) || this.r1 || !hasFocus() || (!z && this.y1)) ? 8 : 0);
    }

    public final void x(boolean z) {
        this.r1 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.S0.getText());
        this.W0.setVisibility(i2);
        w(!zIsEmpty);
        this.T0.setVisibility(z ? 8 : 0);
        ImageView imageView = this.g1;
        imageView.setVisibility((imageView.getDrawable() == null || this.q1) ? 8 : 0);
        s();
        if (this.y1 && !this.r1 && zIsEmpty) {
            this.X0.setVisibility(8);
            i = 0;
        }
        this.Z0.setVisibility(i);
        v();
    }

    public static class SearchAutoComplete extends hj5 {
        public int e;
        public SearchView f;
        public boolean g;
        public final d h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new d(this);
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return SemanticState.Hidden;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            djm0 djm0Var = SearchView.I1;
            djm0Var.getClass();
            djm0.a();
            Method method = djm0Var.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // p.hj5, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                d dVar = this.h;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.x(searchView.r1);
            searchView.post(searchView.F1);
            if (searchView.S0.hasFocus()) {
                searchView.m();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                Context context = getContext();
                djm0 djm0Var = SearchView.I1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.h;
            if (!z) {
                this.g = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.g = true;
                    return;
                }
                this.g = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 2130968722);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public void setOnCloseListener(kc51 kc51Var) {
    }

    public void setOnSuggestionListener(mc51 mc51Var) {
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970187);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
