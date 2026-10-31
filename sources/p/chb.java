package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum chb implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    LOW_POWER("low_power"),
    BALANCED("balanced"),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LATENCY("low_latency");

    public final String a;

    chb(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
