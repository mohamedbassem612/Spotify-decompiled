package p;

import com.google.protobuf.BytesValue;
import com.google.protobuf.Empty;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a4e extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(CastMessages.DeviceId deviceId, onm onmVar) {
        r3e r3eVar;
        if (onmVar instanceof r3e) {
            r3eVar = (r3e) onmVar;
            int i = r3eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r3eVar.c = i - Integer.MIN_VALUE;
            } else {
                r3eVar = new r3e(this, onmVar);
            }
        } else {
            r3eVar = new r3e(this, onmVar);
        }
        Object objCallSingle = r3eVar.a;
        int i2 = r3eVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            r3eVar.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "Connect", deviceId, r3eVar);
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
            return CastMessages.Response.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(CastMessages.ConnectionErrorRequest connectionErrorRequest, onm onmVar) {
        s3e s3eVar;
        if (onmVar instanceof s3e) {
            s3eVar = (s3e) onmVar;
            int i = s3eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3eVar.c = i - Integer.MIN_VALUE;
            } else {
                s3eVar = new s3e(this, onmVar);
            }
        } else {
            s3eVar = new s3e(this, onmVar);
        }
        Object objCallSingle = s3eVar.a;
        int i2 = s3eVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            s3eVar.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "ConnectionError", connectionErrorRequest, s3eVar);
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
    public final Object c(CastMessages.DeviceId deviceId, onm onmVar) {
        t3e t3eVar;
        if (onmVar instanceof t3e) {
            t3eVar = (t3e) onmVar;
            int i = t3eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3eVar.c = i - Integer.MIN_VALUE;
            } else {
                t3eVar = new t3e(this, onmVar);
            }
        } else {
            t3eVar = new t3e(this, onmVar);
        }
        Object objCallSingle = t3eVar.a;
        int i2 = t3eVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            t3eVar.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "DeleteDevice", deviceId, t3eVar);
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
            return CastMessages.Response.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(CastMessages.PutDeviceRequest putDeviceRequest, onm onmVar) {
        v3e v3eVar;
        if (onmVar instanceof v3e) {
            v3eVar = (v3e) onmVar;
            int i = v3eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3eVar.c = i - Integer.MIN_VALUE;
            } else {
                v3eVar = new v3e(this, onmVar);
            }
        } else {
            v3eVar = new v3e(this, onmVar);
        }
        Object objCallSingle = v3eVar.a;
        int i2 = v3eVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            v3eVar.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "PutDevice", putDeviceRequest, v3eVar);
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
            return CastMessages.Response.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(BytesValue bytesValue, onm onmVar) {
        w3e w3eVar;
        if (onmVar instanceof w3e) {
            w3eVar = (w3e) onmVar;
            int i = w3eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w3eVar.c = i - Integer.MIN_VALUE;
            } else {
                w3eVar = new w3e(this, onmVar);
            }
        } else {
            w3eVar = new w3e(this, onmVar);
        }
        Object objCallSingle = w3eVar.a;
        int i2 = w3eVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            w3eVar.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "PutMessage", bytesValue, w3eVar);
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
            return CastMessages.Response.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
