package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum q45 implements z0z {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    EMULATOR("emulator"),
    /* JADX INFO: Fake field, exist only in values array */
    ADB_FORWARD("adb_forward");

    public final String a;

    q45(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
