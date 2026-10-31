package p;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class kl5 {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final jv81 sConstructorMap = new jv81(0);

    public final View a(Context context, String str, String str2) {
        String strConcat;
        jv81 jv81Var = sConstructorMap;
        Constructor constructor = (Constructor) jv81Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            jv81Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    public final void b(View view, String str) {
        if (view != null) {
            return;
        }
        eg.m(l1d.q(new StringBuilder(getClass().getName()), " asked to inflate view for <", str, ">, but returned null"));
    }

    public hj5 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new hj5(context, attributeSet);
    }

    public kj5 createButton(Context context, AttributeSet attributeSet) {
        return new kj5(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public mj5 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new mj5(context, attributeSet);
    }

    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public hk5 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new hk5(context, attributeSet);
    }

    public kk5 createRadioButton(Context context, AttributeSet attributeSet) {
        return new kk5(context, attributeSet);
    }

    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    public lk5 createSeekBar(Context context, AttributeSet attributeSet) {
        return new lk5(context, attributeSet);
    }

    public vk5 createSpinner(Context context, AttributeSet attributeSet) {
        return new vk5(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public il5 createToggleButton(Context context, AttributeSet attributeSet) {
        return new il5(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewCreateRatingBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, moz0.z, 0, 0);
            int resourceId = z2 ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
            if (z3 && resourceId == 0) {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != 0 && (!(context2 instanceof plm) || ((plm) context2).a != resourceId)) {
                context2 = new plm(context2, resourceId);
            }
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "CheckedTextView":
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "TextView":
                viewCreateRatingBar = createTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ImageButton":
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "SeekBar":
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "Spinner":
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "RadioButton":
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ToggleButton":
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ImageView":
                viewCreateRatingBar = createImageView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "AutoCompleteTextView":
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "CheckBox":
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "EditText":
                viewCreateRatingBar = createEditText(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "Button":
                viewCreateRatingBar = createButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = null;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = sClassPrefixList;
                        if (i < strArr.length) {
                            View viewA = a(context2, str, strArr[i]);
                            if (viewA != null) {
                                Object[] objArr2 = this.mConstructorArgs;
                                objArr2[0] = null;
                                objArr2[1] = null;
                                viewCreateRatingBar = viewA;
                                this = objArr2;
                            } else {
                                i++;
                            }
                        } else {
                            Object[] objArr3 = this.mConstructorArgs;
                            objArr3[0] = null;
                            objArr3[1] = null;
                            this = objArr3;
                        }
                    }
                } else {
                    View viewA2 = a(context2, str, null);
                    Object[] objArr4 = this.mConstructorArgs;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    viewCreateRatingBar = viewA2;
                    this = objArr4;
                }
            } catch (Exception unused) {
                Object[] objArr5 = this.mConstructorArgs;
                objArr5[0] = viewCreateRatingBar;
                objArr5[1] = viewCreateRatingBar;
            } catch (Throwable th) {
                Object[] objArr6 = this.mConstructorArgs;
                objArr6[0] = viewCreateRatingBar;
                objArr6[1] = viewCreateRatingBar;
                throw th;
            }
        }
        if (viewCreateRatingBar != null) {
            Context context3 = viewCreateRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && viewCreateRatingBar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = typedArrayObtainStyledAttributes2.getString(0);
                if (string != null) {
                    viewCreateRatingBar.setOnClickListener(new jl5(viewCreateRatingBar, string));
                }
                typedArrayObtainStyledAttributes2.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    b8k1.q(viewCreateRatingBar, typedArrayObtainStyledAttributes3.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    b8k1.r(viewCreateRatingBar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z5 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap = b8k1.a;
                    new l7k1().e(viewCreateRatingBar, Boolean.valueOf(z5));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return viewCreateRatingBar;
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}
