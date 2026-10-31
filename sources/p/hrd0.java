package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hrd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hrd0(mrd0 mrd0Var, byte b) {
        super(0);
        this.a = b;
        this.b = mrd0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        frd0 frd0Var = frd0.a;
        drd0 drd0Var = drd0.a;
        rih1 rih1Var = rih1.a;
        mrd0 mrd0Var = this.b;
        switch (b) {
            case 0:
                mrd0Var.R0.onNext(zqd0.a);
                return rih1Var;
            case 1:
                g5p0.b((g5p0) mrd0Var.a1.getValue(), (ou80) null, 3);
                return rih1Var;
            case 2:
                mrd0Var.R0.onNext(crd0.a);
                return rih1Var;
            case 3:
                g5p0.b((g5p0) mrd0Var.a1.getValue(), (ou80) null, 3);
                return rih1Var;
            case 4:
                mrd0Var.R0.onNext(frd0Var);
                return rih1Var;
            case 5:
                mrd0Var.R0.onNext(frd0Var);
                return rih1Var;
            case 6:
                mrd0Var.R0.onNext(erd0.a);
                return rih1Var;
            case 7:
                mrd0Var.R0.onNext(brd0.a);
                return rih1Var;
            case 8:
                int i = LiveSharingRecordingDialogsHostActivity.h1;
                dg30 dg30Var = mrd0Var.a;
                Intent intent = new Intent((Context) dg30Var, (Class<?>) LiveSharingRecordingDialogsHostActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("recording_session_dialog_type", trd0.a);
                dg30Var.startActivity(intent);
                return rih1Var;
            case 9:
                return (d350) mrd0Var.e.get();
            case 10:
                return (h350) mrd0Var.i.get();
            case 11:
                return (q350) mrd0Var.t.get();
            case 12:
                return (g5p0) mrd0Var.c.get();
            case 13:
                return (oe41) ((g0i) mrd0Var.a).d.c;
            case 14:
                mrd0Var.R0.onNext(drd0Var);
                return rih1Var;
            case 15:
                mrd0Var.R0.onNext(drd0Var);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://workspace.google.com/marketplace/app/spotify/135083966748"));
                mrd0Var.a.startActivity(intent2);
                return rih1Var;
            case 16:
                mrd0Var.R0.onNext(drd0Var);
                mrd0Var.U0.onNext(Boolean.FALSE);
                return rih1Var;
            case 17:
                mrd0Var.R0.onNext(drd0Var);
                mrd0Var.P0 = true;
                return rih1Var;
            case 18:
                mrd0Var.R0.onNext(drd0Var);
                return rih1Var;
            case 19:
                mrd0Var.R0.onNext(drd0Var);
                mrd0Var.P0 = true;
                mrd0Var.U0.onNext(Boolean.FALSE);
                return rih1Var;
            case 20:
                mrd0Var.R0.onNext(drd0Var);
                return rih1Var;
            default:
                mrd0Var.R0.onNext(drd0Var);
                ((lzn0) mrd0Var.X0.getValue()).h(nik1.b2.a);
                return rih1Var;
        }
    }
}
