package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ids implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h98 b;
    public final /* synthetic */ iu30 c;

    public /* synthetic */ ids(byte b, h98 h98Var, iu30 iu30Var) {
        this.a = b;
        this.b = h98Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strB;
        oaq0 oaq0Var;
        Boolean bool;
        Object haq0Var;
        naq0 naq0Var;
        Boolean bool2;
        byte b = this.a;
        Object gaq0Var = null;
        iu30 iu30Var = this.c;
        h98 h98Var = this.b;
        switch (b) {
            case 0:
                paq0 paq0Var = (paq0) h98Var.d;
                if (paq0Var != null) {
                    if (paq0Var instanceof laq0) {
                        gaq0Var = new eaq0(((laq0) paq0Var).d);
                    } else if (paq0Var instanceof maq0) {
                        maq0 maq0Var = (maq0) paq0Var;
                        gaq0Var = new gaq0(maq0Var.h, maq0Var.i);
                    }
                    if (gaq0Var != null) {
                        iu30Var.invoke(gaq0Var);
                    }
                }
                break;
            case 1:
                paq0 paq0Var2 = (paq0) h98Var.d;
                if (paq0Var2 != null && (strB = paq0Var2.b()) != null) {
                    iu30Var.invoke(new iaq0(strB));
                    break;
                }
                break;
            case 2:
                naq0 naq0Var2 = (paq0) h98Var.d;
                if (naq0Var2 != null) {
                    if (!(naq0Var2 instanceof naq0) || (bool2 = (naq0Var = naq0Var2).h) == null) {
                        if ((naq0Var2 instanceof oaq0) && (bool = (oaq0Var = (oaq0) naq0Var2).i) != null) {
                            String str = oaq0Var.h;
                            haq0Var = bool.booleanValue() ? new haq0(str, true) : new baq0(str, true);
                        }
                        if (gaq0Var != null) {
                            iu30Var.invoke(gaq0Var);
                        }
                    } else {
                        String str2 = naq0Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        haq0Var = bool2.booleanValue() ? new haq0(str2, false) : new baq0(str2, false);
                    }
                    gaq0Var = haq0Var;
                    if (gaq0Var != null) {
                        iu30Var.invoke(gaq0Var);
                    }
                }
                break;
            default:
                naq0 naq0Var3 = (paq0) h98Var.d;
                if (naq0Var3 != null) {
                    if (naq0Var3 instanceof naq0) {
                        naq0 naq0Var4 = naq0Var3;
                        String str3 = naq0Var4.g;
                        if (str3 == null) {
                            str3 = naq0Var4.d;
                        }
                        iu30Var.invoke(new caq0(str3, false));
                    } else if (naq0Var3 instanceof oaq0) {
                        iu30Var.invoke(new caq0(((oaq0) naq0Var3).h, true));
                    } else if (naq0Var3 instanceof laq0) {
                        iu30Var.invoke(new daq0(((laq0) naq0Var3).d));
                    } else if (!(naq0Var3 instanceof maq0)) {
                        eg.o();
                    } else {
                        maq0 maq0Var2 = (maq0) naq0Var3;
                        iu30Var.invoke(new faq0(maq0Var2.h, maq0Var2.i));
                    }
                }
                break;
        }
    }
}
