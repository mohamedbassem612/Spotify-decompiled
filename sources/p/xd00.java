package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum xd00 implements afp0 {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    xd00(int i) {
        this.a = i;
    }

    @Override // p.afp0
    public final int getNumber() {
        return this.a ? 1 : 0;
    }
}
