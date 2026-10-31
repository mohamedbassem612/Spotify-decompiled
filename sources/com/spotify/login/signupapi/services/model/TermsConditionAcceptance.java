package com.spotify.login.signupapi.services.model;

import com.spotify.messages.BetamaxPlaybackSession;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.nma0;
import p.o661;
import p.r0z;
import p.t0z;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IMPLICIT", "EXPLICIT", "Companion", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
@o661(with = TermsConditionAcceptanceSerializer.class)
public enum TermsConditionAcceptance {
    IMPLICIT("implicit"),
    EXPLICIT("explicit");

    private final String value;
    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance$Companion;", "", "<init>", "()V", "", "code", "Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "fromString", "(Ljava/lang/String;)Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "Lp/nma0;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TermsConditionAcceptance fromString(String code) {
            TermsConditionAcceptance[] termsConditionAcceptanceArrValues = TermsConditionAcceptance.values();
            int iS = zno1.s(termsConditionAcceptanceArrValues.length);
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (TermsConditionAcceptance termsConditionAcceptance : termsConditionAcceptanceArrValues) {
                linkedHashMap.put(termsConditionAcceptance.getValue(), termsConditionAcceptance);
            }
            TermsConditionAcceptance termsConditionAcceptance2 = (TermsConditionAcceptance) linkedHashMap.get(code);
            return termsConditionAcceptance2 == null ? TermsConditionAcceptance.EXPLICIT : termsConditionAcceptance2;
        }

        public final nma0 serializer() {
            return TermsConditionAcceptanceSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    TermsConditionAcceptance(String str) {
        this.value = str;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
