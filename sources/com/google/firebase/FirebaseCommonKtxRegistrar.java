package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import p.bj20;
import p.dj20;
import p.een;
import p.fw9;
import p.g8b;
import p.hzh;
import p.lzy0;
import p.p7h;
import p.q8n;
import p.sdh1;
import p.tbc0;
import p.vzh;
import p.wct;
import p.zi20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lp/vzh;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vzh> getComponents() {
        hzh hzhVarB = vzh.b(new lzy0(fw9.class, q8n.class));
        hzhVarB.a(new wct(new lzy0(fw9.class, Executor.class), 1, 0));
        hzhVarB.f = een.h1;
        vzh vzhVarB = hzhVarB.b();
        hzh hzhVarB2 = vzh.b(new lzy0(tbc0.class, q8n.class));
        hzhVarB2.a(new wct(new lzy0(tbc0.class, Executor.class), 1, 0));
        hzhVarB2.f = zi20.b;
        vzh vzhVarB2 = hzhVarB2.b();
        hzh hzhVarB3 = vzh.b(new lzy0(g8b.class, q8n.class));
        hzhVarB3.a(new wct(new lzy0(g8b.class, Executor.class), 1, 0));
        hzhVarB3.f = bj20.b;
        vzh vzhVarB3 = hzhVarB3.b();
        hzh hzhVarB4 = vzh.b(new lzy0(sdh1.class, q8n.class));
        hzhVarB4.a(new wct(new lzy0(sdh1.class, Executor.class), 1, 0));
        hzhVarB4.f = dj20.b;
        return p7h.M(new vzh[]{vzhVarB, vzhVarB2, vzhVarB3, hzhVarB4.b()});
    }
}
