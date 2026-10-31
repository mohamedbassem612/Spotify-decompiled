package com.spotify.login.adaptiveauthentication.challenge.smscode;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import io.reactivex.rxjava3.core.Observable;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a7h1;
import p.b7x;
import p.dr41;
import p.i8h1;
import p.jrq0;
import p.krq0;
import p.oja;
import p.p96;
import p.qkn0;
import p.qq91;
import p.r6h1;
import p.rq91;
import p.ryn1;
import p.tym0;
import p.w7h1;
import p.x29;
import p.x6h1;
import p.x7h1;
import p.y29;
import p.y6h1;
import p.z7h1;
import p.zia;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018-.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0011R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010'\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&¨\u0006/"}, d2 = {"Lcom/spotify/login/adaptiveauthentication/challenge/smscode/OtpInputView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "numDigits", "Lp/rih1;", "setNumDigits", "(I)V", "", "mismatch", "setOtpMismatch", "(Z)V", "", "code", "setOtp", "(Ljava/lang/String;)V", "enabled", "setEnabled", "Lp/jrq0;", "t", "Lp/jrq0;", "getListener", "()Lp/jrq0;", "setListener", "(Lp/jrq0;)V", "listener", "Lio/reactivex/rxjava3/core/Observable;", "", "getObservable", "()Lio/reactivex/rxjava3/core/Observable;", "observable", "getOtp", "()Ljava/lang/String;", "otp", "getFirstIncompleteDigit", "()I", "firstIncompleteDigit", "getOtpInternal", "otpInternal", "p/p96", "p/krq0", "src_main_java_com_spotify_login_adaptiveauthentication-adaptiveauthentication"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OtpInputView extends FrameLayout {
    public static final /* synthetic */ int N0 = 0;
    public TextView[] a;
    public final HiddenOtpEditText b;
    public final HorizontalScrollView c;
    public final ViewGroup d;
    public final Rect e;
    public zia f;
    public final ClipboardManager g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public jrq0 listener;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, android.widget.TextView, com.spotify.login.adaptiveauthentication.challenge.smscode.HiddenOtpEditText] */
    public OtpInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p96 p96Var = new p96(this, (byte) 10);
        this.e = new Rect();
        this.g = (ClipboardManager) context.getSystemService("clipboard");
        this.i = -1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ?? r0 = (HiddenOtpEditText) layoutInflaterFrom.inflate(2131626170, (ViewGroup) this, false);
        this.b = r0;
        r0.setOnFocusChangeListener(new x29(this, (byte) 10));
        r0.addTextChangedListener(p96Var);
        r0.setOnInputActionListener(new tym0(this, (byte) 16));
        r0.setOnEditorActionListener(new y29(new qkn0(this, (byte) 12), (byte) 2));
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) layoutInflaterFrom.inflate(2131625349, (ViewGroup) this, false);
        this.c = horizontalScrollView;
        this.d = (ViewGroup) horizontalScrollView.findViewById(2131429648);
        addView(r0);
        addView(horizontalScrollView);
    }

    private final int getFirstIncompleteDigit() {
        TextView textView;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            TextView[] textViewArr = this.a;
            if (!Pattern.compile("\\d").matcher(String.valueOf((textViewArr == null || (textView = textViewArr[i2]) == null) ? null : textView.getText())).matches()) {
                return i2;
            }
        }
        return -1;
    }

    private final String getOtpInternal() {
        StringBuilder sb = new StringBuilder();
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(c(i2));
        }
        return sb.toString();
    }

    public final void a(int i) {
        Rect rect;
        TextView textView;
        TextView[] textViewArr;
        TextView textView2;
        TextView[] textViewArr2;
        TextView textView3;
        dr41 dr41Var;
        if (i >= 0 && (dr41Var = this.listener) != null) {
            qq91 qq91Var = (qq91) dr41Var.b;
            qq91Var.a1(false);
            rq91 rq91VarZ0 = qq91Var.Z0();
            if (!rq91VarZ0.X) {
                rq91VarZ0.X = true;
                i8h1 i8h1Var = rq91VarZ0.c;
                x6h1 x6h1VarC = rq91VarZ0.t.b.c();
                x6h1VarC.i.add(new a7h1("otp_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
            }
        }
        int i2 = this.i;
        AppCompatEditText appCompatEditText = this.b;
        if (i == i2) {
            if (i < 0 || !isEnabled()) {
                return;
            }
            ryn1.z(appCompatEditText);
            return;
        }
        if (i2 >= 0 && (textViewArr2 = this.a) != null && (textView3 = textViewArr2[i2]) != null) {
            textView3.setActivated(false);
        }
        if (i >= 0 && (textViewArr = this.a) != null && (textView2 = textViewArr[i]) != null) {
            textView2.setActivated(true);
        }
        this.i = i;
        if (i < 0) {
            ryn1.v(appCompatEditText);
            return;
        }
        ryn1.z(appCompatEditText);
        TextView[] textViewArr3 = this.a;
        if (textViewArr3 == null || (textView = textViewArr3[i]) == null) {
            rect = null;
        } else {
            int left = textView.getLeft();
            int top = textView.getTop();
            int right = textView.getRight();
            int bottom = textView.getBottom();
            rect = this.e;
            rect.set(left, top, right, bottom);
        }
        this.c.requestChildRectangleOnScreen(this.d, rect, false);
    }

    public final void b() {
        int firstIncompleteDigit;
        if (isEnabled() && (firstIncompleteDigit = getFirstIncompleteDigit()) >= 0) {
            a(firstIncompleteDigit);
        }
    }

    public final String c(int i) {
        TextView textView;
        TextView[] textViewArr = this.a;
        return String.valueOf((textViewArr == null || (textView = textViewArr[i]) == null) ? null : textView.getText());
    }

    public final boolean d() {
        return this.h > 0 && getFirstIncompleteDigit() < 0;
    }

    public final void e(String str) {
        String strI = i(str);
        if (strI != null) {
            a(this.h - 1);
            int i = this.h;
            int i2 = 0;
            while (i2 < i) {
                h(i2, i2 < strI.length() ? String.valueOf(strI.charAt(i2)) : " ");
                i2++;
            }
        }
    }

    public final void f(Bundle bundle) {
        if (bundle.containsKey("key-otp")) {
            int i = bundle.getInt("num-digits");
            String[] stringArray = bundle.getStringArray("key-otp");
            setNumDigits(i);
            for (int i2 = 0; i2 < i; i2++) {
                h(i2, stringArray != null ? stringArray[i2] : null);
            }
        }
    }

    public final void g(Bundle bundle) {
        int i = this.h;
        if (i <= 0) {
            return;
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = c(i2);
        }
        bundle.putStringArray("key-otp", strArr);
        bundle.putInt("num-digits", this.h);
    }

    public final jrq0 getListener() {
        return this.listener;
    }

    public final Observable<CharSequence> getObservable() {
        Observable<CharSequence> observableHide;
        zia ziaVar = this.f;
        if (ziaVar == null) {
            ziaVar = new zia();
            this.f = ziaVar;
        }
        return (ziaVar == null || (observableHide = ziaVar.hide()) == null) ? Observable.empty() : observableHide;
    }

    public final String getOtp() {
        if (d()) {
            return getOtpInternal();
        }
        return null;
    }

    public final void h(int i, String str) {
        int i2;
        TextView textView;
        boolean zD = d();
        TextView[] textViewArr = this.a;
        if (textViewArr != null && (textView = textViewArr[i]) != null) {
            textView.setText(str);
        }
        if (zD != d()) {
            dr41 dr41Var = this.listener;
            if (dr41Var != null) {
                ((Button) ((qq91) dr41Var.b).Y0().i).setEnabled(!zD);
            }
            if (!zD && (i2 = this.i) >= 0 && i2 == this.h - 1) {
                dr41 dr41Var2 = this.listener;
                if (dr41Var2 != null) {
                    Button button = (Button) ((qq91) dr41Var2.b).Y0().i;
                    if (button.isEnabled() && button.isClickable()) {
                        button.performClick();
                    }
                }
                a(-1);
            }
        }
        zia ziaVar = this.f;
        if (ziaVar != null) {
            ziaVar.accept(getOtpInternal());
        }
    }

    public final String i(String str) {
        if (str.length() != this.h) {
            return null;
        }
        int length = str.length();
        boolean zMatches = true;
        for (int i = 0; i < length; i++) {
            zMatches &= Pattern.compile("\\d").matcher(String.valueOf(str.charAt(i))).matches();
        }
        if (zMatches) {
            return str;
        }
        return null;
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
    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.b.setEnabled(enabled);
        TextView[] textViewArr = this.a;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                if (textView != null) {
                    textView.setEnabled(enabled);
                }
            }
        }
        if (enabled) {
            b();
        } else {
            a(-1);
        }
    }

    public final void setListener(jrq0 jrq0Var) {
        this.listener = jrq0Var;
    }

    public final void setNumDigits(int numDigits) {
        if (this.h == numDigits) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            h(i2, " ");
        }
        a(-1);
        ViewGroup viewGroup = this.d;
        viewGroup.removeAllViews();
        this.a = new TextView[numDigits];
        krq0 krq0Var = new krq0(this);
        for (int i3 = 0; i3 < numDigits; i3++) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(2131625350, viewGroup, false);
            textView.setActivated(false);
            textView.setText(" ");
            textView.setOnClickListener(new oja(this, i3, (byte) 2));
            textView.setTextIsSelectable(true);
            textView.setCursorVisible(false);
            textView.setCustomSelectionActionModeCallback(krq0Var);
            viewGroup.addView(textView);
            TextView[] textViewArr = this.a;
            if (textViewArr != null) {
                textViewArr[i3] = textView;
            }
        }
        this.h = numDigits;
    }

    public final void setOtp(String code) {
        int length = code.length();
        int i = 0;
        int i2 = 0;
        while (i < code.length()) {
            int i3 = i2 + 1;
            h(i2, i2 < length ? String.valueOf(code.charAt(i)) : " ");
            i++;
            i2 = i3;
        }
    }

    public final void setOtpMismatch(boolean mismatch) {
        int i = mismatch ? 2131231018 : 2131231016;
        int i2 = mismatch ? 2131103273 : 2131104462;
        TextView[] textViewArr = this.a;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                if (textView != null) {
                    textView.setTextColor(getContext().getColor(i2));
                }
                if (textView != null) {
                    textView.setBackgroundResource(i);
                }
            }
        }
    }

    public OtpInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OtpInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OtpInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
