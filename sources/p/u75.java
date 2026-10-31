package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum u75 implements z0z {
    DEFAULT("default"),
    /* JADX INFO: Fake field, exist only in values array */
    COOLDOWN("cooldown"),
    /* JADX INFO: Fake field, exist only in values array */
    GLOBAL_COOLDOWN("global_cooldown");

    public final String a;

    u75(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
