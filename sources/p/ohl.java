package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ohl extends View {
    public int[] a;
    public int b;
    public final Context c;
    public l660 d;
    public String e;
    public String f;
    public final HashMap g;

    public ohl(Context context) {
        super(context);
        this.a = new int[32];
        this.g = new HashMap();
        this.c = context;
        i(null);
    }

    public final void a(String str) {
        String strTrim;
        int iH;
        if (str.length() == 0 || this.c == null || (iH = h((strTrim = str.trim()))) == 0) {
            return;
        }
        this.g.put(Integer.valueOf(iH), strTrim);
        b(iH);
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArrCopyOf = this.a;
        if (i2 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.a = iArrCopyOf;
        }
        int i3 = this.b;
        iArrCopyOf[i3] = i;
        this.b = i3 + 1;
    }

    public final void c(String str) {
        if (str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof qhl) && strTrim.equals(((qhl) layoutParams).Y) && childAt.getId() != -1) {
                b(childAt.getId());
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View view = (View) constraintLayout.a.get(this.a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final int h(String str) {
        int iG;
        HashMap map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iG = 0;
        } else {
            Object obj = (str == null || (map = constraintLayout.P0) == null || !map.containsKey(str)) ? null : constraintLayout.P0.get(str);
            if (obj instanceof Integer) {
                iG = ((Integer) obj).intValue();
            } else {
                iG = 0;
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = bmz0.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iG != 0) {
            return iG;
        }
        Context context = this.c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, inz0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void j(fil filVar, l660 l660Var, fjl fjlVar, SparseArray sparseArray) {
        gil gilVar = filVar.e;
        int[] iArr = gilVar.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = gilVar.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = gilVar.k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int iH = h(str2.trim());
                        if (iH != 0) {
                            iArrCopyOf[i2] = iH;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    gilVar.j0 = iArrCopyOf;
                } else {
                    gilVar.j0 = null;
                }
            }
        }
        l660Var.v0 = 0;
        Arrays.fill(l660Var.u0, (Object) null);
        if (gilVar.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = gilVar.j0;
            if (i >= iArr2.length) {
                return;
            }
            cjl cjlVar = (cjl) sparseArray.get(iArr2[i]);
            if (cjlVar != null) {
                l660Var.W(cjlVar);
            }
            i++;
        }
    }

    public final void m() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof qhl) {
            ((qhl) layoutParams).p0 = this.d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.e = null;
        this.b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.e == null) {
            b(i);
        }
    }

    public void l() {
    }

    public ohl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.g = new HashMap();
        this.c = context;
        i(attributeSet);
    }

    public ohl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new int[32];
        this.g = new HashMap();
        this.c = context;
        i(attributeSet);
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void k(cjl cjlVar, boolean z) {
    }
}
