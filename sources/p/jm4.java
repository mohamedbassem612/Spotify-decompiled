package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum jm4 implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    IMMEDIATE("immediate"),
    /* JADX INFO: Fake field, exist only in values array */
    THINK1("think1"),
    ACKNOWLEDGE("acknowledge"),
    /* JADX INFO: Fake field, exist only in values array */
    THINK2("think2"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY("play"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");

    public final String a;

    jm4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
