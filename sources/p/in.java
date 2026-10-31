package p;

import android.content.Intent;
import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class in implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ AccountPickerActivity c;

    public in(jn jnVar, AccountPickerActivity accountPickerActivity) {
        this.a = (byte) 1;
        this.b = jnVar;
        this.c = accountPickerActivity;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        jn jnVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hn hnVar = (hn) obj;
                t3b1 t3b1Var = this.c;
                t3b1Var.finish();
                t3b1Var.startActivity(dv.a(jnVar.a, t3b1Var, hnVar.a, hnVar.b, hnVar.c));
                break;
            case 1:
                jnVar.d.a(new nlb1(((fn) obj).a));
                t3b1 t3b1Var2 = this.c;
                t3b1Var2.finish();
                u2f0 u2f0Var = jnVar.b;
                i2i1 i2i1VarA = jnVar.c.a(t3b1Var2, "spotify:home");
                i2i1VarA.c();
                Intent intent = (Intent) i2i1VarA.b;
                intent.addFlags(268435456);
                t3b1Var2.startActivity(u2f0.a(u2f0Var, t3b1Var2, intent, false, (Uri) null, 0, 2, 60));
                break;
            default:
                t3b1 t3b1Var3 = this.c;
                t3b1Var3.finish();
                u2f0 u2f0Var2 = jnVar.b;
                i2i1 i2i1VarA2 = jnVar.c.a(t3b1Var3, "spotify:home");
                i2i1VarA2.c();
                Intent intent2 = (Intent) i2i1VarA2.b;
                intent2.addFlags(268435456);
                t3b1Var3.startActivity(u2f0.a(u2f0Var2, t3b1Var3, intent2, false, (Uri) null, 0, 2, 60));
                break;
        }
    }

    public /* synthetic */ in(AccountPickerActivity accountPickerActivity, jn jnVar, byte b) {
        this.a = b;
        this.c = accountPickerActivity;
        this.b = jnVar;
    }
}
