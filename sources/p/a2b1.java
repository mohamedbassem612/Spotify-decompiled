package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.tap.playback.TapNothingToPlayException;
import com.spotify.tap.spoton.SpotOnService;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a2b1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    public a2b1(aru0 aru0Var, d3d1 d3d1Var, String str, String str2, String str3, String str4) {
        this.a = (byte) 2;
        this.b = aru0Var;
        this.g = d3d1Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Logger.g("Action handled successfully.", new Object[0]);
                av60.b(((SpotOnService) obj3).a(), this.c, this.d, this.e, this.f, (String) obj2, "COMPLETED", (String) null, (String) obj, 64);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Error while handling action.", new Object[0]);
                boolean z = th instanceof TapNothingToPlayException;
                String str = z ? "NOTHING_TO_PLAY" : "PLAYBACK_ERROR";
                av60 av60VarA = ((SpotOnService) obj3).a();
                String str2 = (String) obj2;
                TapNothingToPlayException tapNothingToPlayException = z ? (TapNothingToPlayException) th : null;
                av60VarA.a(this.c, this.d, this.e, this.f, str2, "ERROR", str, tapNothingToPlayException != null ? tapNothingToPlayException.a : null);
                break;
            default:
                w3i1 w3i1Var = (w3i1) obj;
                ((rdo) ((aru0) obj3).c).a(new qdo(this.c, this.d, w3i1Var.b, this.e, w3i1Var.a, "podcast", ((d3d1) obj2).name(), this.f));
                break;
        }
    }

    public /* synthetic */ a2b1(SpotOnService spotOnService, String str, String str2, String str3, String str4, String str5, byte b) {
        this.a = b;
        this.b = spotOnService;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }
}
