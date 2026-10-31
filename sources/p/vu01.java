package p;

import android.os.Bundle;
import com.spotify.mobius.MobiusLoop;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vu01 extends x7e0 implements b031 {
    public final uu01 N0;
    public final uu01 O0;
    public ir01 X;
    public final bpb1 Y;
    public final xe01 Z;
    public final wu01 d;
    public final lr01 e;
    public final iac0 f;
    public final dv01 g;
    public boolean h;
    public boolean i;
    public Integer t;

    public vu01(wu01 wu01Var, lr01 lr01Var, iac0 iac0Var, dv01 dv01Var) {
        this.d = wu01Var;
        this.e = lr01Var;
        this.f = iac0Var;
        this.g = dv01Var;
        bpb1 bpb1VarB = gio1.b(av01.a);
        this.Y = bpb1VarB;
        this.Z = d5p1.h(bpb1VarB);
        this.N0 = new uu01(this, (byte) 1);
        this.O0 = new uu01(this, (byte) 0);
    }

    public static m9m s(String str) {
        if (str != null) {
            try {
                if (!ihc1.y0(str)) {
                    d7 d7Var = new d7(m9m.f, (byte) 0);
                    while (d7Var.hasNext()) {
                        Object next = d7Var.next();
                        if (((m9m) next).a.equalsIgnoreCase(str)) {
                            return (m9m) next;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            } catch (NoSuchElementException unused) {
                n57.e("Invalid content tag: ".concat(str));
            }
        }
        return null;
    }

    public final void a(Bundle bundle) {
        this.h = true;
        lv01 parcelable = bundle.getParcelable("RECENTS_SAVED_STATE_KEY");
        if (parcelable != null) {
            yu01 yu01Var = (yu01) this.d;
            zu01 zu01Var = yu01Var.i;
            tr80 tr80Var = new tr80(0, parcelable.a, 1);
            m9m m9mVar = parcelable.c;
            yu01Var.i = zu01.a(zu01Var, null, 0, 0, parcelable.b, m9mVar, parcelable.d, tr80Var, parcelable.e, null, parcelable.g, 647);
        }
    }

    public final void e() {
        this.X = this.e.a("spotify:list:recents:page");
        fn31.T(cto1.q(this.f), (o8n) null, 0, new xw0(this, (lnm) null, (byte) 11), 3);
    }

    public final void f() {
        yu01 yu01Var = (yu01) this.d;
        MobiusLoop mobiusLoop = yu01Var.j;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
            zu01 zu01Var = (zu01) mobiusLoop.i;
            if (zu01Var != null) {
                yu01Var.i = zu01Var;
            }
        }
        yu01Var.j = null;
        this.X = null;
    }

    public final Bundle serialize() {
        zu01 zu01Var;
        Bundle bundle = new Bundle();
        yu01 yu01Var = (yu01) this.d;
        MobiusLoop mobiusLoop = yu01Var.j;
        if (mobiusLoop == null || (zu01Var = (zu01) mobiusLoop.i) == null) {
            zu01Var = yu01Var.i;
        }
        bundle.putParcelable("RECENTS_SAVED_STATE_KEY", gyo1.T(zu01Var));
        return bundle;
    }
}
