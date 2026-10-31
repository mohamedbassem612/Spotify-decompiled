package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bh30 implements LayoutInflater.Factory2 {
    public final th30 a;

    public bh30(th30 th30Var) {
        this.a = th30Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        si30 si30VarH;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        th30 th30Var = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, th30Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koz0.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = zf30.class.isAssignableFrom(rg30.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    zf30 zf30VarF = resourceId != -1 ? th30Var.F(resourceId) : null;
                    if (zf30VarF == null && string != null) {
                        zf30VarF = th30Var.G(string);
                    }
                    if (zf30VarF == null && id != -1) {
                        zf30VarF = th30Var.F(id);
                    }
                    if (zf30VarF == null) {
                        zf30VarF = th30Var.N().a(context.getClassLoader(), attributeValue);
                        zf30VarF.O0 = true;
                        zf30VarF.Y0 = resourceId != 0 ? resourceId : id;
                        zf30VarF.Z0 = id;
                        zf30VarF.a1 = string;
                        zf30VarF.P0 = true;
                        zf30VarF.U0 = th30Var;
                        tg30 tg30Var = th30Var.x;
                        zf30VarF.V0 = tg30Var;
                        zf30VarF.C0(tg30Var.e, attributeSet, zf30VarF.b);
                        si30VarH = th30Var.a(zf30VarF);
                        if (th30.P(2)) {
                            zf30VarF.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (zf30VarF.P0) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        zf30VarF.P0 = true;
                        zf30VarF.U0 = th30Var;
                        tg30 tg30Var2 = th30Var.x;
                        zf30VarF.V0 = tg30Var2;
                        zf30VarF.C0(tg30Var2.e, attributeSet, zf30VarF.b);
                        si30VarH = th30Var.h(zf30VarF);
                        if (th30.P(2)) {
                            zf30VarF.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    vi30.d(zf30VarF, viewGroup);
                    zf30VarF.i1 = viewGroup;
                    si30VarH.k();
                    si30VarH.j();
                    View view2 = zf30VarF.j1;
                    if (view2 == null) {
                        eg.m(f4i1.f("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (zf30VarF.j1.getTag() == null) {
                        zf30VarF.j1.setTag(string);
                    }
                    zf30VarF.j1.addOnAttachStateChangeListener(new ah30(this, si30VarH));
                    return zf30VarF.j1;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
