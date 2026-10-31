package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jd40 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kd40 b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ jd40(kd40 kd40Var, Consumer consumer, byte b) {
        this.a = b;
        this.b = kd40Var;
        this.c = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Consumer consumer = this.c;
        kd40 kd40Var = this.b;
        switch (b) {
            case 0:
                kd40Var.d(consumer, kd40Var.c, ad40.a, kd40Var.d, kd40Var.e, kd40Var.f, kd40Var.g);
                break;
            case 1:
                kd40Var.d(consumer, kd40Var.d, bd40.a, kd40Var.c, kd40Var.e, kd40Var.f, kd40Var.g);
                break;
            case 2:
                kd40Var.d(consumer, kd40Var.e, cd40.a, kd40Var.c, kd40Var.d, kd40Var.f, kd40Var.g);
                break;
            case 3:
                kd40Var.d(consumer, kd40Var.f, ed40.a, kd40Var.c, kd40Var.d, kd40Var.e, kd40Var.g);
                break;
            default:
                kd40Var.d(consumer, kd40Var.g, gd40.a, kd40Var.c, kd40Var.d, kd40Var.e, kd40Var.f);
                break;
        }
    }
}
