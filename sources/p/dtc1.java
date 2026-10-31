package p;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dtc1 {
    public static final dtc1 a = new dtc1();
    public static final List b = p7h.M(new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    public static final ArrayList a(View view) {
        if (dhn.a.contains(dtc1.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = ibk1.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            dhn.a(dtc1.class, th);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (dhn.a.contains(dtc1.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = ibk1.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            dhn.a(dtc1.class, th);
            return null;
        }
    }

    public static final String d(View view) {
        if (dhn.a.contains(dtc1.class)) {
            return null;
        }
        try {
            String strJ = ibk1.j(view);
            return strJ.length() > 0 ? strJ : TextUtils.join(" ", a.c(view));
        } catch (Throwable th) {
            dhn.a(dtc1.class, th);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (dhn.a.contains(dtc1.class)) {
            return;
        }
        try {
            String strJ = ibk1.j(view);
            String strH = ibk1.h(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", ibk1.c(view));
            if (strJ.length() > 0) {
                jSONObject.put("text", strJ);
            }
            if (strH.length() > 0) {
                jSONObject.put("hint", strH);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            dhn.a(dtc1.class, th);
        }
    }

    public final ArrayList c(View view) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : ibk1.b(view)) {
                String strJ = ibk1.j(view2);
                if (strJ.length() > 0) {
                    arrayList.add(strJ);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }
}
