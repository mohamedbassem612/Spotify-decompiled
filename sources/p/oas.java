package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oas implements n4p0 {
    public final /* synthetic */ byte a;
    public final ynb0 b;

    public /* synthetic */ oas(ynb0 ynb0Var, byte b) {
        this.a = b;
        this.b = ynb0Var;
    }

    public final Function0 a() {
        switch (this.a) {
            case 0:
                return new dor(this, (byte) 17);
            case 1:
                return new f710(this, (byte) 6);
            case 2:
                return new f710(this, (byte) 18);
            case 3:
                return new kks0(this, (byte) 28);
            case 4:
                return new vwz0(this, (byte) 17);
            default:
                return new dch1(this, (byte) 20);
        }
    }

    public final String name() {
        switch (this.a) {
            case 0:
                return "default_mode";
            case 1:
                return "feedback_mode";
            case 2:
                return "free_tier_mode";
            case 3:
                return "podcast_mode";
            case 4:
                return "reinvent_free_mode";
            default:
                return "video_first_mode";
        }
    }
}
