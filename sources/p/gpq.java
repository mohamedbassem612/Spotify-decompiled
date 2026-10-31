package p;

import android.widget.FrameLayout;
import com.spotify.transcript.list.TranscriptListView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gpq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ gpq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final hce1 a(FrameLayout frameLayout, TranscriptListView transcriptListView) {
        byte b = this.a;
        tsq tsqVar = this.b;
        switch (b) {
            case 0:
                c8b1 c8b1Var = new c8b1();
                dgz0 dgz0VarU = ((cbg1) ((wdm) ((ykq) tsqVar).c).b).u();
                c8o.l(dgz0VarU);
                return new hce1(frameLayout, transcriptListView, c8b1Var, dgz0VarU, (byte) 9);
            default:
                c8b1 c8b1Var2 = new c8b1();
                dgz0 dgz0VarU2 = ((cbg1) ((f0a) tsqVar.c).b).u();
                c8o.l(dgz0VarU2);
                return new hce1(frameLayout, transcriptListView, c8b1Var2, dgz0VarU2, (byte) 9);
        }
    }
}
