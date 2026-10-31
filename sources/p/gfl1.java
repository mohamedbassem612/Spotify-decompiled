package p;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gfl1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hfl1 b;

    public /* synthetic */ gfl1(hfl1 hfl1Var, byte b) {
        this.a = b;
        this.b = hfl1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        hfl1 hfl1Var = this.b;
        switch (b) {
            case 0:
                lfl1 lfl1Var = hfl1Var.g;
                if (lfl1Var != null) {
                    bxn0 bxn0Var = lfl1Var.f;
                    sfl1 sfl1Var = lfl1Var.b;
                    if (!sfl1Var.a()) {
                        sfl1Var.e = null;
                        sfl1Var.d.onNext(Boolean.valueOf(sfl1Var.a()));
                        lfl1Var.k.c(lfl1.m[1], lfl1Var, (Object) null);
                        bxn0Var.b();
                        t8r0 t8r0Var = lfl1Var.g;
                        hma1 hma1VarEdit = ((ut71) t8r0Var.b).a((Context) t8r0Var.a).edit();
                        hma1VarEdit.a(agl1.b, true);
                        hma1VarEdit.g();
                    } else {
                        bxn0Var.c();
                        lfl1Var.d.i("com.spotify.music.internal.waze.LAUNCH");
                    }
                }
                break;
            default:
                lfl1 lfl1Var2 = hfl1Var.g;
                if (lfl1Var2 != null && !lfl1Var2.e.d()) {
                    lfl1Var2.f.c();
                    lfl1Var2.d.i("com.spotify.music.internal.waze.LAUNCH");
                    break;
                }
                break;
        }
    }
}
