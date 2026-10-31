package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.CapabilityRequest;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fld extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(CapabilityRequest capabilityRequest, onm onmVar) {
        dld dldVar;
        if (onmVar instanceof dld) {
            dldVar = (dld) onmVar;
            int i = dldVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dldVar.c = i - Integer.MIN_VALUE;
            } else {
                dldVar = new dld(this, onmVar);
            }
        } else {
            dldVar = new dld(this, onmVar);
        }
        Object objCallSingle = dldVar.a;
        int i2 = dldVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            dldVar.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Capabilities", "addCapability", capabilityRequest, dldVar);
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
    public final Object b(CapabilityRequest capabilityRequest, onm onmVar) {
        eld eldVar;
        if (onmVar instanceof eld) {
            eldVar = (eld) onmVar;
            int i = eldVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eldVar.c = i - Integer.MIN_VALUE;
            } else {
                eldVar = new eld(this, onmVar);
            }
        } else {
            eldVar = new eld(this, onmVar);
        }
        Object objCallSingle = eldVar.a;
        int i2 = eldVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            eldVar.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Capabilities", "removeCapability", capabilityRequest, eldVar);
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
