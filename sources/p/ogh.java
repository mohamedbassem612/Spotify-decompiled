package p;

import android.text.Editable;
import android.widget.EditText;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ogh implements Connectable {
    public final tjh a;
    public final af10 b;
    public final wjh c;
    public final String d;
    public final jgh e;
    public final cce f;
    public final bpb1 g = gio1.b((Object) null);

    public ogh(dkh dkhVar, tjh tjhVar, hwe1 hwe1Var, af10 af10Var, wjh wjhVar, String str, jgh jghVar, cce cceVar) {
        this.a = tjhVar;
        this.b = af10Var;
        this.c = wjhVar;
        this.d = str;
        this.e = jghVar;
        this.f = cceVar;
        EditText editText = jghVar.d;
        editText.setOnFocusChangeListener(new x29(this, (byte) 3));
        dkh.a(jghVar.f, jghVar.a.getContext().getString(2131959794), (qwc1) null);
        editText.setOnTouchListener(kgh.b);
    }

    public final Connection L(Consumer consumer) {
        jgh jghVar = this.e;
        jghVar.e.setOnClickListener(new f1b(consumer, (byte) 4));
        jghVar.d.addTextChangedListener(new lgh(consumer, this, (byte) 0));
        jghVar.h.setOnClickListener(new mgh(this, consumer, (byte) 0));
        jghVar.i.setOnClickListener(new mgh(this, consumer, (byte) 1));
        return new ngh(this);
    }

    public final void a() {
        jgh jghVar = this.e;
        jghVar.e.setVisibility(8);
        EditText editText = jghVar.d;
        editText.setVisibility(0);
        editText.requestFocus();
        editText.setSelection(editText.getText().length());
        if (!editText.isLaidOut() || editText.isLayoutRequested()) {
            editText.addOnLayoutChangeListener(new eg7(this, (byte) 6));
        } else {
            o0c.M(editText);
        }
    }

    public final void b(Editable editable) {
        qmy qmyVar;
        int length;
        if (editable != null) {
            wjh wjhVar = this.c;
            if (wjhVar.a()) {
                rph rphVar = (rph) this.g.getValue();
                ace0 ace0Var = rphVar != null ? rphVar.c : null;
                ebe0 ebe0Var = ace0Var instanceof ebe0 ? (ebe0) ace0Var : null;
                if (ebe0Var == null || (qmyVar = (qmy) ebe0Var.a) == null) {
                    return;
                }
                if (!qmyVar.e || wjhVar.b()) {
                    int i = qmyVar.d;
                    int i2 = 0;
                    for (Object obj : editable.getSpans(0, editable.length(), awe1.class)) {
                        editable.removeSpan((awe1) obj);
                    }
                    for (Object obj2 : editable.getSpans(0, editable.length(), nxe1.class)) {
                        editable.removeSpan((nxe1) obj2);
                    }
                    ArrayList<fwe1> arrayListB = hwe1.b(i, editable.toString());
                    int iR = xfo1.r(this.e.d, 2130968788);
                    for (fwe1 fwe1Var : arrayListB) {
                        if (fwe1Var instanceof dwe1) {
                            length = ((dwe1) fwe1Var).a.length() + i2;
                        } else if (!(fwe1Var instanceof ewe1)) {
                            eg.o();
                            return;
                        } else {
                            length = ((ewe1) fwe1Var).b.length() + i2;
                            editable.setSpan(new awe1(iR), i2, length, 33);
                            editable.setSpan(new nxe1(), i2, length, 33);
                        }
                        i2 = length;
                    }
                }
            }
        }
    }

    public final int c(rph rphVar) {
        ace0 ace0Var = rphVar.c;
        ebe0 ebe0Var = ace0Var instanceof ebe0 ? (ebe0) ace0Var : null;
        qmy qmyVar = ebe0Var != null ? (qmy) ebe0Var.a : null;
        wjh wjhVar = this.c;
        if (!wjhVar.a() || qmyVar == null) {
            return 3;
        }
        if (!qmyVar.e || wjhVar.b()) {
            return hwe1.a(qmyVar.d, rphVar.i) ? 1 : 2;
        }
        return 3;
    }

    public final void d(rph rphVar) {
        boolean zB;
        ace0 ace0Var = rphVar.c;
        ebe0 ebe0Var = ace0Var instanceof ebe0 ? (ebe0) ace0Var : null;
        qmy qmyVar = ebe0Var != null ? (qmy) ebe0Var.a : null;
        wjh wjhVar = this.c;
        if (qmyVar == null) {
            zB = false;
        } else {
            zB = !qmyVar.e ? true : wjhVar.b();
        }
        jgh jghVar = this.e;
        jghVar.i.setVisibility((wjhVar.a() && (rphVar.h instanceof jmh) && zB && jghVar.d.hasFocus()) ? 0 : 8);
    }
}
