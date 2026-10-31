package p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qn40 implements ihr0 {
    public final View a;
    public final cir0 b;
    public final ts70 c;
    public final pn40 d;
    public final ArrayList e;
    public iu30 f;

    public qn40(View view, cir0 cir0Var, ts70 ts70Var, pn40 pn40Var, ArrayList arrayList) {
        this.a = view;
        this.b = cir0Var;
        this.c = ts70Var;
        this.d = pn40Var;
        this.e = arrayList;
    }

    public final boolean b(ehr0 ehr0Var) {
        Uri data;
        if (ehr0Var instanceof bos0) {
            Boolean bool = (Boolean) ((bos0) ehr0Var).a.get("android.permission.CAMERA");
            this.b.l(new zf10(this, bool != null ? bool.booleanValue() : false ? this.c.a() : null, (byte) 26));
            return true;
        }
        if (!(ehr0Var instanceof xh0)) {
            return false;
        }
        xh0 xh0Var = (xh0) ehr0Var;
        this.e.remove(this);
        if (xh0Var instanceof wh0) {
            Intent intent = ((wh0) xh0Var).a;
            if (intent == null || (data = intent.getData()) == null) {
                data = (Uri) this.d.d;
            }
            iu30 iu30Var = this.f;
            if (iu30Var != null) {
                data.getClass();
            }
        } else {
            iu30 iu30Var2 = this.f;
            if (iu30Var2 != null) {
            }
        }
        this.f = null;
        return true;
    }
}
