package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fcb1 implements py50, mqb1 {
    public final jus a;
    public iy50 b;
    public final ccb1 c;

    public fcb1(koc0 koc0Var, jus jusVar) {
        this.a = jusVar;
        this.c = new ccb1(koc0Var, this, (byte) 1);
    }

    public static boolean d(kby kbyVar) {
        CharSequence charSequence = (CharSequence) kbyVar.q.get("image_url");
        return !(charSequence == null || charSequence.length() == 0);
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        String string;
        iy50 iy50Var = null;
        Object obj = null;
        iy50Var = null;
        if (bundle != null && (string = bundle.getString("StandardHeaderConfiguration.savedStyle")) != null) {
            d7 d7Var = new d7(iy50.e, (byte) 0);
            while (d7Var.hasNext()) {
                Object next = d7Var.next();
                if (u890.j(((iy50) next).name(), string)) {
                    obj = next;
                    break;
                }
            }
            iy50Var = (iy50) obj;
        }
        this.b = iy50Var;
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        iy50 iy50Var = this.b;
        if (iy50Var != null) {
            bundle.putString("StandardHeaderConfiguration.savedStyle", iy50Var.name());
        }
    }

    @Override // p.py50
    public final iu30 k() {
        return this.c;
    }
}
