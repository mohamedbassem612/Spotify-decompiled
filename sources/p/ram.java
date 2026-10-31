package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum ram {
    NO_NETWORK(Integer.MAX_VALUE),
    SERVICE_ERROR(2147483646),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WARNING(2147483645),
    /* JADX INFO: Fake field, exist only in values array */
    EMPTY_CONTENT(2147483644);

    public static final ram[] d = values();
    public final int a;

    ram(int i) {
        this.a = i;
    }
}
