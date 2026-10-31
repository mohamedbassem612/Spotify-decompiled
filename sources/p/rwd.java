package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rwd extends r570 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ rwd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428307;
            case 1:
                return 2131428330;
            default:
                return 2131428640;
        }
    }

    public final EnumSet c() {
        byte b = this.a;
        ix40 ix40Var = ix40.f;
        switch (b) {
            case 0:
                return EnumSet.of(ix40.h, ix40Var);
            case 1:
                return EnumSet.of(ix40.b);
            default:
                return EnumSet.of(ix40Var);
        }
    }

    public void e(View view, y570 y570Var, int... iArr) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                super.e(view, y570Var, iArr);
                break;
        }
    }

    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                View viewL = eqq.l(viewGroup, 2131624495, viewGroup, false);
                int i = 2131427922;
                RecyclerView recyclerViewT = m5n1.t(viewL, 2131427922);
                if (recyclerViewT != null) {
                    i = 2131431193;
                    TabLayout tabLayoutT = m5n1.t(viewL, 2131431193);
                    if (tabLayoutT != null) {
                        return new qwd(new asn((LinearLayout) viewL, recyclerViewT, tabLayoutT), (uzd) obj, l670Var);
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewL.getResources().getResourceName(i)));
                return null;
            case 1:
                vx40 vx40Var = (vx40) obj;
                View viewL2 = eqq.l(viewGroup, 2131626002, viewGroup, false);
                int i2 = 2131427839;
                EncoreButton encoreButtonT = m5n1.t(viewL2, 2131427839);
                if (encoreButtonT != null) {
                    i2 = 2131428203;
                    if (((RoundedConstraintLayout) m5n1.t(viewL2, 2131428203)) != null) {
                        i2 = 2131430721;
                        RecyclerView recyclerViewT2 = m5n1.t(viewL2, 2131430721);
                        if (recyclerViewT2 != null) {
                            i2 = 2131431356;
                            TextView textView = (TextView) m5n1.t(viewL2, 2131431356);
                            if (textView != null) {
                                return new ky(vx40Var, new kdy0((LinearLayout) viewL2, encoreButtonT, recyclerViewT2, textView, (byte) 29));
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewL2.getResources().getResourceName(i2)));
                return null;
            default:
                return new lh51(((u0i) obj).a((l0i) null));
        }
    }

    private final void g(View view, y570 y570Var, int... iArr) {
    }

    private final void h(View view, y570 y570Var, int... iArr) {
    }
}
