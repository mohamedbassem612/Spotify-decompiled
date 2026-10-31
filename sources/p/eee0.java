package p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import com.spotify.local_files_esperanto.proto.EsLocalFiles;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eee0 extends CoroutineClientBase implements xde0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Empty empty, onm onmVar) {
        yde0 yde0Var;
        if (onmVar instanceof yde0) {
            yde0Var = (yde0) onmVar;
            int i = yde0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yde0Var.c = i - Integer.MIN_VALUE;
            } else {
                yde0Var = new yde0(this, onmVar);
            }
        } else {
            yde0Var = new yde0(this, onmVar);
        }
        Object objCallSingle = yde0Var.a;
        int i2 = yde0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            yde0Var.c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "GetSources", empty, yde0Var);
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
            return EsLocalFiles.GetSourcesResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.GetSourcesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(EsLocalFiles.DefaultSource defaultSource, onm onmVar) {
        zde0 zde0Var;
        if (onmVar instanceof zde0) {
            zde0Var = (zde0) onmVar;
            int i = zde0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zde0Var.c = i - Integer.MIN_VALUE;
            } else {
                zde0Var = new zde0(this, onmVar);
            }
        } else {
            zde0Var = new zde0(this, onmVar);
        }
        Object objCallSingle = zde0Var.a;
        int i2 = zde0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            zde0Var.c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "MutateDefaultSource", defaultSource, zde0Var);
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
            return EsLocalFiles.MutateSourceResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.MutateSourceResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Empty empty, onm onmVar) {
        aee0 aee0Var;
        if (onmVar instanceof aee0) {
            aee0Var = (aee0) onmVar;
            int i = aee0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aee0Var.c = i - Integer.MIN_VALUE;
            } else {
                aee0Var = new aee0(this, onmVar);
            }
        } else {
            aee0Var = new aee0(this, onmVar);
        }
        Object objCallSingle = aee0Var.a;
        int i2 = aee0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            aee0Var.c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "NotifyDefaultSources", empty, aee0Var);
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
    public final Object d(EsLocalFiles.Folder folder, onm onmVar) {
        bee0 bee0Var;
        if (onmVar instanceof bee0) {
            bee0Var = (bee0) onmVar;
            int i = bee0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bee0Var.c = i - Integer.MIN_VALUE;
            } else {
                bee0Var = new bee0(this, onmVar);
            }
        } else {
            bee0Var = new bee0(this, onmVar);
        }
        Object objCallSingle = bee0Var.a;
        int i2 = bee0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            bee0Var.c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "RemoveFolder", folder, bee0Var);
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
            return EsLocalFiles.MutateSourceResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.MutateSourceResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
