package p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sj6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj6(float f, int i) {
        super(1);
        this.a = (byte) 0;
        this.c = f;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.w(uj6.d(f, i));
                kd31Var.f(true);
                break;
            case 1:
                AudioDriver.startDuckingAudioSession(((Number) obj).intValue(), i, f);
                break;
            default:
                rtb0 rtb0Var = (rtb0) obj;
                if (i < 1) {
                    i = 1;
                }
                rtb0.b(rtb0Var, i, (iu30) null, new j2i(-891227864, new ceh0(f), true), 6);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj6(byte b, float f, int i) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = f;
    }
}
