package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum wfs0 implements v190 {
    NO_ERROR(0),
    NO_OWNER_PROVIDER(1),
    SERIALIZATION_ERROR(2),
    DECRYPTION_ERROR(3),
    EVENT_SENDER_ERROR(4),
    FAILED_OPENING_DB(5),
    FAILED_GETTING_EVENT_FROM_DB(6),
    FAILED_ADDING_EVENT_TO_DB(7),
    FAILED_OVERWRITING_EVENT_IN_DB(8),
    FAILED_REMOVING_EVENT_FROM_DB(9),
    FAILED_WRITING_TO_DB(10),
    FAILED_ALLOCATING_SEQUENCE_NUMBER(11),
    BAD_INPUT_PENDING_EVENTS_TOKEN(12),
    EVENT_SENDER_REJECTED_MISSING_NAME(13),
    EVENT_SENDER_REJECTED_MISSING_OWNER(14),
    EVENT_SENDER_REJECTED_EVENT_DATA_TOO_LARGE(15),
    EVENT_SENDER_REJECTED_RATE_LIMITED(16),
    UNRECOGNIZED(-1);

    public final int a;

    wfs0(int i) {
        this.a = i;
    }

    public static wfs0 a(int i) {
        switch (i) {
            case 0:
                return NO_ERROR;
            case 1:
                return NO_OWNER_PROVIDER;
            case 2:
                return SERIALIZATION_ERROR;
            case 3:
                return DECRYPTION_ERROR;
            case 4:
                return EVENT_SENDER_ERROR;
            case 5:
                return FAILED_OPENING_DB;
            case 6:
                return FAILED_GETTING_EVENT_FROM_DB;
            case 7:
                return FAILED_ADDING_EVENT_TO_DB;
            case 8:
                return FAILED_OVERWRITING_EVENT_IN_DB;
            case 9:
                return FAILED_REMOVING_EVENT_FROM_DB;
            case 10:
                return FAILED_WRITING_TO_DB;
            case 11:
                return FAILED_ALLOCATING_SEQUENCE_NUMBER;
            case 12:
                return BAD_INPUT_PENDING_EVENTS_TOKEN;
            case 13:
                return EVENT_SENDER_REJECTED_MISSING_NAME;
            case 14:
                return EVENT_SENDER_REJECTED_MISSING_OWNER;
            case 15:
                return EVENT_SENDER_REJECTED_EVENT_DATA_TOO_LARGE;
            case 16:
                return EVENT_SENDER_REJECTED_RATE_LIMITED;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
