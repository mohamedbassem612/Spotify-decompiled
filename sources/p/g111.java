package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g111 implements h8l {
    public final pux0 a;
    public final uxy0 b;
    public final tkt c;
    public Consumer d;

    public g111(ViewGroup viewGroup, LayoutInflater layoutInflater, onq onqVar, pux0 pux0Var) {
        this.a = pux0Var;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625575, viewGroup, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i = 2131430605;
        ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131430605);
        if (constraintLayoutT != null) {
            int i2 = 2131428963;
            if (((Space) m5n1.t(constraintLayoutT, 2131428963)) != null) {
                i2 = 2131430603;
                EncoreButton encoreButtonT = m5n1.t(constraintLayoutT, 2131430603);
                if (encoreButtonT != null) {
                    i2 = 2131430607;
                    if (((TextView) m5n1.t(constraintLayoutT, 2131430607)) != null) {
                        mlw0 mlw0Var = new mlw0(constraintLayoutT, encoreButtonT);
                        int i3 = 2131430606;
                        RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430606);
                        if (recyclerViewT != null) {
                            i3 = 2131431013;
                            if (m5n1.t(constraintLayoutInflate, 2131431013) != null) {
                                this.b = new uxy0(constraintLayout, mlw0Var, recyclerViewT);
                                ak01 ak01Var = new ak01(this, (byte) 6);
                                wj3 wj3Var = (wj3) onqVar.a.c;
                                this.c = new tkt(recyclerViewT, ak01Var, (sjw0) ((jly0) wj3Var.f).get(), (pnq) ((jly0) wj3Var.h).get(), (rnq) ((jly0) wj3Var.i).get());
                                return;
                            }
                        }
                        i = i3;
                    }
                }
            }
            bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i2)));
            throw null;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        this.d = consumer;
        ((EncoreButton) ((mlw0) this.b.c).b).setOnClickListener(new hid0(this, (byte) 21));
        return new n1b0(this, (byte) 23);
    }

    public final Object getView() {
        return (ConstraintLayout) this.b.b;
    }

    public final Bundle serialize() {
        return mno1.g();
    }

    public final void start() {
    }

    public final void stop() {
    }
}
