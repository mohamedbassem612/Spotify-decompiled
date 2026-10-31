package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum t54 implements z0z {
    ONBOARD("onboard"),
    /* JADX INFO: Fake field, exist only in values array */
    BROWSE("browse"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBFEED("subfeed"),
    /* JADX INFO: Fake field, exist only in values array */
    RE_ONBOARD("re-onboard"),
    /* JADX INFO: Fake field, exist only in values array */
    RE_BROWSE("re-browse");

    public final String a;

    t54(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
