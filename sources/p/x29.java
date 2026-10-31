package p;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x29 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public x29(rhr rhrVar, yzu yzuVar) {
        this.a = (byte) 5;
        this.b = yzuVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        String str;
        byte b = this.a;
        int i = 4;
        b7x b7xVar = b7x.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                f39 f39Var = (f39) obj;
                hce1 hce1Var = f39Var.a;
                if (!z) {
                    iu30 onFocusLost = f39Var.getOnFocusLost();
                    if (onFocusLost != null) {
                        onFocusLost.invoke(((NonCompletingAutoCompleteTextView) hce1Var.e).getText().toString());
                    }
                    ((NonCompletingAutoCompleteTextView) hce1Var.e).dismissDropDown();
                    break;
                } else {
                    Function0 onFocused = f39Var.getOnFocused();
                    if (onFocused != null) {
                        onFocused.invoke();
                    }
                    j320 state = f39Var.getState();
                    if ((state != null ? state.e : null) != null && f39Var.b.getCount() > 0) {
                        ((NonCompletingAutoCompleteTextView) hce1Var.e).showDropDown();
                        break;
                    }
                }
                break;
            case 1:
                if (z) {
                    q0d q0dVarM0 = ((CallingCodePickerActivity) obj).m0();
                    if (!q0dVarM0.h) {
                        q0dVarM0.h = true;
                        i8h1 i8h1Var = q0dVarM0.d;
                        x6h1 x6h1VarC = q0dVarM0.g.b.c();
                        x6h1VarC.i.add(new a7h1("country_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                    }
                }
                break;
            case 2:
                mgg mggVar = (mgg) obj;
                mggVar.d(mggVar.e());
                break;
            case 3:
                ogh oghVar = (ogh) obj;
                jgh jghVar = oghVar.e;
                if (!z) {
                    jghVar.b.setVisibility(4);
                } else {
                    cce cceVar = oghVar.f;
                    if (cceVar != null) {
                        i8h1 i8h1Var2 = (i8h1) cceVar.b;
                        x6h1 x6h1VarC2 = ((gxk0) cceVar.d).a.c();
                        x6h1VarC2.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    jghVar.h.setVisibility(!ihc1.y0(jghVar.d.getText()) ? 0 : 8);
                    jghVar.b.setVisibility(0);
                    rph rphVar = (rph) oghVar.g.getValue();
                    if (rphVar != null) {
                        oghVar.d(rphVar);
                    }
                }
                break;
            case 4:
                jbn jbnVar = (jbn) obj;
                if (z) {
                    i8h1 i8h1Var3 = jbnVar.f;
                    dsk0 dsk0Var = jbnVar.X;
                    dsk0Var.getClass();
                    x6h1 x6h1VarC3 = dsk0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("search_input", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    ((AppBarLayout) jbnVar.a.c).e(false, true, true);
                }
                break;
            case 5:
                yzu yzuVar = (yzu) obj;
                StateListAnimatorImageButton stateListAnimatorImageButton = (StateListAnimatorImageButton) yzuVar.b;
                EditText editText = (EditText) yzuVar.c;
                if (editText.isFocused() && editText.getText().length() > 0) {
                    i = 0;
                }
                stateListAnimatorImageButton.setVisibility(i);
                break;
            case 6:
                fav favVar = (fav) obj;
                if (z) {
                    Function0 onFocused2 = favVar.getOnFocused();
                    if (onFocused2 != null) {
                        onFocused2.invoke();
                    }
                    break;
                } else {
                    l320 state2 = favVar.getState();
                    if (state2 != null && (str = state2.f) != null) {
                        favVar.b(str);
                        break;
                    }
                }
                break;
            case 7:
                jav javVar = (jav) obj;
                javVar.a.setEndIconActivated(z);
                if (!z) {
                    javVar.e(false);
                    javVar.j = false;
                }
                break;
            case 8:
                ((iu30) obj).invoke(new ug20(z));
                break;
            case 9:
                if (z) {
                    hxf0 hxf0Var = (hxf0) obj;
                    if (!hxf0Var.T0) {
                        hxf0Var.T0 = true;
                        qhe0 qhe0Var = hxf0Var.e;
                        ydl0 ydl0Var = hxf0Var.f;
                        ydl0Var.getClass();
                        x6h1 x6h1VarC4 = ydl0Var.a.c();
                        x6h1VarC4.i.add(new a7h1("email_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        qhe0Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()));
                    }
                }
                break;
            case 10:
                if (!z) {
                    int i2 = OtpInputView.N0;
                    ((OtpInputView) obj).a(-1);
                }
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (z) {
                    yts0 yts0VarZ0 = ((wts0) obj).Z0();
                    if (!yts0VarZ0.i) {
                        yts0VarZ0.i = true;
                        i8h1 i8h1Var4 = yts0VarZ0.e;
                        h4l0 h4l0Var = yts0VarZ0.h;
                        h4l0Var.getClass();
                        x6h1 x6h1VarC5 = h4l0Var.b.c();
                        x6h1VarC5.i.add(new a7h1("phone_number_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        i8h1Var4.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()));
                    }
                }
                break;
            case grn1.d /* 12 */:
                View view2 = (SearchView) obj;
                View.OnFocusChangeListener onFocusChangeListener = ((SearchView) view2).o1;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view2, z);
                }
                break;
            default:
                f8e1 f8e1Var = (f8e1) obj;
                if (!z) {
                    iu30 onFocusLost2 = f8e1Var.getOnFocusLost();
                    if (onFocusLost2 != null) {
                        onFocusLost2.invoke(String.valueOf(((TextInputEditText) f8e1Var.a.b).getText()));
                    }
                } else {
                    Function0 onFocused3 = f8e1Var.getOnFocused();
                    if (onFocused3 != null) {
                        onFocused3.invoke();
                    }
                }
                break;
        }
    }

    public /* synthetic */ x29(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
