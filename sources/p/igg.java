package p;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class igg {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mzx b;

    public /* synthetic */ igg(mzx mzxVar, byte b) {
        this.a = b;
        this.b = mzxVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        byte b = this.a;
        mzx mzxVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                EditText editText = textInputLayout.getEditText();
                mgg mggVar = (mgg) mzxVar;
                textInputLayout.setEndIconVisible(mggVar.e());
                textInputLayout.setEndIconCheckable(false);
                View.OnFocusChangeListener onFocusChangeListener = mggVar.f;
                editText.setOnFocusChangeListener(onFocusChangeListener);
                mggVar.c.setOnFocusChangeListener(onFocusChangeListener);
                p96 p96Var = mggVar.e;
                editText.removeTextChangedListener(p96Var);
                editText.addTextChangedListener(p96Var);
                break;
            case 1:
                EditText editText2 = textInputLayout.getEditText();
                if (!(editText2 instanceof AutoCompleteTextView)) {
                    jah.g("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                } else {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
                    jav javVar = (jav) mzxVar;
                    afe1 afe1Var = javVar.e;
                    TextInputLayout textInputLayout2 = javVar.a;
                    int boxBackgroundMode = textInputLayout2.getBoxBackgroundMode();
                    if (boxBackgroundMode == 2) {
                        autoCompleteTextView.setDropDownBackgroundDrawable(javVar.n);
                    } else if (boxBackgroundMode == 1) {
                        autoCompleteTextView.setDropDownBackgroundDrawable(javVar.m);
                    }
                    if (autoCompleteTextView.getKeyListener() == null) {
                        int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                        Drawable boxBackground = textInputLayout2.getBoxBackground();
                        int iR = xfo1.r(autoCompleteTextView, 2130969011);
                        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
                        if (boxBackgroundMode2 == 2) {
                            int iR2 = xfo1.r(autoCompleteTextView, 2130969040);
                            gch0 gch0Var = new gch0(((gch0) boxBackground).a.a);
                            int iS = ago1.s(iR, iR2, 0.1f);
                            gch0Var.m(new ColorStateList(iArr, new int[]{iS, 0}));
                            gch0Var.setTint(iR2);
                            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iS, iR2});
                            gch0 gch0Var2 = new gch0(((gch0) boxBackground).a.a);
                            gch0Var2.setTint(-1);
                            Drawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gch0Var, gch0Var2), boxBackground});
                            WeakHashMap weakHashMap = b8k1.a;
                            autoCompleteTextView.setBackground(layerDrawable);
                        } else if (boxBackgroundMode2 == 1) {
                            int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                            Drawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{ago1.s(iR, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                            WeakHashMap weakHashMap2 = b8k1.a;
                            autoCompleteTextView.setBackground(rippleDrawable);
                        }
                    }
                    autoCompleteTextView.setOnTouchListener(new ica(javVar, autoCompleteTextView));
                    autoCompleteTextView.setOnFocusChangeListener(javVar.f);
                    autoCompleteTextView.setOnDismissListener(new iav(javVar));
                    autoCompleteTextView.setThreshold(0);
                    autoCompleteTextView.removeTextChangedListener(afe1Var);
                    autoCompleteTextView.addTextChangedListener(afe1Var);
                    textInputLayout.setEndIconCheckable(true);
                    textInputLayout.setErrorIconDrawable((Drawable) null);
                    if (autoCompleteTextView.getKeyListener() == null) {
                        AppCompatImageButton appCompatImageButton = javVar.c;
                        WeakHashMap weakHashMap3 = b8k1.a;
                        appCompatImageButton.setImportantForAccessibility(2);
                    }
                    textInputLayout.setTextInputAccessibilityDelegate(javVar.g);
                    textInputLayout.setEndIconVisible(true);
                }
                break;
            default:
                EditText editText3 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                w6s0 w6s0Var = (w6s0) mzxVar;
                w6s0Var.c.setChecked(!w6s0Var.d());
                afe1 afe1Var2 = w6s0Var.e;
                editText3.removeTextChangedListener(afe1Var2);
                editText3.addTextChangedListener(afe1Var2);
                break;
        }
    }
}
