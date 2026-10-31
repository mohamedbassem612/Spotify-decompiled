package p;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class be0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be0(jkk1 jkk1Var) {
        super(0);
        this.b = (byte) 5;
        this.c = jkk1Var;
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                ((fe0) obj3).b();
                break;
            case 1:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ((uaa) obj3).refreshDrawableState();
                }
                break;
            case 2:
                fh81 fh81Var = (fh81) obj3;
                View view = (View) obj2;
                View view2 = (View) obj;
                if (view2 != null) {
                    fh81Var.removeView(view2);
                }
                if (view != null) {
                    fh81Var.addView(view, 0);
                }
                fh81.w(fh81Var);
                break;
            case 3:
                wh81 wh81Var = (wh81) obj3;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    wh81Var.b();
                    if (!zBooleanValue) {
                        wh81Var.t = null;
                    } else if (wh81Var.t == null) {
                        wh81Var.t = String.valueOf(wh81Var.Z);
                    }
                    wh81Var.f.c(wh81.R0[1], wh81Var, zBooleanValue ? new ydb(wh81Var) : null);
                }
                break;
            case 4:
                f8e1 f8e1Var = (f8e1) obj3;
                m320 m320Var = (m320) obj2;
                m320 m320Var2 = (m320) obj;
                if (!u890.j(m320Var2 != null ? m320Var2.getLabel() : null, m320Var != null ? m320Var.getLabel() : null)) {
                    ((TextView) f8e1.a(f8e1Var).c).setText(m320Var != null ? m320Var.getLabel() : null);
                }
                if (!u890.j(m320Var2 != null ? m320Var2.a() : null, m320Var != null ? m320Var.a() : null)) {
                    ((TextInputLayout) f8e1.a(f8e1Var).d).setError(m320Var != null ? m320Var.a() : null);
                    TextInputLayout textInputLayout = (TextInputLayout) f8e1.a(f8e1Var).d;
                    String strA = m320Var != null ? m320Var.a() : null;
                    textInputLayout.setErrorEnabled(!(strA == null || ihc1.y0(strA)));
                }
                if (!String.valueOf(((TextInputEditText) f8e1.a(f8e1Var).b).getText()).equals(m320Var != null ? m320Var.getText() : null)) {
                    ((TextInputEditText) f8e1.a(f8e1Var).b).setText(m320Var != null ? m320Var.getText() : null);
                }
                f8e1.c(f8e1Var).a(m320Var != null);
                f8e1.b(f8e1Var).a((m320Var != null ? m320Var.a() : null) != null);
                break;
            case 5:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    ((jkk1) obj3).f();
                }
                break;
            default:
                ((lfl1) obj3).a();
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public be0(fe0 fe0Var) {
        this.b = (byte) 0;
        Boolean bool = Boolean.FALSE;
        this.c = fe0Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public be0(uaa uaaVar) {
        this.b = (byte) 1;
        Boolean bool = Boolean.FALSE;
        this.c = uaaVar;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public be0(wh81 wh81Var) {
        this.b = (byte) 3;
        Boolean bool = Boolean.FALSE;
        this.c = wh81Var;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be0(Object obj, byte b) {
        super((Object) null);
        this.b = b;
        this.c = obj;
    }
}
