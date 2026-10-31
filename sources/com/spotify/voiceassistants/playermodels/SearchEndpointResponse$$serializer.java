package com.spotify.voiceassistants.playermodels;

import java.util.List;
import kotlin.Metadata;
import p.adt;
import p.chc1;
import p.dar;
import p.h661;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.p661;
import p.pf40;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@adt
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/voiceassistants/playermodels/SearchEndpointResponse.$serializer", "Lp/pf40;", "Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class SearchEndpointResponse$$serializer implements pf40 {
    public static final SearchEndpointResponse$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        SearchEndpointResponse$$serializer searchEndpointResponse$$serializer = new SearchEndpointResponse$$serializer();
        INSTANCE = searchEndpointResponse$$serializer;
        m0v0 m0v0Var = new m0v0("com.spotify.voiceassistants.playermodels.SearchEndpointResponse", searchEndpointResponse$$serializer, 8);
        m0v0Var.j("req_id", false);
        m0v0Var.j("intent", false);
        m0v0Var.j("error", true);
        m0v0Var.j("result", false);
        m0v0Var.j("feedback_details", true);
        m0v0Var.j("action", true);
        m0v0Var.j("feedback_id", false);
        m0v0Var.j("alternative_results", true);
        descriptor = m0v0Var;
    }

    private SearchEndpointResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = SearchEndpointResponse.$childSerializers;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, m5n1.z(chc1Var), chc1Var, m5n1.z((nma0) znb0VarArr[4].getValue()), m5n1.z(chc1Var), chc1Var, znb0VarArr[7].getValue()};
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SearchEndpointResponse m29deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        znb0[] znb0VarArr = SearchEndpointResponse.$childSerializers;
        x1kVarB.getClass();
        SearchEndpointResponse searchEndpointResponse = null;
        boolean z = true;
        List list = null;
        String strF = null;
        String strF2 = null;
        String str = null;
        String strF3 = null;
        MetadataItem metadataItem = null;
        String str2 = null;
        String strF4 = null;
        int i = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    strF3 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    metadataItem = (MetadataItem) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), metadataItem);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) x1kVarB.B(h661Var, 5, chc1.a, str2);
                    i |= 32;
                    break;
                case 6:
                    strF4 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) x1kVarB.A(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    n9v.a(iP);
                    return searchEndpointResponse;
            }
            searchEndpointResponse = null;
        }
        x1kVarB.a(h661Var);
        return new SearchEndpointResponse(i, strF, strF2, str, strF3, metadataItem, str2, strF4, list, (p661) null);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax encoder, SearchEndpointResponse value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        SearchEndpointResponse.write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
