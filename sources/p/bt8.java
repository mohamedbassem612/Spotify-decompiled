package p;

import android.content.Intent;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bt8 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ bt8(Intent intent, byte b) {
        this.a = b;
        this.b = intent;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        crn0 crn0Var = crn0.a;
        Intent intent = this.b;
        switch (b) {
            case 0:
                return ((Boolean) obj).booleanValue() ? new hrn0(i59.class, new k59(intent.getBooleanExtra("puffin_setup_flow_should_resume_music_when_exiting_flow", false)), new c6w0(1, false, (hd5) null, 14)) : crn0Var;
            default:
                n57.g("Error obtaining DSA state for " + intent.getDataString(), (Throwable) obj);
                return crn0Var;
        }
    }
}
