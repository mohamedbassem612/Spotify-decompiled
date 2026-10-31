package p;

import android.content.ActivityNotFoundException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bkb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ihg0 b;
    public final /* synthetic */ pbr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bkb0(ihg0 ihg0Var, pbr0 pbr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ihg0Var;
        this.c = pbr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbr0 pbr0Var = this.c;
        ihg0 ihg0Var = this.b;
        switch (b) {
            case 0:
                try {
                    ihg0Var.a(tto1.f(hh0.a));
                } catch (ActivityNotFoundException unused) {
                    pbr0Var.accept(new c2f(2));
                }
                break;
            default:
                try {
                    ihg0Var.a(tto1.f(ih0.a));
                } catch (ActivityNotFoundException unused2) {
                    pbr0Var.accept(new c2f(2));
                }
                break;
        }
        return rih1Var;
        return rih1Var;
    }
}
