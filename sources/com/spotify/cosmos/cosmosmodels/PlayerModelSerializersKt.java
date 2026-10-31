package com.spotify.cosmos.cosmosmodels;

import kotlin.Metadata;
import p.aha0;
import p.chc1;
import p.f4i1;
import p.fga0;
import p.mf80;
import p.nhc1;
import p.nlc0;
import p.nma0;
import p.uh61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp/aha0;", "", "name", "coerceString", "(Lp/aha0;Ljava/lang/String;)Ljava/lang/String;", "Lp/nma0;", "", "stringMetadataSerializer", "Lp/nma0;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class PlayerModelSerializersKt {
    private static final nma0 stringMetadataSerializer;

    static {
        chc1 chc1Var = chc1.a;
        stringMetadataSerializer = new nlc0(chc1Var, chc1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String coerceString(aha0 aha0Var, String str) {
        if (!aha0Var.c()) {
            mf80 mf80Var = fga0.a;
            if (nhc1.a0(aha0Var.b()) == null) {
                uh61.j(f4i1.f("Expected '", str, "' to be a string"));
                return null;
            }
        }
        return aha0Var.b();
    }
}
