package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.EventRequest;
import com.spotify.ads.esperanto.proto.EventResponse;
import com.spotify.ads.esperanto.proto.UnmanagedEventRequest;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class re00 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(EventRequest eventRequest, onm onmVar) {
        oe00 oe00Var;
        if (onmVar instanceof oe00) {
            oe00Var = (oe00) onmVar;
            int i = oe00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oe00Var.c = i - Integer.MIN_VALUE;
            } else {
                oe00Var = new oe00(this, onmVar);
            }
        } else {
            oe00Var = new oe00(this, onmVar);
        }
        Object objCallSingle = oe00Var.a;
        int i2 = oe00Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            oe00Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Events", "postEvent", eventRequest, oe00Var);
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
            return EventResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.EventResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(UnmanagedEventRequest unmanagedEventRequest, onm onmVar) {
        pe00 pe00Var;
        if (onmVar instanceof pe00) {
            pe00Var = (pe00) onmVar;
            int i = pe00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pe00Var.c = i - Integer.MIN_VALUE;
            } else {
                pe00Var = new pe00(this, onmVar);
            }
        } else {
            pe00Var = new pe00(this, onmVar);
        }
        Object objCallSingle = pe00Var.a;
        int i2 = pe00Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            pe00Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Events", "postUnmanagedEvent", unmanagedEventRequest, pe00Var);
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
