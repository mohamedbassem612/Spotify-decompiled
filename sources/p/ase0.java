package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum ase0 implements afp0 {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    ase0(int i) {
        this.a = i;
    }

    @Override // p.afp0
    public final int getNumber() {
        return this.a;
    }
}
