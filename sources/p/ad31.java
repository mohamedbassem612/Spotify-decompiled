package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/ad31;", "Lp/dwb;", "<init>", "()V", "src_main_java_com_spotify_login_magiclink-magiclink"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ad31 extends dwb {
    public kg0 V1;
    public nxf0 W1;
    public boolean X1;

    public final int b1() {
        return 2132017725;
    }

    public final Dialog c1(Bundle bundle) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(P0()).inflate(2131625594, (ViewGroup) null, false);
        int i = 2131428197;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428197);
        if (encoreButtonT != null) {
            i = 2131430687;
            if (((TextView) m5n1.t(constraintLayoutInflate, 2131430687)) != null) {
                i = 2131430688;
                EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131430688);
                if (encoreButtonT2 != null) {
                    i = 2131430689;
                    if (((TextView) m5n1.t(constraintLayoutInflate, 2131430689)) != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        nxf0 nxf0Var = this.W1;
                        if (nxf0Var == null) {
                            u890.C("magicLinkInstrumentor");
                            throw null;
                        }
                        nxf0Var.a(new up80());
                        encoreButtonT2.setOnClickListener(new zc31(this, (byte) 0));
                        encoreButtonT.setOnClickListener(new zc31(this, (byte) 1));
                        cwb cwbVar = new cwb(P0(), 2132017725);
                        cwbVar.setContentView(constraintLayout);
                        return cwbVar;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.X1) {
            nxf0 nxf0Var = this.W1;
            if (nxf0Var == null) {
                u890.C("magicLinkInstrumentor");
                throw null;
            }
            nxf0Var.a(new tp80(5, 6, 1));
        }
        super/*p.t2u*/.onDismiss(dialogInterface);
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
    }
}
