package p;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/krm1;", "Lp/t2u;", "<init>", "()V", "src_main_java_com_spotify_yourepisodes_settings-settings"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class krm1 extends t2u {
    public th30 V1;
    public String W1;
    public bk7 X1;
    public Function0 Y1;

    public static void i1(krm1 krm1Var, String str, grm1 grm1Var, Function0 function0) {
        krm1Var.W1 = str;
        krm1Var.X1 = bbp1.f(new f2m1(krm1Var, grm1Var, (byte) 16));
        krm1Var.Y1 = function0;
        th30 th30Var = krm1Var.V1;
        if (th30Var != null) {
            krm1Var.g1(th30Var, "YourEpisodesSettingsOptionPicker");
        } else {
            u890.C("innerFragmentManager");
            throw null;
        }
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        Y0();
    }

    public final void G0() {
        Window window;
        super.G0();
        Dialog dialog = ((t2u) this).Q1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setWindowAnimations(2132018925);
    }

    public final void I0(View view, Bundle bundle) {
        kgr0 kgr0Var = (kgr0) view.findViewById(2131430276);
        kgr0Var.setOnBackPressed(new jrm1(this, (byte) 0));
        kgr0Var.setTitle(new j2i(-448559641, new fak1(this, (byte) 22), true));
        RecyclerView recyclerViewFindViewById = view.findViewById(2131430236);
        bk7 bk7Var = this.X1;
        if (bk7Var != null) {
            recyclerViewFindViewById.setAdapter(bk7Var);
        } else {
            u890.C("recyclerAdapter");
            throw null;
        }
    }

    public final int b1() {
        return 2132018149;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Function0 function0 = this.Y1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = kgr0.T0;
        return xyn1.z(layoutInflater.inflate(2131624547, viewGroup));
    }
}
