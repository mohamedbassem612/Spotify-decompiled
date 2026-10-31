package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ibk1 {
    public static final ibk1 a = new ibk1();
    public static WeakReference b = new WeakReference(null);
    public static Method c;

    public static final View a(View view) {
        if (!dhn.a.contains(ibk1.class)) {
            while (view != null) {
                try {
                    ibk1 ibk1Var = a;
                    boolean zEquals = false;
                    if (!dhn.a.contains(ibk1Var)) {
                        try {
                            zEquals = view.getClass().getName().equals("com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            dhn.a(ibk1Var, th);
                        }
                    }
                    if (!zEquals) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    dhn.a(ibk1.class, th2);
                }
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        if (dhn.a.contains(ibk1.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            dhn.a(ibk1.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004d A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:16:0x0024, B:19:0x002d, B:28:0x0044, B:33:0x004d, B:41:0x005f, B:39:0x005a, B:26:0x003e, B:23:0x0038), top: B:84:0x0024, outer: #1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0056  */
    /* JADX WARN: Code duplicated, block: B:41:0x005f A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:16:0x0024, B:19:0x002d, B:28:0x0044, B:33:0x004d, B:41:0x005f, B:39:0x005a, B:26:0x003e, B:23:0x0038), top: B:84:0x0024, outer: #1, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final int c(View view) {
        Class<?> cls;
        Class cls2;
        Set set = dhn.a;
        if (set.contains(ibk1.class)) {
            return 0;
        }
        try {
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            boolean zContains = set.contains(ibk1.class);
            ibk1 ibk1Var = a;
            if (!zContains) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (set.contains(ibk1Var)) {
                            cls = null;
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = dhn.a.contains(ibk1Var) ? null : p6o0.class;
                                if (cls2 != null && cls2.isInstance(parent)) {
                                }
                            }
                        } else {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                                cls = null;
                            } catch (Throwable th) {
                                dhn.a(ibk1Var, th);
                                cls = null;
                            }
                            if (cls != null) {
                                if (dhn.a.contains(ibk1Var)) {
                                }
                                if (cls2 != null) {
                                }
                            } else {
                                if (dhn.a.contains(ibk1Var)) {
                                }
                                if (cls2 != null) {
                                }
                            }
                        }
                    }
                    i |= 512;
                } catch (Throwable th2) {
                    dhn.a(ibk1.class, th2);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | TlsSocketProvider.READ_BUFFER_SIZE;
                    }
                    return ((view instanceof ViewGroup) && ibk1Var.l(view, (View) b.get())) ? i | 64 : i;
                }
                return i | SemanticState.Obscured;
            }
            int i2 = i | 1025;
            if (view instanceof Button) {
                i2 = i | 1029;
                if (view instanceof Switch) {
                    i2 = i | 9221;
                } else if (view instanceof CheckBox) {
                    i2 = 33797 | i;
                }
            }
            int i3 = i2;
            return view instanceof EditText ? i3 | SemanticState.Modal : i3;
        } catch (Throwable th3) {
            dhn.a(ibk1.class, th3);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (dhn.a.contains(ibk1.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListB = b(view);
                int size = arrayListB.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(d((View) arrayListB.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            dhn.a(ibk1.class, th);
            return null;
        }
    }

    public static final View.OnClickListener f(View view) {
        Field declaredField;
        if (dhn.a.contains(ibk1.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            dhn.a(ibk1.class, th);
            return null;
        }
    }

    public static final View.OnTouchListener g(View view) {
        Field declaredField;
        try {
            if (!dhn.a.contains(ibk1.class)) {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) != null) {
                        declaredField.setAccessible(true);
                        return (View.OnTouchListener) declaredField.get(obj);
                    }
                } catch (ClassNotFoundException unused) {
                    wf10 wf10Var = wf10.a;
                } catch (IllegalAccessException unused2) {
                    wf10 wf10Var2 = wf10.a;
                } catch (NoSuchFieldException unused3) {
                    wf10 wf10Var3 = wf10.a;
                }
            }
            return null;
        } catch (Throwable th) {
            dhn.a(ibk1.class, th);
            return null;
        }
    }

    public static final String h(View view) {
        CharSequence hint;
        String string;
        if (dhn.a.contains(ibk1.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            dhn.a(ibk1.class, th);
            return null;
        }
    }

    public static final ViewGroup i(View view) {
        if (!dhn.a.contains(ibk1.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                dhn.a(ibk1.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ee A[EDGE_INSN: B:42:0x00ee->B:43:0x00ef BREAK  A[LOOP:0: B:32:0x00c2->B:38:0x00dc]] */
    public static final String j(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (dhn.a.contains(ibk1.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i++;
                                }
                            }
                        } else {
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((TimePicker) view).getCurrentHour().intValue()), Integer.valueOf(((TimePicker) view).getCurrentMinute().intValue())}, 2));
                        }
                    } else {
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            dhn.a(ibk1.class, th);
            return null;
        }
    }

    public static final void m(View view, JSONObject jSONObject) {
        try {
            if (dhn.a.contains(ibk1.class)) {
                return;
            }
            try {
                String strJ = j(view);
                String strH = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (j561.c(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", fpi1.d(fpi1.Q(strJ)));
                }
                jSONObject.put("hint", fpi1.d(fpi1.Q(strH)));
                if (tag != null) {
                    jSONObject.put("tag", fpi1.d(fpi1.Q(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", fpi1.d(fpi1.Q(contentDescription.toString())));
                }
                jSONObject.put("dimension", a.e(view));
            } catch (JSONException unused) {
                wf10 wf10Var = wf10.a;
            }
        } catch (Throwable th) {
            dhn.a(ibk1.class, th);
        }
    }

    public final JSONObject e(View view) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final void k() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                wf10 wf10Var = wf10.a;
            } catch (NoSuchMethodException unused2) {
                wf10 wf10Var2 = wf10.a;
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final boolean l(View view, View view2) {
        float[] fArr;
        Set set = dhn.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            View view3 = null;
            if (set.contains(this)) {
                fArr = null;
            } else {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{iArr[0], iArr[1]};
                } catch (Throwable th) {
                    dhn.a(this, th);
                    fArr = null;
                }
            }
            if (!dhn.a.contains(this)) {
                try {
                    k();
                    Method method = c;
                    if (method != null && view2 != null) {
                        try {
                            try {
                                View view4 = (View) method.invoke(null, fArr, view2);
                                if (view4.getId() > 0) {
                                    view3 = (View) view4.getParent();
                                }
                            } catch (IllegalAccessException unused) {
                                wf10 wf10Var = wf10.a;
                            }
                        } catch (InvocationTargetException unused2) {
                            wf10 wf10Var2 = wf10.a;
                        }
                    }
                } catch (Throwable th2) {
                    dhn.a(this, th2);
                }
            }
            return view3 != null && view3.getId() == view.getId();
        } catch (Throwable th3) {
            dhn.a(this, th3);
            return false;
        }
    }
}
