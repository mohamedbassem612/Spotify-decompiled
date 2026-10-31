package p;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ito0 implements jrn0 {
    public final /* synthetic */ kto0 a;

    public ito0(kto0 kto0Var) {
        this.a = kto0Var;
    }

    @Override // p.jrn0
    public final irn0 l(Intent intent, th61 th61Var) {
        kto0 kto0Var = this.a;
        kto0.b(kto0Var);
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("push_data", bet0.class) : intent.getParcelableExtra("push_data");
        if (parcelableExtra == null) {
            eg.m("Push action data should not be null");
            return null;
        }
        bet0 bet0Var = (bet0) parcelableExtra;
        String str = bet0Var.d;
        kto0.c(kto0Var, bet0Var.a);
        tv80 tv80VarL = gg.l(intent);
        LoggingParams loggingParamsBuild = tv80VarL != null ? LoggingParams.builder().interactionId(tv80VarL.a.a).build() : null;
        PlayCommand.Builder builder = PlayCommand.builder(Context.fromUri(str), PlayOrigin.create("quicksilver"));
        if (loggingParamsBuild != null) {
            builder.loggingParams(loggingParamsBuild);
        }
        kto0.d(kto0Var).a(builder.build()).subscribe((SingleObserver) new vwf0(bet0Var));
        Set set = s4b1.f;
        return lfb.j(uic.x(str));
    }
}
