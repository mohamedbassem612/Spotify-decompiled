package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum ld4 implements z0z {
    DISABLED(rca.e),
    /* JADX INFO: Fake field, exist only in values array */
    MINUTES1_DEBUG_ONLY("minutes1DebugOnly"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS3("hours3"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS6("hours6"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS12("hours12"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS24("hours24");

    public final String a;

    ld4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
