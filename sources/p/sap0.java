package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ui8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sap0(ui8 ui8Var, byte b) {
        super(0);
        this.a = b;
        this.b = ui8Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ui8 ui8Var = this.b;
        switch (b) {
            case 0:
                return ui8Var.b();
            case 1:
                return ui8Var.d();
            case 2:
                return new tbp0(ui8Var, (byte) 0);
            case 3:
                return new tbp0(ui8Var, (byte) 1);
            case 4:
                return ui8Var.d();
            case 5:
                return new tbp0(ui8Var, (byte) 2);
            case 6:
                return ui8Var.d();
            case 7:
                return ui8Var.f();
            case 8:
                return ui8Var.d();
            case 9:
                return ui8Var.d();
            case 10:
                return ui8Var.c();
            case 11:
                return ui8Var.c();
            case 12:
                return ui8Var.f();
            case 13:
                return ui8Var.c();
            case 14:
                return ui8Var.d();
            case 15:
                return ui8Var.d();
            case 16:
                return new kc00(ui8Var, (byte) 2);
            default:
                return ui8Var.f();
        }
    }
}
