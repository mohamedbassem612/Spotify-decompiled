package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum lk4 implements z0z {
    LOW("low"),
    /* JADX INFO: Fake field, exist only in values array */
    MID("mid"),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH("high");

    public final String a;

    lk4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
