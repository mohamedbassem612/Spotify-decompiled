package p;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yy11 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy11(byte b) {
        super(2, (lnm) null);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                yy11 yy11Var = new yy11(2, lnmVar, (byte) 0);
                yy11Var.b = ((Boolean) obj).booleanValue();
                return yy11Var;
            case 1:
                yy11 yy11Var2 = new yy11(2, lnmVar, (byte) 1);
                yy11Var2.b = ((Boolean) obj).booleanValue();
                return yy11Var2;
            case 2:
                return new yy11(2, lnmVar, (byte) 2);
            case 3:
                yy11 yy11Var3 = new yy11(2, lnmVar, (byte) 3);
                yy11Var3.b = ((Boolean) obj).booleanValue();
                return yy11Var3;
            case 4:
                yy11 yy11Var4 = new yy11(2, lnmVar, (byte) 4);
                yy11Var4.b = ((Boolean) obj).booleanValue();
                return yy11Var4;
            case 5:
                yy11 yy11Var5 = new yy11(2, lnmVar, (byte) 5);
                yy11Var5.b = ((Boolean) obj).booleanValue();
                return yy11Var5;
            case 6:
                yy11 yy11Var6 = new yy11(2, lnmVar, (byte) 6);
                yy11Var6.b = ((Boolean) obj).booleanValue();
                return yy11Var6;
            case 7:
                return new yy11(2, lnmVar, (byte) 7);
            default:
                yy11 yy11Var7 = new yy11(2, lnmVar, (byte) 8);
                yy11Var7.b = ((Boolean) obj).booleanValue();
                return yy11Var7;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yy11) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((yy11) create(bool2, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((yy11) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((yy11) create(bool3, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((yy11) create(bool4, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((yy11) create(bool5, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((yy11) create(bool6, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((yy11) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((yy11) create(bool7, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        m231 m231Var;
        byte b = this.a;
        m231 m231Var2 = d9n.a;
        m231 m231Var3 = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z);
            case 1:
                boolean z2 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z2);
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    if (c921.w(this) == m231Var2) {
                        return m231Var2;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return m231Var3;
            case 3:
                boolean z4 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z4);
            case 4:
                boolean z5 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z5);
            case 5:
                boolean z6 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(!z6);
            case 6:
                boolean z7 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z7);
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    try {
                        try {
                            hkh0.f("video/av01", false, false);
                        } catch (MediaCodecUtil.DecoderQueryException e) {
                            oon1.w("Codec warming failed", e);
                        }
                        try {
                            hkh0.f("video/avc", false, false);
                        } catch (MediaCodecUtil.DecoderQueryException e2) {
                            oon1.w("Codec warming failed", e2);
                        }
                        try {
                            hkh0.f("video/hevc", false, false);
                        } catch (MediaCodecUtil.DecoderQueryException e3) {
                            oon1.w("Codec warming failed", e3);
                        }
                        m231Var = m231Var3;
                    } catch (CancellationException e4) {
                        throw e4;
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    Throwable thA = e331.a(m231Var);
                    if (thA != null) {
                        Logger.l(thA, "Codec decoder info cache warmup failed", new Object[0]);
                    }
                    if (m231Var3 == m231Var2) {
                        return m231Var2;
                    }
                    break;
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return m231Var3;
            default:
                boolean z9 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(!z9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy11(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
