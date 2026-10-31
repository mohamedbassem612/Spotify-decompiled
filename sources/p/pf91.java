package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.ClearSlotRequest;
import com.spotify.ads.esperanto.proto.CreateSlotRequest;
import com.spotify.ads.esperanto.proto.CreateSlotResponse;
import com.spotify.ads.esperanto.proto.PrepareSlotRequest;
import com.spotify.ads.esperanto.proto.PrepareSlotResponse;
import com.spotify.ads.esperanto.proto.TriggerSlotRequest;
import com.spotify.ads.esperanto.proto.TriggerSlotResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pf91 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ClearSlotRequest clearSlotRequest, onm onmVar) {
        jf91 jf91Var;
        if (onmVar instanceof jf91) {
            jf91Var = (jf91) onmVar;
            int i = jf91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf91Var.c = i - Integer.MIN_VALUE;
            } else {
                jf91Var = new jf91(this, onmVar);
            }
        } else {
            jf91Var = new jf91(this, onmVar);
        }
        Object objCallSingle = jf91Var.a;
        int i2 = jf91Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            jf91Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "ClearAllAds", clearSlotRequest, jf91Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ClearSlotRequest clearSlotRequest, onm onmVar) {
        kf91 kf91Var;
        if (onmVar instanceof kf91) {
            kf91Var = (kf91) onmVar;
            int i = kf91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kf91Var.c = i - Integer.MIN_VALUE;
            } else {
                kf91Var = new kf91(this, onmVar);
            }
        } else {
            kf91Var = new kf91(this, onmVar);
        }
        Object objCallSingle = kf91Var.a;
        int i2 = kf91Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            kf91Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "ClearAvailableAds", clearSlotRequest, kf91Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(CreateSlotRequest createSlotRequest, onm onmVar) {
        lf91 lf91Var;
        if (onmVar instanceof lf91) {
            lf91Var = (lf91) onmVar;
            int i = lf91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lf91Var.c = i - Integer.MIN_VALUE;
            } else {
                lf91Var = new lf91(this, onmVar);
            }
        } else {
            lf91Var = new lf91(this, onmVar);
        }
        Object objCallSingle = lf91Var.a;
        int i2 = lf91Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            lf91Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "CreateSlot", createSlotRequest, lf91Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CreateSlotResponse.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.CreateSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(PrepareSlotRequest prepareSlotRequest, onm onmVar) {
        mf91 mf91Var;
        if (onmVar instanceof mf91) {
            mf91Var = (mf91) onmVar;
            int i = mf91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mf91Var.c = i - Integer.MIN_VALUE;
            } else {
                mf91Var = new mf91(this, onmVar);
            }
        } else {
            mf91Var = new mf91(this, onmVar);
        }
        Object objCallSingle = mf91Var.a;
        int i2 = mf91Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            mf91Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "FetchSlot", prepareSlotRequest, mf91Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PrepareSlotResponse.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.PrepareSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(TriggerSlotRequest triggerSlotRequest, onm onmVar) {
        of91 of91Var;
        if (onmVar instanceof of91) {
            of91Var = (of91) onmVar;
            int i = of91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                of91Var.c = i - Integer.MIN_VALUE;
            } else {
                of91Var = new of91(this, onmVar);
            }
        } else {
            of91Var = new of91(this, onmVar);
        }
        Object objCallSingle = of91Var.a;
        int i2 = of91Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            of91Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "TriggerSlot", triggerSlotRequest, of91Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return TriggerSlotResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.TriggerSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
