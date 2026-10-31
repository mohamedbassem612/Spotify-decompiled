package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rbp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kb61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbp0(kb61 kb61Var, byte b) {
        super(0);
        this.a = b;
        this.b = kb61Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kb61 kb61Var = this.b;
        switch (b) {
            case 0:
                return kb61Var.u();
            case 1:
                return kb61Var.R();
            case 2:
                return kb61Var.b();
            case 3:
                return kb61Var.a();
            case 4:
                return kb61Var.G();
            case 5:
                return kb61Var.h();
            case 6:
                return kb61Var.z();
            case 7:
                return kb61Var.f0();
            case 8:
                return kb61Var.y();
            case 9:
                return kb61Var.A();
            case 10:
                return kb61Var.z();
            case 11:
                return kb61Var.G();
            case 12:
                return kb61Var.A();
            case 13:
                return kb61Var.a();
            case 14:
                return kb61Var.t();
            case 15:
                return kb61Var.f0();
            case 16:
                return kb61Var.G();
            case 17:
                return kb61Var.A();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return kb61Var.z();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return kb61Var.k0();
            case 20:
                return kb61Var.u();
            case 21:
                return kb61Var.z();
            case 22:
                return kb61Var.z();
            default:
                return kb61Var.z();
        }
    }
}
