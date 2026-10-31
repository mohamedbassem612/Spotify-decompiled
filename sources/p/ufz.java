package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum ufz implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT_NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_LOAD_FAILURE(1),
    /* JADX INFO: Fake field, exist only in values array */
    QAX_PARSE_FAILURE(2),
    /* JADX INFO: Fake field, exist only in values array */
    OS_NOTIFICATIONS_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    NOTIFICATION_CHANNEL_DISABLED(4),
    /* JADX INFO: Fake field, exist only in values array */
    METADATA_PARSE_FAILURE(5),
    /* JADX INFO: Fake field, exist only in values array */
    SALES_NOTIFICATION_FAILURE(6),
    OTHER(7),
    /* JADX INFO: Fake field, exist only in values array */
    JAM_NOTIFICATION_SUPPRESSED(8),
    /* JADX INFO: Fake field, exist only in values array */
    CHAT_NOTIFICATION_SUPPRESSED(9),
    /* JADX INFO: Fake field, exist only in values array */
    CMP_QA_NOTIFICATION_SUPPRESSED(10),
    /* JADX INFO: Fake field, exist only in values array */
    KALLAX_NOTIFICATION_SUPPRESSED(11),
    /* JADX INFO: Fake field, exist only in values array */
    LIBRARY_IMPORT_NOTIFICATION_SUPPRESSED(12),
    UNRECOGNIZED(-1);

    public final int a;

    ufz(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
