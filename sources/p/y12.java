package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionManualInputModeSelected;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionSearchIntent;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y12 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y12(h22 h22Var, byte b) {
        super(0);
        this.a = b;
        this.b = h22Var;
    }

    public final Object invoke() {
        UUID uuid;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Bundle bundleA = ((oe41) ((zf30) h22Var).x1.c).a("STATE_PROVIDER_VIEW_ID");
                return (bundleA == null || (uuid = (UUID) jhc1.v(bundleA, "STATE_KEY_VIEW_ID", UUID.class)) == null) ? UUID.randomUUID() : uuid;
            case 1:
                Object objT = jhc1.t(h22Var.O0(), "ARGS_KEY", n12.class);
                if (objT != null) {
                    return (n12) objT;
                }
                hhg1.n("Required value was null.");
                return null;
            case 2:
                dsk0 dsk0Var = h22Var.T1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("suggestion_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 3:
                dsk0 dsk0Var2 = h22Var.T1;
                if (dsk0Var2 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC2 = dsk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("edit_disclaimer", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 4:
                dsk0 dsk0Var3 = h22Var.T1;
                if (dsk0Var3 != null) {
                    return dsk0Var3.e();
                }
                u890.C("ubiEventFactory");
                throw null;
            case 5:
                dsk0 dsk0Var4 = h22Var.T1;
                if (dsk0Var4 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC4 = dsk0Var4.b.c();
                x6h1VarC4.i.add(new a7h1("loader", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA3 = x6h1VarC4.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 6:
                dsk0 dsk0Var5 = h22Var.T1;
                if (dsk0Var5 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC5 = dsk0Var5.b.c();
                x6h1VarC5.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA4 = x6h1VarC5.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 7:
                dsk0 dsk0Var6 = h22Var.T1;
                if (dsk0Var6 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC6 = dsk0Var6.b.c();
                x6h1VarC6.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("retry_btton", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                y6h1 y6h1VarA5 = x6h1VarC7.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA5;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
            case 8:
                dsk0 dsk0Var7 = h22Var.T1;
                if (dsk0Var7 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC8 = dsk0Var7.b.c();
                x6h1VarC8.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                y6h1 y6h1VarA6 = x6h1VarC9.a();
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1VarA6;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var6.a();
            case 9:
                dsk0 dsk0Var8 = h22Var.T1;
                if (dsk0Var8 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC10 = dsk0Var8.b.c();
                x6h1VarC10.i.add(new a7h1("view_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                y6h1 y6h1VarA7 = x6h1VarC10.a();
                k7h1 k7h1Var7 = new k7h1();
                ((xjn) k7h1Var7).a = y6h1VarA7;
                ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var7.a();
            case 10:
                dsk0 dsk0Var9 = h22Var.T1;
                if (dsk0Var9 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC11 = dsk0Var9.b.c();
                x6h1VarC11.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = true;
                y6h1 y6h1VarA8 = x6h1VarC11.a();
                k7h1 k7h1Var8 = new k7h1();
                ((xjn) k7h1Var8).a = y6h1VarA8;
                ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var8.a();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                dsk0 dsk0Var10 = h22Var.T1;
                if (dsk0Var10 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC12 = dsk0Var10.b.c();
                x6h1VarC12.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = true;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("form_error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = true;
                y6h1 y6h1VarA9 = x6h1VarC13.a();
                k7h1 k7h1Var9 = new k7h1();
                ((xjn) k7h1Var9).a = y6h1VarA9;
                ((xjn) k7h1Var9).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var9.a();
            case grn1.d /* 12 */:
                dsk0 dsk0Var11 = h22Var.T1;
                if (dsk0Var11 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC14 = dsk0Var11.b.c();
                x6h1VarC14.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = true;
                x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                x6h1VarC15.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = true;
                y6h1 y6h1VarA10 = x6h1VarC15.a();
                k7h1 k7h1Var10 = new k7h1();
                ((xjn) k7h1Var10).a = y6h1VarA10;
                ((xjn) k7h1Var10).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var10.a();
            case 13:
                if (!h22Var.V1) {
                    b8p1 b8p1VarY0 = h22Var.Y0();
                    t2j0 t2j0Var = (t2j0) b8p1VarY0.c;
                    f12 f12VarN = AddressCollectionSearchIntent.n();
                    f12VarN.n(((UUID) b8p1VarY0.e).toString());
                    t2j0Var.a(f12VarN.build());
                    h22Var.V1 = true;
                }
                return rih1Var;
            case 14:
                b8p1 b8p1VarY1 = h22Var.Y0();
                t2j0 t2j0Var2 = (t2j0) b8p1VarY1.c;
                d12 d12VarN = AddressCollectionManualInputModeSelected.n();
                d12VarN.n(((UUID) b8p1VarY1.e).toString());
                t2j0Var2.a(d12VarN.build());
                h22Var.Z0().U(a000.a);
                return rih1Var;
            case 15:
                dsk0 dsk0Var12 = h22Var.T1;
                if (dsk0Var12 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC16 = dsk0Var12.b.c();
                x6h1VarC16.i.add(new a7h1("learn_more_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = true;
                y6h1 y6h1VarA11 = x6h1VarC16.a();
                k7h1 k7h1Var11 = new k7h1();
                ((xjn) k7h1Var11).a = y6h1VarA11;
                ((xjn) k7h1Var11).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var11.a();
            default:
                q22 q22Var = h22Var.N1;
                if (q22Var != null) {
                    return q22Var;
                }
                u890.C("vmFactory");
                throw null;
        }
    }
}
