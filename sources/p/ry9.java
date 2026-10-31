package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ry9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ px9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry9(px9 px9Var, byte b) {
        super(0);
        this.a = b;
        this.b = px9Var;
    }

    public final Object invoke() {
        byte b = this.a;
        px9 px9Var = this.b;
        switch (b) {
            case 0:
                kly0 kly0Var = px9Var.S;
                return p7h.M(new jlq0[]{new wo5(px9Var.Q, (y2g0) new cbp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5).invoke(), (byte) 10), new wo5((FireAndForgetResolver) new cbp0(0, px9Var.P, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2).invoke(), (r241) new cbp0(0, px9Var.R, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3).invoke(), (byte) 4), new i5n(), new fjg((jnh0) new cbp0(0, px9Var.A, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4).invoke(), (byte) 5), new bp5((y2g0) new bbp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28).invoke(), (Context) new bbp0(0, px9Var.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29).invoke(), (cd30) new cbp0(0, px9Var.c0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0).invoke(), (oo70) new cbp0(0, px9Var.H, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1).invoke())});
            case 1:
                return px9Var.c;
            case 2:
                return px9Var.a;
            case 3:
                return px9Var.L;
            case 4:
                return px9Var.M;
            case 5:
                return px9Var.d0;
            case 6:
                return px9Var.r;
            case 7:
                return px9Var.g0;
            case 8:
                return px9Var.r0;
            case 9:
                return px9Var.s0;
            case 10:
                return px9Var.g0;
            case 11:
                return ((w5b1) px9Var.K.get()).a;
            case 12:
                return px9Var.K;
            case 13:
                return px9Var.r;
            case 14:
                return px9Var.g0;
            case 15:
                return px9Var.b;
            case 16:
                return px9Var.h0;
            case 17:
                return px9Var.i0;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return px9Var.j0;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return px9Var.d0;
            default:
                return px9Var.f0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry9(jma jmaVar, px9 px9Var, uv40 uv40Var, l3n1 l3n1Var) {
        super(0);
        this.a = (byte) 0;
        this.b = px9Var;
    }
}
