package p;

import com.spotify.esperanto.esperanto.CoroutineClientBase;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oqp0 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(EsOffline$DownloadRequest esOffline$DownloadRequest, onm onmVar) {
        iqp0 iqp0Var;
        if (onmVar instanceof iqp0) {
            iqp0Var = (iqp0) onmVar;
            int i = iqp0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqp0Var.c = i - Integer.MIN_VALUE;
            } else {
                iqp0Var = new iqp0(this, onmVar);
            }
        } else {
            iqp0Var = new iqp0(this, onmVar);
        }
        Object objCallSingle = iqp0Var.a;
        int i2 = iqp0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            iqp0Var.c = 1;
            objCallSingle = callSingle("spotify.offline_esperanto.proto.Offline", "AddDownload", esOffline$DownloadRequest, iqp0Var);
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
            return EsOffline.DownloadResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.DownloadResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(EsOffline.GetContextsProgressRequest getContextsProgressRequest, onm onmVar) {
        jqp0 jqp0Var;
        if (onmVar instanceof jqp0) {
            jqp0Var = (jqp0) onmVar;
            int i = jqp0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqp0Var.c = i - Integer.MIN_VALUE;
            } else {
                jqp0Var = new jqp0(this, onmVar);
            }
        } else {
            jqp0Var = new jqp0(this, onmVar);
        }
        Object objCallSingle = jqp0Var.a;
        int i2 = jqp0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            jqp0Var.c = 1;
            objCallSingle = callSingle("spotify.offline_esperanto.proto.Offline", "GetContextsProgress", getContextsProgressRequest, jqp0Var);
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
            return EsOffline.ContextsProgressResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.ContextsProgressResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(EsOffline$DownloadRequest esOffline$DownloadRequest, onm onmVar) {
        kqp0 kqp0Var;
        if (onmVar instanceof kqp0) {
            kqp0Var = (kqp0) onmVar;
            int i = kqp0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqp0Var.c = i - Integer.MIN_VALUE;
            } else {
                kqp0Var = new kqp0(this, onmVar);
            }
        } else {
            kqp0Var = new kqp0(this, onmVar);
        }
        Object objCallSingle = kqp0Var.a;
        int i2 = kqp0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            kqp0Var.c = 1;
            objCallSingle = callSingle("spotify.offline_esperanto.proto.Offline", "RemoveDownload", esOffline$DownloadRequest, kqp0Var);
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
            return EsOffline.DownloadResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.DownloadResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
