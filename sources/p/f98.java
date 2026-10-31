package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f98 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gw70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f98(Context context, gw70 gw70Var, byte b) {
        super(0);
        this.a = b;
        this.b = context;
        this.c = gw70Var;
    }

    public final Object invoke() {
        byte b = this.a;
        gw70 gw70Var = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                return new lly(this.b, this.c, 4, false, false, false, 48);
            case 1:
                return new QuickActionView(new zez0(context, gw70Var));
            case 2:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625426, (ViewGroup) null, false);
                int i = 2131427611;
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
                if (view != null) {
                    i = 2131429055;
                    if (m5n1.t(constraintLayoutInflate, 2131429055) != null) {
                        i = 2131429056;
                        if (m5n1.t(constraintLayoutInflate, 2131429056) != null) {
                            i = 2131429057;
                            if (m5n1.t(constraintLayoutInflate, 2131429057) != null) {
                                i = 2131429058;
                                if (m5n1.t(constraintLayoutInflate, 2131429058) != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                    i = 2131431115;
                                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                    if (textView != null) {
                                        i = 2131431356;
                                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                        if (textView2 != null) {
                                            i = 2131431395;
                                            SwitchCompat switchCompatT = m5n1.t(constraintLayoutInflate, 2131431395);
                                            if (switchCompatT != null) {
                                                y6v0 y6v0Var = new y6v0(constraintLayout, view, textView, textView2, switchCompatT);
                                                view.setViewContext(new f47(gw70Var));
                                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                ArrayList arrayList = v9w0VarQ.c;
                                                Collections.addAll(arrayList, textView2);
                                                Collections.addAll(arrayList, textView);
                                                Collections.addAll(v9w0VarQ.d, view);
                                                v9w0VarQ.e = false;
                                                v9w0VarQ.a();
                                                return y6v0Var;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                return null;
            case 3:
                return new lly(this.b, this.c, 4, false, false, false, 48);
            default:
                return new QuickActionView(new zez0(context, gw70Var));
        }
    }
}
