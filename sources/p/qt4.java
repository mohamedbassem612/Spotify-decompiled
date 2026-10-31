package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum qt4 implements z0z {
    OFF("off"),
    /* JADX INFO: Fake field, exist only in values array */
    RCS_COPY("rcs_copy"),
    ENABLED(rca.d);

    public final String a;

    qt4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
