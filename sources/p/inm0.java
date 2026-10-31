package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.Barrier;
import com.comscore.streaming.WindowState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class inm0 {
    public final MotionLayout a;
    public final up20 b;
    public hnm0 c;
    public final ArrayList d;
    public final hnm0 e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public ymm0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f68p;
    public final e821 q;
    public float r;
    public float s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public inm0(Context context, MotionLayout motionLayout, int i) {
        this.b = null;
        this.c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.g = new SparseArray();
        this.h = new HashMap();
        this.i = new SparseIntArray();
        this.j = WindowState.NORMAL;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = motionLayout;
        e821 e821Var = new e821();
        e821Var.a = new ArrayList();
        e821Var.e = new ArrayList();
        e821Var.b = motionLayout;
        this.q = e821Var;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            hnm0 hnm0Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                epa0 epa0Var = new epa0(context, xml);
                                if (hnm0Var != null) {
                                    hnm0Var.k.add(epa0Var);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                j(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                rhk1 rhk1Var = new rhk1(context, xml);
                                e821 e821Var2 = this.q;
                                ((ArrayList) e821Var2.a).add(rhk1Var);
                                e821Var2.c = null;
                                int i2 = rhk1Var.b;
                                if (i2 == 4) {
                                    e821.o(rhk1Var);
                                } else if (i2 == 5) {
                                    e821.o(rhk1Var);
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                hnm0Var = new hnm0(this, context, xml);
                                boolean z = hnm0Var.b;
                                arrayList.add(hnm0Var);
                                if (this.c == null && !z) {
                                    this.c = hnm0Var;
                                    eif1 eif1Var = hnm0Var.l;
                                    if (eif1Var != null) {
                                        eif1Var.c(this.f68p);
                                    }
                                }
                                if (z) {
                                    if (hnm0Var.c == -1) {
                                        this.e = hnm0Var;
                                    } else {
                                        this.f.add(hnm0Var);
                                    }
                                    arrayList.remove(hnm0Var);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && hnm0Var != null && !motionLayout.isInEditMode()) {
                                hnm0Var.m.add(new gnm0(context, hnm0Var, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (hnm0Var == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (hnm0Var != null) {
                                    hnm0Var.l = new eif1(context, motionLayout, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                k(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new up20(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                j(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.g.put(2131430004, new kil());
        this.h.put("motion_base", 2131430004);
    }

    public static int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        hnm0 hnm0Var;
        if (this.o != null) {
            return false;
        }
        for (hnm0 hnm0Var2 : this.d) {
            int i2 = hnm0Var2.n;
            if (i2 != 0 && ((hnm0Var = this.c) != hnm0Var2 || (hnm0Var.r & 2) == 0)) {
                int i3 = hnm0Var2.d;
                bnm0 bnm0Var = bnm0.d;
                bnm0 bnm0Var2 = bnm0.c;
                bnm0 bnm0Var3 = bnm0.b;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(bnm0Var);
                    motionLayout.setTransition(hnm0Var2);
                    if (hnm0Var2.n == 4) {
                        motionLayout.y(1.0f);
                        motionLayout.O1 = null;
                        motionLayout.setState(bnm0Var3);
                        motionLayout.setState(bnm0Var2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.A(true);
                    motionLayout.setState(bnm0Var3);
                    motionLayout.setState(bnm0Var2);
                    motionLayout.setState(bnm0Var);
                    motionLayout.F();
                    return true;
                }
                if (i == hnm0Var2.c && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(bnm0Var);
                    motionLayout.setTransition(hnm0Var2);
                    if (hnm0Var2.n == 3) {
                        motionLayout.y(0.0f);
                        motionLayout.setState(bnm0Var3);
                        motionLayout.setState(bnm0Var2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.A(true);
                    motionLayout.setState(bnm0Var3);
                    motionLayout.setState(bnm0Var2);
                    motionLayout.setState(bnm0Var);
                    motionLayout.F();
                    return true;
                }
            }
        }
        return false;
    }

    public final kil b(int i) {
        int iL;
        up20 up20Var = this.b;
        if (up20Var != null && (iL = up20Var.l(i)) != -1) {
            i = iL;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i) != null) {
            return (kil) sparseArray.get(i);
        }
        bmq0.y(this.a.getContext(), i);
        return (kil) sparseArray.get(sparseArray.keyAt(0));
    }

    public final Interpolator d() {
        hnm0 hnm0Var = this.c;
        int i = hnm0Var.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new pmm0(clv.d(hnm0Var.f), (byte) 1);
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(a aVar) {
        hnm0 hnm0Var = this.c;
        if (hnm0Var != null) {
            Iterator it = hnm0Var.k.iterator();
            while (it.hasNext()) {
                ((epa0) it.next()).a(aVar);
            }
        } else {
            hnm0 hnm0Var2 = this.e;
            if (hnm0Var2 != null) {
                Iterator it2 = hnm0Var2.k.iterator();
                while (it2.hasNext()) {
                    ((epa0) it2.next()).a(aVar);
                }
            }
        }
    }

    public final float f() {
        eif1 eif1Var;
        hnm0 hnm0Var = this.c;
        if (hnm0Var == null || (eif1Var = hnm0Var.l) == null) {
            return 0.0f;
        }
        return eif1Var.t;
    }

    public final int g() {
        hnm0 hnm0Var = this.c;
        if (hnm0Var == null) {
            return -1;
        }
        return hnm0Var.d;
    }

    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        kil kilVar = new kil();
        kilVar.f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iC2 = c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        kilVar.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                kilVar.d = 4;
                                break;
                            case "left":
                                kilVar.d = 2;
                                break;
                            case "none":
                                kilVar.d = 0;
                                break;
                            case "right":
                                kilVar.d = 1;
                                break;
                            case "x_right":
                                kilVar.d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iC = c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(iC));
                    kilVar.a = bmq0.y(context, iC);
                    break;
                case "stateLabels":
                    kilVar.c = attributeValue.split(",");
                    int i2 = 0;
                    while (true) {
                        String[] strArr = kilVar.c;
                        if (i2 < strArr.length) {
                            strArr[i2] = strArr[i2].trim();
                            i2++;
                        }
                    }
                    break;
            }
        }
        if (iC != -1) {
            int i3 = this.a.m1;
            kilVar.o(context, xmlResourceParser);
            if (iC2 != -1) {
                this.i.put(iC, iC2);
            }
            this.g.put(iC, kilVar);
        }
        return iC;
    }

    public final int i(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.w);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                i(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.m);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i, MotionLayout motionLayout) {
        SparseArray sparseArray = this.g;
        kil kilVar = (kil) sparseArray.get(i);
        String str = kilVar.a;
        HashMap map = kilVar.g;
        kilVar.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            l(i2, motionLayout);
            kil kilVar2 = (kil) sparseArray.get(i2);
            if (kilVar2 == null) {
                bmq0.y(this.a.getContext(), i2);
                return;
            }
            HashMap map2 = kilVar2.g;
            kilVar.b += "/" + kilVar2.b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                fil filVar = (fil) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new fil());
                }
                fil filVar2 = (fil) map.get(num);
                if (filVar2 != null) {
                    gil gilVar = filVar2.e;
                    if (!gilVar.b) {
                        gilVar.a(filVar.e);
                    }
                    iil iilVar = filVar2.c;
                    if (!iilVar.a) {
                        iilVar.a(filVar.c);
                    }
                    jil jilVar = filVar2.f;
                    if (!jilVar.a) {
                        jilVar.a(filVar.f);
                    }
                    hil hilVar = filVar2.d;
                    if (!hilVar.a) {
                        hilVar.a(filVar.d);
                    }
                    for (String str2 : filVar.g.keySet()) {
                        if (!filVar2.g.containsKey(str2)) {
                            filVar2.g.put(str2, (mhl) filVar.g.get(str2));
                        }
                    }
                }
            }
        } else {
            kilVar.b = l1d.n(kilVar.b, "  layout", new StringBuilder());
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                Barrier childAt = motionLayout.getChildAt(i3);
                qhl qhlVar = (qhl) childAt.getLayoutParams();
                int id = childAt.getId();
                if (kilVar.f && id == -1) {
                    jah.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new fil());
                }
                fil filVar3 = (fil) map.get(Integer.valueOf(id));
                if (filVar3 != null) {
                    iil iilVar2 = filVar3.c;
                    gil gilVar2 = filVar3.e;
                    jil jilVar2 = filVar3.f;
                    if (!gilVar2.b) {
                        fil.a(filVar3, id, qhlVar);
                        if (childAt instanceof ohl) {
                            gilVar2.j0 = ((ohl) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = childAt;
                                gilVar2.o0 = barrier.getAllowsGoneWidget();
                                gilVar2.g0 = barrier.getType();
                                gilVar2.h0 = barrier.getMargin();
                            }
                        }
                        gilVar2.b = true;
                    }
                    if (!iilVar2.a) {
                        iilVar2.b = childAt.getVisibility();
                        iilVar2.d = childAt.getAlpha();
                        iilVar2.a = true;
                    }
                    if (!jilVar2.a) {
                        jilVar2.a = true;
                        jilVar2.b = childAt.getRotation();
                        jilVar2.c = childAt.getRotationX();
                        jilVar2.d = childAt.getRotationY();
                        jilVar2.e = childAt.getScaleX();
                        jilVar2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            jilVar2.g = pivotX;
                            jilVar2.h = pivotY;
                        }
                        jilVar2.j = childAt.getTranslationX();
                        jilVar2.k = childAt.getTranslationY();
                        jilVar2.l = childAt.getTranslationZ();
                        if (jilVar2.m) {
                            jilVar2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (fil filVar4 : map.values()) {
            if (filVar4.h != null) {
                if (filVar4.b == null) {
                    filVar4.h.e(kilVar.m(filVar4.a));
                } else {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        fil filVarM = kilVar.m(((Integer) it.next()).intValue());
                        String str3 = filVarM.e.l0;
                        if (str3 != null && filVar4.b.matches(str3)) {
                            filVar4.h.e(filVarM);
                            filVarM.g.putAll((HashMap) filVar4.g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void m(int i, int i2) {
        int iL;
        int iL2;
        hnm0 hnm0Var;
        ArrayList arrayList;
        Iterator it;
        hnm0 hnm0Var2;
        hnm0 hnm0Var3;
        hnm0 hnm0Var4;
        int i3;
        eif1 eif1Var;
        up20 up20Var = this.b;
        if (up20Var != null) {
            iL = up20Var.l(i);
            if (iL == -1) {
                iL = i;
            }
            iL2 = up20Var.l(i2);
            if (iL2 == -1) {
            }
            hnm0Var = this.c;
            if (hnm0Var == null && hnm0Var.c == i2 && hnm0Var.d == i) {
                return;
            }
            arrayList = this.d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    hnm0Var2 = this.e;
                    for (hnm0 hnm0Var5 : this.f) {
                        if (hnm0Var5.c == i2) {
                            hnm0Var2 = hnm0Var5;
                        }
                    }
                    hnm0Var3 = new hnm0(this, hnm0Var2);
                    hnm0Var3.d = iL;
                    hnm0Var3.c = iL2;
                    if (iL != -1) {
                        arrayList.add(hnm0Var3);
                    }
                    this.c = hnm0Var3;
                    return;
                }
                hnm0Var4 = (hnm0) it.next();
                i3 = hnm0Var4.c;
                if ((i3 != iL2 && hnm0Var4.d == iL) || (i3 == i2 && hnm0Var4.d == i)) {
                    break;
                }
            }
            this.c = hnm0Var4;
            eif1Var = hnm0Var4.l;
            if (eif1Var != null) {
                eif1Var.c(this.f68p);
            }
        }
        iL = i;
        iL2 = i2;
        hnm0Var = this.c;
        if (hnm0Var == null) {
        }
        arrayList = this.d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                hnm0Var2 = this.e;
                while (r9.hasNext()) {
                    if (hnm0Var5.c == i2) {
                        hnm0Var2 = hnm0Var5;
                    }
                }
                hnm0Var3 = new hnm0(this, hnm0Var2);
                hnm0Var3.d = iL;
                hnm0Var3.c = iL2;
                if (iL != -1) {
                    arrayList.add(hnm0Var3);
                }
                this.c = hnm0Var3;
                return;
            }
            hnm0Var4 = (hnm0) it.next();
            i3 = hnm0Var4.c;
            if (i3 != iL2) {
            }
        }
        this.c = hnm0Var4;
        eif1Var = hnm0Var4.l;
        if (eif1Var != null) {
            eif1Var.c(this.f68p);
        }
    }

    public final boolean n() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((hnm0) it.next()).l != null) {
                return true;
            }
        }
        hnm0 hnm0Var = this.c;
        return (hnm0Var == null || hnm0Var.l == null) ? false : true;
    }
}
