package p;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class no61 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BoolValue boolValue, lnm lnmVar) {
        pn61 pn61Var;
        if (lnmVar instanceof pn61) {
            pn61Var = (pn61) lnmVar;
            int i = pn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn61Var.c = i - Integer.MIN_VALUE;
            } else {
                pn61Var = new pn61(this, lnmVar);
            }
        } else {
            pn61Var = new pn61(this, lnmVar);
        }
        Object objCallSingle = pn61Var.a;
        int i2 = pn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            pn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetAllowAudioQualityDowngrade", boolValue, pn61Var);
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
    public final Object b(BoolValue boolValue, lnm lnmVar) {
        qn61 qn61Var;
        if (lnmVar instanceof qn61) {
            qn61Var = (qn61) lnmVar;
            int i = qn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn61Var.c = i - Integer.MIN_VALUE;
            } else {
                qn61Var = new qn61(this, lnmVar);
            }
        } else {
            qn61Var = new qn61(this, lnmVar);
        }
        Object objCallSingle = qn61Var.a;
        int i2 = qn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            qn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetAutomix", boolValue, qn61Var);
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
    public final Object c(BoolValue boolValue, lnm lnmVar) {
        rn61 rn61Var;
        if (lnmVar instanceof rn61) {
            rn61Var = (rn61) lnmVar;
            int i = rn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn61Var.c = i - Integer.MIN_VALUE;
            } else {
                rn61Var = new rn61(this, lnmVar);
            }
        } else {
            rn61Var = new rn61(this, lnmVar);
        }
        Object objCallSingle = rn61Var.a;
        int i2 = rn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            rn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfade", boolValue, rn61Var);
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
    public final Object d(Int32Value int32Value, lnm lnmVar) {
        sn61 sn61Var;
        if (lnmVar instanceof sn61) {
            sn61Var = (sn61) lnmVar;
            int i = sn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn61Var.c = i - Integer.MIN_VALUE;
            } else {
                sn61Var = new sn61(this, lnmVar);
            }
        } else {
            sn61Var = new sn61(this, lnmVar);
        }
        Object objCallSingle = sn61Var.a;
        int i2 = sn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            sn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfadeTimeSeconds", int32Value, sn61Var);
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
    public final Object e(BoolValue boolValue, lnm lnmVar) {
        tn61 tn61Var;
        if (lnmVar instanceof tn61) {
            tn61Var = (tn61) lnmVar;
            int i = tn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn61Var.c = i - Integer.MIN_VALUE;
            } else {
                tn61Var = new tn61(this, lnmVar);
            }
        } else {
            tn61Var = new tn61(this, lnmVar);
        }
        Object objCallSingle = tn61Var.a;
        int i2 = tn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            tn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfeed", boolValue, tn61Var);
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
    public final Object f(Int32Value int32Value, lnm lnmVar) {
        un61 un61Var;
        if (lnmVar instanceof un61) {
            un61Var = (un61) lnmVar;
            int i = un61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                un61Var.c = i - Integer.MIN_VALUE;
            } else {
                un61Var = new un61(this, lnmVar);
            }
        } else {
            un61Var = new un61(this, lnmVar);
        }
        Object objCallSingle = un61Var.a;
        int i2 = un61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            un61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfeedIntensity", int32Value, un61Var);
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
    public final Object g(BoolValue boolValue, lnm lnmVar) {
        vn61 vn61Var;
        if (lnmVar instanceof vn61) {
            vn61Var = (vn61) lnmVar;
            int i = vn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vn61Var.c = i - Integer.MIN_VALUE;
            } else {
                vn61Var = new vn61(this, lnmVar);
            }
        } else {
            vn61Var = new vn61(this, lnmVar);
        }
        Object objCallSingle = vn61Var.a;
        int i2 = vn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            vn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetDownloadOver3G", boolValue, vn61Var);
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
    public final Object h(Int32Value int32Value, lnm lnmVar) {
        wn61 wn61Var;
        if (lnmVar instanceof wn61) {
            wn61Var = (wn61) lnmVar;
            int i = wn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wn61Var.c = i - Integer.MIN_VALUE;
            } else {
                wn61Var = new wn61(this, lnmVar);
            }
        } else {
            wn61Var = new wn61(this, lnmVar);
        }
        Object objCallSingle = wn61Var.a;
        int i2 = wn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            wn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetDownloadPreferredResourceType", int32Value, wn61Var);
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
    public final Object i(Int32Value int32Value, lnm lnmVar) {
        xn61 xn61Var;
        if (lnmVar instanceof xn61) {
            xn61Var = (xn61) lnmVar;
            int i = xn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xn61Var.c = i - Integer.MIN_VALUE;
            } else {
                xn61Var = new xn61(this, lnmVar);
            }
        } else {
            xn61Var = new xn61(this, lnmVar);
        }
        Object objCallSingle = xn61Var.a;
        int i2 = xn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            xn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetDownloadQuality", int32Value, xn61Var);
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
    public final Object j(BoolValue boolValue, lnm lnmVar) {
        yn61 yn61Var;
        if (lnmVar instanceof yn61) {
            yn61Var = (yn61) lnmVar;
            int i = yn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yn61Var.c = i - Integer.MIN_VALUE;
            } else {
                yn61Var = new yn61(this, lnmVar);
            }
        } else {
            yn61Var = new yn61(this, lnmVar);
        }
        Object objCallSingle = yn61Var.a;
        int i2 = yn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            yn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetDownmix", boolValue, yn61Var);
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
    public final Object k(BoolValue boolValue, lnm lnmVar) {
        zn61 zn61Var;
        if (lnmVar instanceof zn61) {
            zn61Var = (zn61) lnmVar;
            int i = zn61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zn61Var.c = i - Integer.MIN_VALUE;
            } else {
                zn61Var = new zn61(this, lnmVar);
            }
        } else {
            zn61Var = new zn61(this, lnmVar);
        }
        Object objCallSingle = zn61Var.a;
        int i2 = zn61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            zn61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetGapless", boolValue, zn61Var);
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
    public final Object l(Int32Value int32Value, lnm lnmVar) {
        ao61 ao61Var;
        if (lnmVar instanceof ao61) {
            ao61Var = (ao61) lnmVar;
            int i = ao61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ao61Var.c = i - Integer.MIN_VALUE;
            } else {
                ao61Var = new ao61(this, lnmVar);
            }
        } else {
            ao61Var = new ao61(this, lnmVar);
        }
        Object objCallSingle = ao61Var.a;
        int i2 = ao61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ao61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetLoudnessEnvironment", int32Value, ao61Var);
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
    public final Object m(BoolValue boolValue, lnm lnmVar) {
        bo61 bo61Var;
        if (lnmVar instanceof bo61) {
            bo61Var = (bo61) lnmVar;
            int i = bo61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bo61Var.c = i - Integer.MIN_VALUE;
            } else {
                bo61Var = new bo61(this, lnmVar);
            }
        } else {
            bo61Var = new bo61(this, lnmVar);
        }
        Object objCallSingle = bo61Var.a;
        int i2 = bo61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            bo61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetNormalize", boolValue, bo61Var);
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
    public final Object n(BoolValue boolValue, lnm lnmVar) {
        co61 co61Var;
        if (lnmVar instanceof co61) {
            co61Var = (co61) lnmVar;
            int i = co61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                co61Var.c = i - Integer.MIN_VALUE;
            } else {
                co61Var = new co61(this, lnmVar);
            }
        } else {
            co61Var = new co61(this, lnmVar);
        }
        Object objCallSingle = co61Var.a;
        int i2 = co61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            co61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetOfflineMode", boolValue, co61Var);
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
    public final Object o(BoolValue boolValue, lnm lnmVar) {
        do61 do61Var;
        if (lnmVar instanceof do61) {
            do61Var = (do61) lnmVar;
            int i = do61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                do61Var.c = i - Integer.MIN_VALUE;
            } else {
                do61Var = new do61(this, lnmVar);
            }
        } else {
            do61Var = new do61(this, lnmVar);
        }
        Object objCallSingle = do61Var.a;
        int i2 = do61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            do61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetOtfn", boolValue, do61Var);
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
    public final Object p(BoolValue boolValue, lnm lnmVar) {
        eo61 eo61Var;
        if (lnmVar instanceof eo61) {
            eo61Var = (eo61) lnmVar;
            int i = eo61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo61Var.c = i - Integer.MIN_VALUE;
            } else {
                eo61Var = new eo61(this, lnmVar);
            }
        } else {
            eo61Var = new eo61(this, lnmVar);
        }
        Object objCallSingle = eo61Var.a;
        int i2 = eo61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            eo61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetPlayExplicitContext", boolValue, eo61Var);
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
    public final Object q(BoolValue boolValue, lnm lnmVar) {
        fo61 fo61Var;
        if (lnmVar instanceof fo61) {
            fo61Var = (fo61) lnmVar;
            int i = fo61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo61Var.c = i - Integer.MIN_VALUE;
            } else {
                fo61Var = new fo61(this, lnmVar);
            }
        } else {
            fo61Var = new fo61(this, lnmVar);
        }
        Object objCallSingle = fo61Var.a;
        int i2 = fo61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            fo61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetPrivateSession", boolValue, fo61Var);
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
    public final Object r(BoolValue boolValue, lnm lnmVar) {
        go61 go61Var;
        if (lnmVar instanceof go61) {
            go61Var = (go61) lnmVar;
            int i = go61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                go61Var.c = i - Integer.MIN_VALUE;
            } else {
                go61Var = new go61(this, lnmVar);
            }
        } else {
            go61Var = new go61(this, lnmVar);
        }
        Object objCallSingle = go61Var.a;
        int i2 = go61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            go61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetShowUnavailableTracks", boolValue, go61Var);
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
    public final Object s(Int32Value int32Value, lnm lnmVar) {
        ho61 ho61Var;
        if (lnmVar instanceof ho61) {
            ho61Var = (ho61) lnmVar;
            int i = ho61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho61Var.c = i - Integer.MIN_VALUE;
            } else {
                ho61Var = new ho61(this, lnmVar);
            }
        } else {
            ho61Var = new ho61(this, lnmVar);
        }
        Object objCallSingle = ho61Var.a;
        int i2 = ho61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ho61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetStreamNonMeteredQuality", int32Value, ho61Var);
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
    public final Object t(Int32Value int32Value, lnm lnmVar) {
        io61 io61Var;
        if (lnmVar instanceof io61) {
            io61Var = (io61) lnmVar;
            int i = io61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                io61Var.c = i - Integer.MIN_VALUE;
            } else {
                io61Var = new io61(this, lnmVar);
            }
        } else {
            io61Var = new io61(this, lnmVar);
        }
        Object objCallSingle = io61Var.a;
        int i2 = io61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            io61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetStreamQuality", int32Value, io61Var);
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
    public final Object u(StringValue stringValue, lnm lnmVar) {
        jo61 jo61Var;
        if (lnmVar instanceof jo61) {
            jo61Var = (jo61) lnmVar;
            int i = jo61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jo61Var.c = i - Integer.MIN_VALUE;
            } else {
                jo61Var = new jo61(this, lnmVar);
            }
        } else {
            jo61Var = new jo61(this, lnmVar);
        }
        Object objCallSingle = jo61Var.a;
        int i2 = jo61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            jo61Var.c = 1;
            objCallSingle = callSingle("spotify.settings.esperanto.proto.Settings", "SetWebgateUrl", stringValue, jo61Var);
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
}
