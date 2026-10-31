package com.spotify.voiceassistants.playermodels;

import java.util.List;
import kotlin.Metadata;
import p.bga0;
import p.dar;
import p.ega0;
import p.h661;
import p.hon1;
import p.nfa0;
import p.nma0;
import p.p36;
import p.r36;
import p.rga0;
import p.uax;
import p.wr80;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/RetryDelayMsSerializer;", "Lp/nma0;", "", "", "<init>", "()V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Ljava/util/List;", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Ljava/util/List;)V", "delegate", "Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RetryDelayMsSerializer implements nma0 {
    public static final RetryDelayMsSerializer INSTANCE = new RetryDelayMsSerializer();
    private static final nma0 delegate;
    private static final h661 descriptor;

    static {
        r36 r36Var = new r36(wr80.a, (byte) 0);
        delegate = r36Var;
        descriptor = (p36) r36Var.c;
    }

    private RetryDelayMsSerializer() {
    }

    public List<Integer> deserialize(dar decoder) {
        if (!(decoder instanceof bga0)) {
            return (List) delegate.deserialize(decoder);
        }
        bga0 bga0Var = (bga0) decoder;
        ega0 ega0VarM = bga0Var.m();
        if (ega0VarM instanceof rga0) {
            return z6x.a;
        }
        nfa0 nfa0VarD = bga0Var.d();
        nma0 nma0Var = delegate;
        nfa0VarD.getClass();
        return (List) hon1.z(nfa0VarD, ega0VarM, nma0Var);
    }

    public h661 getDescriptor() {
        return descriptor;
    }

    public void serialize(uax encoder, List<Integer> value) {
        delegate.serialize(encoder, value);
    }
}
