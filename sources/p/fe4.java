package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum fe4 implements z0z {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE_WITH_FETCH("none_with_fetch"),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_TRACK_1("after_track_1"),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_TRACK_2("after_track_2"),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_TRACK_3("after_track_3"),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER_TRACK_7("after_track_7");

    public final String a;

    fe4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
