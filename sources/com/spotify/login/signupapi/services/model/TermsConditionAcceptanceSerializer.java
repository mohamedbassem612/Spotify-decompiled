package com.spotify.login.signupapi.services.model;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.dar;
import p.h661;
import p.knw0;
import p.nma0;
import p.omo1;
import p.uax;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptanceSerializer;", "Lp/nma0;", "Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class TermsConditionAcceptanceSerializer implements nma0 {
    public static final TermsConditionAcceptanceSerializer INSTANCE = new TermsConditionAcceptanceSerializer();
    private static final h661 descriptor = omo1.c("TermsConditionAcceptance", knw0.o);

    private TermsConditionAcceptanceSerializer() {
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public TermsConditionAcceptance m5deserialize(dar decoder) {
        return TermsConditionAcceptance.INSTANCE.fromString(decoder.V());
    }

    public h661 getDescriptor() {
        return descriptor;
    }

    public void serialize(uax encoder, TermsConditionAcceptance value) {
        encoder.h0(value.getValue());
    }
}
