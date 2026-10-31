package p;

import com.spotify.concertcampaignview.v1.CtaType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum q0p1 implements swn1 {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_INPUT(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIAPIPE_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(101),
    /* JADX INFO: Fake field, exist only in values array */
    NO_NETWORK_CONNECTION(102),
    /* JADX INFO: Fake field, exist only in values array */
    METERED_NETWORK(103),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILED(104),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(105),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(106),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(107),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(108),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(109),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(110),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(111),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(112),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(113),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(114),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(115),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(116),
    OPTIONAL_MODULE_NOT_AVAILABLE(201),
    OPTIONAL_MODULE_INIT_ERROR(202),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(203),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(204),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(205),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(206),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(207),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(301),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(302),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(303),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(304),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(305),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(401),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(402),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(403),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(404),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(405),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(406),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(407),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(501),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(CtaType.BUY_TICKETS_FIELD_NUMBER),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(601),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(602),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(603),
    UNKNOWN_ERROR(9999);

    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    q0p1(int i) {
        this.a = i;
    }

    @Override // p.swn1
    public final int zza() {
        return this.a;
    }
}
