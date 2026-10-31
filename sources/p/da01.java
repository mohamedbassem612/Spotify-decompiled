package p;

import android.view.View;
import com.spotify.transcript.reportdialog.events.proto.ReadAlongErrorReportingEvent;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class da01 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ea01 b;

    public /* synthetic */ da01(ea01 ea01Var, byte b) {
        this.a = b;
        this.b = ea01Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ea01 ea01Var = this.b;
        switch (b) {
            case 0:
                s901 s901Var = (s901) obj;
                qy30 qy30Var = ea01Var.b;
                String str = s901Var.a;
                String str2 = s901Var.b;
                String str3 = s901Var.c;
                t2j0 t2j0Var = qy30Var.a;
                x701 x701VarN = ReadAlongErrorReportingEvent.n();
                x701VarN.r(str);
                x701VarN.q(str2);
                x701VarN.n(str3);
                t2j0Var.a(x701VarN.build());
                break;
            default:
                kt91 kt91Var = ea01Var.d;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961272});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131961272, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
