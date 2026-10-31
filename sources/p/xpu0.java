package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xpu0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fji0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpu0(fji0 fji0Var) {
        super(3);
        this.a = (byte) 0;
        this.b = fji0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fji0 fji0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                x4i1 x4i1Var = fji0Var.a;
                String str = x4i1Var.b;
                String str2 = x4i1Var.e;
                if (str2 == null) {
                    str2 = "";
                }
                Uri uri = Uri.parse(str2);
                x4i1 x4i1Var2 = fji0Var.a;
                String str3 = x4i1Var2.c;
                if (str3 == null) {
                    str3 = x4i1Var2.b;
                }
                bmq0.a(uri, (qim0) null, (hcx) null, str, str3, 0L, 0L, false, b0kVar, 0, 230);
                break;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(406433623);
                StringBuilder sb = new StringBuilder();
                boolean z = fji0Var.c;
                int i = fji0Var.d;
                int i2 = fji0Var.b;
                if (z) {
                    x340Var.i0(-1052880488);
                    sb.append(cwl1.o0(x340Var, 2131960117));
                    x340Var.r(false);
                } else {
                    wls0 wls0Var = fji0Var.f;
                    if (wls0Var == wls0.f) {
                        x340Var.i0(-1052876066);
                        sb.append(cwl1.o0(x340Var, 2131960116));
                        x340Var.r(false);
                    } else if (wls0Var == wls0.d) {
                        x340Var.i0(-1052871591);
                        sb.append(cwl1.o0(x340Var, 2131960118));
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1720796115);
                        x340Var.r(false);
                    }
                }
                if (i2 > 0) {
                    x340Var.i0(1720834183);
                    if (sb.length() > 0) {
                        sb.append(" • ");
                    }
                    sb.append(cwl1.U(2131820848, i2, new Object[]{Integer.valueOf(i2)}, x340Var));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1721091731);
                    x340Var.r(false);
                }
                if (i > 0) {
                    x340Var.i0(1721131969);
                    if (sb.length() > 0) {
                        sb.append(" • ");
                    }
                    sb.append(cwl1.U(2131820847, i, new Object[]{Integer.valueOf(i)}, x340Var));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1721395283);
                    x340Var.r(false);
                }
                String string = sb.toString();
                x340Var.r(false);
                if (!ihc1.y0(string)) {
                    x340Var.i0(-698587149);
                    uwo1.e(string, anm1.N("playlist_participants_collaborator_item_subtitle: ".concat(fji0Var.a.a), nim0.a), (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1724);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-698345628);
                    x340Var.r(false);
                }
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                cjc0 cjc0Var = new cjc0(2);
                x4i1 x4i1Var3 = fji0Var.a;
                String str4 = x4i1Var3.c;
                if (str4 == null) {
                    str4 = x4i1Var3.b;
                }
                uwo1.e(str4, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar2, 0, 0, 1726);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpu0(ulc ulcVar, fji0 fji0Var, byte b) {
        super(3);
        this.a = b;
        this.b = fji0Var;
    }
}
